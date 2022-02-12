package Arrays.FindTheDuplicateNumber;

class Solution{
    int findDuplicate(int arr[]){
       int slow = arr[0],fast=arr[0];
       int ans=0;
       do{
        slow=arr[slow];
        fast=arr[arr[fast]];
       }while(slow!=fast);

       fast=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }

       return slow;
    }
}

public class Optimal {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[] = {1,2,3,4,3};
        System.out.println( obj.findDuplicate(arr));
    }
}
