package practise;

public class Pattern2 {
    public static void main(String[] args) {
        int num = 10,a=0;

        for (int i = 1;i<=num ;i++)
        {
            a=i+a;
            int b = a;
            for (int j=1; j<=i;j++)
            {
                System.out.print((b--)+" ");
            }
            System.out.println();
        }
    }
}
