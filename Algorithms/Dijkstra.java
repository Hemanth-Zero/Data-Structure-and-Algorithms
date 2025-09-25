public class Dijkstra {
        public void algorithm(){
            /*
            Dijkstra(Graph G, source):
                dist[] = {∞, ∞, ..., ∞}
                dist[source] = 0
                PQ = priority queue with (source, 0)

                while PQ is not empty:
                    (u, dist[u]) = extractMin(PQ)
                    for each edge (u, v) with weight w:
                        if dist[u] + w < dist[v]:
                            dist[v] = dist[u] + w
                            PQ.decreaseKey(v, dist[v])

                return dist;
            */
        }
}