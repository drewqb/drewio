// demo.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include "TPool.h"

#include <stdio.h>
#include <iostream>
#include <fstream>
#include <boost/shared_ptr.hpp>
#include <boost/thread.hpp>
#include <boost/filesystem.hpp>
#include <boost/bind.hpp>
#include <boost/iostreams/device/mapped_file.hpp> // for mmap
#include <boost/iostreams/stream.hpp>             // for stream
#include <boost/regex.hpp>             // for stream
#include <boost/algorithm/string.hpp>
#include <algorithm>                              // for std::find
#include <Windows.h>
#include "reader.h"
#include "ZipFileLoader.h"
#include <istream>
#include <ostream>
#include <string>
#include <boost/asio.hpp>

#include <boost/foreach.hpp>
#include <sstream>
#include <map>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "bparser.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;
using boost::asio::ip::tcp;
__declspec(noinline)
class Tracer
{
	std::string m_name;
public:
	Tracer(const char *name) : m_name(name)
	{
		printf("Enter %s\n", m_name.c_str());

	}
	~Tracer()
	{
		printf("Exit %s\n", m_name.c_str());
	}
};

class IInject
{
public:
	virtual std::string getName() = 0;

};
class Bar : public IInject
{
public:
	std::string m_name;
	std::string getName() { return m_name; }
	Bar() : m_name("bar")
	{

	}
};
template<class IInject>
class NeedsFoo {
	IInject *m_pInject;
public:
	NeedsFoo(IInject *p) : m_pInject(p)
	{ 
		
	}
	virtual void test1()
	{
		m_pInject->getName();
	}
	
	// Methods using foo that needs to be tested.
};

bool checkPortTCPActive(short int dwPort)
{
	struct sockaddr_in client;
	int sock;

	client.sin_family = AF_INET;
	client.sin_port = htons(dwPort);
	client.sin_addr.S_un.S_addr = inet_addr("127.0.0.1");


	sock = (int)socket(AF_INET, SOCK_STREAM, 0);

	int result = connect(sock, (struct sockaddr *) &client, sizeof(client));
	//returns -1 on failure to connect, and a non-negative value if it manages to connect.
	char buf[256];

	if (result == 0)
	{
		closesocket(sock);
		sprintf_s(buf, "Port Active %d retcode=%d", dwPort, result);
		std::cout << buf << std::endl;
		return true; // port is active and used
	}
	else
	{
		sprintf_s(buf, "Port Failed %d retcode=%d", dwPort, result);
		std::cout << buf << std::endl;
		return false;

	}
}

#define LG_FUNC Tracer ____tracing(__FUNCSIG__);//FUNCTION or FUNCDNAME

/*
#include "rapidjson/document.h"     // rapidjson's DOM-style API
#include "rapidjson/prettywriter.h" // for stringify JSON
#include <cstdio>
#include "rapidjson/writer.h"
#include "rapidjson/stringbuffer.h"
#include <iostream>

int writeJson() {
	rapidjson::StringBuffer s;
	rapidjson::Writer<rapidjson::StringBuffer> writer(s);
	
	writer.StartObject();
	writer.String("hello");
	writer.String("world");
	writer.String("t");
	writer.Bool(true);
	writer.String("f");
	writer.Bool(false);
	writer.String("n");
	writer.Null();
	writer.String("i");
	writer.Uint(123);
	writer.String("pi");
	writer.Double(3.1416);
	writer.String("a");
	writer.StartArray();
	for (unsigned i = 0; i < 4; i++)
		writer.Uint(i);
	writer.EndArray();
	writer.EndObject();

	std::cout << s.GetString() << std::endl;

	return 0;
}

void printActualValue(const rapidjson::Value &theValue)
{
	static const char* kTypeNames[] = { "Null", "False", "True", "Object", "Array", "String", "Number" };

	if (theValue.IsNull())
	{
		std::cout <<  kTypeNames[theValue.GetType()] << ":" << "NULL" << std::endl;
	}
	
	else if (theValue.IsBool())
	{
		std::cout  << kTypeNames[theValue.GetType()] << ":" << theValue.GetBool() << std::endl;
	}
	else if (theValue.IsString())
	{
		std::cout  << kTypeNames[theValue.GetType()] << ":" << theValue.GetString() << std::endl;
	}
	else if (theValue.IsInt())
	{
		std::cout << kTypeNames[theValue.GetType()] << ":" << theValue.GetInt() << std::endl;
	}
	else if (theValue.IsDouble())
	{
		std::cout << kTypeNames[theValue.GetType()] << ":" << theValue.GetDouble() << std::endl;
	}
	else if (theValue.IsDouble())
	{
		std::cout << kTypeNames[theValue.GetType()] << ":" << theValue.GetDouble() << std::endl;
	}
	else if (theValue.IsArray())
	{
		const rapidjson::Value& a = theValue;
		std::cout << kTypeNames[theValue.GetType()] << ":";
		for (rapidjson::SizeType i = 0; i < a.Size(); i++)
		{
			printActualValue(a[i]);
			
		}
		std::cout << std::endl;

	}
	else
	{
		std::cout << kTypeNames[theValue.GetType()] << std::endl;
	}
}
void printValue(rapidjson::Value::ConstMemberIterator &itr)
{
	
	std::cout << itr->name.GetString() << ":";
	printActualValue(itr->value);

	
}
void jsonTests() {
	////////////////////////////////////////////////////////////////////////////
	// 1. Parse a JSON text string to a document.

	//const char json[] = " { \"hello\" : \"world\", \"t\" : true , \"f\" : false, \"n\": null, \"i\":123, \"pi\": 3.1416, \"a\":[1, 2, 3, 4] } ";
	const char *json = " { \"hello\" : \"world\", \"t\" : true , \"f\" : false, \"n\": null, \"i\":123, \"pi\": 3.1416, \"a\":[1, 2, 3, 4] } "; 
	printf("Original JSON:\n %s\n", json);

	rapidjson::Document document;  // Default template parameter uses UTF8 and MemoryPoolAllocator.
	//document.Parse()

	// "normal" parsing, decode strings to new buffers. Can use other input stream via ParseStream().
	if (document.Parse(json).HasParseError())
		return ;

	if (!document.IsObject())
	{
		printf("Error: parsing document\n");
		return;
	}
	static const char* kTypeNames[] = { "Null", "False", "True", "Object", "Array", "String", "Number" };

	
	assert(document.HasMember("hello"));
	assert(document["hello"].IsString());
	printf("hello = %s\n", document["hello"].GetString());
}
void readjson2()
{
	//const char *json = "{\"root\":[{\"hello\":\"world\"},{\"hello2\":\"world2\"},{\"hello3\":\"world3\"}]}";
	const char *json = "[{\"hello\":\"world\"},{\"hello2\":\"world2\"},{\"hello3\":\"world3\"}]";
	printf("Original JSON:\n %s\n", json);

	rapidjson::Document document;  // Default template parameter uses UTF8 and MemoryPoolAllocator.
	//document.Parse()

	// "normal" parsing, decode strings to new buffers. Can use other input stream via ParseStream().
	if (document.Parse(json).HasParseError())
		{
			printf("Error: not array document\n");
			return;
		}

	
	static const char* kTypeNames[] = { "Null", "False", "True", "Object", "Array", "String", "Number" };
	//rapidjson::Value::ConstMemberIterator itr = document.FindMember("root");// .MemberBegin();
	std::cout << document.GetType() << std::endl;
	const rapidjson::Value& a = document;// itr->value;
	if (a.IsArray())
	{
		for (rapidjson::SizeType i = 0; i < a.Size(); i++) // Uses SizeType instead of size_t
		{
		
			std::cout << "{";
			for (rapidjson::Value::ConstMemberIterator itr = a[i].MemberBegin(); itr != a[i].MemberEnd(); ++itr) {
				//printValue(itr);
				std::cout << kTypeNames[itr->value.GetType()] << ":";
				std::cout << itr->name.GetString() << ":" << itr->value.GetString();
				std::cout << ",";
			}
			std::cout << "}" << std::endl;;
		}
	}
	
}
void example() {
  // Write json.
  ptree pt;
  pt.put ("foo", "bar");
  std::ostringstream buf; 
  write_json (buf, pt, false);
  std::string json = buf.str(); // {"foo":"bar"}

  // Read json.
  ptree pt2;
  std::istringstream is (json);
  read_json (is, pt2);
  std::string foo = pt2.get<std::string> ("foo");
}
//std::map<unsigned int, ProfileStatus*>::iterator pos;
//	for(std::map<unsigned int, ProfileStatus*>::iterator pos = m_statii.begin(); pos != m_statii.end(); pos++) 


*/
std::string map2json(std::map<std::string, std::string>& theMap) {
	ptree pt;
	std::map<std::string, std::string>::iterator it;
	for (it = theMap.begin(); it != theMap.end(); ++it)
	{
		pt.put(it->first, it->second);
	}
	std::ostringstream buf;
	write_json(buf, pt, false);
	return buf.str();
}
void jsonTest()
{
	std::map<std::string, std::string> theMap;
	theMap["A"] = "A";
	theMap["A1"] = "A1";
	theMap["A2"] = "A2";
	theMap["A2"] = "A2";


	std::string jsonObj = map2json(theMap);
	ptree pt2;
	std::istringstream is(jsonObj);
	read_json(is, pt2);
	std::string foo = pt2.get<std::string>("foo");





}
struct AlignTest1
{
	 std::string Name;
            std::string DisplayName;
            int Size;
            bool Hidden;
            int Precision;
            int Index;
            int DisplayIndex;
            bool Null;
};
struct AlignTest2
{
	 std::string Name;
            std::string DisplayName;
            int Size;
            int Precision;
            int Index;
            int DisplayIndex;
            bool Null;
	bool Hidden;
};
struct AlignTest3
{
	bool Hidden;
};
struct AlignTest4
{
	float Hidden;
};
struct AlignTest5
{
	double Hidden;
};

