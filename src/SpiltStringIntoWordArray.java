import java.util.Arrays;

public class SpiltStringIntoWordArray {
    public static void main(String[] args){
        String str = "My Name is Harshal";
        String[] words = str.split(" ");
        for (String word : words)
        {
            String firstLetters=word.substring(0,word.length()-1);
            String lastLetter=word.substring(word.length()-1);
            System.out.println(firstLetters+lastLetter.toUpperCase());
        }
        System.out.println(Arrays.toString(words));
    }
}
