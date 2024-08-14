package 과거의산물.구현2;

import java.io.IOException;
import java.util.Scanner;

public class _3613 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String variableName = scanner.next();

        if (isJavaStyle(variableName)) {
            System.out.println(convertToCppStyle(variableName));
        } else if (isCppStyle(variableName)) {
            System.out.println(convertToJavaStyle(variableName));
        } else {
            System.out.println("Error!");
        }
    }

    private static boolean isJavaStyle(String name) {
        return !name.contains("_") && Character.isLowerCase(name.charAt(0)) && !name.contains(" ");
    }

    private static boolean isCppStyle(String name) {
        return !name.contains("__") && !name.startsWith("_") && !name.endsWith("_") && name.equals(name.toLowerCase()) && !name.contains(" ");
    }

    private static String convertToCppStyle(String javaName) {
        StringBuilder cppName = new StringBuilder();
        for (char ch : javaName.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                cppName.append("_").append(Character.toLowerCase(ch));
            } else {
                cppName.append(ch);
            }
        }
        return cppName.toString();
    }

    private static String convertToJavaStyle(String cppName) {
        StringBuilder javaName = new StringBuilder();
        boolean nextUpper = false;
        for (char ch : cppName.toCharArray()) {
            if (ch == '_') {
                nextUpper = true;
            } else {
                javaName.append(nextUpper ? Character.toUpperCase(ch) : ch);
                nextUpper = false;
            }
        }
        return javaName.toString();
    }
}