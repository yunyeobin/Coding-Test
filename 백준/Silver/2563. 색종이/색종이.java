
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        int count = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        int totalArea = 0;
        boolean[][] paper = new boolean[100][100];

        for (int i = 0; i < count; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            x = Integer.parseInt(stringTokenizer.nextToken());
            y = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!paper[j][k]) {
                        paper[j][k] = true;
                        totalArea++;
                    }
                }

            }
        }
        System.out.println(totalArea);

        
        br.close();
    }
}