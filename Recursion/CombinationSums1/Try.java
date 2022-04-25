package Recursion.CombinationSums1;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Try {
    public static List<List<Integer>> ans=new ArrayList<>();
    public static List<Integer> combination = new ArrayList<>();

    public static void recur(int candidates[],int target,int n ){
        if(target==0){
            ans.add(combination);
            return;
        }
        if(n==1 && target%candidates[n-1]==0){
            for(int i=0;i<target/candidates[n-1];i++)combination.add(candidates[n-1]);
            ans.add(combination);
            for(int )
            return;
        }
        if(candidates[n-1]<=target){
            combination.add(candidates[n-1]);
            recur(candidates,target - candidates[n-1],n);
            combination.remove(combination.size() - 1);
            recur(candidates,target,n-1);
        }
        else
         recur(candidates,target,n-1);

    }

    public static void main(String[] args) {
        int candidates[] = {2,3,6,7};
        Arrays.sort(candidates);
        int target = 7;
        recur(candidates,target,candidates.length);
        System.out.println(ans);
    }
}
