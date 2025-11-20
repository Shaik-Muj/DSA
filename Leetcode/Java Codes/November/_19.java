import java.util.*;

class _19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        int original = sc.nextInt();
        System.out.println(helper(nums, original));
        sc.close();
    }

    static int helper(int[] nums, int original){
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }

        while(hs.contains(original)){
            original *= 2;
        }

        return original;
    }
}
