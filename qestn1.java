package WIELY;

import java.util.Scanner;

public class qestn1 {
    public static int cal(int a, int b ,int  c, int  d) {
        int totalValue = a + b + c + d;
        if (totalValue > 10000) {
            double discount = totalValue * 0.1;
            totalValue -= discount;
        }
        return totalValue;

    }
    public static void main(String[] args) {

        int a = 250;
        int b = 250;
        int c = 250;
        int d = 25000;

        int totalValue = cal(a, b, c, d);
        System.out.println("Total value: 1st way " + totalValue);
    }

}
