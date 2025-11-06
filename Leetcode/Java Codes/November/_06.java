import java.util.*;

class _06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Expected input:
        // c
        // m
        // m lines: u v
        // q
        // q lines: operation station
        int c = sc.nextInt();
        int m = sc.nextInt();
        int[][] connections = new int[m][2];
        for (int i = 0; i < m; i++) {
            connections[i][0] = sc.nextInt();
            connections[i][1] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[][] queries = new int[q][2];
        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        int[] ans = helper(c, connections, queries);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }

    static int[] helper(int c, int[][] connections, int[][] queries){
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<c; i++){
            adj.add(new ArrayList<>());
        }

        for(int connection[] : connections){
            int u = connection[0];
            int v = connection[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean visited[] = new boolean[c+1];
        List<TreeSet<Integer>> components = new ArrayList<>();
        int[] compIdx = new int[c+1];
        for(int i=1; i<=c; i++){
            if(!visited[i]){
                bfs(visited, i, adj, compIdx, components);
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int[] query : queries){
            int operation = query[0];
            int station = query[1];
            int cIdx = compIdx[station];
            TreeSet<Integer> tset = components.get(cIdx);

            if(operation == 1){
                if(tset.isEmpty()){
                    res.add(-1);
                } else if(tset.contains(station)){
                    res.add(station);
                } else {
                    res.add(tset.first());
                }
            } else {
                tset.remove(station);
            }
        }

        int[] ans = new int[res.size()];
        int j=0;
        for (int num : res){
            ans[j++] = num;
        }
        return ans;
    }

    static void bfs(boolean[] visited, int i, List<List<Integer>> adj, int[] compIdx, List<TreeSet<Integer>> components){
        int cIdx = components.size();
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visited[i] = true;

        TreeSet<Integer> set = new TreeSet<>();
        while(!q.isEmpty()){
            int curr = q.poll();
            compIdx[curr] = cIdx;
            set.add(curr);

            for(int nbr : adj.get(curr)){
                if(!visited[nbr]){
                    q.offer(nbr);
                    visited[nbr] = true;
                }
            }
        }

        components.add(set);
    }
}
