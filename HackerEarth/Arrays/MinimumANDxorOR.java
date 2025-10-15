import java.util.*;

class MinimumANDxorOR{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            helper(arr);
        }
        sc.close();
    }

    static void helper(int[] arr){
        int res = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++){
            if((arr[i]^arr[i+1])<res){
                res = arr[i]^arr[i+1];
            }
        }

        System.out.println(res);
    }
}