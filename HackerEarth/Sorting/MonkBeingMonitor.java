
import java.util.*;
class MonkBeingMonitor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            helper(arr,n);
        }
        sc.close();
    }

    static void helper(int[] arr, int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
    for(int a : arr){
        hm.put(a, hm.getOrDefault(a, 0)+1);
    }

    List<Integer> sortedHeights = new ArrayList<>(hm.keySet());
    Collections.sort(sortedHeights);

    int maxFreqSoFar = hm.get(sortedHeights.get(sortedHeights.size()-1));
    int maxDiff = -1;

    // Traverse from second largest height to smallest
    for(int i = sortedHeights.size() - 2; i >= 0; i--) {
        int freq = hm.get(sortedHeights.get(i));
        maxDiff = Math.max(maxDiff, maxFreqSoFar - freq);
        maxFreqSoFar = Math.max(maxFreqSoFar, freq);
    }
    System.out.println(maxDiff > 0 ? maxDiff : -1);
    }
}