using namespace std;

struct Runner1
{
public:
	void run(const std::string &s1, int sleep)
	 {
   		for(int i=0;i<10;++i)
		{
			cout << s1.c_str() << " ..... " << " A " << " B " << endl;
			boost::this_thread::sleep( boost::posix_time::milliseconds(sleep) );
		}
		cout << s1.c_str() << ".. done" <<endl;
	}
};
struct Runner2 : public IRunnable
{
	std::string m_s;
	int m_sl;
public:
	Runner2(const char *s1, int sleep):m_s(s1), m_sl(sleep)
	{
	}
	virtual void operator()()
	{
		for(int i=0;i<10;++i)
		{
			cout << m_s.c_str() << " ..... " << " A " << " B " << endl;
			boost::this_thread::sleep( boost::posix_time::milliseconds(m_sl) );
		}
		cout << m_s.c_str() << ".. done" <<endl;
	}
};
void testKill(TPool *tp)
{
	boost::this_thread::sleep(boost::posix_time::milliseconds(5000));
	tp->abort();

}
	void pooltest()
	{
		TPool tp;
		
		tp.start();
		//tp.addTask(boost::bind(&Runner1::run,&r1,1));
		//tp.addTask(boost::bind(&Runner2::run, &r2, 2));
		boost::thread worker(boost::bind(testKill,&tp));
       
		for(int x=0;x<8;x++)
		{
			std::ostringstream s;
			s << "Task" << x;
			Runner1 r1;
			tp.getService().post(boost::bind(&Runner1::run,&r1,s.str(),500+100*x));
		}
		Runner2 r2("runner2", 2);
		tp.addJob(&r2);

		tp.runAll();

		/*while(tp.isRunning())
		{
			boost::this_thread::sleep(boost::posix_time::milliseconds(1000));
		}
		*/
		cout<<"Pooltest done" <<endl;
	}

	/*
int testPerf2()
{
	SimpleProfiler p;
	
	timeBeginPeriod(1); //Add Winmm.lib in Project
	unsigned int diffTime = 0, lastTime = 0, newTime = 0;

	p.startTime();
	lastTime = p.calculateElapsedTime();
	cout<<"Start Time = "<<lastTime<<endl;

	Sleep(100);
	newTime = p.calculateElapsedTime();
	diffTime = newTime - lastTime;
	cout<<"Time after 100ms Sleep = "<<newTime<<", Difference = "<<diffTime<<endl;
	lastTime = newTime;

	Sleep(100);
	newTime = p.calculateElapsedTime();
	diffTime = newTime - lastTime;
	cout<<"Time after 100ms Sleep = "<<newTime<<", Difference = "<<diffTime<<endl;
	lastTime = newTime;

	Sleep(5);
	newTime = p.calculateElapsedTime();
	diffTime = newTime - lastTime;
	cout<<"Time after   5ms Sleep = "<<newTime<<", Difference = "<<diffTime<<endl;
	lastTime = newTime;

	Sleep(50);
	newTime = p.calculateElapsedTime();
	diffTime = newTime - lastTime;
	cout<<"Time after  50ms Sleep = "<<newTime<<", Difference = "<<diffTime<<endl;

	timeEndPeriod(1); //Must be called if timeBeginPeriod() was called
	return 0;

}
*/
class MemTest
{
public:
void readfile1(std::string &s1, int loop)
{
	LG_FUNC
	for(int i=0;i<loop;++i)
	{
		std::ifstream file(s1.c_str());
		std::string line; 
		int cnt=0;
		while (std::getline(file, line) )
		{
			//std::cout << line << std::endl;
		}
		file.close();
	}	
}
void readfile2(std::string &s1, int loop)
{
	LG_FUNC
	for(int i=0;i<loop;++i)
	{
		ZipFileLoader zl(s1.c_str());
		std::istream instream(&zl.getBuffer());
		//Iterate lines
		std::string line;
		int cnt=0;
		while(std::getline(instream, line) ) {
			//std::cout << line << std::endl;
		}
	}	
}
void readfile3(std::string &s1, int loop)
{
	LG_FUNC
	for(int i=0;i<loop;++i)
	{
		boost::iostreams::mapped_file_source mmap(s1.c_str());
		boost::iostreams::stream<boost::iostreams::mapped_file_source> is(mmap, std::ios::binary);

		std::string line;

		//unsigned int m_numLines = 0;
		while (std::getline(is, line))
		{
		   // m_numLines++;
		}

		//std::cout << "m_numLines = " << m_numLines << "\n";
	}
}
};
void ctest1()
{
	for(int x=0;x<10;++x)
	{
		printf("Loop = %d\n",x);
	}

}
/*
void ctest()
{
	std::string s1("c:\\src\\data\\Run_1_71R1.tff");
	std::string s2("c:\\src\\data\\Run_1_71R1.tff.gz");

	int loop=1;
	SimpleProfiler p;
	

	//timeBeginPeriod(1); //Add Winmm.lib in Project
	unsigned int diffTime = 0, lastTime = 0, newTime = 0;
	
	p.startTime();
	MemTest m;

	lastTime = p.calculateElapsedTime();
	m.readfile1(s1,loop);
	newTime = p.calculateElapsedTime();
	diffTime = newTime - lastTime;
	cout<<"read = "<< diffTime<<endl;

	lastTime = p.calculateElapsedTime();
	m.readfile2(s2,loop);
	newTime = p.calculateElapsedTime();
	diffTime = newTime - lastTime;
	cout<<"gzip read = "<< diffTime<<endl;

	lastTime = p.calculateElapsedTime();
	m.readfile3(s1,loop);
	newTime = p.calculateElapsedTime();
	diffTime = newTime - lastTime;
	cout<<"mapped_file read = "<< diffTime<<endl;


	cout<<"end = " << endl;

}*/

