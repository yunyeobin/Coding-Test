import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스 수 입력
        sc.nextLine(); // 개행 문자 처리

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine(); // 한 줄 전체 입력받기
            Stack<Character> stack = new Stack<>();
            boolean isValid = true; // VPS 여부 플래그

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    stack.push('('); // 열린 괄호는 스택에 추가
                } else {
                    if (stack.empty()) {
                        isValid = false; // 닫는 괄호가 나왔는데 스택이 비어 있으면 VPS 아님
                        break;
                    }
                    stack.pop(); // 열린 괄호와 닫는 괄호를 짝지음
                }
            }

            // 루프 종료 후 스택이 비어 있지 않으면 VPS가 아님
            if (!stack.empty()) {
                isValid = false;
            }

            // 결과 출력
            System.out.println(isValid ? "YES" : "NO");
        }

        sc.close();
    }
}
