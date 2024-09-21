import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] tree = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tree);

        int min = tree[0];
        int max = tree[N-1];
        int mid = (max+min) /2;

        int answer = 0;
        while (true) {
            int sum = 0;
            for (int i=N-1;i>=0;i--) {
                if (tree[i] <= mid) {
                    break;
                }
                sum += tree[i] - mid;
            }

            if (sum >= M) {
                answer = mid;
            }

            if (mid >= max) {
                break;
            }
            mid = (max+mid) / 2 + 1;
        }

        System.out.println(answer);
    }
}