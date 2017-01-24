#include "StdAfx.h"
#include "TPool.h"

#include <boost/bind.hpp>


TPool::TPool(void) : m_work(m_ioService)
{
	
}

TPool::~TPool(void)
{
	abort();
}

void TPool::start(void)
{
	unsigned int num = boost::thread::hardware_concurrency() ;
	for(int i=0;i<num;++i)
	{
		m_threadpool.create_thread(boost::bind(&boost::asio::io_service::run, &m_ioService));
	}
	

}

void TPool::runAll(void)
{
	m_ioService.stop();
	m_threadpool.join_all();
	
}
void TPool::abort(void)
{
	m_ioService.stop();
	m_threadpool.interrupt_all();

}


void TPool::addJob(IRunnable *runner)
{
    m_ioService.post(boost::bind(&IRunnable::operator(),runner));
}
