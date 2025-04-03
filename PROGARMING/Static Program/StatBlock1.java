class StatBlock1 {
    
    // First static block (executed before main method)
    static {
        System.out.println("From Static Block 1");
    }
    // Main method (executes after all static blocks)
    public static void main(String[] args) {
        System.out.println("From Method Block");
    }
    
    // Second static block
    static {
        System.out.println("From Static Block 2");
    }

    // Third static block
    static {
        System.out.println("From Static Block 3");
    }

    
}
