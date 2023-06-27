package javaprograms;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String inputString = "How are you";
        String result = removeDuplicates(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen.contains(ch)) {
                sb.append(ch);
                seen.add(ch);
            }
        }

        return sb.toString();
    }
}
