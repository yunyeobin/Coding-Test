import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 수의 개수 입력
        int N = Integer.parseInt(br.readLine());
        
        // 계수 정렬을 위한 배열 (범위: 1 ~ 10,000)
        int[] count = new int[10001];
        
        // 숫자 입력 및 카운트
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }
        
        // 정렬된 결과 출력
        for (int i = 1; i <= 10000; i++) {
            while (count[i] > 0) {
                bw.write(i + "\n");
                count[i]--;
            }
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}
