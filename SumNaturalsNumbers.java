/*
 * QUESTION[2]-Given a number n, find the sum of the first natural numbers.
 ** 
 * Example 1:**
 * 
 * Input: n = 3
 * 
 * Output: 6
 ** 
 * Example 2:**
 * 
 * Input : 5
 * 
 * Output : 15
 */

public class SumNaturalsNumbers {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;

        int sum1 = sumOfFirstNNumbers(n1);
        int sum2 = sumOfFirstNNumbers(n2);

        System.out.println(sum1); // Output: 6
        System.out.println(sum2); // Output: 15
    }

    public static int sumOfFirstNNumbers(int n) {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }
}
