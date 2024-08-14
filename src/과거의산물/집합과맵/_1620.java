package 과거의산물.집합과맵;

import java.io.*;
import java.util.HashMap;

public class _1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]); // 도감의 개수
        int m = Integer.parseInt(nm[1]); // 맞춰야 하는 개수

        HashMap<String, Integer> dogamName = new HashMap<>();
        HashMap<Integer, String> dogamCount = new HashMap<>();
        // 도감에 입력
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            dogamName.put(name, i + 1);
            dogamCount.put(i + 1, name);
        }

        // 찾을 과거의산물.문자열 입력
        for (int i = 0; i < m; i++) {
            String findInput = br.readLine();

            if (dogamName.containsKey(findInput)) { // 문자열로 들어 왔을 때
                bw.write(dogamName.get(findInput) + "\n");
            } else { // 숫자로 들어왔을 때
                int num = Integer.parseInt(findInput);
                bw.write(dogamCount.get(num) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}