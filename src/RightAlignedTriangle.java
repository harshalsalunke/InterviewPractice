public class RightAlignedTriangle {
    public static void main(String[] args) {
        // More than Easy
        int row=5;
        for(int i=0;i<=row-1;i++)
        {
            for(int j=1;j<=row-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=row-i;k<=row;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
