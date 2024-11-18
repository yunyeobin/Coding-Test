
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int copy = N;

        do {N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;
        } while (copy != N);

        System.out.println(cnt);
        br.close();
    }
}