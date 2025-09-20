#include<iostream>
#include<random>
#include <cstdlib>   // for rand()
#include <ctime>
using namespace std;

int partition(int a[],int s,int e){
    srand(time(0));
    int pivot = s + rand() % (e - s + 1);
    int i = s;
    int j = e;
    while(i<j){
        while(a[i]<=a[pivot] && i < e) i++;
        while(a[j]>a[pivot] && j > s) j--;
        if (i < j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
    int t = a[pivot];
    a[pivot] = a[j];
    a[j] = t;
    return j;
}
void quciksort(int a[],int s,int e){
    if(s >= e ) return ;
    int part = partition(a,s,e);
    quciksort(a,s,part-1);
    quciksort(a,part+1,e);
    return;
}

int main(){
    int arr[] = {5,6,-5,8,9,14,2,53,1,-2};
    int n = sizeof(arr)/sizeof(arr[0]);
    quciksort(arr,0,n-1);
    for(int i =0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}