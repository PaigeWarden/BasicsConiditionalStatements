import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner n = new
                Scanner(System.in);
        System.out.println("Enter a number");
        int input = n.nextInt();
        int sumTotal = 1;
        int i = 1;
        while(i <= input){
            sumTotal *= i;
            i++;
        }
        System.out.println("The factorial equation of " + input + " is " + sumTotal);
    }
}
