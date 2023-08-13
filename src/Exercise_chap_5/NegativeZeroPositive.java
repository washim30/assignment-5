package Exercise_chap_5;

import java.util.Scanner;

public class NegativeZeroPositive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter a integer number : ");
        num = in.nextInt();
        System.out.println("This number is : ");
        if(num==0)
        {
            System.out.println("Zero ");
        }
        else if (num>0)
        {
            System.out.println("Positive ");
        }
        else
        {
            System.out.println("Negative ");
        }


    }

}
