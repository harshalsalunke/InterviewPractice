import java.util.Arrays;

public class EvenSumFromArray {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,2,5,2,2};
        int sum=0;
        for(int i : arr)
        {
            if(i%2==0)
                sum+=i;
        }
        System.out.println(sum);
       int sumWithStream = Arrays.stream(arr).filter(i->i%2==0).sum();
       System.out.println("Sume using Stream: "+sumWithStream);
    }
}
