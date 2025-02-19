class Pattern90 {
    public static void main(String[] args) {
        int n = 5;
        int a = 0; 

        for (int i = 1; i <= n; i++) {
            a = i + a; // Update 'a' to hold sum of previous row value and current row number
            int b = a; // Store 'a' in 'b' for controlled decrementing

            for (int j = 1; j <= i; j++) {
                System.out.print(b-- + " "); // Print 'b' and decrement it (instead of 'a')
            }
            System.out.println(); // Move to the next line
        }
    }
}

/*
1
3 2
6 5 4 
10 9 8 7 
15 14 13 12 11 
*/
