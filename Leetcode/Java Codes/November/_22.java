import java.util.*;

class _22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        System.out.println(helper(nums));
        sc.close();
    }

    static int helper(int[] nums){
        int res = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 3) continue;

            else if((nums[i]-1)%3 == 0 || (nums[i]+1)%3 == 0) res++;
        }

        return res;
    }
}
