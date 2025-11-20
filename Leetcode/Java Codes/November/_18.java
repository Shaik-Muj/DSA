import java.util.*;

class _18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bits = new int[n];
        for(int i=0; i<n; i++) bits[i] = sc.nextInt();
        System.out.println(helper(bits));
        sc.close();
    }

    static boolean helper(int[] bits) {
        int i=0;
        while(i < bits.length){
            if(bits[i] == 1){
                i += 2;
            } else i += 1;
        }

        return i == bits.length-1;
    }
}