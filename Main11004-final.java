import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main11004 {
    private void www() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[a];

        st = new StringTokenizer(br.readLine());
        while (a-->0)
            arr[a] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
        System.out.println(arr[b-1]);
    }

    public static void main(String[] args) throws Exception{
        new Main11004().www();
    }
}










