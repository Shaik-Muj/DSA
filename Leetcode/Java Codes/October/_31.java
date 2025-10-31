import java.util.*;

class _31 {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int[] arr=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))arr[k++]=nums[i];
            else set.add(nums[i]);
        }
        return arr;
    }

    // Added runnable entry point
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 2, 4}; // example input
        int[] res = new _31().getSneakyNumbers(nums);
        System.out.println(res[0] + " " + res[1]);
    }
}