import java.util.Arrays;
import java.util.Scanner;

//Custom utilities
import utility.utilities;

class array {
    Integer arr[];
    int len = 0;

    void init() {
        arr = new Integer[] { 10, 20, 30, 40, 50 };
        len = arr.length;
    }

    void display() {
        System.out.println("\nList of array: " + Arrays.toString(arr));
    }

    void display(int kek) {
        Integer[] prop = arr;
        Arrays.sort(prop);
        int max = prop[prop.length - 1];
        int min = prop[0];
        if (kek == 1) {
            System.out.println("\nMaximum value in array: " + max);
        } else {
            System.out.println("\nMinimum value in array: " + min);
        }
    }
}

public class Solution1 {
    public static void main(String[] args) {
        utilities.cls();
        array obj = new array();
        Scanner in = new Scanner(System.in);
        boolean exit = true;
        do {
            System.out.print(
                    "\n1. Initilize array\n2. Show array\n3. Show max value in array\n4. Show min value in array\n5. Exit\n\nEnter choice: ");
            int a = in.nextInt();
            switch (a) {
                case 1:
                    obj.init();
                    System.out.print("\nInitialized array\n\n");
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    obj.display(1);
                    break;
                case 4:
                    obj.display(0);
                    break;
                case 5:
                    exit = false;
                    break;
                default:
                    System.out.println("Wrong option!");
            }
        } while (exit);
        in.close();
    }
}
