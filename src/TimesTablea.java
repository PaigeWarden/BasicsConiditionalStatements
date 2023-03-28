import java.util.Scanner;
public class TimesTablea {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What times table would you like?: ");
        int timesTable = reader.nextInt();

        for(int i = 1;i <= 12; i++) {
            ;
            System.out.println(i * timesTable);
        }
            //Use a For Loop to display the times table up to 12 x timesTable
        //
        //Print the result for each within the For Loop using println
    }

}
