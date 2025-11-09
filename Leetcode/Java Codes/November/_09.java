import java.util.*;

class _09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(countOperations(num1, num2));
        sc.close();
    }

    static int countOperations(int num1, int num2) {
        if(num1 == 0 || num2 == 0) return 0;
        int ans = 0;
        //boolean isZero = false;
        while(num1!=0 || num2!=0){
            if(num1 >= num2){
                num1 = num1-num2;
                if(num1 == 0 || num2 == 0) return ans+1;
            } else if(num2 >= num1){
                num2 = num2-num1;
                if(num1 == 0 || num2 == 0) return ans+1;
            }
            ans++;
        }
        return ans;
    }
}
