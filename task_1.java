
//package java_1_hw;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Число: ");
        int x = iScanner.nextInt();
        int fact_x = 1;
        int sum_x  = 0;
        for (int i = 1; i<=x;i++){
            fact_x = fact_x * i;
            sum_x = sum_x + i;
        }
        
        System.out.println(fact_x);
        System.out.println(sum_x);
        

        iScanner.close();
    }
}