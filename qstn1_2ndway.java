package WIELY;

import java.util.Scanner;

public class qstn1_2ndway {
    public static void main(String[] args) {
        int len=5;
        int[] arr = new int[len];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cart value");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(cal2(arr)+"    2nd way");
    }
    static  int cal2(int []arr)
    {
        int totalValue = 0;
        for(int i=0; i<arr.length; i++)
        {
            totalValue=totalValue+arr[i];
        }

        if (totalValue > 10000) {
            double discount = totalValue * 0.1;
            totalValue -= discount;
        }
        return totalValue;


    }
}
