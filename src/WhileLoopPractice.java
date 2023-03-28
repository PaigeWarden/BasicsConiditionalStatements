 //import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
     /*   Scanner reader = new
                Scanner(System.in);
        System.out.print("Enter your first number ");
        int input = reader.nextInt();
        System.out.println("Enter your second number ");
        int inputTwo = reader.nextInt();
        while (true) {
            int output = input + inputTwo;
            System.out.println(input + " + " + inputTwo + " = " + output);
            break; // exits the loop once executing the sum
            } */

        int sum = 0;
        int increasingFactor = 1;
        while (increasingFactor <= 10) {
            sum += increasingFactor;
            increasingFactor++;
        }
        System.out.println("The sum of all numbers from 1 to 10 is " + sum);

        }
    }



