#include "StdAfx.h"
#include "ZipFileLoader.h"
#include <iostream>
#include <sstream>
#include <string>
#include <fstream>

#include <boost/iostreams/filtering_streambuf.hpp>

#include <boost/iostreams/copy.hpp>
#include <boost/iostreams/filter/gzip.hpp>
#include <boost/iostreams/stream.hpp>

ZipFileLoader::ZipFileLoader(const char *path) : m_file(path, std::ios_base::in | std::ios_base::binary)
{
	boost::iostreams::filtering_ostream os;
    in.push( boost::iostreams::gzip_decompressor());
    in.push(m_file);
	
	//boost::iostreams::copy(in, std::cout);
  
    //Cleanup
    //file.close();

}

ZipFileLoader::~ZipFileLoader(void)
{
}

/*

int main() 
{
    using namespace std;

    ifstream file("hello.gz", ios_base::in | ios_base::binary);
    filtering_streambuf<input> in;
    in.push(gzip_decompressor());
    in.push(file);
    boost::iostreams::copy(in, cout);
}*/
