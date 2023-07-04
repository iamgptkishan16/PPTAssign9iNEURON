/*QUESTION[5]-Given an array of integers **arr**, the task is to find maximum element of that array using recursion.

**Example 1:**

Input: arr = {1, 4, 3, -5, -4, 8, 6};
Output: 8

**Example 2:**

Input: arr = {1, 4, 45, 6, 10, -8};
Output: 45*/


public class MaxElement {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 3, -5, -4, 8, 6};
        int max1 = findMax(arr1);
        System.out.println(max1); // Output: 8

        int[] arr2 = {1, 4, 45, 6, 10, -8};
        int max2 = findMax(arr2);
        System.out.println(max2); // Output: 45
    }

    public static int findMax(int[] arr) {
        return findMaxRecursive(arr, 0, arr.length - 1);
    }

    public static int findMaxRecursive(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        }

        int mid = (start + end) / 2;
        int leftMax = findMaxRecursive(arr, start, mid);
        int rightMax = findMaxRecursive(arr, mid + 1, end);

        return Math.max(leftMax, rightMax);
    }
}
