package 과거의산물.조합론;

// DP(기억하기 알고리즘, 기억하며 풀기) : 모든 경우의 수를 구해야 하는데 시간이 오래걸려 만들어진 것
// 메모리를 사용해(배열, 자료구조 사용) 중복 연산을 삭제(연산결과를 배열에 저장), 따라서 속도 개선
// 언제 사용하냐? : 계산 수가 500만개가 넘어갈 때. (DPS, DFS를 쓰면 무조건 시간초과가 날 것 같을때)
// 중복연산이 많다는 것을 알았을 때.
import java.io.*;

public class _11050 {

    public static int factorial(int n, int k) {
        if (n == k || k == 0) {
            return 1;
        }

        return factorial(n - 1, k - 1) + factorial(n - 1, k);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        // N개 중에서 K개를 뽑는 경우의 수 구하기.
        // nCk
        //    n!
        // k!(n-k!)
        System.out.println(factorial(N, K));

    }
}