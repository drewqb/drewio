#include "stdafx.h"
#include "reader.h"

#include <stdio.h>
#include <iostream>
#include <fstream>
#include <boost/iostreams/device/mapped_file.hpp> // for mmap
#include <boost/iostreams/stream.hpp>             // for stream
using namespace std;

Reader::Reader(void)
{
}

Reader::~Reader(void)
{
}


void Reader::readFileMapped(char *nm)
{
	//boost::iostreams::mapped_file_source mmap(nm);
	//boost::iostreams::stream<boost::iostreams::mapped_file_sink> is(mmap, std::ios::binary);

    //unsigned int size =is->size();
	//const char *pData = is->data();
	 boost::iostreams::mapped_file mmap(nm, boost::iostreams::mapped_file::priv);
	 char* pData = mmap.data();//.const_data();
    unsigned int size =  mmap.size();

	unsigned idx =0;
    while(idx<size)
    { 
        TestData p_Data;
		
        //binary_file2.seekg(i*sizeof(TestData));
        //binary_file2.read(reinterpret_cast<char *>(&p_Data),sizeof(TestData));
		p_Data = *reinterpret_cast< TestData *>(pData);
		
        cout<<p_Data.name<<endl;
		cout<<"Value1: "<< p_Data.value1<<endl;
		cout<<"Value2: "<< p_Data.value2<<endl;
		pData+=sizeof(TestData);
		idx+=sizeof(TestData);

		char *pother= reinterpret_cast< char *>(pData);
		pData+=512;
		idx+=512;
		
		unsigned char *c1 = reinterpret_cast< unsigned char *>(pData);
		pData+=1;
		idx+=1;
		unsigned char *c2 = reinterpret_cast< unsigned char *>(pData);
		pData+=1;
		idx+=1;

		cout<<"Other : "<<pother<<endl;
		cout<<"C1 : "<<*c1<<endl;
		cout<<"C2 : "<<*c2<<endl;
    }
   
}
struct Slots
{
	char other[512];
	unsigned char c1;
	unsigned char c2;
};

void Reader::readFile(char *nm)
{
	fstream binary_file2(nm,ios::binary|ios::in| ios::ate );
    int size = binary_file2.tellg();
	binary_file2.seekg(0);
    for(int i = 0; i<5;i++)//size/sizeof(TestData); i++)
    { 
        TestData p_Data;
		Slots slots;
        //binary_file2.seekg(i*sizeof(TestData));
        binary_file2.read(reinterpret_cast<char *>(&p_Data),sizeof(TestData));
		binary_file2.read(reinterpret_cast<char *>(&slots), sizeof(Slots));
	
        cout<<p_Data.name<<endl;
		cout<<"Value1: "<< p_Data.value1<<endl;
		cout<<"Value2: "<< p_Data.value2<<endl;
		cout << "Other: " << slots.other << endl;
		cout << "c1: " << slots.c1 << endl;
		cout << "c2: " << slots.c2 << endl;
		
    }
    binary_file2.close();

}
bool Reader::fileExists(char *nm)
{
	fstream file;
	file.open(nm, ios::in | ios::out | ios::binary);

	if (file.fail())
	{
		cout << "ERROR: Cannot open the file..." << endl;
		return false;
	}
	return true;
}

void Reader::writeFile(char *nm)
{
	fstream binary_file(nm,ios::out|ios::binary|ios::app);

	for(int x=0;x<5;x++)
	{
		TestData me;
		sprintf_s(me.name, "Data%d", x);
		//strcpy_s(me.name, "Data");
		me.value1=x;
		me.value2=x+20;
		
		
		binary_file.write(reinterpret_cast<char *>(&me),sizeof(TestData));

		char other[512];
		unsigned char c1='c';
		unsigned char c2='d';
		sprintf_s(other, "Other %d", x);
		binary_file.write(reinterpret_cast<char *>(&other),512);
		binary_file.write(reinterpret_cast<char *>(&c1),1);
		binary_file.write(reinterpret_cast<char *>(&c2),1);

	}
	binary_file.close();
}