package org.dsa.java.graph.traversal;

/*
* Breadth first search
*   - Go to the immediate neighbours
*   ==> 0, 1, 2, 3, 4, 5, 6
*
*        (1)------(3)
*       /          |  \
*   (0)            |    (5)
*       \          |  /    \
*         (2)-----(4)       (6)
*
*   Uses A queue and a Array DS
*
* Steps {:::::::::::::::::::::::::::::::::::}
*
*  - select a stating point
*  - enqueue that element in the Queue
*  - Dequeue that element
*  - Print that element
*  - Enqueue all the neighbour
*
*  - Dequeue a element
*  - Visit that element
*       - if: any of its neighbour already in the visited array, then don't print it
*       - else: Print that element and push into Visited Array
*
* SO ON
*
*
* DFS depth first search
* visit and print all neighbour
* */

import org.dsa.java.graph.adjacencylist.UndirectedUnweighted;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSandDFS {

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

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));


        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));


        graph[6].add(new Edge(6,5));



        // print 2's neighbours
//        for(int i =0; i<graph[2].size(); i++) {
//            System.out.print(graph[2].get(i).dst + " ");
//        }

    }


    public static void bfs(int VERTICES ,  ArrayList<Edge>[] graphs) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[VERTICES];
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if(vis[curr] == false) {
                System.out.print(curr+" ");
                vis[curr] = true;

                for(int i =0; i<graphs[curr].size(); i++) {
                    Edge e = graphs[curr].get(i);
                    q.add(e.dst);
                }
            }
        }
    }


    public static void dfs(ArrayList<Edge>[] graphs, int curr , boolean[] vis) {

        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i =0; i<graphs[curr].size(); i++) {
            Edge edge = graphs[curr].get(i);
            if(vis[edge.dst] == false) {
                dfs(graphs, edge.dst, vis);
            }
        }

    }

    public static void main(String[] args) {
        final int VERTICES = 7;
        ArrayList<Edge>[] graph = new ArrayList[VERTICES];
        createGraph(graph);
//        bfs(VERTICES,graph);

        dfs(graph, 0 , new boolean[]{false,false,false,false,false,false,false});

    }

}
