package practice.baekjoon._1000_9999번대._1000번대._1874_스택_수열.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Integer> STACK = new ArrayList<>();
    private static final StringBuilder OUTPUT = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] seq = new int[n];
        for (int i = 0; i < n; i++)
            seq[i] = Integer.parseInt(br.readLine());
        int push = 0; //항상 push 는 1 부터 n까지 오름차순으로 되므로, 이전의 푸쉬값만 알면 푸쉬된 모든 수를 알 수 있다.
        int popCount = 0;
        while (popCount < n) {
            if(push < seq[popCount]) { //push 보다 현재 pop 해야하는 수가 클경우, 아직 해당 수가 push 되지 않았다는 의미이다.
                OUTPUT.append("+\n"); //push
                STACK.add(++push);
            } else if(STACK.get(STACK.size() - 1) == seq[popCount]) {
                OUTPUT.append("-\n"); //pop
                STACK.remove(STACK.size() - 1);
                popCount++;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(OUTPUT);
    }
}
