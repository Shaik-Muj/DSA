import java.util.*;

class MonkAndRotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases - ");
        int t = sc.nextInt();
        System.out.println("Enter the number of elements 'n' and enter those elements - ");
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            System.out.print("Enter the value of k - ");
            int k = sc.nextInt();
            System.out.println("Rotated array is - " + Arrays.toString(helper(arr,k)));
        }
        sc.close();
    }

    static int[] helper(int[] arr, int k){
        if(arr.length == 0) return new int[]{};
        if(arr.length == 1) return arr;

        int[] res = new int[arr.length];
        int idx = 0;
        int l = arr.length-1;
        k = k%(l+1);
        for(int i=1; i<arr.length+1; i++){
            res[idx++] = arr[(l-k+i)%(l+1)];
        }

        return res;
    }
}