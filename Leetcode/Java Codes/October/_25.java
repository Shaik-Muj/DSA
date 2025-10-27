public class _25 {
    static int totalMoney(int n) {
        int week=0;
        int ans = 0;

        while(n>7){
            ans += 28 + (week*7);
            n -= 7;
            week++;
        }

        while(n>0){
            ans += ++week;
            n--;
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example usage:
        int n = 20;
        System.out.println(totalMoney(n));
    }
}
