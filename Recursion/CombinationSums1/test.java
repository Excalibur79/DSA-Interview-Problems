package Recursion.CombinationSums1;
import java.util.*;

public class test {

    public static int dp(int candidates[],int sum,int n){
        if(sum==0)
            return 1;
        if(n==0)
            return 0;
        if(n==1){
            if(sum%candidates[n-1]==0)
                return 1;
            return 0;
        }
        if(candidates[n-1]<=sum){
            return dp(candidates, sum-candidates[n-1], n) + dp(candidates, sum, n-1);
        }
        return dp(candidates,sum,n-1);
    }
    public static void main(String[] args) {
        int candidates[] = {2};
        int sum = 1;
        int ans = dp(candidates,sum,candidates.length);
        System.out.println(ans);
    }
}
