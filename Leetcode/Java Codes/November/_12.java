import java.util.*;

class _12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        System.out.println(helper(nums));
        sc.close();
    }

    static int helper(int[] nums){
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int ones = 0;
        for(int num : nums){
            if(num == 1) ones++;
        }
        if(ones > 0) return n - ones;

        for(int i=0; i<n; i++){
            int currentGcd = nums[i];
            for(int j=i+1; i<n; i++){
                currentGcd = gcd(currentGcd, nums[j]);

                if(currentGcd == 1){
                    ans = Math.min(ans, j-i+1);
                    break;
                }
            }
        }

        if(ans == Integer.MAX_VALUE) return -1;
        else return (ans-1) + (n-1);
    }

    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}
