class Method4
{
    public static void main (String[] Args)
    {
        int a = 10;  // 'a' is a local integer variable in main()
        System.out.println(a);
        test();  // Calling test() method
    }

    public static void test()
    {
        String a = "Pratik";  // 'a' is a local string variable in test()
        System.out.println(a);
    }
}
