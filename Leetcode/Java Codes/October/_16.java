import java.util.*;

class _16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int value = sc.nextInt();
        System.out.println(helper(nums,value));
        sc.close();
    }

    static int helper(int[] nums, int value){
        HashMap<Integer, Integer> remainders = new HashMap<>();

        for(int num=0; num<nums.length; num++){
            int remainder = ((nums[num]%value) + value) % value;

            remainders.put(remainder, remainders.getOrDefault(remainder,0)+1);
        }

        int x=0;
        while(true){

            int rem = x%value;
            if(!remainders.containsKey(rem)){
                break;
            } else {
                int count = remainders.get(rem);
                if(count == 1){
                    remainders.remove(rem);
                } else {
                    remainders.put(rem, count - 1);
                }
                x++;
            }
        }

        return x;
    }
}