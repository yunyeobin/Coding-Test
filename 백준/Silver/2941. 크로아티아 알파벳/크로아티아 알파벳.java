import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        word = word.replace("c=", "0");
        word = word.replace("c-", "0");
        word = word.replace("dz=", "0");
        word = word.replace("d-", "0");
        word = word.replace("lj", "0");
        word = word.replace("nj", "0");
        word = word.replace("s=", "0");
        word = word.replace("z=", "0");

        int count = word.length();

        System.out.print(count);

        bw.flush();
        bw.close();
        br.close();
    }
}
