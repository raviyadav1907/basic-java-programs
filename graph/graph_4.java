import java.util.Collections;
import java.util.ArrayList;
import java.util.Queue;

import javax.print.attribute.standard.MediaSize.Other;

import java.util.LinkedList;
import java.util.PriorityQueue;

class graph_4{

    static class edge{
        int src;
        int nbr;
        int wt;
        edge(int v1 , int v2 , int wt){
            this.src = v1 ;
            this.nbr = v2 ;
            this.wt = wt ;
        }
    }

    public static void AddEdge(ArrayList<ArrayList<edge>> graph , int src , int nbr , int wt ){
        graph.get(src).add(new edge(src, nbr, wt));
        graph.get(nbr).add(new edge(nbr, src, wt));
    }

    public static void display(ArrayList<ArrayList<edge>> graph){
        for(int i = 0 ; i<graph.size() ; i++){
            System.out.print(i + " -> ");
            for( int j = 0 ; j<graph.get(i).size() ; j++){
                edge ce = graph.get(i).get(j);
                System.out.print("["+ ce.nbr + "@"+ce.src + "]");
            }
            System.out.println();
        }
    } 

    static class bfsHelper{
        int vtx;
        String path;
        int cost;
        bfsHelper( int v, String p, int c ){
            this.vtx = v; this.path = p; this.cost = c;
        }
        public int camparedTO(bfsHelper other){
            return this.cost - other.cost;
        }
    }

    public static void dijkstra(ArrayList<ArrayList<edge>> graph, int s){
        PriorityQueue<bfsHelper> qu = new PriorityQueue<>();
        //PriorityQueue<bfsHelper> pq = new PriorityQueue<>{Collections.reverseOrder()}; max PriorityQueue
        boolean[] visited = new boolean[graph.size()];
        bfsHelper root = new bfsHelper(s, ""+s+" -> ",0) ;
        qu.add(root);
        while( qu.size() > 0 ){
            // remove
            bfsHelper cv = qu.remove();
            // mark
            if( visited[cv.vtx] ){
                continue;
            }else{
                visited[cv.vtx] = true;
            }
            // work
            System.out.println( cv.path +" @ "+cv.cost );
            // add nbrs
            for( int e =  0 ; e < graph.get(cv.vtx).size() ; e++ ){
                edge ce = graph.get(cv.vtx).get(e);
                if( visited[ce.nbr] == false ){
                    bfsHelper newvtx = new bfsHelper( ce.nbr, cv.path + ce.nbr+" -> ",cv.cost+ce.wt);
                    qu.add(newvtx);
                }
            }
        }
    }

    static class primsHelper implements Comparable<primsHelper>{
        int vtx;
        int par;
        int wt;
        primsHelper(int v, String p, int c){
            this.vtx = v;
            this.par = p;
            this.wt = c;
        }
        public int camperTo(primsHelper Other){
            return this.wt - Other.wt;
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<edge>> graph = new ArrayList<>() ;
        for(int i = 0 ; i <= 6 ; i++){
            graph.add(new ArrayList<edge>());
        }
        AddEdge(graph, 0, 1, 10);
        AddEdge(graph, 0, 3, 40);
        AddEdge(graph, 1, 2, 10);
        AddEdge(graph, 2, 3, 10);
        AddEdge(graph, 2, 5, 20);
        AddEdge(graph, 3, 4, 2);
        AddEdge(graph, 4, 5, 3);
        AddEdge(graph, 5, 6, 3);
        AddEdge(graph, 4, 6, 8);
        boolean[] visited = new boolean[graph.size()];
        display(graph);
        System.out.println();   
        dijkstra(graph, 0);
    }

}