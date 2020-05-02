import java.time.LocalTime;
import java.util.Scanner;

import utility.utilities;

class Time {
  int hours;
  int minutes;

  void readTime() {
    hours = LocalTime.now().getHour();
    minutes = LocalTime.now().getMinute();
  }

  void displayTime() {
    System.out.println("Current time: " + hours + "H " + minutes + "m");
  }

  void sumOfTimes(int h1, int h2, int m1, int m2, int s1, int s2) {
    int totalHours = h1 + h2;
    int totalMinutes = m1 + m2;
    int totalSeconds = s1 + s2;
    if (totalSeconds >= 60) {
      totalMinutes++;
      totalSeconds = totalSeconds % 60;
    }
    if (totalMinutes >= 60) {
      totalHours++;
      totalMinutes = totalMinutes % 60;
    }
    System.out.println("\n\n Sum of times is: " + totalHours + "H " + totalMinutes + "m " + totalSeconds + "s");
  }
}

public class Solution3 {
  public static void main(String[] args) {
    utilities.cls();

    Time obj = new Time();
    obj.readTime();
    obj.displayTime();
    Scanner in = new Scanner(System.in);
    System.out.println("\nSum of two 'time'");
    System.out.println("Enter time 1 (H/m/s): ");
    System.out.println("\n\tEnter Hour: ");
    int h1 = in.nextInt();
    System.out.println("\tEnter Minute: ");
    int m1 = in.nextInt();
    System.out.println("\tEnter second: ");
    int s1 = in.nextInt();
    System.out.println("\nEnter time 2 (H/m/s): ");
    System.out.println("\n\tEnter Hour: ");
    int h2 = in.nextInt();
    System.out.println("\tEnter Minute: ");
    int m2 = in.nextInt();
    System.out.println("\tEnter second: ");
    int s2 = in.nextInt();
    obj.sumOfTimes(h1, h2, m1, m2, s1, s2);
    in.close();
  }
}