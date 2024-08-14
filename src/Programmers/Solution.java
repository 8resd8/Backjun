package Programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    static int solution(int[] array) {
        List<Integer> list = Arrays.stream(array)
                .boxed().sorted().collect(Collectors.toList());
        return list.get(list.size() / 2);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 7, 10, 11};

        int answer = solution(numbers);
        System.out.println(answer);


    }
}
