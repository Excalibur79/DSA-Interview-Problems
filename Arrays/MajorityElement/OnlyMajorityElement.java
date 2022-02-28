package Arrays.MajorityElement;


public class OnlyMajorityElement {

    public static int majorityElement(int arr[]){
        int num=-1,count=0;
        for(int data:arr){
           // System.out.println(num);
            if(count==0)
                num=data;
            if(data==num)
                count++;
            else{
                count--;
                // if(count==0)
                //     num=data;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,6,3,1,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
    
}