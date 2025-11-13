import java.util.*;
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
    public static void knapsnak(int weight[],int values[],int C){
        int n = weight.length;
        int value = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]) ); // MAX HEAP TAKE
        int ratio[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            ratio[i] = values[i]/weight[i];
            pq.add(new int[]{ratio[i],i});
        }
        while(C > 0 || !pq.isEmpty()){
            int[] item = pq.poll();
            int i = item[1];
            if(weight[i]<=C){
                System.out.println(values[i] + " "+ i);
                value += values[i];
                C -= weight[i];
            }
            else{
                value += (ratio[i]*C) ;
                System.out.println(ratio[i]*C + "  "+ i);
                C = 0;
            }
        }
        System.out.println(" "+value);
        return;
    }
    public static void main(String[] args){
        int[] weights = {3,4,2,1};
        int[] values = {1,2,3,4};
        knapsnak(weights,values,4);
    }
}