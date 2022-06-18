# include <iostream>
# include <vector>

using namespace std;


int main(){
	vector<int> v;
	v = {1,4,71,62,33,0,-5};

	for(int i=0;i<v.size()-1;i++){
		int ind;
		for(int j=i;j<v.size();j++){
			if(v[j]<=v[i])
				ind = j;
		}
		int temp = v[i];
		v[i] = v[ind];
		v[ind] = temp;
	}
	
	for(int i=0;i<v.size();i++)
		cout<<v[i]<<" ";	
	return 0;
}

