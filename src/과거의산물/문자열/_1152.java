package 과거의산물.문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        int count = 0;

        while(st.hasMoreTokens()) {
            st.nextToken();
            count++;
        }
        System.out.println(count);

    }
}