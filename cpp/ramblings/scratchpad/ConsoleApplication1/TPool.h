#pragma once
#include <boost/thread/thread.hpp>
#include <boost/asio/io_service.hpp>

class IRunnable
{
public:
	virtual void operator()() = 0;

};
class TPool
{
	boost::asio::io_service m_ioService;
	boost::thread_group m_threadpool;
	boost::asio::io_service::work m_work;
	

public:
	TPool(void);
	~TPool(void);
	void start();
	void runAll();
	void abort();

	boost::asio::io_service& getService() {return m_ioService;}
	void addJob(IRunnable *p);

};