void test()
{
	unsigned int aaa[] = {0,5,7,20};
	unsigned int bb[] = {30,30,30,30};
	int cnt = sizeof(aaa)/sizeof(unsigned int);
	for(int i=0;i<cnt;++i)
	{
		float per=(float) aaa[i]/bb[i];
		cout << per << endl;
	}
}
// command commadonlione /GH /Gh
//int _tmain(int argc, _TCHAR* argv[])
// itunes.apple.com /search?term=deep_purple
// www.boost.org /LICENSE_1_0.txt
// localhost:23214 /rest/analysis/testconfigparameters
// rest/analysis/last
// rest/analysis/savedusecaselist
// localhost:23214 /atrt_ent/rest/analysis/last


// ie. localhost 23214 /atrt_ent/rest/analysis/last
bool readAtrtHeartbeat(std::string &host, std::string &port, std::string &command)
{
	try
	{
		boost::asio::io_service io_service;

		// Get a list of endpoints corresponding to the server name.
		tcp::resolver resolver(io_service);
		boost::asio::ip::tcp::resolver::query query(host, port);
		//tcp::resolver::query query(arg1, "http", 23214);
		tcp::resolver::iterator endpoint_iterator = resolver.resolve(query);

		// Try each endpoint until we successfully establish a connection.
		tcp::socket socket(io_service);

		boost::asio::connect(socket, endpoint_iterator);

		// Form the request. We specify the "Connection: close" header so that the
		// server will close the socket after transmitting the response. This will
		// allow us to treat all data up until the EOF as the content.
		boost::asio::streambuf request;
		std::ostream request_stream(&request);
		request_stream << "GET " << command << " HTTP/1.0\r\n";
		request_stream << "Host: " << host << "\r\n";
		request_stream << "Accept: */*\r\n";
		request_stream << "Connection: close\r\n\r\n";


		// Send the request.
		boost::asio::write(socket, request);

		// Read the response status line. The response streambuf will automatically
		// grow to accommodate the entire line. The growth may be limited by passing
		// a maximum size to the streambuf constructor.
		boost::asio::streambuf response;
		boost::asio::read_until(socket, response, "\r\n");

		// Check that response is OK.
		std::istream response_stream(&response);
		std::string http_version;
		response_stream >> http_version;
		unsigned int status_code;
		response_stream >> status_code;
		std::string status_message;
		std::getline(response_stream, status_message);
		if (!response_stream || http_version.substr(0, 5) != "HTTP/")
		{
		  std::cout << "Invalid response\n";
		  return 1;
		}
		if (status_code != 200)
		{
		  std::cout << "Response returned with status code " << status_code << "\n";
		  return 1;
		}

		// Read the response headers, which are terminated by a blank line.
		boost::asio::read_until(socket, response, "\r\n\r\n");

		// Process the response headers.
		std::string header;
		while (std::getline(response_stream, header) && header != "\r")
		  std::cout << header << "\n";
		std::cout << "\n";

		// Write whatever content we already have to output.
		if (response.size() > 0)
		  std::cout << &response;

		// Read until EOF, writing data to output as we go.
		boost::system::error_code error;
		while (boost::asio::read(socket, response,
			  boost::asio::transfer_at_least(1), error))
		  std::cout << &response;
		if (error != boost::asio::error::eof)
		  throw boost::system::system_error(error);
	}
	catch (std::exception& e)
	{
	std::cout << "Exception: " << e.what() << "\n";
	return false;
	}
  return true;
}
unsigned int BCDnA( unsigned int n, const unsigned char * data )
{
    unsigned int uResult = 0;
    unsigned int i;

    for (i=0;i<n;i++) 
    {
        uResult = (uResult * 100) + ((data[i] >> 4) * 10 ) + ( data[i] & 0x0F);     
    }

    return uResult; 
}
unsigned int BCDn( unsigned int n, const unsigned char * data )
{
    unsigned int uResult = 0;
    unsigned char ucTmp;
    int iTmp1,iTmp2;

    unsigned int factor = 1;
    for (unsigned int i=n-1;i>=0;i--)
    {
        ucTmp = data[i];
        iTmp1 = (ucTmp & 0xf0) >> 4;
        iTmp2 = ucTmp & 0x0f;
        uResult += (iTmp1*10+iTmp2) * factor;
        factor *= 100;
    }

    return uResult; 
}
void test222()
{
	unsigned char data[] = {0x97, 0x65};
	printf("%d\n", BCDnA(2, data));

}
int rfile2()
{
	char *nm = "c:\\src\\t.bin";
	Reader rr ;
	if(!rr.fileExists(nm))
	{
		rr.writeFile(nm);
	}
	rr.readFileMapped(nm);
	return 0;
}
static UINT const  broadcastTimeout = 5000; // in milliseconds
static char const *userEnvSubKey    = "Environment";
static char const *systemEnvSubKey  = "System\\CurrentControlSet\\Control\\"
                                      "Session Manager\\Environment";
