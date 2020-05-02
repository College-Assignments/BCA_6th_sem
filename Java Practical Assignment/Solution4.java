import java.util.Scanner;
import java.util.Vector;

import utility.utilities;

class Viktor {
  Vector<Integer> vic;

  // A. Craete vector
  void createVector() {
    vic = new Vector<Integer>();
    vic.add(7);
    vic.add(6);
    vic.add(9);
    vic.add(2);
    vic.add(3);
    System.out.println("Vectors created");
  }

  // B. Modify element
  void modifyElement() {
    System.out.println("Before modifications the vector contains: " + vic);
    vic.set(1, 12);
    System.out.println("Modified Vector elements are: " + vic);
  }

  // C. Multiply by a scalar value
  double mul(Vector a, int b) {
    return mul(a) + b;
  }

  static double mul(Vector value) {
    // returns sum of all elements in vector,
    // but since there is only one element in vector it will return the first value
    return value.stream().mapToDouble(x -> (double) x).sum();
  }

  // D. Display Vectors
  void display() {
    System.out.println("Vector value is: " + vic);
  }

  void display(Vector prop) {
    System.out.println("Current vector is: " + prop);
  }

  // E. Add two vectors
  double sum(Vector value, Vector value1) {
    return sum(value) + sum(value1);
  }

  static double sum(Vector value) {
    return value.stream().mapToDouble(x -> (double) x).sum();
  }

}

public class Solution4 {
  public static void main(String[] args) {
    utilities.cls();
    // Declare
    Viktor obj = new Viktor();
    Vector a = new Vector();
    Vector b = new Vector();
    Vector c = new Vector();

    Scanner in = new Scanner(System.in);

    // Work
    System.out.println("Enter value in first vector");
    double aI = in.nextInt();
    System.out.println("\nEnter value in second vector\n");
    double bI = in.nextInt();
    a.add(aI);
    b.add(bI);
    System.out.println("Addition of two vectors is: " + obj.sum(a, b) + "\n\n");

    System.out.println("Vector multiplication with scalar\nEnter vector part: ");
    double cI = in.nextDouble();
    c.add(cI);
    System.out.println("\nEnter scalar part: ");
    int d = in.nextInt();
    System.out.println("Product of vector and scalar is: " + obj.mul(c, d) + "\n");

    System.out.println("\nOperations on predefined vectors:\n");
    obj.createVector();
    obj.modifyElement();
    in.close();
  }
}