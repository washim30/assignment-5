package Exercise_chap_5;

import java.util.Random;

public class SuperMarketCoupon {
    public static void main(String[] args)
    {
        Random generator = new Random();

        String couponPercentage;

        double randNum = (0 + (250 - 0)) * generator.nextDouble();

        if(randNum > 210)
        {
            couponPercentage = "18%";
        }
        else if(randNum > 150)
        {
            couponPercentage = "12%";
        }
        else if(randNum > 60)
        {
            couponPercentage = "10%";
        }
        else if(randNum > 10)
        {
            couponPercentage = "8%";
        }
        else
        {
            couponPercentage = "No Coupon";
        }

        System.out.printf("Money Spent: %.2f\nRecieved Coupon: %s\n", randNum, couponPercentage);
    }
}
