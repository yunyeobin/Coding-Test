import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int[] arrays = new int[5];
        for (int i = 0; i < 5; i++) {
            arrays[i] = sc.nextInt();
            sum += arrays[i];
        }
        avg = sum/5;
        System.out.println(avg);
        Arrays.sort(arrays);
        System.out.println(arrays[2]);
    }
}