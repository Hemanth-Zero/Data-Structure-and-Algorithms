public class kadenalgo{
    /*the following code contains kaden algorithm
    which is used for find max sum subarray in given an array
    */
   static int kaden_algorithm(int[] input){
        int n = input.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start=0;
        int arrstart =0;
        int end=0 ;
        for(int i =0 ; i < n ; i++ ){
            if(sum<0) {
                start = i;
                sum =0;
            }
            sum+= input[i];
            if(sum > max){
                arrstart = start;
                max = sum;
                end = i;
            }
        }
        System.out.print(arrstart+" "+ end);
        return max;
   }
   public static void main(String[] args){
    int[] input = {5,7,-10,25,6,-12,9,-20,14,2,53,1,-2};
    int[] input2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.print("\nmax "+ kaden_algorithm(input));
   }
}