import java.util.*;
class _23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(helper(s));
        sc.close();
    }

    static boolean helper(String s) {
        boolean areSame = false;
        while(!areSame){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<s.length()-1; i++){
                int sumOfDigits = (s.charAt(i)-'0' + s.charAt(i+1)-'0') % 10;
                sb.append(sumOfDigits);
            }
            s = sb.toString();
            if(s.length()==2){
                if(s.charAt(0) == s.charAt(s.length()-1)){
                    areSame = true;
                    break;
                }
                else return false;
            }
        }

        return areSame;
    }
}
