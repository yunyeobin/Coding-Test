import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        if (m < 45) {
            m += 60;
            h--;
            if (h < 0) {
                h = 23;
            }
        }
        m -= 45;

        bw.write(h + " " + m);
        bw.flush();
        bw.close();
        br.close();
    }
}
