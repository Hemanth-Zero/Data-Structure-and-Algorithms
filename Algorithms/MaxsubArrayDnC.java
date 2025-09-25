public class MaxsubArrayDnC {
    public void algorithm(){
        /*
            MaxsubArrayDnC(int[] a, int s,int e){
                if(s>= e) return a[s]
                mid = s+e/2
                L = MaxsubArrayDnC(a,s,mid)
                R = MaxsubArrayDnC(a,mid+1)
                crossSum = {
                    for(int i = mid ; i>= s ; i++){
                            sum+= a[i]
                            if(leftsum<sum) leftsum = sum
                    }   
                    for(int i = mid+1 ; i<= e ; i++)    
                        sum+=a[i]
                        if(rightsum < sum ) rightsum = sum
                    return leftsum+rightsum 
                }
                return max( L , R ,crossSum)
            }   
        */
    }
}