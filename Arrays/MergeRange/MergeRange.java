package Arrays.MergeRange;
import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int rangeP2[] = intervals[i];
            int rangeP1[] =  ans.get(ans.size()-1);
            if(rangeP2[0]<=rangeP1[1]){
                ans.remove(ans.size()-1);
                int newRange[] = {Math.min(rangeP1[0],rangeP2[0]),Math.max(rangeP1[1],rangeP2[1])};
                ans.add(newRange);
            }
            else{
                ans.add(rangeP2);
            }
        }
       
        return ans.toArray(new int[0][]);
    }
}



class MergeRange {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[][]={{}};
        System.out.println( obj.merge(arr));
    }
    
}