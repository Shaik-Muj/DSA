import java.util.*;

class MonkAndSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        // Sort the array once
        Arrays.sort(arr);

        int Q = sc.nextInt();
        for(int i=0; i<Q; i++){
            int operation = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(helper(arr, operation, x, N));
        }

        sc.close();
    }

    static int helper(int[] arr, int operation, int x, int n){
        if(operation == 0){
            // Count elements >= x
            // Find the first index where arr[i] >= x
            int idx = lowerBound(arr, x);
            return n - idx;
        } else {
            // Count elements > x
            // Find the first index where arr[i] > x
            int idx = upperBound(arr, x);
            return n - idx;
        }
    }

    // Find first index where arr[i] >= target
    static int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    // Find first index where arr[i] > target
    static int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
