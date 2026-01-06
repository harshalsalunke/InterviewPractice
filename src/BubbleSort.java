import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int arr[]={1,0,2,3,2,5,2,2,0};
        int arrLenth=arr.length;
        for(int i = 0 ; i< arrLenth-1;i++){

            for(int j =0 ; j < arrLenth-1-i;j++)
            {
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]= arr[j]-arr[j+1];
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
