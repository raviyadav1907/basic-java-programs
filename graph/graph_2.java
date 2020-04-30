import java.util.ArrayList;
class graph_2{

    static class edge{
        int src;
        int nbr;
        int wt;
        edge(int v1,int v2,int wt){
            this.src = v1;
            this.nbr = v2;
            this.wt = wt;
        }
    }

    public static void addEdge(ArrayList<ArrayList<edge>> graph ,int src , int nbr , int wt ){
        graph.get( src ).add(new edge(src,nbr,wt));
        graph.get( nbr ).add(new edge(nbr,src,wt));
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

    static int mincost = Integer.MAX_VALUE;
    static int maxcost = Integer.MIN_VALUE;
    static String minpath = "";
    static String maxpath = "";

    public static void longestAndShortestPaths(ArrayList<ArrayList<edge>> graph ,int  s,int d,boolean[] visited,String psf,int csf){
        if( s==d ){
            psf = psf + d;
            if(csf < mincost ){
                mincost = csf;
                maxpath = psf;
            }
            if(csf > maxcost){
                maxcost = csf;
                minpath = psf;
            }
            return ;
        }
        visited[s] = true;
        for( int e = 0 ; e < graph.get(s).size() ; e++ ){
            edge ce = graph.get(s).get(e);
            if( visited[ce.nbr] == false ){
                longestAndShortestPaths(graph, ce.nbr, d, visited, psf+s+" ->",csf + ce.wt );
            }
        }
        visited[s] = false;
    }

    static int cCost = Integer.MAX_VALUE;
    static int fCost = Integer.MIN_VALUE;
    static String cPath = "";
    static String fPath = "";

    public static void cAndPaths(ArrayList<ArrayList<edge>> graph ,int  s,int d,boolean[] visited,String psf,int csf,int factor){
        if(s==d){
            psf = psf + d ;
            if(csf >= factor ){
                if(cCost > csf){
                    cCost = csf ;
                    cPath = psf;
                }
            }
            if(csf <= factor){
                if(csf > fCost){
                    fCost = csf;
                    fPath = psf;
                }
            }
            return ;
        }
        visited[s] = true;
        for( int e = 0 ; e < graph.get(s).size() ; e++ ){
            edge ce = graph.get(s).get(e);
            if( visited[ce.nbr] == false ){
                cAndPaths(graph, ce.nbr, d, visited, psf+s+" ->",csf + ce.wt,factor);
            }
        }
        visited[s] = false;
    }

    public static void kthlargestpath(ArrayList<ArrayList<edge>> graph,int s,int d,int k){
        int factor = Integer.MAX_VALUE;
        // fCost = Integer.MIN_VALUE;
        boolean[] visited = new boolean[graph.size()];
        for(int i=0;i<k;i++){
            fCost = Integer.MIN_VALUE;
            cAndPaths(graph, s, d, visited, "", 0, factor);
            factor = fCost;
        }
        System.out.println(fPath +"@"+fCost);
    }

    public static void main(String[] args){

        ArrayList<ArrayList<edge>> graph = new ArrayList<>();

        for(int i = 0 ; i <= 6 ; i++){
            graph.add(new ArrayList<edge>());
        }
        addEdge(graph, 0, 1, 10);
        addEdge(graph, 0, 3, 40);
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 2, 3, 10);
        addEdge(graph, 3, 4, 2);
        addEdge(graph, 4, 5, 3);
        addEdge(graph, 5, 6, 3);
        addEdge(graph, 4, 6, 8);
        boolean[] visited = new boolean[graph.size()];

        longestAndShortestPaths(graph, 0, 0, visited,"", 0);
        cAndPaths(graph, 0, 0, visited, "", 0, factor);
        kthlargestpath(graph, s, d, k);

    }

}