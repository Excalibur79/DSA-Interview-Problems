package Greedy.FractionalKnapsack;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class itemComparator implements Comparator<Item>{
    @Override
    public int compare(Item a,Item b){
       return (int)((double)b.value/b.weight - (double)a.value/a.weight);
    }
}

class Solution
{
    //Function to get the maximum total value in the knapsack.
    public static double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr,new itemComparator());
        double ans=0;
        for(Item item:arr){
          if(W>0){
              if(item.weight<=W){
                  ans+=item.value;
                  W-=item.weight;
              }
              else{
                ans+=((double)item.value/item.weight)*(W);
              }
          }
          else break;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        int n,w;
        n = sc.nextInt();
        w = sc.nextInt();
        Item arr[] = new Item[n];
        for(int i=0;i<n;i++)
           arr[i]=new Item(sc.nextInt(),sc.nextInt());        
        System.out.println(fractionalKnapsack(w,arr, n))    ;

    }
}