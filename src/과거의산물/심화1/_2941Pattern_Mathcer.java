package 과거의산물.심화1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2941Pattern_Mathcer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] targets = {"c-", "c=", "d-", "dz=", "lj", "nj", "s=", "z="};

        for (String target : targets) {
            Pattern pattern = Pattern.compile(target); // target값을 pattern으로 넣기
            Matcher matcher = pattern.matcher(input); // input값에서 pattern의 값이 있는지 확인
            System.out.println(matcher);

            while (matcher.find()) {
                // 크로아티아 문자열만 제외하고 아무거나 1글자 (1글자로 취급해야 하기 때문)
                input = input.replaceAll(target, "a");
            }
        }
        System.out.println(input.length());
    }
}



//import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//
//public class 과거의산물.삼성DX사전문제.Backjoon.silver.s2.Main {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        String[] croatiaAlphabet = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
//        int index = 0;
//
//        for (int i = 0; i < croatiaAlphabet.length; i++) {
//            index = s.indexOf(croatiaAlphabet[i]);
//            if (index >= 0) {
//                s = s.replaceAll(croatiaAlphabet[i], "A");
//            }
//        }
//        System.out.println(s.length());
//    }
//}