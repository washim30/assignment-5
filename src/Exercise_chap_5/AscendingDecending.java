package Exercise_chap_5;

import java.util.Scanner;

public class AscendingDecending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3;
        boolean order = false;

        System.out.print("Please Enter 3 Numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        in.close();

        if (num1 < num2 && num2 < num3)
        {
            order = true;
        }
        else if (num1 > num2 && num2 > num3)
        {
            order = true;
        }
        else if (num1 < num2 && num2 == num3)
        {
            order = true;
        }
        else if (num1 == num2 && num2 < num3)
        {
            order = true;
        }
        else if (num1 == num2 && num2 > num3)
        {
            order = true;
        }
        else if (num1 > num2 && num2 == num3)
        {
            order = true;
        }


        if (order == true)
        {
            System.out.println("In order");
        }
        else
        {
            System.out.println("Not in order");
        }
    }

}
