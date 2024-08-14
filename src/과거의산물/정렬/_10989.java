package 과거의산물.정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] count = new int[10001];

        // 입력으로 들어오는 값은 1 ~ 10000의 수가 천만번 들어온다. 즉, 중복되는 수는 숫자만 늘려서 출력
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }

        for (int i = 0; i < 10001; i++) {
            while (count[i] > 0) {
                bw.write(Integer.toString(i));
                bw.newLine();
                count[i]--;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}