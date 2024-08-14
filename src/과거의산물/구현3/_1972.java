package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class _1972 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            if (input.equals("*")) return;

            if (checkSurprising(input)) System.out.println(input + " is surprising.");
            else System.out.println(input + " is NOT surprising.");
        }
    }

    private static boolean checkSurprising(String input) {
        for (int i = 0; i < input.length(); i++) {
            HashSet<String> set = new HashSet<>();
            for (int j = 0; j + i + 1 < input.length(); j++) {
                String value = input.charAt(j) + "" + input.charAt(j + i + 1);

                if (set.contains(value)) return false;
                set.add(value);
            }
        }
        return true;
    }
}