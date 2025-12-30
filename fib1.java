//Write a java program to find the Fibonacci series using recursive and non-recursive functions.

class fib {
    int a, b, c;

    // Non-recursive function
    void nonrecursive(int n) {
        a = 0;
        b = 1;
        System.out.print(a + " " + b + " ");

        c = a + b;
        while (c <= n) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    // Recursive function
    int recursive(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else
            return recursive(n - 1) + recursive(n - 2);
    }
}

// Class that calls recursive and non-recursive functions
class fib1 {
    public static void main(String args[]) {

        int n = 5;

        System.out.println("The Fibonacci series using non-recursive is:");
        fib f = new fib();   // Creating object of fib class
        f.nonrecursive(n);  // Calling non-recursive function

        System.out.println("\nThe Fibonacci series using recursive is:");
        for (int i = 0; i <= n; i++) {
            int F1 = f.recursive(i);   // Calling recursive function
            System.out.print(F1 + " ");
        }
    }
}
