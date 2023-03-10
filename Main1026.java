
import java.util.Arrays;
import java.util.Scanner;

public class Main1026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int[] arr1 = new int[A];
        int[] arr2 = new int[A];
        int[] arr3 = new int[A];
        int sum = 0;

        for (int i=0; i< A; i++){
            arr1[i] = sc.nextInt();
        }
        for (int i=0; i<A; i++){
            arr2[i] = sc.nextInt();
            arr3[i] = arr2[i];
        }

        Arrays.sort(arr1);
        Arrays.sort(arr3);

        for (int i=0; i<A; i++){
            sum = sum + (arr1[i] * arr3[A-1-i]);
        }
        System.out.println(sum);
    }
}
