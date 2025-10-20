import java.util.*;

class _19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(helper(s, a, b));
        sc.close();
    }

    static String helper(String s, int a, int b){
        HashSet<String> hs = new HashSet<>();
        Deque<String> dq = new ArrayDeque<>();
        String smallest = s;
        hs.add(smallest);
        dq.offer(smallest);

        while(!dq.isEmpty()){
            String cur = dq.poll();
            if(cur.compareTo(smallest) < 0) smallest = cur;

            StringBuilder sb = new StringBuilder(cur);
            for(int i=1; i<sb.length(); i+=2){
                sb.setCharAt(i, (char) ((sb.charAt(i)-'0' + a) % 10 + '0'));
            }
            String added = sb.toString();
            if(hs.add(added)) dq.offer(added);

            String rotated = cur.substring(cur.length() - b) + cur.substring(0, cur.length()-b);
            if(hs.add(rotated)) dq.offer(rotated);
        }
        return smallest;
    }
}
