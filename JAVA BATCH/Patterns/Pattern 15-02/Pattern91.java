class Pattern91 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for (int i = 1; i <= n; i++) 
        {
            int num = i;
            int diff = n-1;
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(num + " ");
                num += diff--; // Increase by decreasing values of n-j
            }
            System.out.println();
        }
    }
}

/*
1 
2 6 
3 7 10
4 8 11 13
5 9 12 14 15
		*/
		
