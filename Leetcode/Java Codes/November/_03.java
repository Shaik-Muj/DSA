import java.util.*;

class _03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String colors = sc.next();
        int n = sc.nextInt();
        int[] neededTime = new int[n];
        for (int i = 0; i < n; i++) neededTime[i] = sc.nextInt();

        int result = helper(colors, neededTime);
        System.out.println(result);
        sc.close();
    }

    static int helper(String colors, int[] neededTime){
        int totalCost = 0;
        int prev = neededTime[0];

        for(int i=1; i<colors.length(); i++){
            if(colors.charAt(i) == colors.charAt(i-1)){
                totalCost += Math.min(neededTime[i], prev);
                prev = Math.max(prev, neededTime[i]);
            } else {
                prev = neededTime[i];
            }
        }

        return totalCost;
    }
}