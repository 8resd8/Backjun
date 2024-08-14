package 과거의산물.재귀;

import java.io.*;

public class _24060 {

    static int findNumber;
    static int count;
    static int result;

    static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p , q, r);
        }
    }

    private static void merge(int[] A, int p, int q, int r) {
        int i = p, j = q + 1, t = 0;
        int[] tmp = new int[r - p + 1];
        count++;
        while (i <= q && j <= r) {

            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }

        }

        while (i <= q) {
            tmp[t++] = A[i++];
        }

        while (j <= r) {
            tmp[t++] = A[j++];
        }

        i = p;
        t = 0;
        while (i <= r) {
            A[i++] = tmp[t++];
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] A = new int[n];
        String[] number = br.readLine().split(" ");
        findNumber = k;

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(number[i]);
        }
        mergeSort(A, 0, n);
        System.out.println(count);


    }
}