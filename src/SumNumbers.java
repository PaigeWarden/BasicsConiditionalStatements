import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new
                Scanner(System.in);
        System.out.print
                ("Input a number to sum to: ");

        int sumTo = reader.nextInt();
        int i = 1;
        int sumTotal = 0;
        while (i <= sumTo){
            sumTotal = sumTotal + i;
            i++;
        }
       // System.out.println(sumTotal);
        System.out.println("The sum of numbers from 1 to " + sumTo + " is " + sumTotal + ".");
    }
    }

