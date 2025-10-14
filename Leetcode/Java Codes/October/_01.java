import java.util.*;

class _01 {
    static int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles; // Initially drink all bottles we have
        int emptyBottles = numBottles; // After drinking, we have this many empty bottles
        
        // Keep exchanging empty bottles for new ones until we can't exchange anymore
        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange; // New bottles from exchange
            totalDrunk += newBottles; // Drink the new bottles
            emptyBottles = emptyBottles % numExchange + newBottles; // Remaining + new empties
        }
        
        return totalDrunk;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Test case 1: Example from problem
        int numBottles1 = 15;
        int numExchange1 = 4;
        System.out.println("Test case 1:");
        System.out.println("Initial bottles: " + numBottles1 + ", Exchange rate: " + numExchange1);
        System.out.println("Total bottles drunk: " + numWaterBottles(numBottles1, numExchange1));
        System.out.println();
        
        // Test case 2: Another example
        int numBottles2 = 13;
        int numExchange2 = 6;
        System.out.println("Test case 2:");
        System.out.println("Initial bottles: " + numBottles2 + ", Exchange rate: " + numExchange2);
        System.out.println("Total bottles drunk: " + numWaterBottles(numBottles2, numExchange2));
        System.out.println();
        
        // Interactive input
        System.out.print("Enter number of initial bottles: ");
        int userBottles = sc.nextInt();
        System.out.print("Enter exchange rate (empty bottles needed for 1 new bottle): ");
        int userExchange = sc.nextInt();
        
        int result = numWaterBottles(userBottles, userExchange);
        System.out.println("You can drink a total of " + result + " bottles!");
        
        sc.close();
    }
}