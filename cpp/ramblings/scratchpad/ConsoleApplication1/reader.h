#pragma once

struct TestData
{
    char name[1024];
    int value1;
    int value2;
    
};
// filename.ep, 1000, 2000, 3000

class Reader
{
public:
	Reader(void);
	~Reader(void);

	void readFile(char *nm);
	bool fileExists(char *nm);
	void writeFile(char *nm);
	void readFileMapped(char *nm);
};
