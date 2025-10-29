import java.util.*;
public class Dijkstra {
        public void algorithm(){
            /*
            Dijkstra(Graph G, source):
                dist[] = {∞, ∞, ..., ∞}
                dist[source] = 0
                PQ = priority queue with (source, 0)

                while PQ is not empty:      -> V
                    (u, dist[u]) = extractMin(PQ)    -> log V
                    for each edge (u, v) with weight w:  ->E
                        if dist[u] + w < dist[v]:
                            dist[v] = dist[u] + w
                            PQ.decreaseKey(v, dist[v])  ->log V

                return dist;


                Total Time complexity = O( (V+E) log V) ~ O(E LogV)
            */
        }
        
        public static int Dijkstramethod(int adj[][]){
            int n = adj.length;
            boolean visited[] = new boolean[adj.length];
            int dist[] = new int[adj.length];
            Arrays.fill(dist,Integer.MAX_VALUE);
            dist[0] = 0;

            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
            pq.add(new int[]{0, 0});

            while(!pq.isEmpty()){
                int cur[] = pq.poll();
                int d = cur[0];
                int u = cur[1];

                if (visited[u]) continue;
                visited[u] = true;

                for(int v = 0 ; v < n ; v++){
                    if(!visited[v] && adj[u][v] != Integer.MAX_VALUE){
                        if(dist[v] > dist[u]+adj[u][v]){
                            dist[v] = dist[u]+adj[u][v];
                            pq.add(new int[]{dist[v], v});
                        }
                    }
                }
            }
            return dist[n-1];
        }

        public static void main(String[] args){
            int n = 5;
            int adj[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(adj[i], Integer.MAX_VALUE);
            }
            adj[0][1] = 4;
            adj[0][2] = 1;
            adj[1][3] = 1;
            adj[2][3] = 5;
            adj[1][4] = 5;
            adj[3][4] = 3;
            /*
                    (4)
                  0 ------ 1\
                  |        | \5
                 (1)      (1) \4 
                  |        |/3
                  2 ------ 3
                    (5)
            */
            System.out.println("Minmum dist : "+Dijkstramethod(adj));
            // 0 -> 1 - > 3 -> 4 
            //    4 +  1  +  3  = 8.
        }
}