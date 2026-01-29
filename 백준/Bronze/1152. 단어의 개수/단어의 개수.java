import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String str = br.readLine().trim();
        if(str.isBlank()){
            System.out.println(0);
        }else{
            int s = 0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) == ' '){
                    s++;
                }
            }
            System.out.println(s + 1);
        }
    }
}