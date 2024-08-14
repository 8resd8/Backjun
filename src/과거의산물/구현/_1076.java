package 과거의산물.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] register = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int n = 3;

        // 입력
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = br.readLine();
        }


        StringBuilder value = new StringBuilder(); // 47
        long result = 0;
        int multiple = 0;
        for (int i = 0; i < n; i++) { // 3번 반복 1. yello 2. violet 3. red
            for (int j = 0; j < register.length; j++) { // 모든 레지스터 확인
                if (input[i].equals(register[j])) {
                    value.append(j);
                    multiple = j;
                }
            }
        }
        value.replace(value.length() - 1, value.length(), "");
        result = (long) (Integer.parseInt(value.toString()) * Math.pow(10, multiple));
        System.out.println(result);

        /*
        색	    값	곱
        black	0	1
        brown	1	10
        red	    2	100 10^2
        orange	3	1,000 10^3
        yellow	4	10,000 10^4
        green	5	100,000
        blue	6	1,000,000
        violet	7	10,000,000
        grey	8	100,000,000
        white	9	1,000,000,000
        */
    }
}
