import java.util.Arrays;

public class CustomSortArray {
    public void main(String[] args) {
        //medium
        int[] arr ={11,1,2,1,5,6,5,8,9,2,2};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                boolean isSwapRequried=false;
                int currentNumber=arr[j];
                int nextNumber=arr[j+1];
                //here we are checking if current number is odd and next number is even then we need to swap

                if(currentNumber%2!=0 && nextNumber%2==0){
                    isSwapRequried=true;
                }
                /*
                 here we are checking if current and next number are same(ord or even)
                 and current number is greater than next number then we need to swap
                */
                else if ((currentNumber%2==nextNumber%2)&&currentNumber>nextNumber) {
                    isSwapRequried=true;
                }
                if(isSwapRequried)
                {
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}