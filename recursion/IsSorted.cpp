int isArraySorted(int A[], int n){
	if(n==1)
		return 1;
	if(A[n-1] < A[n-2])
		return isArraySorted(A, n-1);
	else
		return 0;
}

