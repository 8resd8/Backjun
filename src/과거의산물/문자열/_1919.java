package 과거의산물.문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        List<Character> aList = new ArrayList<>();
        List<Character> bList = new ArrayList<>();

        addList(a, aList);

        addList(b, bList);

        calculation(b, aList);

        calculation(a, bList);

        // a, b의 경우 따로 확인
        System.out.println(aList.size() + bList.size());

    }

    private static void addList(String a, List<Character> aList) {
        for (char c : a.toCharArray()) {
            aList.add(c);
        }
    }

    private static void calculation(String b, List<Character> aList) {
        for (char c : b.toCharArray()) {
            if (aList.contains(c)) {
                aList.remove(Character.valueOf(c));
            }
        }
    }
}