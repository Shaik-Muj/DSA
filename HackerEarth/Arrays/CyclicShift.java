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
        char[] digits = binary.toCharArray();
        String max = binary;

        for(int shift=1; shift<n; shift++){
            if(isGreater(digits, shift, max,n)){
                max = buildMax(digits, shift, n);
            }
        }

        List<Integer> positions = new ArrayList<>(); 
        for (int shift = 0; shift < n; shift++) { 
            if (equalsMax(max, digits, n, shift)) { 
                positions.add(shift); 
            } 
        }

        int countInOneCycle = positions.size();
        if(countInOneCycle == 0){
            System.out.println(0); 
            return;
        }

        long numCycles = (k-1)/countInOneCycle;
        int index = (int)(k-1)%countInOneCycle;

        long res = (numCycles*n) + positions.get(index);

        System.out.println(res);

    }

    static boolean isGreater(char[] digits,int shift,String max,int n){
        for(int i=0; i<n; i++){
            char c1 = max.charAt(i);
            char c2 = digits[(i+shift)%n];
            if(c1 != c2) return c1 < c2;
        }

        return false;
    }

    static String buildMax(char[] digits, int shift, int n){
        StringBuilder sb = new StringBuilder(n);
        for(int i=0; i<n; i++){
            sb.append(digits[(i+shift)%n]);
        }
        return sb.toString();
    }

    static boolean equalsMax(String max, char[] digits, int n, int shift){
        for(int i=0; i<n; i++){
            if(digits[(i+shift)%n] != max.charAt(i)) return false;
        }
        return true;
    }
}