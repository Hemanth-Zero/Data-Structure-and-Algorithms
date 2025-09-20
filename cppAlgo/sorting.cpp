#include<iostream>
using namespace std;

void printer(int a[],int n){
    for(int i =0;i<n;i++){
        cout<<a[i]<<" ";
    }
    cout<<endl;
}

void insertionsort(int a[],int n){
    int t;
    for(int i=0;i<n;i++){
        for(int j = i;j<n;j++){
                if(a[i]>a[j]){
                    t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
        }
    }
    printer(a,n);
}


int partition(int a[],int s,int e){
    int pivot = s;
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
    int arr2[] = {5,6,-5,8,9,14,2,53,1,-2};
    int n = sizeof(arr)/sizeof(arr[0]);
    insertionsort(arr,n);
    quciksort(arr2,0,n-1);
    printer(arr2,n);
}