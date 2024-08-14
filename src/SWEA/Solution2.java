package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] wantsSize = new int[n];
            int[] capsSize = new int[n];

            for (int j = 0; j < n; j++) {
                wantsSize[j] = sc.nextInt();
            }

            for (int j = 0; j < n; j++) {
                capsSize[j] = sc.nextInt();
            }

            Arrays.sort(wantsSize);
            Arrays.sort(capsSize);

            int answer = 0;
            int index = 0;

            for (int j = 0; j < n; j++) {
                // 조건 일치하는 모자 확인
                while (index < n && capsSize[index] < wantsSize[j] - 3) {
                    index++;
                }

                if (index < n && Math.abs(capsSize[index] - wantsSize[j]) <= 3) {
                    answer++;
                    index++;
                }
            }


            System.out.println("#" + i + " " + answer);

        }
        sc.close();


    }
}