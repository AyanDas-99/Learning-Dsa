#include <iostream>
using namespace std;
void toh(int n, char frompeg, char topeg, char auxpeg)
{
	if(n==1){
		cout<<"move disk 1 from peg "<<frompeg<<" to peg "<<topeg;
		return;
	}

	toh(n-1, frompeg, auxpeg, topeg);

	cout<<endl<<"move disk "<<n<<" from peg "<<frompeg<<" to peg "<<topeg<<endl;

	toh(n-1, auxpeg, topeg, frompeg);

}

int main(){
	int n;
	cin>>n;
	toh(n, 'A', 'B', 'C');
	cout <<endl;
	return 0;
}
