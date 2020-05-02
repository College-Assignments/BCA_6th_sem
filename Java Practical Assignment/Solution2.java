import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import utility.utilities;

class Employee {
  String name;
  int age;

  Employee() {
  }

  Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class Solution2 {

  void add() {
    System.out.println("\nAdded employee");
  }

  public static void main(String[] args) {
    utilities.cls();
    List<Employee> list = new ArrayList<Employee>();

    // Switch loop
    Scanner in = new Scanner(System.in);
    boolean exit = true;
    do {
      System.out.print("\n\n1. Add Employee\n2. Display Employees\n3. Exit\n\nEnter choice: ");
      int a = in.nextInt();
      switch (a) {
        case 1:
          System.out.println("\nEnter employee name");
          // workaround
          in.nextLine();
          String name = in.nextLine();
          System.out.println("\nEnter employee age");
          int age = in.nextInt();
          list.add(new Employee(name, age));
          System.out.print("\nAdded employee\n\n");
          break;
        case 2:
          System.out.println("\nName\tAge");
          for (Employee s : list) {
            System.out.println(s.name + "\t" + s.age);
          }
          break;
        case 3:
          exit = false;
          break;
        default:
          System.out.println("Wrong option!");
      }
    } while (exit);
    in.close();
    System.out.println("Bye");
  }
}