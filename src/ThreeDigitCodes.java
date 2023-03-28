public class ThreeDigitCodes {
    public static void main(String[] args) {
        int totalVariations = 0;
        // int which will increase each time a new variation is made
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= 4; j++)
            {
                for(int k = 1; k <= 4; k++)
                {
    if( i != j && i != k && j != k) {
        // if statement ensuring that i does not equal either j or k, and j does not equal i or k
        System.out.println(i + " " + k + " " + j + " ");
        // printing out each variation on its own line
        totalVariations++;
        // variation increasing by one after each loop
    }
                }
            }
        }
        System.out.print("The total number of variations is " + totalVariations);
    }
}
