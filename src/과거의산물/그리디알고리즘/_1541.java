package 과거의산물.그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1541 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder previous = new StringBuilder();
        int result = 0;
        int i = 0;
        boolean minusCheck = false;
        for (char c : input.toCharArray()) {
            // -가 나온 시점부터 뒤에 값들은 전부 빼버려야 한다.
            if (c == '-' && !minusCheck) {
                minusCheck = true;
                result = getResult(result, previous);
            } else if (minusCheck && (c == '+' || c == '-')) {
                result -= Integer.parseInt(String.valueOf(previous));
                previous.setLength(0);
            } else if (!minusCheck && c == '+') {
                // -가 나오지 않았을때는 그냥 더해.
                result = getResult(result, previous);

            }

            // 0부터 추가되는 숫자라면 추가되지 않아야 한다.
            if (previous.length() == 0 && c == '0') {
                i++;
                continue;
            }

            previous.append(c);
            i++;
        }

        if (i == input.length()) {
            if (minusCheck) {
                result -= Integer.parseInt(String.valueOf(previous));
            } else {
                result += Integer.parseInt(String.valueOf(previous));
            }
        }
        System.out.println(result);
    }

    private static int getResult(int result, StringBuilder previous) {
        result += Integer.parseInt(String.valueOf(previous));
        previous.setLength(0);
        return result;
    }
}