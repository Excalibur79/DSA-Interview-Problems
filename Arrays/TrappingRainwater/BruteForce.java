package Arrays.TrappingRainwater;

public class BruteForce {

    public static int trap(int height[]){
        int ans=0;
        for(int i=0;i<height.length;i++){          
            int leftMax=i;
            int rightMax=i;
            //finding right
            for(int j=i+1;j<height.length;j++){
               rightMax =  height[j]>height[rightMax]?j:rightMax;
            }
            //finding left
            for(int j=i-1;j>=0;j--){
                leftMax = height[j]>height[leftMax]?j:leftMax;
            }
            if(leftMax!=-1 && rightMax!=-1){
               // System.out.println(Math.min(height[leftMax],height[rightMax]) - height[i]+" "+i);
                ans+=Math.min(height[leftMax],height[rightMax]) - height[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(trap(new int[]{4,2,0,3,2,5}));
    }
    
}