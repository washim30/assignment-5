package Exercise_chap_5;

import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mode, num1, num2, num3;

        System.out.print("Enter 1 for Lenient or 2 for Strict Mode: ");
        mode = in.nextInt();

        System.out.print("Please enter 3 integers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        in.close();

        if (mode == 1) {
            if (num1 < num2 && num2 < num3)
            {
                System.out.println("increasing");
            }
            else if (num1 > num2 && num2 > num3)
            {
                System.out.println("decreasing");
            }
            else if (num1 == num2 && num2 < num3)
            {
                System.out.println("increasing");
            }
            else if (num1 == num2 && num2 > num3)
            {
                System.out.println("decreasing");
            }
            else if (num1 < num2 && num2 == num3)
            {
                System.out.println("increasing");
            }
            else if (num1 > num2 && num2 == num3)
            {
                System.out.println("decreasing");
            }
            else
            {
                System.out.println("neither");
            }
        }

            else if (mode == 2)
            {
            if (num1 < num2 && num2 < num3)
            {
                System.out.println("increasing");
            }
            else if (num1 > num2 && num2 > num3)
            {
                System.out.println("decreasing");
            }
            else
            {
                System.out.println("neither");
            }
        }
        else
        {
            System.out.println("This is not supported");
        }

    }
}
