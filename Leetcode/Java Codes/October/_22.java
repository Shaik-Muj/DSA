import java.util.*;

class _22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int numOperations = sc.nextInt();
        System.out.print(helper(nums, k, numOperations));
        sc.close();
    }

    static int helper(int[] nums, int k, int numOperations){
        int ans = 1;
        int n = nums.length;
        if(n==0) return ans-1;
        
        Arrays.sort(nums);

        HashMap<Long, Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put((long) num,hm.getOrDefault((long) num, 0)+1);
        }

        for(Map.Entry<Long, Integer> entry : hm.entrySet()){
            long v = entry.getKey();
            int count = entry.getValue();

            long low_val = v - k;
            long high_val = v + k;
            int L = lowerBound(nums, low_val);
            int R = upperBound(nums, high_val);
            int total = R - L;
            int need = total - count;
            int canChange = Math.min(numOperations, need);
            ans = Math.max(ans, canChange+count);
        }
        /*
        Let's say k = 3:

        If nums[l] = 5 and nums[r] = 11
        Distance = 11 - 5 = 6 = 2k
        nums[l] can become at most 8 (5 + 3)
        nums[r] can become at least 8 (11 - 3)
        They can meet at 8!
        */
        int l=0;
        for(int r=0; r<n; r++){
            while (l <= r && (long) nums[r] - nums[l] > 2L * k)
                l++;
            int w = r - l + 1;
            ans = Math.max(ans, Math.min(w, numOperations));
        }
        return ans;
    }

    static int lowerBound(int[] nums, long low_val){
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if ((long) nums[mid] < low_val)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }

    static int upperBound(int[] arr, long target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if ((long) arr[mid] <= target)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }
}