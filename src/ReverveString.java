public class ReverveString {
    public static void main(String[] args){
        String str="My Name is Harshal";
        String reverse = "";
        for(int i = str.length()-1;i>-1;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);

        // different method
        System.out.println(new StringBuilder(reverse).reverse());
    }
}
