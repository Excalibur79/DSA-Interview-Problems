package Arrays.MergeSort;

public class MergeSort {

    public static int temp[];

    public static void merge(int arr[],int l,int mid,int h){
        int i=l;
        int j = mid+1;
        int k=l;
        while(i<=mid && j<=h){
            if(arr[i]<=arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        while(i<=mid)temp[k++]=arr[i++];
        while(j<=h)temp[k++] =arr[j++];
        for(i=l;i<=h;i++)
            arr[i] = temp[i];
    }

    public static void mergeSort(int arr[],int l,int h){
        if(l<h){
            int mid = (l+h)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, h);
            merge(arr,l,mid,h);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,1,2,1,6};
        temp = new int[arr.length];
        mergeSort(arr,0,arr.length-1);
        for(int data:arr)
            System.out.print(data+" ");
    }
    
}