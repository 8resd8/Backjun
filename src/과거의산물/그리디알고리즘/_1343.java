package 과거의산물.그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1343 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder();
        int countX = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'X') {
                countX++;
            } else {
                if (!replaceAB(sb, countX)) {
                    System.out.println(-1);
                    return;
                }
                sb.append(c);
                countX = 0;
            }
        }

        if (!replaceAB(sb, countX)) {
            System.out.println(-1);
            return;
        }
        System.out.println(sb);

    }

    private static boolean replaceAB(StringBuilder sb, int countX) {
        if (countX % 2 != 0) {
            return false;
        }

        while (countX >= 4) {
            countX -= 4;
            sb.append("AAAA");
        }

        if (countX == 2) {
            sb.append("BB");
        }

        return true;
    }
}