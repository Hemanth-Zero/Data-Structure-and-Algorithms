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
}