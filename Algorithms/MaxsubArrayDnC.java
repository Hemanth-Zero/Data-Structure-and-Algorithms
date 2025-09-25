public class MaxsubArrayDnC {
    public void algorithm(){
        /*
            MaxsubArrayDnC(int[] a, int s,int e){
                if(s>= e) return a[s]
                mid = s+e/2
                L = MaxsubArrayDnC(a,s,mid)     -> T(n/2)
                R = MaxsubArrayDnC(a,mid+1)     ->T(n/2)
                crossSum = {
                    for(int i = mid ; i>= s ; i++){   -> n/2
                            sum+= a[i]
                            if(leftsum<sum) leftsum = sum
                    }   
                    for(int i = mid+1 ; i<= e ; i++)     -> n/2
                        sum+=a[i]
                        if(rightsum < sum ) rightsum = sum
                    return leftsum+rightsum 
                }
                return max( L , R ,crossSum)
            }   

            Total TimeComplexity = 2T(n/2) + O(n) = O(n log n)
        */
    }
}