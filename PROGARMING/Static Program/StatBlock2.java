class StatBlock2 {
    
    // Static block executes when the class is loaded
    static {
        test(); // Calling the static method `test()` inside the static block
    }

    // Main method executes after static blocks
    public static void main(String[] args) {
        System.out.println("From main method");
    }

    // Static method `test()`
    public static void test() {
        System.out.println("From test");
    }
}

// Execution Flow
// Class is loaded into memory → The static block executes first.

// Inside the static block, test() is called.

// test() prints "From test".

// After all static blocks execute, main() runs

// "From main method" is printed.