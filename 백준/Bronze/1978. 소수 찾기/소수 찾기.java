import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 숫자 개수
        int result = 0; // 소수 개수

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (isPrime(number)) { // 소수라면 결과 증가
                result++;
            }
        }

        System.out.println(result); // 소수 개수 출력
    }

    // 소수 판별 함수
    private static boolean isPrime(int num) {
        if (num <= 1) { // 1 이하의 숫자는 소수가 아님
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // √num까지만 나눗셈 확인
            if (num % i == 0) { // 나누어떨어지면 소수가 아님
                return false;
            }
        }
        return true; // 나누어떨어지지 않으면 소수
    }
}
