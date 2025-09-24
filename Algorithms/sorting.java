public class sorting{
    static void insertionsort(int[] a){
        for(int i =0;i<a.length;i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j]>key){
                a[j+1] =a[j];
                j--;
            }
            a[j+1] = key;
        }
    }
    static void printing(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void quicksort(int[] a,int s,int e){
        if(s>= e) return; 
        int pivot = partition(a,s,e);
        quicksort(a,s,pivot);
        quicksort(a,pivot+1,e);
    }
    static int partition(int[] a, int s,int e){
        //use pivot as random to get random qucicksort
        int pivot = s;
        int i = s;
        int j = e;
        while(i<j){
            while(i<=e && a[pivot]>a[i])i++;
            while(j>=s && a[pivot]< a[j] ) j--;
            if(i< j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

        }
        int temp = a[pivot];
        a[pivot ]= a[j];
        a[j] = temp;
        return j;
    }

    static void mergesort(int[] a,int s,int e){
        int mid = (s+e)/2;
        if(s<e){
            mergesort(a,s,mid);
            mergesort(a,mid+1,e);
        }
        int n1 = mid-s+1;
        int n2 = e - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for (int i = 0; i < n1; i++) left[i] = a[s + i];
        for (int j = 0; j < n2; j++) right[j] = a[mid + 1 + j];
        int i = 0, j = 0, k = s;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }   
        while (i < n1) a[k++] = left[i++];
        while (j < n2) a[k++] = right[j++];
    }

    public static void main(String[] args){
        int arr[] = {5,6,-5,8,9,14,2,53,1,-2};
        int arr2[] ={5,6,-5,8,9,14,2,53,1,-2};
        int arr3[] ={5,6,-5,8,9,14,2,53,1,-2};
        System.out.print("\n array  :");
        printing(arr);
        System.out.print("\n insertionsort :");
        insertionsort(arr);
        printing(arr);
        System.out.print("\n quicksort :");
        quicksort(arr2,0,arr2.length-1);
        printing((arr2));
        System.out.print("\n mergesort :");
        mergesort(arr3,0,arr3.length-1);
        printing(arr3);

    }
}