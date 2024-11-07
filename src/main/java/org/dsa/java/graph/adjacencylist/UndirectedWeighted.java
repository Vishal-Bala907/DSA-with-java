package org.dsa.java.graph.adjacencylist;

import java.util.ArrayList;

public class UndirectedWeighted {
    // Undirected and unweighted graph
    static class Edge {
         private int src;
         private int dst;
         private int weight;

         public Edge(int src, int dst, int weight) {
             this.src = src;
             this.dst = dst;
             this.weight = weight;
         }
     }

     public static void createGraph(ArrayList<Edge>[] graph) {
         for(int i=0; i<graph.length; i++) {
             graph[i] = new ArrayList<>();
         }

         graph[0].add(new Edge(0,2,2));
         graph[1].add(new Edge(1,2,10));
         graph[1].add(new Edge(1,3,0));
         graph[2].add(new Edge(2,0,2));
         graph[2].add(new Edge(2,3,-1));
         graph[2].add(new Edge(2,1,10));
         graph[3].add(new Edge(3,2,-1));
         graph[3].add(new Edge(3,1,0));

         // print 2's neighbours
         for(int i =0; i<graph[2].size(); i++) {
             System.out.print(graph[2].get(i).dst + " ");
         }
         System.out.println();
     }



    public static void main(String[] args) {
        final int VERTICES = 4;
        ArrayList<Edge>[] graph = new ArrayList[VERTICES];
        createGraph(graph);
        // print 2's neighbours
        for(int i =0; i<graph[2].size(); i++) {
            System.out.println(graph[2].get(i).dst + " WEIGHT : " +graph[2].get(i).weight );
        }

    }
}

/* (0)
    \     (3)
   2 \ -1/  \ 0
     (2)----(1)
         10

 */