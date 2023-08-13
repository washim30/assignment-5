package Exercise_chap_5;

import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3, num4;

        System.out.print("Please Enter 4 Numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        num4 = in.nextInt();

        in.close();

        if (num1 == num2 && num3 == num4)
        {
            System.out.println("two pairs");
        }
        else if (num1 == num3 && num2 == num4)
        {
            System.out.println("two pairs");
        }
        else if (num1 == num4 && num2 == num3)
        {
            System.out.println("two pairs");
        }
        else
        {
            System.out.println("not two pairs");
        }
    }
}
