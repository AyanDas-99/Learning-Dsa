#include <iostream>
using namespace std;
int a=0;
void print(int n){
	a++;
	cout<<a<<endl;
	if(a==n)
		return;
	else
	return print(n);	
}

int main(){
	print(10);
	return 0;
}
