
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Число 1: ");
        int number_1 = iScanner.nextInt();
        
        System.out.printf("Знак: ");
        String sign = iScanner.next();

        System.out.printf("Число 2: ");
        int number_2 = iScanner.nextInt();

        if(sign.equals("+"))
        {
            System.out.printf("%d + %d = %d \n", number_1, number_2, number_1+number_2);
        }

        if(sign.equals("-"))
        {
            System.out.printf("%d - %d = %d \n", number_1, number_2, number_1-number_2);
        }

        if(sign.equals("*"))
        {
            System.out.printf("%d * %d = %d \n", number_1, number_2, number_1*number_2);
        }

        if(sign.equals("/"))
        {
            System.out.printf("%d / %d = %d \n", number_1, number_2, number_1/number_2);
        }
        iScanner.close();
    }
    
}
