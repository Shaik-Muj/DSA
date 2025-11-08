import java.util.*;

class _08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(minimumOneBitOperations(n));
        sc.close();
    }

    static int minimumOneBitOperations(int n) {
        int ans = 0;
        while(n>0){
            ans ^= n;
            n >>= 1;
        }
        return ans;
    }
}