void broadcastEnvChange()
{
    DWORD_PTR result;

    // Broadcast WM_SETTINGCHANGE
    SendMessageTimeout(HWND_BROADCAST,
                       WM_SETTINGCHANGE,
                       NULL,
                       (LPARAM)L"Environment",
                       SMTO_NORMAL,
                       broadcastTimeout,
                       &result);

	//	LRESULT result = SendMessageTimeout(HWND_BROADCAST, WM_SETTINGCHANGE, 0,
    //(LPARAM)"Environment", SMTO_ABORTIFHUNG, 5000, &result2);
}
void setSystemEnv (std::string const &name, std::string const &text)
{
    HKEY        key=HKEY_CURRENT_USER;
    HKEY        subKey;
	std::string subKeyName=userEnvSubKey;

	std::string theName = name;
	std::string theValue = text;

    // Write the new value to the registry.
	RegOpenKeyExA(key, subKeyName.c_str(), 0, KEY_SET_VALUE, &subKey);
    RegSetValueExA(subKey,
                  theName.c_str(),
                  0,
                  REG_EXPAND_SZ,
                  reinterpret_cast<const BYTE *>(theValue.c_str()),
                  theValue.length() + 1);
    RegCloseKey(key);

    // Notify everyone of the change.
    broadcastEnvChange();
}
std::string getStringRegKey(const std::string &strValueName)
{
    HKEY        key=HKEY_CURRENT_USER;
    DWORD       size;
    LONG        status;
    HKEY        subKey;
    std::string subKeyName=userEnvSubKey;
	std::string theRet="";

	RegOpenKeyExA(key, subKeyName.c_str(), 0, KEY_QUERY_VALUE | KEY_SET_VALUE, &subKey);
    status = RegQueryValueExA(subKey, strValueName.c_str(), 0, NULL, NULL, &size);
    if (ERROR_SUCCESS == status) 
	{
        // This environment variable already exists. Assign its value to this
        // EnvVar object.
        PBYTE data = new BYTE [size];
        RegQueryValueExA(subKey, strValueName.c_str(), 0, NULL, data, &size);
        theRet = reinterpret_cast<char const *>(data);
        delete [] data;
    }
    RegCloseKey(key);
	return theRet;
}
std::string getStringRegKey(HKEY hKey, const std::string &strValueName, const std::string &strDefaultValue)
{
    std::string strValue = strDefaultValue;
    char szBuffer[512];
    DWORD dwBufferSize = sizeof(szBuffer);
    ULONG nError;
    nError = RegQueryValueExA(hKey, strValueName.c_str(), 0, NULL, (LPBYTE)szBuffer, &dwBufferSize);
    if (ERROR_SUCCESS == nError)
    {
        strValue = szBuffer;
    }
    return strValue;
}
void runSomething()
{
	std::string cmd = "dir /p";

    STARTUPINFOA si;
    PROCESS_INFORMATION pi;

    ZeroMemory( &si, sizeof(si) );
    si.cb = sizeof(si);
    ZeroMemory( &pi, sizeof(pi) );

    

    // Start the child process. 
    if( !CreateProcessA( NULL,   // No module name (use command line)
		(LPSTR)cmd.c_str(),        // Command line
        NULL,           // Process handle not inheritable
        NULL,           // Thread handle not inheritable
        FALSE,          // Set handle inheritance to FALSE
        0,              // No creation flags
        NULL,           // Use parent's environment block
        NULL,           // Use parent's starting directory 
        &si,            // Pointer to STARTUPINFO structure
        &pi )           // Pointer to PROCESS_INFORMATION structure
    ) 
    {
        printf( "CreateProcess failed (%d).\n", GetLastError() );
        return;
    }

    // Wait until child process exits.
    WaitForSingleObject( pi.hProcess, INFINITE );

    // Close process and thread handles. 
    CloseHandle( pi.hProcess );
    CloseHandle( pi.hThread );
}
void jsonTest2()
{
	try
    {
        std::stringstream ss;
        ss << "{ \"root\": { \"values\": [1, 2, 3, 4, 5 ] } }";
 
        boost::property_tree::ptree pt;
        boost::property_tree::read_json(ss, pt);
 
		//BOOST_FOREACH(ptree::value_type &v, pt.get_child("root.values"))
        BOOST_FOREACH(boost::property_tree::ptree::value_type &v, pt.get_child("root.values")){
            assert(v.first.empty()); // array elements have no names
            std::cout << v.second.data() << std::endl;
        }
        
    }
    catch (std::exception const& e)
    {
        std::cerr << e.what() << std::endl;
    }
}

struct TestDataHeader
{
	int header;
};
struct TestDataMap
{
	TestDataHeader m_header;
    char name[1024];
	int data;
	
    
};

 
void writeFile(char *nm)
{
	ofstream binary_file(nm,ios::binary);

	for(int x=0;x<5;x++)
	{
		TestDataMap me;
		me.m_header.header=100+x;
		sprintf_s(me.name, "Data%d", x);
		me.data=x;
		
		binary_file.write(reinterpret_cast<char *>(&me),sizeof(me));
	}
	binary_file.close();
}
void readFile(char *nm)
{
	fstream binary_file2(nm,ios::binary|ios::in| ios::ate );
    int size = binary_file2.tellg();
	binary_file2.seekg(0);
    for(int i = 0; i<size/sizeof(TestDataMap); i++)
    { 
		TestDataHeader theHeader;
        TestDataMap p_Data;
        //binary_file2.seekg(i*sizeof(p_Data));
        binary_file2.read(reinterpret_cast<char *>(&theHeader),sizeof(theHeader));
		//binary_file2.read(reinterpret_cast<char *>(&p_Data),sizeof(p_Data));
		binary_file2.ignore(sizeof(p_Data.name));
		binary_file2.ignore(sizeof(p_Data.data));
		cout << "Header=" << theHeader.header << endl;
		//cout << "Header=" << p_Data.m_header.header << endl;
		//cout<< "Name =" << p_Data.name << ", data=" << p_Data.data << endl; 
		
    }
    binary_file2.close();
}
void otherTest()
{
	char *nm = "c:\\src\\map_test.bin";
	Reader rr ;
	//if(!rr.fileExists(nm))
	{
		writeFile(nm);
	}
	readFile(nm);
	
}
typedef struct student
{
    char name[10];
    int age;
    vector<int> grades;
}student_t;

