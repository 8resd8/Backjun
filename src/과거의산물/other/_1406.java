package 과거의산물.other;

import java.io.*;

public class _1406 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append(string);

        int currentLocation = sb.length();
        for (int i = 0; i < n; i++) {
            String[] order = br.readLine().split(" ");

            switch (order[0]) {
                case "L":
                    if (currentLocation > 0) currentLocation--;
                    break;
                case "D":
                    if (currentLocation < sb.length()) currentLocation++;
                    break;
                case "B":
                    if (currentLocation > 0) {
                        sb.delete(currentLocation - 1, currentLocation--);
                    }
                    break;
                case "P":
                    sb.insert(currentLocation++, order[1]);
                    break;
            }
//            System.out.printf("커서 : %d, 현재 값 : %s\n", currentLocation, sb);
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();

    }
}