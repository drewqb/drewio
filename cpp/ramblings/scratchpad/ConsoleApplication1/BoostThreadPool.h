#pragma once
#include <memory>
#include <boost/asio.hpp>
#include <boost/thread.hpp>

struct BoostThreadPool 
{
	typedef std::unique_ptr<boost::asio::io_service::work> asio_worker;

	BoostThreadPool(int threads) : 
		m_service(), 
		m_service_worker(new asio_worker::element_type(m_service))
	{
		m_service.stop();
		for (int i = 0; i < threads; ++i) 
		{
			auto worker = [this] { return m_service.run(); };
			m_ThreadGroup.add_thread(new boost::thread(worker));
		}
		/*for (int i = 0; i < threads; ++i)
		{
			m_ThreadGroup.create_thread(boost::bind(&boost::asio::io_service::run, &m_service));
		}
		*/
	}
	~BoostThreadPool() 
	{
		
	}
	void abort()
	{
		m_service.stop();
		m_ThreadGroup.interrupt_all();
	
	}
	void runAll()
	{
		m_service_worker.reset();
		m_ThreadGroup.join_all();
		m_service.stop();
	}
	template<class F>  void addTask(F f)
	{
		m_service.post(f);
	}

	

private:
	boost::asio::io_service m_service;
	asio_worker m_service_worker;
	boost::thread_group m_ThreadGroup;
};