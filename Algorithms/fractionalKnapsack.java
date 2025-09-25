public class fractionalKnapsack {
    public void algorithm(){
        /*
            fractionalKnapsack(Item[] A,int capacity){
                Ratio[A.size] 
                Container = 0
                for(int i =0;i<n;i++)    -> n 
                    Ratio[i] = A[i].value / A[i].weight

                
                while(capacity > 0){   -> n 
                    i = maxvalue_index(Ratio)  -> log n
                    if(A[i].capacity < capacity){ 
                        Container+=A[i].value
                        capacity -= A[i].weight   
                    }else{
                            Container+= Ratio[i] * capacity
                            capacity = 0; 
                    }
                    Ratio.remove(i) ->log n
                }
            }


            Total Time complexity = O(n log n)
        */
    }
}