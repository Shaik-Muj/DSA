
package HackerEarth.Sorting;
import java.util.*;
class MonkAndSuffixSort {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        System.out.print(helper(s, k));
        sc.close();
    }

    static String helper(String s, int k){
        int n = s.length();
        int idx = 0;
        String[] suffix = new String[n];

        for(int i=0; i<n; i++){
            suffix[idx++] = s.substring(i);
        }

        Arrays.sort(suffix);
        return suffix[k-1];
    }
}
