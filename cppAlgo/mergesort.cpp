#include<iostream>

using namespace std;


void merge(int a[],int s,int e,int mid){
     int n1 = mid - s + 1;
    int n2 = e - mid;

    // temp arrays
    int left[n1], right[n2];

    // copy into left and right
    for (int i = 0; i < n1; i++) left[i] = a[s + i];
    for (int j = 0; j < n2; j++) right[j] = a[mid + 1 + j];

    // merge two sorted arrays
    int i = 0, j = 0, k = s;
    while (i < n1 && j < n2) {
        if (left[i] <= right[j]) {
            a[k++] = left[i++];
        } else {
            a[k++] = right[j++];
        }
    }

    // copy remaining elements
    while (i < n1) a[k++] = left[i++];
    while (j < n2) a[k++] = right[j++];
}

void mergesort(int a[],int s, int e){
    if(s>=e) return ;
    int mid = (s+e)/2;
    mergesort(a,s,mid);
    mergesort(a,mid+1,e);
     merge(a,s,e,mid);

}

int main(){

    int a[] = {2, 5 ,4, 8,94,125,-8,-6,7};
    int n = sizeof(a)/sizeof(a[0]);
    mergesort(a,0,n-1);
    for(int i =0;i<n;i++){
        cout<<a[i]<<" ";
    }
}