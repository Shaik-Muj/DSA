// PASSED 270/277

import java.util.*;

class _17_TLE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.print(helper(s,k));
        sc.close();
    }

    static int helper(String s, int k){
        int n = s.length();
        int maxP = countPartitions(s, k);

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            for(int j='a'; j<='z'; j++){
                if(j == ch) continue;

                StringBuilder sb = new StringBuilder(s);
                sb.setCharAt(i, ch);
                int partitions = countPartitions(sb.toString(), k);

                maxP = Math.max(maxP, partitions);
            }
        }
        return maxP;

    }

    static int countPartitions(String s, int k){
        int partition = 1;
        Set<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()){
            set.add(ch);
            if(set.size()>k){
                partition++;
                set.clear();
                set.add(ch);    
            }
        }
        
        return partition;
    }
}
