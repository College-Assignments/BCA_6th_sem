import java.util.Arrays;

public class Solution7 {
  public static void main(String[] args) {
    Integer arr[] = { 10, 123, 1235, 636, 6234, 43, 234, 66, 343 };
    Integer sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    System.out.println("\n\nInitial Array: " + Arrays.toString(arr));
    System.out.println("\nSum of all numbers in array is: " + sum);
  }
}