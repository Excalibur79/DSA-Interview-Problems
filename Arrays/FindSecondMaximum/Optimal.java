package Arrays.FindSecondMaximum;
public class Optimal {
    public static void main(String[] args) {
        int arr[] = {1,0,7,7,1};
        int secondMax = -1;
        int firstMax = arr[0];
        for(int data:arr){
            if(data>firstMax){
                secondMax=firstMax;
                firstMax = data;
            }
            else if(data>secondMax && data<firstMax)
                secondMax = data;
        }
        System.out.println(secondMax);
    }
}
