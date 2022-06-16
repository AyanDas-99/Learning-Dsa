#include <iostream>
using namespace std;

long sum(int n){
	if(n==1)
		return 1;
	return n+sum(n-1);
}

int main()
{
//	int a;
//	cin>>a;
	cout << sum(cin);
	return 0;
}
