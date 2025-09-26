package practise;
public class Pattern1 {
    public static void main(String[] args) {
        int num = 5;
        int a = 0;
        for (int i = 1; i<=num;i++)
        {
            for (int k = 1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for (int j = 5;j>=i;j--)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
