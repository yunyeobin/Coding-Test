
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 슬라이딩 윈도우를 이용하여 최소 날짜 계산
        int start = 0, end = 0, sum = 0;
        int minDays = Integer.MAX_VALUE;

        while (end < N) {
            sum += A[end++];

            while (sum >= M) {
                minDays = Math.min(minDays, end - start);
                sum -= A[start++];
            }
        }

        // 출력
        if (minDays == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minDays);
        }

        sc.close();
    }
}