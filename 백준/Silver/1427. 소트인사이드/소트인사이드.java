import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] arrays = sc.nextLine().toCharArray();
        Arrays.sort(arrays);
        for (int i = arrays.length-1; i >= 0; i--) {
            System.out.print(arrays[i]);
        }

    }
}