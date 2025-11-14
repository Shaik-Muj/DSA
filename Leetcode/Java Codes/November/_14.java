import java.util.*;

class _14 {
    static int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] res = new int[n+1][n+1];
        
        for(int query[] : queries){
            int r1 = query[0];
            int c1 = query[1];
            int r2 = query[2];
            int c2 = query[3];

            res[r1][c1] += 1;
            res[r2+1][c1] -= 1;
            res[r1][c2+1] -= 1;
            res[r2+1][c2+1] += 1;
        }

        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                res[i][j] += res[i][j-1];
            }
        }

        for(int j=0; j<n; j++){
            for(int i=1; i<n; i++){
                res[i][j] += res[i-1][j];
            }
        }

        int[][] result = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                result[i][j] = res[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[][] queries = new int[q][4];
        for(int i=0; i<q; i++){
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
            queries[i][2] = sc.nextInt();
            queries[i][3] = sc.nextInt();
        }
        
        int[][] result = rangeAddQueries(n, queries);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
