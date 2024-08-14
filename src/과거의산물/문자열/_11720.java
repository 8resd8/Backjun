package 과거의산물.문자열;

import java.util.Scanner;

public class _11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println(sum);


//        이 방법은 어떤 값을 "기준으로 나눌 때" 사용한다. 따라서 붙어있는 문자열은 사용불가능.
//        StringTokenizer st = new StringTokenizer(s, "");
//        int result = 0;
//        while(st.hasMoreTokens()) {
//            result += Integer.parseInt(st.nextToken());
//        }
//        System.out.println(result);
    }
}