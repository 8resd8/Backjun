package 과거의산물.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _7795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int aSize = Integer.parseInt(input[0]);
            int bSize = Integer.parseInt(input[1]);
            int[] aArr = new int[aSize];
            int[] bArr = new int[bSize];

            String[] aInput = br.readLine().split(" ");
            String[] bInput = br.readLine().split(" ");

            for (int j = 0; j < aSize; j++) {
                aArr[j] = Integer.parseInt(aInput[j]);
            }

            for (int j = 0; j < bSize; j++) {
                bArr[j] = Integer.parseInt(bInput[j]);
            }
            Arrays.sort(aArr);
            Arrays.sort(bArr);

            int bPointer = 0;
            int count = 0;

            // bPointer값을 초기화 시킬 이유가 없다
            for (int j = 0; j < aSize; j++) {
                while (bPointer < bSize && aArr[j] > bArr[bPointer]) {
                    bPointer++;
                }
                count += bPointer;
                System.out.println("aArr[" + j + "] = " + aArr[j] + ", bPointer = " + bPointer + ", count = " + count);
            }

            System.out.println(count);


        }


    }
}
