import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main9656 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        bw.write((a % 2 == 1 ? "CY" : "SK"));
        bw.flush();
        bw.close();
        br.close();
    }
}
