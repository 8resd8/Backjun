import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        int b = (int) (a * (1 - 0.22));
        int c = (int) ((a * 0.8) + (a * 0.2) * (1 - 0.22));

        System.out.println(b + " " + c);
    }
}
