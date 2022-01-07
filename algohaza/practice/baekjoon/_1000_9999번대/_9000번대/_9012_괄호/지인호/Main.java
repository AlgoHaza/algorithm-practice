package practice.baekjoon._1000_9999번대._9000번대._9012_괄호.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    int i;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            char[] data = br.readLine().toCharArray();
            boolean isVPS = true;
            int n = 0;
            for (char datum : data) {
                if(datum == '(') n++;
                else n--;
                if(n < 0) {
                    isVPS = false;
                    break;
                }
            }
            isVPS = (isVPS && n == 0);
            System.out.println(isVPS ? "YES" : "NO");
        }
    }
}
