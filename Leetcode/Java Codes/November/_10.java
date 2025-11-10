import java.util.*;

class _10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        System.out.println(helper(nums));
        sc.close();
    }

    static int helper(int[] nums){
        int ans = 0;
        
        Stack<Integer> s = new Stack<>();
        for(int val : nums){
            while(!s.isEmpty() && s.peek()>val){
                s.pop();
            }

            if(val == 0) {
                s.clear();
                continue;
            }

            if(s.isEmpty() || s.peek()<val){
                s.push(val);
                ans++;
            }
        }
        return ans;
    }
}