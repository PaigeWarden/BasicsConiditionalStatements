public class logicalNot {
    public static void main(String[] args) {
        System.out.println("Is the string equal to eggs?");

        String breakfastItem = "Bacon!";

        if(!(breakfastItem.equals("eggs"))) {
            System.out.println("No!");
        }
        else {
            System.out.println("Yes");
        }
    }

}
