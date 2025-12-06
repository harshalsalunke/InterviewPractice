public class Triangle {
    public static void main(String[] args) {
        int row=5;
        for(int i=0;i<=row-1;i++)
        {
          for(int j = row-i; j>1;  j--)
          {
            System.out.print(" ");
          }
          for(int k=0;k<=i;k++)
          {
              System.out.print("* ");
          }

          System.out.println();
        }

    }
}
