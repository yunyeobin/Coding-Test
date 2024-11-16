import java.io.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        String bomb = br.readLine();

        Stack<Character> stack = new Stack<>();
        int bombLength = bomb.length();
        
        // 문자열을 한 글자씩 스택에 추가
        for (char c : input.toCharArray()) {
            stack.push(c); // 현재 문자 추가
            
            // 스택의 끝부분이 폭발 문자열과 일치하는지 확인
            if (stack.size() >= bombLength) {
                boolean isMatch = true;
                for (int i = 0; i < bombLength; i++) {
                    // 스택의 끝에서 폭발 문자열 길이 만큼과 비교
                    if (stack.get(stack.size() - bombLength + i) != bomb.charAt(i)) {
                        isMatch = false;
                        break;
                    }
                }
                
                // 폭발 문자열이 일치하면 제거
                if (isMatch) {
                    for (int i = 0; i < bombLength; i++) {
                        stack.pop(); // 폭발 문자열 길이만큼 pop
                    }
                }
            }
        }
        
        // 스택에 남아 있는 문자 합치기
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        
        if (result.length() == 0) {
            bw.write("FRULA");
        } else {
            bw.write(result.toString());
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}