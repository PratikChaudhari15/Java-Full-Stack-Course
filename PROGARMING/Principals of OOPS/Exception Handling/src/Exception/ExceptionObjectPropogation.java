package Exception;

public class ExceptionObjectPropogation
{
    public static void main(String[] args) {
        try{
            divsion(10,0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Dont divide by zero");
        }
    }
    public static void divsion(int a,int b)
    {
        System.out.println(a/b);
    }
}
