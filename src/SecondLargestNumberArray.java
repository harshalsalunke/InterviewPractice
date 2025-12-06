import java.util.Arrays;

public class SecondLargestNumberArray {
    public static void main(String[] args)
    {
        int arr[]={2,45,5,45,41,71,118,6,9,0};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i : arr)
        {
            if(i>=largest){
                secondLargest=largest;
                largest=i;
            } else if (i>secondLargest) {
                secondLargest=i;
            }
        }
        System.out.println("Second largest number is:"+secondLargest);
        Arrays.stream(arr).sorted().skip(arr.length-2).findFirst().ifPresent(System.out::println);
    }
}
