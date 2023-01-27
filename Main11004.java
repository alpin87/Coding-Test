import java.util.*;
import java.io.*;

public class Main11004 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] a = new int[sc.nextInt()];
        int b;
        b = sc.nextInt();

        for (int i = 0; i < a.length; i++){
                a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        System.out.println(a[b-1]);
    }
}