int main2()
{
    student_t apprentice[3];  
    strcpy(apprentice[0].name, "john");
    apprentice[0].age = 21;
    apprentice[0].grades.push_back(1);
    apprentice[0].grades.push_back(3);
    apprentice[0].grades.push_back(5);    

    strcpy(apprentice[1].name, "jerry");
    apprentice[1].age = 22;
    apprentice[1].grades.push_back(2);
    apprentice[1].grades.push_back(4);
    apprentice[1].grades.push_back(6);

    strcpy(apprentice[2].name, "jimmy");
    apprentice[2].age = 23;
    apprentice[2].grades.push_back(8);
    apprentice[2].grades.push_back(9);
    apprentice[2].grades.push_back(10);

    // Serializing struct to student.data
    ofstream output_file("students.data", ios::binary);
    output_file.write((char*)&apprentice, sizeof(apprentice));
    output_file.close();

    // Reading from it
    ifstream input_file("students.data", ios::binary);
    student_t master[3];
    input_file.read((char*)&master, sizeof(master));         

    for (size_t idx = 0; idx < 3; idx++)
    {
        // If you wanted to search for specific records, 
        // you should do it here! if (idx == 2) ...

        cout << "Record #" << idx << endl;
        cout << "Name: " << master[idx].name << endl;
        cout << "Age: " << master[idx].age << endl;
        cout << "Grades: " << endl;
        for (size_t i = 0; i < master[idx].grades.size(); i++)
           cout << master[idx].grades[i] << " ";
        cout << endl << endl;
    }

    return 0;
}
#include <iostream>
#include <vector>
#include <string>
#include <boost/range/adaptor/sliced.hpp>
#include <boost/algorithm/string/join.hpp>
#include <boost/assign.hpp> //just for fun

void deleteIt()
{
	using namespace std;
	using namespace boost::assign;
	std::vector< std::string > v;
    v += "(a)","(b)","(c)","(d)","(e)";
	cout << v[2] << endl;
	for(std::vector< std::string >::const_iterator it2 = v.begin(); it2 != v.end();)
	{
	    
	   if(*it2 == "(c)")
	   {
		  it2 = v.erase(it2); 
	   }
	   else
	   {
		  ++it2;
	   }
	}
	cout << v[2] << endl;
}

void newMain()
{
	using namespace std;
	using namespace boost::assign;

	const int K = 2;
    vector< string > v;
    v += "(a)","(b)","(c)","(d)","(e)";
	vector< string > v2;
	vector< string > v3;

    for( unsigned int i=0; i<v.size(); i+=K )
	{
		v2.push_back( boost::algorithm::join(v | boost::adaptors::sliced( i, min(i+K, v.size()) ), "," ) );
		
	}
	cout << v.at(0);
}
#include <stdio.h>      /* printf */
#include <time.h>       /* time_t, struct tm, difftime, time, mktime */

int main111 ()
{
  time_t now;
  struct tm newyear;
  
  time(&now);  /* get current time; same as: now = time(NULL)  */

  newyear = *localtime(&now);

  newyear.tm_hour = 14; newyear.tm_min = 0; newyear.tm_sec = 0;
  newyear.tm_mon = 6;  newyear.tm_mday = 10;

  double seconds = difftime(now,mktime(&newyear));

  printf ("%.f seconds since new year in the current timezone.\n", seconds);

  return 0;
}

void myterminate() {
	cerr << "terminate handler called\n";
	auto exc = std::current_exception();
	if (exc) {
		try{
			rethrow_exception(exc); // throw to recognize the type
		}
		
		catch (std::exception const& exc) {
			cerr << exc.what() << endl;
		}
		catch (...) {
			cerr << "caugh..." << endl;
		}
	}

	abort();  // forces abnormal termination
}
#include <direct.h>

std::string getCurrentDirectory()
{
	char buffer[FILENAME_MAX];
	if (_getcwd(buffer, FILENAME_MAX))
	{
		return  std::string(buffer);
	}
	return std::string("");
}



bool setCurrentDirectory(const std::string &path){
	if (path.empty()) return false;
	
	return _chdir(path.c_str()) == 0;
}
std::string getPath()
{
	HMODULE hModule = GetModuleHandleA(NULL);
	char path[MAX_PATH];
	GetModuleFileNameA(hModule, path, MAX_PATH);
	return std::string(path);

}
void hTest()
{
	std::string s = "http://////www.boost.org/doc/libs/1_53_0/libs/regex/doc/html/boost_regex/ref/regex_replace.html";
	boost::regex expr("/\{2,\}");
	std::string fmt("/");
	std::string s2 = boost::regex_replace(s, expr, fmt);
	cout << s2 << endl;
}
#include "server_http.hpp"


//Added for the json-example
#define BOOST_SPIRIT_THREADSAFE
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

//Added for the default_resource example
#include <fstream>
#include <boost/filesystem.hpp>

using namespace std;
//Added for the json-example:
using namespace boost::property_tree;

typedef SimpleWeb::Server<SimpleWeb::HTTP> HttpServer;


