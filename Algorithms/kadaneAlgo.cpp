#include<iostream>
using namespace std;

void kadanealgo(int a[],int n){
    int max = a[0];
    int sum = 0;
    for(int i =0;i<n;i++){
        sum = sum + a[i];
        if(sum > max){
            max = sum;
         
        }
        cout<<i<<" "<<sum<<" "<<max<<endl;
        if(sum < 0) sum = 0;
    }
    cout<<max;
}

int main(){
    int arr[] = {5,6,-5,9,-20,14,2,53,1,-2};
    int n = sizeof(arr)/sizeof(arr[0]);
   int  a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    kadanealgo(arr,n);
    cout<<"\n 2nd"<<endl;
    kadanealgo(a,8);

}