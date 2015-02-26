#include <iostream>
#include <fstream>
#include <windows.h>

using namespace std;

unsigned int f_7 = 5, f_1 = 1;

unsigned int func(unsigned int n)
{
	if (n % 2 != 0)
		return 0;
	int f_7_temp = 0, f_1_temp = 0;
	for (int i = 0; i < (n / 2) - 1; i++)
	{	
		f_7_temp = 5 * f_7 + 4 * f_1;
		f_1_temp = f_7 + 2 * f_1;
		f_7 = f_7_temp;
		f_1 = f_1_temp;
	}
	return f_7;
}


int main()
{
	ifstream fin("tst.in");
	ofstream fout("tst.out");
	unsigned int n = 0;
	fin >> n;
	fout << func(n) << endl;
	system("PAUSE");
	return 0;
}