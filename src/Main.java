package 입출력과사칙연산.src;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static int N, name, minLength;
    static int[][] map, visited;
    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] v = new int[3][3];

        HashMap<Integer, Integer> x = new HashMap<>();
        HashMap<Integer, Integer> y = new HashMap<>();

        for (int i = 0; i < v.length; i++) {
            x.put(  v[i][0], x.getOrDefault(x.get(v[i][0]), 0) + 1  );
            x.put(v[i][0], x.getOrDefault(x.get(v[i][0]), 0) + 1);

        }


        for (int i = 0; i < v.length; i++) {
            x.put((v[i][0]), x.getOrDefault(x.get(v[i][0]), 0) + 1);

            y.put((v[i][1]), x.getOrDefault(x.get(v[i][1]), 0) + 1);
        }

        int X = 0;
        int Y = 0;
        for (Map.Entry<Integer, Integer> entry : x.entrySet()) {
            if (entry.getValue() == 1) {
                X = entry.getKey();
            }
        }

        for (Map.Entry<Integer, Integer> entry : y.entrySet()) {
            if (entry.getValue() == 1) {
                Y = entry.getKey();
            }
        }

        int[] result = new int[]{X, Y};

    }
}