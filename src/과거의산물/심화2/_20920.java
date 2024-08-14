package 과거의산물.심화2;

import java.io.*;
import java.util.*;

public class _20920 {

    static class Word {
        String word;
        int count;

        Word(String word, int count) {
            this.count = count;
            this.word = word;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        HashMap<String, Integer> words = new HashMap<>();
        ArrayList<Word> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            if (name.length() < M) {
                continue;
            }
            words.put(name, words.getOrDefault(name, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            list.add(new Word(entry.getKey(), entry.getValue()));
        }

        Collections.sort(list, (word1, word2) -> {
            if (word1.count == word2.count) {
                if (word1.word.length() == word2.word.length()) {
                    return word1.word.compareTo(word2.word);
                } else {
                    return word2.word.length() - word1.word.length();
                }
            } else {
                return word2.count - word1.count;
            }
        });

        for (Word s : list) {
            bw.write(s.word + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}