package practice.baekjoon._10000_19999번대._11000번대._11047_동전_0.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//그리디 알고리즘은 global minimum 을 구한다고 확신할 수 없다. 하지만 tasecase 가 정제된 경우에는 사용 가능하다
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] initData = br.readLine().split(" ");
        int n = Integer.parseInt(initData[0]);
        int k = Integer.parseInt(initData[1]);
        int[] values = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            values[i] = value;
        }

        for (int i = n - 1; i >= 0 || k != 0; i--) {
            cnt += k / values[i];
            k %= values[i];
        }

        System.out.println(cnt);
    }
}
