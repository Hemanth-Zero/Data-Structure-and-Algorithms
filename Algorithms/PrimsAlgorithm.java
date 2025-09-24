public class PrimsAlgorithm {
    public void algorithm(){
        /*
           PrimsAlgorithm(G):
           {
                MST = {}
                Choose any start vertex s
                Let key[v] = ∞ for all v ∈ G
                key[s] = 0
                parent[v] = NIL for all v
                Q = set of all vertices   // or a min-heap keyed by key[v]
                while Q is not empty:
                    u = Extract-Min(Q)          // vertex with smallest key value
                    Add u to MST
                    for each neighbor v of u:
                        if v ∈ Q and weight(u,v) < key[v]:
                            key[v] = weight(u,v)
                            parent[v] = u
                            Decrease-Key(Q, v)  // update priority
                return MST = { (parent[v], v) | v ≠ s }
            }    
    */
    }
    public static void main(String[] args){

    }
}