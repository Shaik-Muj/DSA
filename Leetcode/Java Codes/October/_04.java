import java.util.*;

class _04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];
        for(int i=0; i<n; i++){
            height[i] = sc.nextInt();
        }
        System.out.print(maxArea(height));
        sc.close();
    }

    static int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxA = 0;

        while(left <= right){
            int area = Math.min(height[right], height[left]) * (right-left);

            maxA = Math.max(maxA, area);

            if(height[left]<=height[right]) left++;
            else right--;
        }
        return maxA;
    }

}