int main222() {
	//HTTP-server at port 8080 using 4 threads
	HttpServer server(8080, 4);

	//Add resources using path-regex and method-string, and an anonymous function
	//POST-example for the path /string, responds the posted string
	server.resource["^/string$"]["POST"] = [](HttpServer::Response& response, shared_ptr<HttpServer::Request> request) {
		//Retrieve string:
		auto content = request->content.string();
		//request->content.string() is a convenience function for:
		//stringstream ss;
		//ss << request->content.rdbuf();
		//string content=ss.str();

		response << "HTTP/1.1 200 OK\r\nContent-Length: " << content.length() << "\r\n\r\n" << content;
	};

	//POST-example for the path /json, responds firstName+" "+lastName from the posted json
	//Responds with an appropriate error message if the posted json is not valid, or if firstName or lastName is missing
	//Example posted json:
	//{
	//  "firstName": "John",
	//  "lastName": "Smith",
	//  "age": 25
	//}
	server.resource["^/json$"]["POST"] = [](HttpServer::Response& response, shared_ptr<HttpServer::Request> request) {
		try {
			ptree pt;
			read_json(request->content, pt);

			string name = pt.get<string>("firstName") + " " + pt.get<string>("lastName");

			response << "HTTP/1.1 200 OK\r\nContent-Length: " << name.length() << "\r\n\r\n" << name;
		}
		catch (exception& e) {
			response << "HTTP/1.1 400 Bad Request\r\nContent-Length: " << strlen(e.what()) << "\r\n\r\n" << e.what();
		}
	};

	//GET-example for the path /info
	//Responds with request-information
	server.resource["^/info$"]["GET"] = [](HttpServer::Response& response, shared_ptr<HttpServer::Request> request) {
		stringstream content_stream;
		content_stream << "<h1>Request from " << request->remote_endpoint_address << " (" << request->remote_endpoint_port << ")</h1>";
		content_stream << request->method << " " << request->path << " HTTP/" << request->http_version << "<br>";
		for (auto& header : request->header) {
			content_stream << header.first << ": " << header.second << "<br>";
		}

		//find length of content_stream (length received using content_stream.tellp())
		content_stream.seekp(0, ios::end);

		response << "HTTP/1.1 200 OK\r\nContent-Length: " << content_stream.tellp() << "\r\n\r\n" << content_stream.rdbuf();
	};

	//GET-example for the path /match/[number], responds with the matched string in path (number)
	//For instance a request GET /match/123 will receive: 123
	server.resource["^/match/([0-9]+)$"]["GET"] = [](HttpServer::Response& response, shared_ptr<HttpServer::Request> request) {
		string number = request->path_match[1];
		response << "HTTP/1.1 200 OK\r\nContent-Length: " << number.length() << "\r\n\r\n" << number;
	};
	server.resource["^/jsoninfo$"]["GET"] = [](HttpServer::Response& response, shared_ptr<HttpServer::Request> request) {
		string answer = "{\"firstName\": \"John\",\"lastName\": \"Smith\",\"age\": 25}";
		response << "HTTP/1.1 200 OK\r\nContent-Length: " << answer.length() << "\r\n\r\n" << answer;
	};
	//Default GET-example. If no other matches, this anonymous function will be called. 
	//Will respond with content in the web/-directory, and its subdirectories.
	//Default file: index.html
	//Can for instance be used to retrieve an HTML 5 client that uses REST-resources on this server
	server.default_resource["GET"] = [](HttpServer::Response& response, shared_ptr<HttpServer::Request> request) {
		boost::filesystem::path web_root_path("web");
		if (!boost::filesystem::exists(web_root_path))
			cerr << "Could not find web root." << endl;
		else {
			auto path = web_root_path;
			path += request->path;
			if (boost::filesystem::exists(path)) {
				if (boost::filesystem::canonical(web_root_path) <= boost::filesystem::canonical(path)) {
					if (boost::filesystem::is_directory(path))
						path += "/index.html";
					if (boost::filesystem::exists(path) && boost::filesystem::is_regular_file(path)) {
						ifstream ifs;
						ifs.open(path.string(), ifstream::in | ios::binary);

						if (ifs) {
							ifs.seekg(0, ios::end);
							size_t length = ifs.tellg();

							ifs.seekg(0, ios::beg);

							response << "HTTP/1.1 200 OK\r\nContent-Length: " << length << "\r\n\r\n";

							//read and send 128 KB at a time
							size_t buffer_size = 131072;
							vector<char> buffer;
							buffer.reserve(buffer_size);
							size_t read_length;
							try {
								while ((read_length = ifs.read(&buffer[0], buffer_size).gcount())>0) {
									response.write(&buffer[0], read_length);
									response.flush();
								}
							}
							catch (const exception &e) {
								cerr << "Connection interrupted, closing file" << endl;
							}

							ifs.close();
							return;
						}
					}
				}
			}
		}
		string content = "Could not open path " + request->path;
		response << "HTTP/1.1 400 Bad Request\r\nContent-Length: " << content.length() << "\r\n\r\n" << content;
	};

	thread server_thread([&server](){
		//Start server
		server.start();
	});

	//Wait for server to start so that the client can connect
	this_thread::sleep_for(chrono::seconds(1));

	//Client examples
	/* HttpClient client("localhost:8080");
	auto r1=client.request("GET", "/match/123");
	cout << r1->content.rdbuf() << endl;

	string json="{\"firstName\": \"John\",\"lastName\": \"Smith\",\"age\": 25}";
	stringstream ss(json);
	auto r2=client.request("POST", "/string", ss);
	cout << r2->content.rdbuf() << endl;

	ss.str(json);
	auto r3=client.request("POST", "/json", ss);
	cout << r3->content.rdbuf() << endl;

	server_thread.join();
	*/
	while (true)
	{
		this_thread::sleep_for(chrono::seconds(1));

	}
	return 0;
}
bool port_in_use(unsigned short port) {
	using namespace boost::asio;
	using ip::tcp;

	io_service svc;
	tcp::acceptor a(svc);

	boost::system::error_code ec;
	a.open(tcp::v4(), ec) || a.bind({ tcp::v4(), port }, ec);

	return ec == error::address_in_use;
}
void testresolve()
{
	/*boost::asio::ip::tcp::resolver::query query("localhost","", boost::asio::ip::tcp::resolver::query::canonical_name);
	std::cout << query.host_name() << std::endl;
	std::cout << query.service_name() << std::endl;

	boost::asio::io_service io_service;

	boost::asio::ip::tcp::acceptor	acceptor(io_service);

	acceptor.listen();

	boost::asio::ip::tcp::endpoint endpoint = acceptor.local_endpoint();
	
	std::cout << endpoint.address() << std::endl;
	std::cout << endpoint.port() << std::endl;
	*/

	boost::asio::io_service service;
	boost::asio::ip::tcp::acceptor acceptor(service);
	unsigned short port = 0;
	boost::asio::ip::tcp::endpoint endPoint(boost::asio::ip::tcp::endpoint(boost::asio::ip::tcp::v4(), port));
	acceptor.open(endPoint.protocol());
	acceptor.set_option(tcp::acceptor::reuse_address(true));
	acceptor.bind(endPoint);

	//acceptor.listen();

	boost::asio::ip::tcp::endpoint le = acceptor.local_endpoint(); //THIS LINE SOLVES IT
	port = le.port();
	std::cout << port << std::endl;
	std::cout << endPoint.port() << std::endl;
	// port = endPoint.port(); // This is didn't work for me

}
#include <windows.h>
#include <ShellApi.h>

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
		for (int x = 0; x < 5; ++x)
		{
			printf("fun1()\n");
			boost::this_thread::sleep(boost::posix_time::milliseconds(100));
			boost::thread_interrupted();
		}
	}
	void fun2(int val)
	{
		for (int x = 0; x < 10; ++x)
		{
			printf("fun1(%d)\n", val);
			boost::this_thread::sleep(boost::posix_time::milliseconds(100));
			boost::thread_interrupted();
		}
	}

};

void callAbort(BoostThreadPool *tp)
{
	tp->abort();
	printf("abort threadpool\n");
}
int poolTest()
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
			tp.addTask(boost::bind(&HandleIt::fun2, sp, x));
		}
		if (x == 4)
		{
			tp.addTask(boost::bind(&callAbort, &tp));
		}
	}
	tp.runAll();

	printf("hello");
	return 0;
}
void view_debug(const char* pszFileName)
{
	ShellExecuteA(GetDesktopWindow(), "open", pszFileName, NULL, NULL, SW_SHOW);
}

#include<iostream>
#include<fstream>
#include<string>
#include<cstdlib>
#include<sstream>

std::string ssystem(const char *command) {
	char tmpname[L_tmpnam];
	std::tmpnam(tmpname);
	std::string scommand = command;
	std::string cmd = scommand + " >> " + tmpname;
	std::system(cmd.c_str());
	std::ifstream file(tmpname, std::ios::in);
	std::string result;
	if (file) 
	{
		while (!file.eof())
		{
			result.push_back(file.get());
		}
		file.close();
	}
	remove(tmpname);
	return result;
}
#define _ENABLE_ATOMIC_ALIGNMENT_FIX
#include <boost/thread/thread.hpp>
#include <boost/atomic.hpp>
#pragma warning(push)
#pragma warning(disable: 4244) // possible loss of data
#include <boost/lockfree/queue.hpp>
#pragma warning(pop)


