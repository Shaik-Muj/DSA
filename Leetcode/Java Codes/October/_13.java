import java.util.*;

class _13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        System.out.print(helper(words));
        sc.close();
    }

    static List<String> helper(String[] words){
        List<String> res = new ArrayList<>();
        String prev = "";

        for(int i=0; i<words.length; i++){
            String str = sortedOne(words[i].toCharArray());
            if(!str.equals(prev)) {
                prev = str;
                res.add(words[i]);
            }
        }
        return res;
    }

    static String sortedOne(char[] letters){
        Arrays.sort(letters);
        return new String(letters);
    }
}