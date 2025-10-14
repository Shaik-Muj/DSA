import java.util.*;

class CyclicShift{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();

            String binary = sc.next();

            helper(binary,n,k);
        }

        sc.close();
    }

    static void helper(String binary, int n, int k){
        int count = 0;
        String max = generateMaximum(binary,n);
        String temp = binary;

        for(int i=0; i<n; i++){
            temp = temp.substring(1) + temp.charAt(0);
            if(!temp.equals(max)) count++;
            
        }

        System.out.println((2*count)+1);
    }

    static String generateMaximum(String binary, int n) {
        String maxBinary = binary;
        String temp = binary;
        for(int i = 0; i < n; i++) {
            temp = temp.substring(1) + temp.charAt(0);
            if(temp.compareTo(maxBinary) > 0) {
                maxBinary = temp;
            }
        }
    
        return maxBinary;
    }
}