
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] score = new double[N];
        double avg, max = 0, sum = 0;
        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }
        max = Arrays.stream(score).max().getAsDouble();
        sum = 0;
        for (int i = 0; i < N; i++) {
            score[i] = (score[i]/max)*100;
            sum += score[i];
        }

        avg = sum/N;
        System.out.println(avg);
    }
}