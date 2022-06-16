#include <iostream>
#include <string>
using namespace std;

bool isPal(string a,int i, int len){
	if(a[i] != a[len-1])
		return false;
	isPal(a,i+1,len-1);
	return true;
}	



int main()
{
	string a = "this";
	cout << isPal(a,0,a.length());
	return 0;
}
