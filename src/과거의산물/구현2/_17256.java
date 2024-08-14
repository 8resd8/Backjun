package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17256 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        String[] c = br.readLine().split(" ");

        int ax = Integer.parseInt(a[0]);
        int ay = Integer.parseInt(a[1]);
        int az = Integer.parseInt(a[2]);

        int cx = Integer.parseInt(c[0]);
        int cy = Integer.parseInt(c[1]);
        int cz = Integer.parseInt(c[2]);

        int bx = Math.abs(az - cx);
        int by = Math.abs(cy / ay);
        int bz = Math.abs(cz - ax);

        System.out.print(bx + " " + by + " " + bz);

    }
}