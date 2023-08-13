package Exercise_chap_5;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Income: ");
        int income = in.nextInt();
        double tax;

        in.close();

        if(income > 500000)
        {
            tax = 6.0 / 100.0;
            System.out.println("Income Tax: " + tax * income);
        }
        else if(income > 250000)
        {
            tax = 5.0 / 100.0;
            System.out.println("Income Tax: " + tax * income);
        }
        else if(income > 100000)
        {
            tax = 4.0 / 100.0;
            System.out.println("Income Tax: " + tax * income);
        }
        else if(income > 75000)
        {
            tax = 3.0 / 100.0;
            System.out.println("Income Tax: " + tax * income);
        }
        else if(income > 50000)
        {
            tax = 2.0 / 100.0;
            System.out.println("Income Tax: " + tax * income);
        }
        else
        {
            tax = 1.0 / 100.0;
            System.out.println("Income Tax: " + tax * income);
        }
    }
}
