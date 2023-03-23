
import java.util.Scanner;

public class task_2 
{
public static void main(String[] args) 
{
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Число: ");
    int x = iScanner.nextInt();
    for (int i = 2; i <= x; i++) {
        boolean isPrime = i > 2;
        for (int j = 2; j < i; j++) {
                if(i % j == 0)
                { 
                    isPrime = false;
                    break;
                }
              }
        if(isPrime)
                System.out.println(i);
              }              
    iScanner.close();
}    
}
