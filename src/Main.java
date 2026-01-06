import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // String Reverse
        String str = "Harshal";
        char[] chars =str.toCharArray();
        for(int i = str.length()-1;i>-1;i--){
            System.out.println(chars[i]);

        }
        StringBuffer newStr=new StringBuffer(str);
        newStr.reverse();
        System.out.println(newStr);
        // fibonachi
        System.out.println("Fibonachi");
        int a=0,b=1,c=0,lenth=5;
        while(lenth>-1)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            lenth--;
        }
        System.out.println("Max number from array");
        int[] arr={19,45,86,88,99,0,1,75};
        int max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
            }
        System.out.println("Max number is:"+max);
        Arrays.stream(Arrays.stream(arr).toArray()).max().ifPresent(System.out::println);

        System.out.println("Find max number of char repeated in a sentence");
        String sen="My Name is Harshal ssssSalunke";
        sen=sen.toLowerCase().replaceAll(" ","");
        HashMap<Character,Integer> charCount=new HashMap<>();
        for(char c1 : sen.toCharArray())
        {
            if(charCount.containsKey(c1))
            {
                charCount.put(c1,charCount.get(c1)+1);
            }
            else
                charCount.put(c1,1);
        }
        System.out.println(charCount);

        char maxChar=' ';
        int maxCount=0;
        for(Map.Entry<Character, Integer> entry : charCount.entrySet())
        {
            if(entry.getValue()>maxCount)
            {
                maxCount=entry.getValue();
                maxChar=entry.getKey();
            }
        }
        System.out.println("Max char is:"+maxChar+" and count is:"+maxCount);

System.out.println("Prime Number");
int num=13;
boolean isPrime=true;
for(int i=2;i<num;i++)
{
    if(num%i==0)
    {
        isPrime=false;
        break;
    }
}
if(isPrime)
    System.out.println(num+" is a prime number");
else
    System.out.println(num+" is not a prime number");



    }
}