boost::atomic_int producer_count(0);
boost::atomic_int consumer_count(0);


const int iterations = 1000;
const int producer_thread_count = 4;
const int consumer_thread_count = 4;
class IJob
{
	std::string m_id;
	public:
	void run() {}

};
class JobManager
{
	boost::lockfree::queue<int> queue1;
	boost::lockfree::queue<IJob*> queue2;
	boost::atomic<bool> done;
public:
	JobManager() : queue1(128), done(false)
	{

	}
	void producer(void)
	{
		for (int i = 0; i != iterations; ++i) {
			int value = ++producer_count;
			while (!queue1.push(value))
				;
		}
	}
	
	void consumer(void)
	{
		int value;
		while (!done) {
			while (queue1.pop(value))
				++consumer_count;
		}

		while (queue1.pop(value))
			++consumer_count;
	}
	void run()
	{
		using namespace std;


		boost::thread_group producer_threads, consumer_threads;

		for (int i = 0; i != producer_thread_count; ++i)
			producer_threads.create_thread(boost::bind(&JobManager::producer, this));
		//boost::thread workerThread(boost::bind(&DataFilterSetupWindow::doGetColumnValues, this));
		for (int i = 0; i != consumer_thread_count; ++i)
			consumer_threads.create_thread(boost::bind(&JobManager::consumer, this));

		producer_threads.join_all();
		done = true;

		consumer_threads.join_all();

		cout << "produced " << producer_count << " objects." << endl;
		cout << "consumed " << consumer_count << " objects." << endl;
	}

};
#include <concurrent_vector.h>
int counter = 0;
std::vector<int> vec;
concurrency::concurrent_vector<int> cvec;
boost::atomic<int> acounter(0);
// mutex to lock critical region
boost::mutex mylock;

void push2vector() {
	try {
		for (int i = 0; i < 1000000; i++){
			// increment here will generate repeated values in the vector
			//counter++;
			mylock.lock();
			// increment here is thread safe
			counter++;
			// push back to the vector when the mutex is locked
			// using the concurrent vector has the same effect
			vec.push_back(counter);
			mylock.unlock();
		}
	}
	catch (std::exception e) {
		std::cout << "counter = " << counter << std::endl;
		std::cerr << e.what() << std::endl;
	}

}
void push2vector2() {
	try {
		for (int i = 0; i < 1000000; i++){
		
			acounter++;
			
			cvec.push_back(acounter);
			
		}
	}
	catch (std::exception e) {
		std::cout << "counter = " << acounter << std::endl;
		std::cerr << e.what() << std::endl;
	}

}
int mainaa() {

	for (int i = 0; i < 10; i++) {
		counter = 0;
		vec.clear();

		std::thread t1(push2vector);
		std::thread t2(push2vector);

		t1.join();
		t2.join();

		std::sort(vec.begin(), vec.end());

		bool repeated = false;
		for (int j = 0; j < vec.size() - 1; j++) {
			repeated |= (vec[j] == vec[j + 1]);

		}

		std::cout << (repeated ? "repeat" : "no repeat") << std::endl;
		/*
		std::for_each(vec.begin(), vec.end(), [](int x){
		std::cout << x << std::endl;
		});
		*/

		system("pause");
	}

	return 0;
}
int mainbb() {

	for (int i = 0; i < 10; i++) {
		acounter = 0;
		cvec.clear();

		std::thread t1(push2vector2);
		std::thread t2(push2vector2);

		t1.join();
		t2.join();

		std::sort(cvec.begin(), cvec.end());

		bool repeated = false;
		for (int j = 0; j < cvec.size() - 1; j++) {
			repeated |= (cvec[j] == cvec[j + 1]);

		}

		std::cout << (repeated ? "repeat" : "no repeat") << std::endl;
		

		system("pause");
	}

	return 0;
}
#include <windows.h>
#include <tlhelp32.h>
bool IsProcessRunning(const wchar_t *processName)
{
	bool exists = false;
	PROCESSENTRY32 entry;
	entry.dwSize = sizeof(PROCESSENTRY32);

	HANDLE snapshot = CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS, NULL);

	if (Process32First(snapshot, &entry))
		while (Process32Next(snapshot, &entry))
			if (!wcsicmp(entry.szExeFile, processName))
				exists = true;

	CloseHandle(snapshot);
	return exists;
}

HANDLE exists()
{
	HANDLE h = CreateMutexA(0, FALSE, "Local\\ATRT"); // try to create a named mutex
	if (GetLastError() == ERROR_ALREADY_EXISTS) // did the mutex already exist?
		return NULL; // quit; mutex is released automatically
	return h;

}
class IResourceManager
{
public:
	virtual std::string getId()=0;
};
class Man1 : public IResourceManager
{
public:
	virtual std::string getId() { return "man1"; }
	std::string getMethod() { return "method"; }

};
class Man2 : public IResourceManager
{
public:
	virtual std::string getId() { return "man2"; }
	std::string getMethod2() { return "method2"; }

};

/*
The purpose of this class is to colocate all the fw singletons into a single place to get the manager objects and remove all
the singletons, and lazy create them as needed by the application. When the behavior of an existing singleton is well understood 
we can then remove it from here and just make it an aggreate of its owning class(es) and or passed shared refs to the ctors.

*/
#include <mutex>
class ResourceManagerFactory
{
	struct FlagHolder
	{
		mutable std::once_flag m_flag;
	};
	std::shared_ptr<Man1> m_Man1;
	std::shared_ptr<Man2> m_Man2;
	mutable std::once_flag flags[2];
	
public:
	ResourceManagerFactory() :m_Man1(NULL), m_Man2(NULL)
	{
		

	}
	template <class type> void initter(type a)
	{
		a = std::make_shared<type>();
	}
	
	void do_init() 
	{
		m_Man1 = std::make_shared<Man1>();
	}
	void do_init2()
	{
		m_Man2 = std::make_shared<Man2>();
	}
public:
	
	const std::shared_ptr<Man1> getMan1()
	{
//		std::call_once(flags[0], &ResourceManagerFactory::initter<std::shared_ptr<Man1>>, this, m_Man1);
		return m_Man1;
	}
	const std::shared_ptr<Man2> getMan2()
	{
		std::call_once(flags[1], &ResourceManagerFactory::do_init2, this);
		return m_Man2;
	}
};

struct expensive_data
{
	std::string name;
	expensive_data(const char *ref){ name = ref; }
};
class lazy_init
{
	mutable std::once_flag flag;
	mutable std::unique_ptr<expensive_data> data;

