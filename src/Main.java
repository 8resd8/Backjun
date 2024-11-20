import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = br.readLine();
        int count = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= input.length() - 4; i++) {
            sb.append(input.substring(i, i + 4));
            if (sb.toString().equals("DKSH")) count++;
            sb.setLength(0);
        }

        System.out.println(count);
    }
}
