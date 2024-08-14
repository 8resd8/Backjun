package 과거의산물.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _11576 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ABString = br.readLine().split(" ");
        int aStr = Integer.parseInt(ABString[0]);
        int bStr = Integer.parseInt(ABString[1]);

        int m = Integer.parseInt(br.readLine());
        String[] AString = br.readLine().split(" ");
        // A진법 수 AString을 10진법으로 변환 후 b진법으로 변환
        // m자리수가 주어지고 높은자리부터 주어짐. (2)(16)

        int changeA = 0;
        int pow = m - 1;
        for (String s : AString) {
            int number = Integer.parseInt(s);
            changeA += (int) Math.pow(aStr, pow--) * number;
        }

        String result = "";
        while (changeA > 0) {
            result = (changeA % bStr) + " " + result;
            changeA /= bStr;
        }
        System.out.println(result);


    }
}