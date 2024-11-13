
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

            //push 명령어
            if (cmd.startsWith("push")){
                int number = Integer.parseInt(cmd.split(" ")[1]);
                stack.push(number);
            }

            //pop 명령어
            else if (cmd.equals("pop")) {
                if (stack.empty()){
                    bw.write("-1\n");
                }else {
                    bw.write(stack.pop()+"\n");
                }
            }

            //size 명령어
            else if (cmd.equals("size")) {
                bw.write(stack.size()+"\n");
                
            }
            
            //empty 명령어
            else if (cmd.equals("empty")) {
                if (stack.isEmpty()){
                    bw.write("1\n");
                }else {
                    bw.write("0\n");
                }
            }

            //top 명령어
            else if (cmd.equals("top")) {
                if (stack.isEmpty()){
                    bw.write("-1\n");
                }else {
                    bw.write(stack.peek() + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}