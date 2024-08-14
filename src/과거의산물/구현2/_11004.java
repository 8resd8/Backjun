package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int k = Integer.parseInt(nk[1]) - 1;

        String[] input = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);

        System.out.println(list.get(k));
    }
}