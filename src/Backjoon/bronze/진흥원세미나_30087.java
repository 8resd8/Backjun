package Backjoon.bronze;

// https://www.acmicpc.net/problem/30087

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 진흥원세미나_30087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> seminar = new HashMap<>();

        seminar.put("Algorithm", "204");
        seminar.put("DataAnalysis", "207");
        seminar.put("ArtificialIntelligence", "302");
        seminar.put("CyberSecurity", "B101");
        seminar.put("Network", "303");
        seminar.put("Startup", "501");
        seminar.put("TestStrategy", "105");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            sb.append(seminar.get(input)).append("\n");
        }

        System.out.print(sb);
    }
}
