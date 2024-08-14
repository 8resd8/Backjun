package 과거의산물.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class _4358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Integer> trees = new TreeMap<>();
        int treeCount = 0;

        while (true) {
            String input = br.readLine();
            if (input == null) {
                break;
            }
            trees.put(input, trees.getOrDefault(input, 0) + 1);
            treeCount++;
        }

        for (Map.Entry<String, Integer> tree : trees.entrySet()) {
            System.out.printf("%s %.4f\n", tree.getKey(), (double) tree.getValue() / treeCount * 100);
        }

    }
}