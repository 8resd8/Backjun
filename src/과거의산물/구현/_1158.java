package 과거의산물.구현;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        result.append("<");

        for (int i = 0; i < n; i++) {
            queue.offer(i + 1);
        }

        while (!queue.isEmpty()) {
            int count = 0;
            while (count != k) {
                count++;
                if (count == k) {
                    if (queue.size() != 1) {
                        result.append(queue.poll()).append(", ");
                    } else {
                        result.append(queue.poll());
                    }

                } else {
                    if (!queue.isEmpty()) {
                        queue.offer(queue.poll());
                    }
                }
            }
        }
        result.append(">");


        System.out.println(result);


    }
}
