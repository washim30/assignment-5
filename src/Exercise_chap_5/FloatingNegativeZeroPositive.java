package Exercise_chap_5;

import java.util.Scanner;

public class FloatingNegativeZeroPositive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num;
        System.out.println("Please Enter a floating number : ");
        num = in.nextDouble();
        System.out.println("This num is : ");
        if (num == 0)
        {
            System.out.println("zero");
        }
        else if (num > 0 && num < 1)
        {
            System.out.println("small positive");
        }
        else if (num> 0 && num < 1000000)
        {
            System.out.println("positive");
        }
        else if (num > 1000000)
        {
            System.out.println("large positive");
        }
        else if (num < 0 && num > -1)
        {
            System.out.println("small negative");
        }
        else if (num < 0 && num > -1000000)
        {
            System.out.println("negative");
        }
        else if (num < -1000000)
        {
            System.out.println("large negative");
        }
    }
}
