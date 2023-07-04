/*QUESTION[8]-Given an array, find a product of all array elements.

**Example 1:**

Input  : arr[] = {1, 2, 3, 4, 5}
Output : 120
**Example 2:**

Input  : arr[] = {1, 6, 3}
Output : 18*/


public class ProductOfArrayElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int product1 = getProduct(arr1);
        System.out.println("Product of elements in arr1: " + product1);

        int[] arr2 = {1, 6, 3};
        int product2 = getProduct(arr2);
        System.out.println("Product of elements in arr2: " + product2);
    }

    public static int getProduct(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }
}
