import java.util.*;

class _18{
    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 4, 3};
        int k1 = 1;
        System.out.println("Test Case 1: " + maxDistinctElements(nums1, k1));  // Expected output: 4

        int[] nums2 = {1, 1, 1, 1};
        int k2 = 2;
        System.out.println("Test Case 2: " + maxDistinctElements(nums2, k2));  // Expected output: 3

        int[] nums3 = {1, 6, 3, 4, 5, 2};
        int k3 = 2;
        System.out.println("Test Case 3: " + maxDistinctElements(nums3, k3));  // Expected output: 6
    }

    static int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            int ele = (i==0) ? nums[i]-k : Math.max(res[i-1]+1, nums[i]-k);

            if(ele > nums[i]+k) ele = nums[i] + k;

            hs.add(ele);
            res[i] = ele;
        }

        return hs.size();
    }
}