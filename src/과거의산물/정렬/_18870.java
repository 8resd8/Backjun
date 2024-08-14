package 과거의산물.정렬;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class _18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        String[] input = br.readLine().split(" ");

        // 입력 받기
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(input[i]);
            arr.add(num);
        }

        // 배열을 복사해서 정렬한 배열 들기
        ArrayList<Integer> sortedArr = new ArrayList<>(arr);
        Collections.sort(sortedArr);

        // 입력받은 배열에 순서를 부여하기 위한 해쉬맵
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int order = 0; // 순서 부여

        // 정렬된 배열에 값을 0부터 넣기
        for (int i = 0; i < n; i++) {
            if (!hashMap.containsKey(sortedArr.get(i))) { // 중복값이 없다면 값 추가
                hashMap.put(sortedArr.get(i), order++);
            }
        }

        // 원본 배열값들을 넣어서 출력하기
        for(int i: arr) {
            bw.write(hashMap.get(i) + " ");
        }
        bw.write("\n");

        bw.flush();
        bw.close();
        br.close();

    }
}