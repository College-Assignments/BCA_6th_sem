import java.util.Scanner;

import utility.utilities;

class Matrix {
  int n = 3;
  int[][] m1;
  int[][] m2;
  int[][] mul;
  int[][] add;

  public void input() {
    Scanner input = new Scanner(System.in);
    m1 = new int[n][n];
    m2 = new int[n][n];

    // Take input of matrices
    System.out.println("Enter the elements of 1st matrix row wise( 3x3 ): ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        m1[i][j] = input.nextInt();
      }
    }
    System.out.println("Enter the elements of 2nd matrix row wise( 3x3 ): ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        m2[i][j] = input.nextInt();
      }
    }
    input.close();
  }

  void matrixMul() {
    mul = new int[n][n];
    // Multiply matrices
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
          mul[i][j] = mul[i][j] + m1[i][k] * m2[k][j];
        }
      }
    }

    System.out.println("\nProduct :");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(mul[i][j] + "\t");
      }
      System.out.println();
    }
  }

  void matrixAdd() {
    add = new int[n][n];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        add[i][j] = m1[i][j] + m2[i][j];
      }
      System.out.println();
    }

    System.out.println("\nAddition :");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(add[i][j] + "\t");
      }
      System.out.println();
    }
  }
}

public class Solution5 {
  public static void main(String[] args) {
    utilities.cls();
    Matrix obj = new Matrix();
    obj.input();
    obj.matrixMul();
    obj.matrixAdd();
  }
}