package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17219 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String stS = br.readLine();
        String stP = br.readLine();
        int result = stS.indexOf(stP) != -1 ? 1 : 0;

        System.out.println(result);


    }


}