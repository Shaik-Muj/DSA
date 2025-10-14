import java.util.*;
class _02 {
    static int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrank = numBottles; // Initially drink all bottles
        int emptyBottles = numBottles; // After drinking, we have this many empty bottles
        
        System.out.println("Initial: drank=" + totalDrank + ", empty=" + emptyBottles + ", exchange=" + numExchange);
        
        while (emptyBottles >= numExchange) {
            // We can only exchange ONE batch at current exchange rate
            // Exchange numExchange empty bottles for 1 new bottle
            emptyBottles -= numExchange; // Remove the exchanged empty bottles
            totalDrank += 1; // Drink the 1 new bottle we got
            emptyBottles += 1; // Add 1 new empty bottle from drinking
            
            System.out.println("Exchange: used " + numExchange + " empties for 1 new bottle, drank=" + totalDrank + 
                             ", empty=" + emptyBottles + ", next exchange=" + (numExchange + 1));
            
            // Increase exchange rate for next operation
            numExchange++;
        }
        
        return totalDrank;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Test case 1: numBottles = 13, numExchange = 6
        System.out.println("=== Test Case 1 ===");
        System.out.println("Expected: 15");
        System.out.println("Result: " + maxBottlesDrunk(13, 6));
        System.out.println();
        
        // Test case 2: numBottles = 10, numExchange = 3  
        System.out.println("=== Test Case 2 ===");
        System.out.println("Expected: 13");
        System.out.println("Result: " + maxBottlesDrunk(10, 3));
        System.out.println();
        
        // Test case 3: The failing case you mentioned
        System.out.println("=== Test Case 3 (Your failing case) ===");
        System.out.println("Result: " + maxBottlesDrunk(20, 1));
        System.out.println();
        
        // Interactive input
        System.out.print("Enter number of initial bottles: ");
        int userBottles = sc.nextInt();
        System.out.print("Enter initial exchange rate: ");
        int userExchange = sc.nextInt();
        
        System.out.println("=== Your Input ===");
        int result = maxBottlesDrunk(userBottles, userExchange);
        System.out.println("Maximum bottles you can drink: " + result);
        
        sc.close();
    }
}
