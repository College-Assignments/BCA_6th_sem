import java.util.Arrays;
import java.util.Scanner;

import utility.utilities;

public class Solution6 {
  static int arr[];

  public static void main(String[] args) {
    input();
    bubbleSort();
    insertionSort();
  }

  static void bubbleSort() {
    int bubble[] = arr;
    int n = bubble.length;
    int temp = 0;
    System.out.println("\nBubble sort process..\n");
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (bubble[j - 1] > bubble[j]) {
          temp = bubble[j - 1];
          bubble[j - 1] = bubble[j];
          bubble[j] = temp;
          System.out.println(Arrays.toString(bubble));
        }
      }
    }
    System.out.println("\nBubble sorted array: " + Arrays.toString(bubble));
  }

  static void insertionSort() {
    int insertion[] = arr;
    int n = insertion.length;
    System.out.println("\nInsertion sort process..\n");
    for (int i = 1; i < n; ++i) {
      int key = insertion[i];
      int j = i - 1;
      while (j >= 0 && insertion[j] > key) {
        insertion[j + 1] = insertion[j];
        j = j - 1;
      }
      insertion[j + 1] = key;
      System.out.println(Arrays.toString(insertion));
    }
    System.out.println("\nInsertion sorted array: " + Arrays.toString(insertion));
  }

  static void input() {
    utilities.cls();
    Scanner in = new Scanner(System.in);
    System.out.println("\n\nEnter number of items you want to enter: ");
    int a = in.nextInt();
    arr = new int[a];
    for (int i = 0; i < a; i++) {
      System.out.print("Enter value: ");
      arr[i] = in.nextInt();
    }
    System.out.print("\n");
    in.close();
  }
}