import java.util.Scanner;
public class ForLoopPractice {

    public static void main(String[] args) {
       /* Scanner reader = new
        Scanner(System.in);
        System.out.print("How many rows would you like?");

        int input = reader.nextInt();
        int i = 0;
        int j = 0;
        for(i=0; i <= input; i++){
            for(j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */
        int i = 0;
        for (i = 1; i <= 10; i++) {
            for ( int j = 1; j <= 10; j++)
                System.out.print(i * j + " ");
            System.out.println();
        }

    }
}