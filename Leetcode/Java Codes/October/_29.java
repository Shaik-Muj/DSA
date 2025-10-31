//import java.util.*;

class _29 {
    public int smallestNumber(int n) {
        int ans = 0;
        for(int i=n; i<10000; i++){
            if(isSet(i)){
                ans = i;
                break;
            }
        }
        return ans;
    }

    static boolean isSet(int num){
        while(num>0){
            if((num & 1) == 0) return false;
            num >>= 1;
        }
        return true;
    }

    // Added runnable entry point
    public static void main(String[] args) {
        int n = 5; // example input
        System.out.println(new _29().smallestNumber(n));
    }
}