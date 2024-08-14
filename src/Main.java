import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int max;

    static void calculateScore(int idx, int N, int L, int score, int calory, int[] tasteScores, int[] calories) {
        if (calory > L) return;

        max = Math.max(score, max);
        for (int i = idx; i < N; i++) {
            calculateScore(i + 1, N, L, score + tasteScores[i], calory + calories[i], tasteScores, calories);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            max = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());

            int[] calories = new int[N];
            int[] tasteScores = new int[N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                tasteScores[i] = Integer.parseInt(st.nextToken());
                calories[i] = Integer.parseInt(st.nextToken());
            }

            calculateScore(0, N, L, 0, 0, tasteScores, calories);
            System.out.println(max);
        }
    }
}