package org.dsa.java.graph.adjacencylist;
import java.util.ArrayList;

public class UndirectedUnweighted {
    // Undirected and unweighted graph
    static class Edge {
        private int src;
        private int dst;

        public Edge(int src, int dst) {
            this.src = src;
            this.dst = dst;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,1));

        // print 2's neighbours
        for(int i =0; i<graph[2].size(); i++) {
            System.out.print(graph[2].get(i).dst + " ");
        }

    }



    public static void main(String[] args) {
        final int VERTICES = 4;
        ArrayList<Edge>[] graph = new ArrayList[VERTICES];
        createGraph(graph);
    }
}
