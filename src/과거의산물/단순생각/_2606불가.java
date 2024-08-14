package 과거의산물.단순생각;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _2606불가 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 컴퓨터 수
        int n = Integer.parseInt(br.readLine()); // 컴퓨터 쌍(개수)
        Set<Integer> set = new HashSet<>();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            arr[i][0] = a;
            arr[i][1] = b;
        }

//        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(arr, (a, b) -> {
            if (b[0] < b[1]) {
                return Integer.compare(b[0], b[1]);
            } else {
                return Integer.compare(a[0], a[1]);
            }
        });

        set.add(arr[0][0]);
        set.add(arr[0][1]);
        for (int i = 1; i < n; i++) {
            if (set.contains(arr[i][0]) || set.contains(arr[i][1])) {
                set.add(arr[i][0]);
                set.add(arr[i][1]);
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }



        System.out.println(set.size() - 1); // 1번 컴퓨터는 제외
    }
}