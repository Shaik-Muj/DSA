import java.util.*;

public class MonkAndInversions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int mat[][] = new int[n][n];
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    mat[j][k] = sc.nextInt();
                }
            }
            System.out.print(helper(mat));
        }
        sc.close();
    }

    static int helper(int[][] mat){
        int count=0;

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                for(int p=i; p<mat.length; p++){
                    for(int q=j; q<mat.length; q++){
                        if(mat[i][j] > mat[p][q]) count++;
                    }
                }
            }
        }

        return count;
    }
}
