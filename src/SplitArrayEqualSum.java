import java.util.ArrayList;
import java.util.Arrays;

public class SplitArrayEqualSum {
    public static void main(String[] args) {

        //Given an array of integers, check if it is possible to split the array into two parts such that the sum of elements in both parts is equal.
        int arr[]={1,2,3,4,2,8};
        int sum=0;
        int leftSum=0;
        for(int i : arr)
        {
            sum+=i;
        }
        if(sum%2!=0)
        {
            System.out.println("Not Possible");
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                leftSum+=arr[i];
                if(leftSum==sum-leftSum){
                    System.out.println("Possible");
                    System.out.println("Spliting Index "+i);
                    System.out.println("Array 1: " + Arrays.toString(Arrays.copyOfRange(arr, 0, i + 1)));
                    System.out.println("Array 2: " + Arrays.toString(Arrays.copyOfRange(arr, i + 1, arr.length)));
                    return;
                }

            }
            System.out.println("Not Possible");
        }
    }
}
