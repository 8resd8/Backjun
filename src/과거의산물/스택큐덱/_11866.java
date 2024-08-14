package 과거의산물.스택큐덱;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        int circle = 0;
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        for (int i = 0; i < n; i++) {
            q.offer(i + 1);
        }

        while(!q.isEmpty()) {
            circle++;

            if (circle % k == 0) {
                circle = 0;
                arr.add(q.poll());
            } else {
                q.offer(q.poll());
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<").append(arr.get(0));
        for (int i = 1; i < arr.size(); i++) {
            sb.append(", ").append(arr.get(i));
        }
        sb.append(">\n");

        System.out.println(sb);
    }
}

