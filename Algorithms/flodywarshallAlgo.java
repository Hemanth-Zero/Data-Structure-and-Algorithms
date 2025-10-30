import java.util.*;
public class flodywarshallAlgo {
    static int infinity = Integer.MAX_VALUE/2;
    //flodywarshallAlgo isnt provided due to simple implementation
    
    static void flodywarshall(int a[][]){
        //let it be square 
        int n = a.length;
        for(int k = 0 ; k < n ; k++){
            for(int i =0;i<n;i++){
                for(int j = 0;j<n;j++){
                    if(a[i][j] >  a[i][k]+a[k][j] )
                        a[i][j] = a[i][k]+a[k][j];
                }
            }
        }
    }


    public static void main(String[] args){
        int adj[][] = {
            {0,3,8,infinity},
            {infinity,0,2,infinity},
            {infinity,infinity,0,1},
            {4,infinity,infinity,0}
        };

        flodywarshall(adj);

        int n = adj.length;
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j< n ; j ++){
                if(adj[i][j] != infinity)
                    System.out.print(adj[i][j]+" ");
                else
                    System.out.print("∞ ");
            }
            System.out.println("");
        }
        
    }
}