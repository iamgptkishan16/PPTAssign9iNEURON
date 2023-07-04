/*QUESTION[3]-Given a positive integer, N. Find the factorial of N. 

**Example 1:**

Input: N = 5 

Output: 120

**Example 2:**

Input: N = 4

Output: 24*/


public class PositiveInteger {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 4;

        long factorial1 = factorial(n1);
        long factorial2 = factorial(n2);

        System.out.println(factorial1); // Output: 120
        System.out.println(factorial2); // Output: 24
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

