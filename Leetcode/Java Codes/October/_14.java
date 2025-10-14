import java.util.*;

class _14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> nums = new ArrayList<>();
        for (int num : arr) {
            nums.add(num);
        }
        System.out.print(helper(nums,k));
        sc.close();
    }

    static boolean helper(List<Integer> nums, int k){
        if(nums.size() < 2*k) return false;

        for(int i=0; i+(2*k) <= nums.size(); i++){
            if(isTrue(nums, i, i+k-1) && isTrue(nums, i+k, i+(2*k)-1)) return true;
        }

        return false;
    }

    static boolean isTrue(List<Integer> nums, int start, int end){
        for(int i=start; i<end; i++){
            if(nums.get(i) > nums.get(i+1)) return false;
        }

        return true;
    }
}