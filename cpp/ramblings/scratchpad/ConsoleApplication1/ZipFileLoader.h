#pragma once

#include <fstream>
#include <boost/iostreams/filtering_stream.hpp>


class ZipFileLoader 
{
    std::ifstream m_file;
	boost::iostreams::filtering_streambuf<boost::iostreams::input> in;

public:
	ZipFileLoader(const char *path);
	~ZipFileLoader(void);
	boost::iostreams::filtering_streambuf<boost::iostreams::input> &getBuffer(){return in;}
};
