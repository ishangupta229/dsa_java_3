import java.util.*;
public class BFS {

    static class edge {
        int source;
        int dest;
        int wt;

        edge(int s, int d, int w){
            this.source=s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static void BFS( AbstractList<edge> [] graph) {
        Queue <Integer> q = new LinkedList<>();
        
        boolean [] vis = new boolean[graph.length];
        for (int i = 0; i < vis.length; i++) vis[i] =false;
        q.add(0);
        vis[0] = true;
        while (!q.isEmpty()) {
            int tmp = q.remove();
            System.out.print(tmp + " -> ");
            for (int i = 0; i < graph[tmp].size(); i++) {
                edge g = graph[tmp].get(i);
                if(vis[g.dest]==false)
                {
                    q.add(g.dest);
                    vis[g.dest]= true;
                }
            }           
        }
        System.out.println("BFS");
        
    }

    public static void main(String[] args) {

        int v = 7;
        ArrayList <edge> [] graph = new ArrayList[v];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();            
        }

        //0
        graph[0].add(new edge(0,1,1));
        graph[0].add(new edge(0,2,1));

        //1
        graph[1].add(new edge(1,3,1));
        graph[1].add(new edge(1,0,1));

        //2
        graph[2].add(new edge(2,0,1));
        graph[2].add(new edge(2,4,1));

        //3
        graph[3].add(new edge(3,1,1));
        graph[3].add(new edge(3,4,1));
        graph[3].add(new edge(3,5,1));

        //4
        graph[4].add(new edge(4,2,1));
        graph[4].add(new edge(4,3,1));
        graph[4].add(new edge(4,5,1));

        //4
        graph[5].add(new edge(5,3,1));
        graph[5].add(new edge(5,4,1));
        graph[5].add(new edge(5,6,1));


        //4
        graph[6].add(new edge(6,5,1));

        BFS(graph);
    }
}
