//package Backjoon.gold;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class 좋은친구_3078 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int n = nk[0];
//        int k = nk[1];
//        String[] arr = new String[n];
//        Queue<String> queue = new LinkedList<>();
//        Queue<String> save = new LinkedList<>();
////        for (int i = 0; i < n; i++) {
////            arr[i] = br.readLine();
////        }
//
//        for (int i = 0; i < n; i++) {
//            String input = br.readLine();
//            queue.add(input);
////            save.add(input);
//        }
//
//
//        int answer = 0;
//        while (!queue.isEmpty()) {
//            String nowString = queue.poll(); // 기준 문자열
//
//            for (int i = 0; i < k; i++) {
//                if (queue.isEmpty()) break;
//                String poll = queue.poll();
//                save.add(poll); // 여기를 배열로하기?
//
//                int nowIdx = index.poll();
//
//                if (len == poll.length()) answer++;
//                queue.add(poll);
//                index.add(i);
//
//
//
//            }
//
//
//        }
//        System.out.println(answer);
//    }
//}