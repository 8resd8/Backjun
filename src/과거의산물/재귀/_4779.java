package 과거의산물.재귀;

import java.io.*;

public class _4779 {

    static StringBuilder strings;

    static public void khan(int left, int right) {
        if (right == 1) return;

        int newRight = right / 3;

        for (int i = left + newRight; i < left + newRight * 2; i++) {
            strings.setCharAt(i, ' ');
        }
        khan(left, newRight); // 왼쪽
        khan(left + newRight * 2, newRight); // 오른쪽

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s == null) break;

            int input = Integer.parseInt(s);
            strings = new StringBuilder();

            for (int i = 0; i < Math.pow(3, input); i++) {
                strings.append("-");
            }

            khan(0, strings.length());
            System.out.println(strings);

        }


    }
}