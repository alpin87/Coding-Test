import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            parent = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                parent[i] = i;
            }
            
            Map<Integer, List<int[]>> typeToEdges = new HashMap<>();
            
            for (int i = 1; i <= M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                
                typeToEdges.putIfAbsent(i, new ArrayList<>());
                typeToEdges.get(i).add(new int[]{a, b});
            }
            
            int connectedComponents = N;
            int typesUsed = 0;
            
            for (int type = 1; type <= M; type++) {
                if (!typeToEdges.containsKey(type)) continue;
                
                boolean usedThisType = false;
                
                for (int[] edge : typeToEdges.get(type)) {
                    int a = edge[0];
                    int b = edge[1];
                    
                    if (find(a) == find(b)) continue;
                    
                    union(a, b);
                    connectedComponents--;
                    usedThisType = true;
                }
                
                if (usedThisType) {
                    typesUsed++;
                }
                
                if (connectedComponents == 1) break;
            }
            
            int result = (connectedComponents == 1) ? typesUsed : -1;
            bw.write(result + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    private static int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) parent[b] = a;
    }
}

