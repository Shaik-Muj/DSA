import java.util.*;

class _04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Expected input:
        // n
        // n integers (nums)
        // k x
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();

        int[] res = helper(nums, k, x);
        System.out.println(Arrays.toString(res));
        sc.close();
    }

    static int[] helper(int[] nums, int k, int x){
        int n = nums.length;
        int[] res = new int[n - k + 1];
        for(int i=0; i + k <= n; i++){
            res[i] = findXSum(i, i+k-1, nums, x);
        }

        return res;
    }

    static int findXSum(int start, int end, int[] nums, int x){
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=start; i<=end; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        Collections.sort(list, (a,b) -> {
            if(!b.getValue().equals(a.getValue())){
                return b.getValue() - a.getValue();
            } else {
                return b.getKey() - a.getKey();
            }
        });

        for(int i=0; i<x; i++){
            Map.Entry<Integer, Integer> entry = list.get(i);
            sum += (entry.getValue() * entry.getKey());
        }

        return sum;
    }
}
