import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

import javax.print.attribute.Size2DSyntax;

class graph_3{

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

    public static void Hamiltonian_Path_and_Cycles(ArrayList<ArrayList<edge>> graph , int s ,ArrayList<Integer> psf , boolean[] visited , int os){
      if(psf.size() == graph.size() - 1 ){
          psf.add(s);
          for(int i = 0 ; i <psf.size() ; i++){
              System.out.print(psf.get(i)+"");
          }
          boolean isCycle = false ;
          for(int e=0;e<graph.get(s).size();e++){
              edge ce = graph.get(s).get(e);
              if(ce.nbr ==os){
                  isCycle = true ;
                  break ;
              }
          }
          if(isCycle){
              System.out.println(".");
          }
          System.out.println();
          psf.remove(psf.size()-1);
          return ;
      }
        visited[s] = true;
        psf.add(s);
        for( int e = 0 ; e < graph.get(s).size() ; e++ ){
            edge ce = graph.get(s).get(e);
            if( visited[ce.nbr] == false ){
                Hamiltonian_Path_and_Cycles(graph, ce.nbr, psf, visited,os);
            }
        }
        psf.remove(psf.size() -1 );
        visited[s] = false;
    }

    public static void getComponent(ArrayList<ArrayList<edge>> graph,ArrayList<Integer> comp,boolean[] visited,int s){
        visited[s] =true ;
        comp.add(s);
        for(int e=0;e<graph.get(s).size();e++){
            edge ce = graph.get(s).get(e);
            if(visited[ce.nbr] == false){
                getComponent(graph, comp, visited, ce.nbr);
            }
        }
    }

    public static int connectedComponent(ArrayList<ArrayList<edge>> graph){
        boolean[] visited = new boolean[graph.size()];
        int count = 0;
        for(int v = 0 ; v< graph.size();v++){
            if(visited[v]==false){
                count++;
                ArrayList<Integer> singleComp = new ArrayList<>();
                getComponent(graph,singleComp,visited,v);
                System.out.println(singleComp);
            }
        }
        return count ;
    }

    static class bfsHelper{
        int vtx;
        String path;
        int cost;
        bfsHelper( int v, String p, int c ){
            this.vtx = v;
            this.path = p;
            this.cost = c;
        }
    }

    public static void bfsTraversal(ArrayList<ArrayList<edge>> graph, int s){
        Queue<bfsHelper> qu = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];
        qu.add( new bfsHelper(s, ""+s+" -> ",0) );
        visited[0] = true;
        while( qu.size() > 0 ){
            // remove
            bfsHelper cv = qu.remove();
            // mark
            // if( visited[cv.vtx] ){
            //     continue;
            // }else{
            //     visited[cv.vtx] = true;
            // }
            // work
            System.out.println( cv.path +" @ "+cv.cost );
            // add nbrs
            for( int e =  0 ; e < graph.get(cv.vtx).size() ; e++ ){
                edge ce = graph.get(cv.vtx).get(e);
                if( visited[ce.nbr] == false ){
                    visited[ce.nbr] = true;
                    qu.add( new bfsHelper( ce.nbr, cv.path + ce.nbr+" -> ",cv.cost+ce.wt) );
                }
            }
        }
    }

    public static void main(String[] args){
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
        Hamiltonian_Path_and_Cycles(graph, 0, new ArrayList<>(), visited, 0);
        connectedComponent(graph);
        bfsTraversal(graph, 0);
    }

}