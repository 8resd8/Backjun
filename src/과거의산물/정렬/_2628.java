package 과거의산물.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        int t = Integer.parseInt(br.readLine());

        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();
        rows.add(row);
        rows.add(0);
        cols.add(col);
        cols.add(0);

        for (int i = 0; i < t; i++) {
            input = br.readLine().split(" ");
            int selectRowCol = Integer.parseInt(input[0]);
            int cut = Integer.parseInt(input[1]);

            if (selectRowCol == 0) cols.add(cut);
            else rows.add(cut);
        }
        Collections.sort(rows);
        Collections.sort(cols);

        int rowMax = getMax(rows);
        int colMax = getMax(cols);


        System.out.println(rowMax * colMax);
    }

    private static int getMax(List<Integer> cuts) {
        int max = 0;
        for (int i = 1; i < cuts.size(); i++) {
            max = Math.max(cuts.get(i) - cuts.get(i - 1), max);
        }
        return max;
    }
}
