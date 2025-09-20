#include<iostream>
#include<algorithm>
#include<climits>
using namespace std;

int crosssum(int a[],int s,int mid,int e){
    int leftsum = INT_MIN;
    int sum =0;
    for ( int i = mid ; i>=s ; i--){
        sum += a[i];
        if(leftsum<sum){
            leftsum = sum;
        }
    }
    int rightsum = 0;
    sum =0;
    for ( int i = mid+1 ; i<=e ; i++){
        sum += a[i];
        if(rightsum<sum){
            rightsum = sum;
        }
    }

    return leftsum+rightsum;
}

int DnCmaxsub(int a[],int s,int e){
    if(s == e) return a[s];
    int mid = (s+e)/2;
    int left = DnCmaxsub(a,s,mid);
    int right = DnCmaxsub(a,mid+1,e);
    int center = crosssum(a,s,mid,e);

    return max({left,right,center});


}


int main(){
    int arr[] = {1,4,-3,6,-20,0,12};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout<<DnCmaxsub(arr,0,n-1);

}