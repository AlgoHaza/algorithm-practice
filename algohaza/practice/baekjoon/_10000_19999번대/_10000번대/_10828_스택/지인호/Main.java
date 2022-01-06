package practice.baekjoon._10000_19999번대._10000번대._10828_스택.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> stack = new ArrayList<>();

        int commandCnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < commandCnt; i++) {
            String command = br.readLine();
            switch (command.split(" ")[0]) {
                case "push":
                    int arg = Integer.parseInt(command.split(" ")[1]);
                    stack.add(arg);
                    break;
                case "pop":
                    if(stack.size() == 0) System.out.println(-1);
                    else {
                        System.out.println(stack.get(stack.size() - 1));
                        stack.remove(stack.size() - 1);
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.get(stack.size() - 1));
                    break;
            }
        }
    }
}
