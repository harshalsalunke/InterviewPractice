public class LeftAlignedTriangle {
    public static void main(String[] args) {
//Easy
        int row=5;
        for(int i=1;i<=row;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println();
        }
    }
}
