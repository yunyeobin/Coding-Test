import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int [] arrays = new int[N];
        for (int i = 0; i < N; i++) {
            arrays[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arrays);
        for (int i = 0; i < N; i++) {
            bw.write(String.valueOf(arrays[i]));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}