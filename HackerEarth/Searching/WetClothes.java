import java.util.*;

class WetClothes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int g = sc.nextInt();

        int[] times = new int[n];
        for(int i=0; i<n; i++){
            times[i] = sc.nextInt();
        }

        int[] dryTimes = new int[m];
        for(int i=0; i<m; i++){
            dryTimes[i] = sc.nextInt();
        }
        sc.close();

        int[] gaps = new int[n-1];
        for(int i=0; i<n-1; i++){
            gaps[i] = times[i+1] - times[i];
        }

        int ans = 0;
        for(int i=0; i<n-1; i++){
            int count = 0;
            for(int j=0; j<m; j++){
                if(dryTimes[j] <= gaps[i]) count++;
            }
            ans = Math.max(ans, count);
        }

        System.out.print(ans);
    }
}
