package Arrays.TrappingRainwater;

public class Better {

    public static int trap(int height[]){
        int ans=0;
        int leftMaxArray[] = new int[height.length];
        int rightMaxArray[] = new int[height.length];

        //preprocesssing leftMaxArray       
        leftMaxArray[0] = height[0];
        for(int i=1;i<height.length;i++){
          leftMaxArray[i] = Math.max(height[i],leftMaxArray[i-1]);
        }
        //preprocessing rigthMaxArray
        rightMaxArray[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMaxArray[i] = Math.max(height[i],rightMaxArray[i+1]);
        }

        //calculating rain traps
        for(int i=0;i<height.length;i++){
            ans+=Math.min(leftMaxArray[i],rightMaxArray[i]) - height[i];
        }                
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{4,2,0,3,2,5}));
    }
}
