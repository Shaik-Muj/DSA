import java.util.*;
class _21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int numOperations = sc.nextInt();
        System.out.print(helper(nums,k,numOperations));
        sc.close();
    }

    static int helper(int[] nums, int k, int numOperations){
        int res = 0;
        Arrays.sort(nums);
        int[] freq = new int[100_002];
        int n = nums.length;
        int s=nums[0], e=nums[n-1];
        int i=0, j=0;

        for(int c=s; c<=e; c++){
            while(c - nums[i] > k) i++;
            while(j<n && nums[j]-c <= k) j++;
            res = Math.max(res, Math.min(numOperations, j-i-freq[c])+freq[c]);
        }
        return res;
    }
}
