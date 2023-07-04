/*QUESTION[4]-Given a number N and a power P, the task is to find the exponent of this number raised to the given power, i.e. N^P.

**Example 1 :** 

Input: N = 5, P = 2

Output: 25

**Example 2 :**
Input: N = 2, P = 5

Output: 32*/

public class Exponent {
    public static void main(String[] args) {
        int N1 = 5;
        int P1 = 2;

        double result1 = findExponent(N1, P1);

        System.out.println(result1); // Output: 25.0

        int N2 = 2;
        int P2 = 5;

        double result2 = findExponent(N2, P2);

        System.out.println(result2); // Output: 32.0
    }

    public static double findExponent(int N, int P) {
        return Math.pow(N, P);
    }
}

