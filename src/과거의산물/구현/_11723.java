package 과거의산물.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Set<Integer> setResult = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int number = 0;
            if (input.length > 1) {
                number = Integer.parseInt(input[1]);
            }

            switch (input[0]) {
                case "add":
                    setResult.add(number);
                    break;
                case "remove":
                    setResult.remove(number);
                    break;
                case "check":
                    if (!setResult.contains(number)) {
                        sb.append(0).append("\n");
                    } else {
                        sb.append(1).append("\n");
                    }
                    break;
                case "toggle":
                    if (setResult.contains(number)) {
                        setResult.remove(number);
                    } else {
                        setResult.add(number);
                    }
                    break;
                case "all":
                    for (int j = 1; j <= 20; j++) {
                        setResult.add(j);
                    }
                    break;
                case "empty":
                    setResult.clear();
                    break;
            }
        }
        System.out.println(sb);


    }
}