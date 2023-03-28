public class LogicalOr {
    public static void main(String[] args) {

        System.out.println("Is the number less than 5 OR greater than 10?");

        int number = 4;
        if(number < 5 || number > 10) {
            System.out.println("Yes! :)");
        }
        else {
            System.out.println("Nope :(");
        }
    }
}
