package 과거의산물.심화2;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class _25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> log = new HashSet<>();
        int gomgomCount = 0;
        int checkOne = 0; // ENTER가 1회임을 확인하는 변수

        for (int i = 0; i < n; i++) {
            String e = br.readLine();

            // ENTER가 입력되면 정산하기
            if (e.equals("ENTER")) {
                gomgomCount += log.size();
                checkOne++;
                log.clear();
            } else {
                log.add(e);
            }
        }

        // ENTER가 1번이면 기록의 크기가 곰곰티콘의 사용 수
        if (checkOne == 1) {
            gomgomCount = log.size();
        } else { // 마지막 입력 정산하기
            gomgomCount += log.size();
        }

        System.out.println(gomgomCount);

    }
}