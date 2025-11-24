import java.util.*;

class _23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        System.out.println(helper(nums));
        sc.close();
    }

    static int helper(int[] nums){
        List<Integer> mod1 = new ArrayList<>();
        List<Integer> mod2 = new ArrayList<>();
        int totalSum = 0;

        for(int num : nums){
            totalSum += num;

            if(num%3 == 1) mod1.add(num);
            else if(num%3 == 2) mod2.add(num);
        }

        Collections.sort(mod1);
        Collections.sort(mod2);

        if(totalSum % 3 == 0) return totalSum;
        int remainder = totalSum % 3;
        int minRemove = Integer.MAX_VALUE;

        if(remainder == 1){
            if(!mod1.isEmpty()) minRemove = Math.min(minRemove, mod1.get(0));
            if (mod2.size() >= 2) minRemove = Math.min(minRemove, mod2.get(0) + mod2.get(1));
        } else {
            if (!mod2.isEmpty()) minRemove = Math.min(minRemove, mod2.get(0));
            if (mod1.size() >= 2) minRemove = Math.min(minRemove, mod1.get(0) + mod1.get(1));
        }

        return totalSum - minRemove;
    }
}
