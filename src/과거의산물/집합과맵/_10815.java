package 과거의산물.집합과맵;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int myCards = Integer.parseInt(br.readLine());
        // Set: 중복을 허용하지 않는 데이터의 집합
        // Map: key-value 쌍으로 데이터를 저장하는 구조
        HashSet<Integer> card = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            card.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            if (card.contains(Integer.parseInt(st.nextToken()))) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}