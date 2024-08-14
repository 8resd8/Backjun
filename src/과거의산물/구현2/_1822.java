package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class _1822 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = br.readLine().split(" ");
        TreeSet<Integer> set = new TreeSet<>();

        String[] aSet = br.readLine().split(" ");
        String[] bSet = br.readLine().split(" ");

        for (String s : aSet) {
            int num = Integer.parseInt(s);
            set.add(num);
        }

        for (String s : bSet) {
            int num = Integer.parseInt(s);
            set.remove(num);
        }

        if (set.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(set.size());
            for (Integer i : set) {
                System.out.print(i + " ");
            }
        }



    }


}