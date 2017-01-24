// sandbox.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include "BoostThreadPool.h"
#include <boost/function.hpp>
#include <boost/bind.hpp>
#include <memory>
#include <deque>
class HandleIt
{
public:
	void fun1() 
	{ 
		for (int x = 0; x < 5;++x)
		{
			printf("fun1()\n");
			boost::this_thread::sleep(boost::posix_time::milliseconds(100));
			boost::thread_interrupted();
		}
	}
	void fun2(int val)
	{
		for (int x = 0; x < 10;++x)
		{
			printf("fun1(%d)\n", val);
			boost::this_thread::sleep(boost::posix_time::milliseconds(100));
			boost::thread_interrupted();
		}
	}

};


/*
void callAbort(BoostThreadPool *tp)
{
tp->abort();
printf("abort threadpool\n");
}
int main()
{
	BoostThreadPool tp(10);
	std::deque<std::shared_ptr<HandleIt>> tasks;

	for (int x = 0; x < 10; x++)
	{
		auto sp = std::shared_ptr<HandleIt>(new HandleIt());
		tasks.push_back(sp);
		if (x % 2)
		{
			tp.addTask(boost::bind(&HandleIt::fun1, sp));
		}
		else
		{
			tp.addTask(boost::bind(&HandleIt::fun2, sp,x));
		}
		if (x == 3)
		{
			//tp.addTask(boost::bind(&callAbort, &tp));
		}
	}
	tp.runAll();

	printf("hello");
    return 0;
}
*/
