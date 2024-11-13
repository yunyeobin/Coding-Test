
import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();

            // 명령어의 종류에 따라 분기
            switch (cmd.split(" ")[0]) {
                case "push":
                    // "push X"에서 X 값을 추출하여 스택에 추가
                    int value = Integer.parseInt(cmd.split(" ")[1]);
                    stack.push(value);
                    break;

                case "pop":
                    // 스택이 비어있으면 -1, 아니면 맨 위의 값을 꺼내고 출력
                    if (stack.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(stack.pop() + "\n");
                    }
                    break;

                case "size":
                    // 스택의 크기 출력
                    bw.write(stack.size() + "\n");
                    break;

                case "empty":
                    // 스택이 비어있으면 1, 아니면 0 출력
                    bw.write((stack.isEmpty() ? 1 : 0) + "\n");
                    break;

                case "top":
                    // 스택이 비어있으면 -1, 아니면 맨 위의 값 출력
                    if (stack.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(stack.peek() + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}