import java.util.*;

class _13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(helper(s));
        sc.close();
    }

    static int helper(String s){
        int res = 0;
        int ones = 0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == '1'){
                ones++;

                if(s.charAt(i+1) == '0'){
                    res += ones;
                }
            }
        }
        return res;
    }
}
