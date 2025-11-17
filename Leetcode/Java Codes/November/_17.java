import java.util.*;

class _17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(helper(nums, k));
        sc.close();
    }

    static boolean helper(int []nums, int k){
        List<Integer> indices = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1) indices.add(i);
        }

        for(int i=1; i<indices.size(); i++) {
            if((indices.get(i) - indices.get(i-1) - 1) < k) return false;
        }

        return true;
    }
}