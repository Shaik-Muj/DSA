import java.util.*;

class _16 {
    public static int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(helper(s));
        sc.close();
    }

    static int helper(String s){
        long ans = 0;
        long countOnes = 0;

        s = s + "0";

        char[] str = s.toCharArray();
        for(int i=0; i<str.length; i++){
            if(str[i] == '1') countOnes++;

            else {
                ans =(ans + (countOnes * (countOnes+1) / 2) % MOD) % MOD;
                countOnes = 0;
            }
        }
        return (int)ans;
    }

}
