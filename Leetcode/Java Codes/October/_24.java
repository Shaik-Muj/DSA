import java.util.*;

class _24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(helper(n));
        sc.close();
    }

    static int helper(int n){
        for(int i=n+1; i<=1224444; i++){
            if(isBalanced(i)){
                return i;
            }
        }
        return -1;
    }

    static boolean isBalanced(int n){
        boolean res = true;
        int[] freq = new int[10];
        while(n>0){
            int d = n%10;
            freq[d]++;
            n /= 10;       
        }
        for(int i=0; i<10; i++){
            if(freq[i] > 0 && freq[i] != i) return false;
        }
        return res;
    }
}
