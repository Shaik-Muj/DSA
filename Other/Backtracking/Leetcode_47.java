package Other.Backtracking;

import java.util.*;

class Leetcode_47{

    static int countDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n /= 10;
        }
        return count;
    }

    static int[] convertToArray(int n){
        int size = countDigits(n);
        int[] arr = new int[size];
        int idx=0;

        for(int i=0; i<size; i++){
            arr[idx++] = n%10;
            n /= 10;
        }

        return arr;

    }

    static int convertToNumber(List<Integer> temp){
        StringBuilder sb = new StringBuilder();
        for(int i : temp){
            sb.append(String.valueOf(i));
        }

        return Integer.parseInt(sb.toString());
    }

    static String backtrack(int n){
        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int[] arr = convertToArray(n);
        boolean[] visited = new boolean[arr.length];
        Arrays.sort(arr);

        backtracking(list, temp, visited, arr);

        return Arrays.toString(list.toArray());
    }

	static void backtracking(List<Integer> list, List<Integer> temp, boolean[] visited, int[] arr){
        if(temp.size() == arr.length){
            list.add(convertToNumber(new ArrayList<>(temp)));
        }

        for(int i=0; i<arr.length; i++){
            if(visited[i] || (i>0 && arr[i]==arr[i-1] && !visited[i-1])){
                continue;
            }

            temp.add(arr[i]);
            visited[i]=true;

            backtracking(list, temp, visited, arr);

            temp.remove(temp.size()-1);
            visited[i]=false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        System.out.println("The other permutations are - \n");
        System.out.print(backtrack(n));
        sc.close();
    }
}