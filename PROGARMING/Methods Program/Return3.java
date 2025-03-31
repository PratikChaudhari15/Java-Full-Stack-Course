class Return3
{
    public static void main (String[]Args)
    {
        System.out.println("Calling multi() method...");
        int result = multi(22, 44);
        System.out.println("Returned value from multi(): " + result);
    }   
    public static int multi(int a,int b)
    {
        System.out.println("Inside multi() method: a = " + a + ", b = " + b);
        int res = a * b;
        System.out.println("Multiplication result: " + res);
        return res;
    }
}