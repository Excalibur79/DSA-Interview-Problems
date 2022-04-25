package Greedy.JobSequencing;
import java.util.Arrays;

public class JobSequencingDSU {
    public static int parent[];
    public static int rank[];

    public static void makeSet(int n){
        parent = new int[n+1];
        rank = new int[n+1];
        for(int i=0;i<=n;i++){
            parent[i]=i;
            rank[i] = 0;
        }
    }

    public static int find(int u){
        if(parent[u]==u)return u;
        return parent[u] = find(parent[u]);
    }

    public static void union(int u,int v){
        u=find(u);
        v=find(v);
        parent[v] = u;
    }

    public static void main(String[] args) {
        int jobs[][] = {{2,30},{2,40},{1,10},{1,10}};
        Arrays.sort(jobs,(a,b)->b[1]-a[1]);
        makeSet(1000);
        int ans=0;
        for(int job[]:jobs){
            int d = Math.min(jobs.length,job[0]);
            d = find(d);
            if(d>0){
                union(d-1,d);
                ans+=job[1];                
            }
        }
        System.out.println(ans);
    }
}
