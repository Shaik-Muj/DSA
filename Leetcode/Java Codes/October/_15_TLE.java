//This code is correct, but gave TLE (Time Limit Exceeded) error
//But, I found the logic to be good

import java.util.*;

class _15_TLE {
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
        int k = n/2;

        int[] inc = new int[n];
        inc[0]=1;
        for(int i=1; i<n; i++){
            if(nums.get(i) > nums.get(i-1)){
                inc[i] = inc[i-1] + 1;
            } else inc[i] = 1;
        }

        while(k>0){
            boolean found =  false;
            
            for(int i=k-1; i + k < n; i++){
                if(inc[i]>=k && inc[i+k]>=k){
                    found=true;
                    break;
                }
            }

            if(found) break;
            k--;
        }
        return k;
    }
}
