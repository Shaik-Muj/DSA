public class _27 {
    public int numberOfBeams(String[] bank) {
        int[] num = new int[bank.length];
        int idx = 0;
        for(String s : bank){
            if(contains1(s)) num[idx++] = countOnes(s);
        }

        int ans = 0;
        for(int i=1; i<num.length; i++){
            ans += num[i-1]*num[i];
        }
        return ans;
    }

    static boolean contains1(String s){
        if(!s.contains("1")) return false;
        return true;
    }

    static int countOnes(String s){
        int c = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1') c++;
        }
        return c;
    }

    public static void main(String[] args) {
        // Example usage:
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(new _27().numberOfBeams(bank));
    }
}