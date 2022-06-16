#include <iostream>
#include "IsSorted.cpp"
using namespace std;

void reverse(int arr[],int i,int j)
{
	if(i==j)
		return;
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;

	reverse(arr,i+1,j-1);
}

int main()
{
	int arr[5] = {1,2,3,4,5};
//	reverse(arr,0,4);
	for(int i=0;i<5;i++)
		cout<<arr[i]<<" ";
	cout<<endl<<isArraySorted(arr,5);
	return 0;
}

