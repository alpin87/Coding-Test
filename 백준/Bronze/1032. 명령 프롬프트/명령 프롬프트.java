import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] fileName = new String[N];

        for (int i = 0; i < N; i++) {
            fileName[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        int len = fileName[0].length();

        for (int i=0; i< len;i++) {
            char c = fileName[0].charAt(i);
            boolean flag = true;

            for (int j = 1; j < N; j++) {
                if (fileName[j].charAt(i) != c) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sb.append(c);
            } else {
                sb.append('?');
            }
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
