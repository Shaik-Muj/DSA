package Other.Backtracking;

import java.util.*;

class Leetcode_78 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        System.out.print(helper(nums));
        sc.close();
    }

    static List<List<Integer>> helper(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        Backtracking(res, nums, new ArrayList<>(), 0);
        return res;
    }

    static void Backtracking(List<List<Integer>> res, int[] nums, List<Integer> temp, int index){
        res.add(new ArrayList<>(temp));

        for(int i=index; i<nums.length; i++){
            temp.add(nums[i]);
            Backtracking(res, nums, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
}