
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int[] array= new int[26];    //단어에 나오는 알파벳의 개수를 셀 배열 생성
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                array[str.charAt(i) - 'A']++;
            }
            else {
                array[str.charAt(i) - 'a']++;   //배열의 초기값은 0으로 되어있고, 해당하는 알파벳 나오면 ++
            }
        }
        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (array[i] > max) {
                max = array[i];
                ch = (char) (i + 65);
            }
            else if (array[i] == max) {
                ch = '?';
            }
        }

        System.out.print(ch);

    }
}