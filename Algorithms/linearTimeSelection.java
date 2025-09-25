
public class linearTimeSelection {
    public void algorithm(){
        /*
            The algorithm for linear time selection is as follows 
            linearTimeSelection(A,k){
                0. if(|A| < 5) sort(A)  return A[k]  
                1. while i < n :     -> n
                2.      chunks[j] = chunks[i to i+5] 
                3.      medi[j] = medians(chunks[j])  -> 1
                4.      i = i+5; j++;
                5 median = linearTimeSelection(medi[0 to n/5]) -> T(n/5)
                6. L = {A[i] : A[i] < median }  -> n 
                7. R = {A[i] : A[i] > median }  -> n
                8.if k >|L| linearTimeSelection(R,k-|L|)   -> T(7n/10)
                9.else linearTimeSelection(L,k)  
            }

            total TimeComplexity = T(n/5) + T(7n/10) + O(n)
        */
    }
    public void linearTimeSelection(){

    }
    public static void main(String[] args){

    }
}