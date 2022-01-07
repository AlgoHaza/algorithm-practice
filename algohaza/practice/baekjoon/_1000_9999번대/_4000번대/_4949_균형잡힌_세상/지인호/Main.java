package practice.baekjoon._1000_9999번대._4000번대._4949_균형잡힌_세상.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Character> STACK = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while(true) {
            input = br.readLine();
            if(input.equals(".")) break;
            String formattedInput = format(input);
            boolean check = check(formattedInput);
            System.out.println(check ? "yes" : "no");
            STACK.clear();
        }
    }

    private static String format(String input) {
        return input.replaceAll("[^()\\[\\]]", "");
    }

    private static boolean check(String formattedInput) {
        for (char c : formattedInput.toCharArray()) {
            int topIdx = STACK.size() - 1;
            if(c == '[' || c == '(') STACK.add(c);
            else if(STACK.isEmpty() || STACK.remove(topIdx) != ((c == ']') ? '[' : '(')) return false;
        }
        return STACK.isEmpty();
    }
}
