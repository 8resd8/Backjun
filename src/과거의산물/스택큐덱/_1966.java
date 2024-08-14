package 과거의산물.스택큐덱;

import java.io.*;
import java.util.*;

public class _1966 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();


            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                int number = sc.nextInt();
                list.add(number);
            }
            Collections.sort(list);
            Collections.reverse(list);

            int importanceLevel = 0;
            int count = 0;
            Queue<Integer> queue = new LinkedList<>(list);
            while (queue.size() > 1) {
                int role = queue.peek();

                if (role == queue.poll()) {
                    count++;
                    System.out.println(count);
                    break;
                }


            }
            // poll했는데 값이 같은 경우
            // 9 1 1 1 1 1


        }

    }
}