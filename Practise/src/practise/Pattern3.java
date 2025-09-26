package practise;

public class Pattern3
{
    public static void main(String[] args) {
        int num = 4;
        //int a= 0;
        for (int i = 1 ; i<=num;i++)
        {
            for (int k=3; k>=i;k--)
            {
                System.out.print(" ");
            }
            for (int j = 1 ; j<=i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
