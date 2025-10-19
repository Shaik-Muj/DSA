package HackerEarth.Sorting;

import java.util.*;
public class MonkAndNiceStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());  // Read N using nextLine and parse
        String[] s = new String[N];

        // Read N strings
        for(int i = 0; i < N; i++){
            s[i] = sc.nextLine().trim();
        }

        // Calculate niceness for each string
        for(int i = 0; i < N; i++){
            int niceness = 0;
            for(int j = 0; j < i; j++){
                // If previous string is lexicographically smaller
                if(s[j].compareTo(s[i]) < 0){
                    niceness++;
                }
            }
            System.out.println(niceness);
        }

        sc.close();
    }
}
