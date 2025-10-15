import java.util.*;

class _15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> nums = new ArrayList<>();
        for(int a : arr){
            nums.add(a);
        }

        System.out.print(helper(nums));
        sc.close();
    }    

    static int helper(List<Integer> nums){
        int n = nums.size();
        //int k = n/2;
        int ans = 0;

        int[] inc = new int[n];
        inc[0] = 1;
        for(int i=1; i<n; i++){
            if(nums.get(i)>nums.get(i-1)){
                inc[i] = inc[i-1]+1;
            } else {
                inc[i] = 1;
            }
        }

        int left=0, right = n/2;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(isTrue(nums,inc,mid)){
                ans=mid;
                left=mid+1;
            }
            else right = mid-1;
        }

        return ans;
    }

    static boolean isTrue(List<Integer> nums, int[] inc, int k) {
        int n = nums.size();
        for (int i = k - 1; i + k < n; i++) {
            if (inc[i] >= k && inc[i + k] >= k) return true;
        }
        return false;
    }
}
