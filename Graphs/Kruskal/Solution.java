package Graphs.Kruskal;
import java.util.*;

class Edge{
    int u;
    int v;
    int wt;
    Edge(int u,int v,int wt){
        this.u = u;
        this.v = v;
        this.wt = wt;
    }
}

class edgeComparator implements Comparator<Edge>{
    @Override
    public int compare(Edge a,Edge b){
        return a.wt-b.wt;
    }
}

public class Solution {
    public static List<Edge> edges=new ArrayList<>();
    public static int parent[] = new int[1000];
    public static int rank[] = new int[1000];

    static void makeSet(){
        for(int i=0;i<parent.length;i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }

    static int find(int u){
        if(parent[u]==u)
            return u;
        else
            return parent[u] = find(parent[u]);
    }

    static void merge(int u,int v){
        u = find(u);
        v = find(v);
        if(rank[u]>rank[v]){
            parent[v] = u;
        }
        else if(rank[v]>rank[u]){
            parent[u] = v;
        }
        else{
            parent[v] = u;
            rank[u]++;
        }
    }

    public static void main(String[] args) {
        // int arr[][] = {{7,6,1},{8,2,2},{6,5,2},{0,1,4},{2,5,4},
        // {8,6,6},{2,4,7},{7,8,8},{0,7,8},{1,2,8},{3,4,9},{5,4,10},
        // {1,7,11},{3,5,14}};
        int arr[][] = {{0,1,10},{0,2,6},{0,3,5},{1,3,15},{2,3,4}};
        makeSet();
        for(int data[]:arr){
            edges.add(new Edge(data[0],data[1],data[2]));
        }
        Collections.sort(edges,new edgeComparator());
        List<Edge> ans = new ArrayList<>();
        int wt=0;
        for(Edge edge:edges){
            if(find(edge.u)!=find(edge.v)){
                merge(edge.u,edge.v);
                ans.add(edge);
                wt+=edge.wt;
            }
        }
        for(Edge ansEdge:ans){
            System.out.println(ansEdge.u+"---"+ansEdge.v+" : "+ansEdge.wt);
        }  
        System.out.println(wt);
              
    }
}
