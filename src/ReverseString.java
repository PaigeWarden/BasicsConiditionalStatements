import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner reader = new
                Scanner(System.in);
        // inputting a scanner system
        System.out.print("Input a string");
        // requesting a string from the user
        char[] letters = reader.nextLine().toCharArray();

        for (int i = letters.length-1; i >= 0; i--) {
            // creates a loop
            System.out.print(letters[i]);
            // print the output on the same line
        }
    }
}
