//pascals triangle question of finding sum of nth row

import java.util.Scanner;

public class ch7_p6 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the row number (n): ");
        int n = scanner.nextInt();

        int sum = 1 << (n - 1); // 1 * 2^(n-1) using bitwise left shift

        System.out.println("The sum of the " + n + "th row in Pascal's triangle is: " + sum);

        scanner.close();
    }
}

