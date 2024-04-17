import java.util.*;
public class intro_graphs {

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

    public static void main(String[] args) {

        int v = 5;
        ArrayList <edge> [] graph = new ArrayList[v];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();            
        }

        //0
        graph[0].add(new edge(0,1,5));

        //1
        graph[1].add(new edge(1,0,5));
        graph[1].add(new edge(1,2,1));
        graph[1].add(new edge(1,3,3));

        //2
        graph[2].add(new edge(2,1,1));
        graph[2].add(new edge(2,3,1));
        graph[2].add(new edge(2,4,2));

        //3
        graph[3].add(new edge(3,1,3));
        graph[3].add(new edge(3,2,1));

        //4
        graph[4].add(new edge(4,2,2));

        //2's neighbour
        for (int i = 0; i < graph[2].size(); i++) {
            edge g = graph[2].get(i);
            System.out.println(g.dest);
        }
    }
}
