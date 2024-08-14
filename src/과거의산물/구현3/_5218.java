package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String str1 = input[0];
            String str2 = input[1];
            sb.append("Distances: ");
            for (int j = 0; j < str1.length(); j++) {
                String s1 = String.valueOf(str1.charAt(j));
                String s2 = String.valueOf(str2.charAt(j));
                int distance = Math.abs(s1.compareTo(s2) - 26) % 26;
                sb.append(distance).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}