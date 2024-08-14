package 과거의산물.문자열;

import java.util.Arrays;
import java.util.Scanner;

public class _10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alpha = new int[26];
        int order = 0; // 시작하는 순서

        Arrays.fill(alpha, -1); // -1값으로 모두 채우기
        String input = sc.next(); // 입력 받기

        for (int i = 0; i < input.length(); i++) {
            int calculate = input.charAt(i) - 97; // a = 97이므로 a = 0, b = 1 --- z = 25
            // input.charAt(i) - 'a'

            if (alpha[calculate] < 0) {
                alpha[calculate] = order;
            }
            order++;
        }

        for (int i = 0; i < alpha.length; i++) {
            System.out.printf("%d ", alpha[i]);
        }
    }
}



//        for (int i = 0; i < input.length(); i++) {
//            int val = input.charAt(i) - 97;
//            if (temp[val] < 1) {
//                temp[val] = order;
//                alpha[val] = order;
//            }
//            order++;
//
//            System.out.printf("%d = %d\n", input.charAt(i) - 97, temp[input.charAt(i) - 97]);
//
//        }
//        System.out.println();
//
//        for (int i = 0; i < temp.length; i++) {
//            System.out.printf("%d ", alpha[i]);
//        }
//


        // 1. 단어 s를 입력받기.
        // 2. s값을 처음부터 끝까지 하나하나 확인
        // 3. s[0]번째의 단어는 0
        // 4. s[1]번째의 단어는 1 ---
        // 5. s[7]번째의 단어는 7 ---
        // 6.

        
        
        // a = 97이므로 97을 빼주자
//        System.out.println();
//        char cha = 'b';
//        System.out.println((int)cha);

//    }
//}