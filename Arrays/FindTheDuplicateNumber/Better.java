package Arrays.FindTheDuplicateNumber;
import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
       HashMap<Integer,Integer> hash = new HashMap<>();
        for(int data:nums){
            if(hash.containsKey(data))
                hash.put(data,hash.get(data)+1);
            else
                hash.put(data,1);
        }
        for(HashMap.Entry<Integer,Integer> data:hash.entrySet()){
          if(data.getValue()>1)
            return data.getKey();
        }
        return 1;
      
       
    }
}

public class Better {
    public static void main(String[] args) {
        Solution obj= new Solution();
        int arr[] = {1,2,3,4,3};
        System.out.println( obj.findDuplicate(arr));
    }
}