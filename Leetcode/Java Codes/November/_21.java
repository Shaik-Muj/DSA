import java.util.*;

class _21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(helper(s));
        sc.close();
    }

    static int helper(String s){
        int count = 0;

        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> last = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!first.containsKey(ch)){
                first.put(ch, i);
            }
            last.put(ch, i);
        }

        for(char ch : first.keySet()){
            int start = first.get(ch);
            int end = last.get(ch);
            HashSet<Character> hs = new HashSet<>();
            if(start == end) continue;
            for(int i=start+1; i<end; i++){
                hs.add(s.charAt(i));
            }

            count += hs.size();
        }

        return count;
    }
}
