#pragma once
#include <memory>
#include <boost/asio.hpp>
#include <boost/thread.hpp>

struct BoostThreadPool {
	typedef std::unique_ptr<boost::asio::io_service::work> asio_worker;

	BoostThreadPool(int threads) : m_service(), m_service_worker(new asio_worker::element_type(m_service))
	{
		for (int i = 0; i < threads; ++i) {
			auto worker = [this] { return m_service.run(); };
			m_ThreadGroup.add_thread(new boost::thread(worker));
		}
	}

	template<class F>  void addTask(F f)
	{
		m_service.post(f);
	}

	~BoostThreadPool() {
		m_service_worker.reset();
		m_ThreadGroup.join_all();
		m_service.stop();
	}

private:
	boost::asio::io_service m_service;
	asio_worker m_service_worker;
	boost::thread_group m_ThreadGroup;
};