	void do_init() const
	{
		
		data.reset(new expensive_data("TTTTT"));
	}
public:
	expensive_data const& get_data() const
	{
		std::call_once(flag, &lazy_init::do_init, this);
		return *data;
	}
};
#include <boost/log/utility/setup/common_attributes.hpp>
#include <boost/log/trivial.hpp>
#include <boost/log/utility/setup/file.hpp>
#include <boost/log/sources/severity_channel_logger.hpp>
void logTest()
{
	std::string dir = "c:/data";
	std::string fileName = "cctest";
	boost::log::sources::severity_channel_logger<boost::log::trivial::severity_level, std::string> logger;

	boost::log::register_simple_formatter_factory< boost::log::trivial::severity_level, char >("Severity");
	boost::log::add_common_attributes();
	std::string fName = dir + "/" + fileName + "_%Y-%m-%d_%H-%M-%S-%5N.log";
	boost::log::add_file_log(
		boost::log::keywords::file_name = fName,
		boost::log::keywords::auto_flush = true,
		boost::log::keywords::rotation_size = 1 * 1024,
		boost::log::keywords::open_mode = std::ios::out | std::ios::app,
		boost::log::keywords::format = "[%TimeStamp%] [%ProcessID%] [%ThreadID%] [%Channel%] [%Severity%]: %Message%")->locked_backend()->set_file_collector
		(boost::log::sinks::file::make_collector
		(boost::log::keywords::target = dir
		, boost::log::keywords::max_size = 10 * 1024 // just for test limit to 200K
		)
		);


	for (int x = 0; x < 5; ++x)
	{
		for (int i = 0; i < 1000; ++i)
		{
			BOOST_LOG_CHANNEL_SEV(logger, "testing", boost::log::trivial::severity_level::info) << "hello";
		}
	}
	boost::log::core::get()->remove_all_sinks();
}
struct TestArg
{
	std::string m_name;
	TestArg(char *nm) : m_name(nm)
	{
		std::cout << "Hi arg" << m_name << std::endl;
	}
	TestArg() 
	{
		std::cout << "Hi ctro" << std::endl;
	}
	TestArg(const TestArg &obj)
	{
	
		m_name = obj.m_name;
		std::cout << "Hi copy ctor " << m_name << std::endl;
	}

};
class TestObj
{
	TestArg m_arg;;
public:
	TestObj(TestArg &n) : m_arg(n)
	{
		std::cout << "Hi ref" << m_arg.m_name << std::endl;
	}
	TestObj(TestArg n, bool b) : m_arg(n)
	{
		std::cout << "Hi copy" << m_arg.m_name << std::endl;
	}
};


int main(int argc, char* argv[])
{
	TestArg arg1("Test1");
	TestArg arg2("Test2");

	TestObj t(arg1);
	TestObj t2(arg2,true);

	return 0;
}
#include <boost/uuid/uuid.hpp>            // uuid class
#include <boost/uuid/uuid_generators.hpp> // generators
#include <boost/uuid/uuid_io.hpp>         // streaming operators etc.
int mainuuid(int argc, char* argv[])
{
	boost::uuids::uuid uuid = boost::uuids::random_generator()();
	std::ostringstream ss;
	ss << uuid;
	std::cout << ss.str() << std::endl;

		char* argv2[] = { "-l", "-o", "--out", "test" };
		
		int iTest = sizeof(argv2) / sizeof(argv2[0]);
		for (int i = 0; i < iTest; ++i)
		{
			std::cout << argv2[i] << std::endl;
		}
	

	return 0;
}
int mainaa(int argc, char* argv[])
{
	//JobManager j;
	//j.run();
	//printf()

	std:string theName = "C:/appdata6/atrt/1.0.0/atrt_ent/log/server.log";
	std::ifstream in(theName.c_str(), std::ios::in);
	if (!in.is_open())
	{
		
		return 1;
	}
	in.seekg(0, std::ios_base::end);
	size_t sz = in.tellg();
	in.seekg(0, std::ios_base::beg);
	std::cout << " ifstream  file size: " <<sz << std::endl;
	size_t CHUNK = 50000;
	if (sz < CHUNK)
	{
		std::stringstream contents;
		contents << in.rdbuf();
		std::string sRet = contents.str();
	}
	else
	{
		std::string contents;
		in.seekg(0, std::ios::end);
		contents.resize(CHUNK);
		in.seekg(0, std::ios::beg);
		in.read(&contents[0], contents.size());
		std::cout << contents << std::endl;
	}
	in.close();

	



}

int mainOld(int argc, char* argv[])
{
	
	std::string in;
	std::string s = ssystem("dir c:\\projects");
	std::istringstream iss(s);
	std::string line;
	while (std::getline(iss, line))
	{
		std::cout << "LINE-> " + line + "  length: " << line.length() << std::endl;
	}

	//std::set_terminate(myterminate);
	//std::cout << getCurrentDirectory() << std::endl;
	//setCurrentDirectory("c:\\users\\dfrantz");
	//std::cout << getCurrentDirectory() << std::endl;
	//cout << getPath() << endl;

	//hTest();
	//main222();
	//jsonTests();
	//poolTest();
	//view_debug("C:\\Users\\dfrantz\\Documents\\ATRT\\Output\\Analysis1\\20141022_142059\\High_Level_Report.html");

	//testresolve();
	//throw bad_exception();  // unhandled exception: calls terminate handler
	

	//rfile2();
	//setSystemEnv("DREW_TEST", "lalal");
	//std::string val = getStringRegKey("DREW_TEST");
	//printf("%s\n", val.c_str());

	//runSomething();
	//otherTest();
	//employee{ age, "surname", "forename", salary }
	//BParser::run();
	//BParser::run2(std::string("employee{ 12, \"surname\", \"forename\", 12.2 }") );
	//deleteIt();
	//otherTest();
	/*if (argc < 4)
	{
	  std::cout << "Usage: sync_client <server> <path>\n";
	  std::cout << "Example:\n";
	  std::cout << "  sync_client www.boost.org /LICENSE_1_0.txt\n";
	  return 1;
	}
	readAtrtHeartbeat(std::string(argv[1]), std::string(argv[2]), std::string(argv[3]));
   */


  return 0;
}

int _tmainold(int argc, _TCHAR* argv[])
{
	//test();
	// pooltest();
	//otherTest();
	//SimpleProfiler::getInstance().printResults();
	//SimpleProfiler::getInstance().deleteItems();
	
	return 0;
}
int foo()
{
	unsigned int n = boost::thread::hardware_concurrency() ;
	cout << "Threads " << n << endl;
	AlignTest1 t1;
	AlignTest2 t2;
	AlignTest3 t3;
	AlignTest4 t4;
	AlignTest4 t5;

	cout << "AlignTest1= " << sizeof(t1) << endl;
	cout << "AlignTest2= " << sizeof(t2) << endl;
	cout << "AlignTest3= " << sizeof(t3) << endl;
	cout << "AlignTest4= " << sizeof(t4) << endl;
	cout << "AlignTest5= " << sizeof(t5) << endl;

	char *nm = "c:\\src\\t.bin";
	Reader rr ;
	if(!rr.fileExists(nm))
	{
		rr.writeFile(nm);
	}
	rr.readFile(nm);
	return 0;
}

