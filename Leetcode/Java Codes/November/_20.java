import java.util.*;

class _20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for(int i = 0; i < n; i++){
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        System.out.println(helper(intervals));
        sc.close();
    }

    static int helper(int[][] intervals){
        if(intervals == null || intervals.length == 0) return 0;

        Arrays.sort(intervals, (a,b) -> {
            if(a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });

        int last1 = Integer.MIN_VALUE;
        int last2 = Integer.MIN_VALUE;
        int count = 0;

        for(int iv[] : intervals){
            int s = iv[0], e = iv[1];
            
            if(s <= last2) continue;

            if(last1 >= s) {
                count += 1;
                last2 = last1;
                last1 = e;
                continue;
            }

            count += 2;
            last2 = e - 1;
            last1 = e;
        }

        return count;
    }
}