package 과거의산물.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _9996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String inputPattern = br.readLine();
        String startStr = "";
        String endStr = "";
        boolean flag = false;

        for (int i = 0; i < inputPattern.length(); i++) {
            if (inputPattern.charAt(i) == '*') {
                flag = true;
                continue;
            }

            if (flag) {
                endStr += inputPattern.charAt(i);
                continue;
            }

            if (inputPattern.charAt(i) != '*') {
                startStr += inputPattern.charAt(i);
            }
        }

        String regex = "^" + startStr + ".*" + endStr + "$";
        // 패턴 컴파일
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.matches()) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }

        }


    }
}