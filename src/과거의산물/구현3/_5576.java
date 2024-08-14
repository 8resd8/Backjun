package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _5576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> WUniversity = new ArrayList<>();
        List<Integer> KUniversity = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            WUniversity.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(WUniversity);

        for (int i = 0; i < 10; i++) {
            KUniversity.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(KUniversity);

        int Wsum = 0;
        int Ksum = 0;
        for (int i = 9; i > 6; i--) {
            Wsum += WUniversity.get(i);
            Ksum += KUniversity.get(i);
        }
        System.out.print(Wsum + " " + Ksum);

    }

}