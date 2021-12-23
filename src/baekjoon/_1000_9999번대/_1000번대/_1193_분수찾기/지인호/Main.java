package baekjoon._1000_9999번대._1000번대._1193_분수찾기.지인호;

import java.util.Scanner;

public class Main {
    private static int x = 1, y = 1;
    public static void main(String[] args) {
        int X = new Scanner(System.in).nextInt();
        int n = 0, count = 0;

        while (true) {
            count++;
            if (count >= X) break;
            right();

            n++;
            for (int i = 0; i < n; i++) {
                count++;
                if (count >= X) break;
                leftDown();
            }

            count++;
            if (count >= X) break;
            down();

            n++;
            for (int i = 0; i < n; i++) {
                count++;
                if (count >= X) break;
                rightUp();
            }
        }
        System.out.println(y + "/" + x);
    }
    public static void right() {
        x++;
    }
    public static void down() {
        y++;
    }
    public static void leftDown() {
        x--;
        y++;
    }
    public static void rightUp() {
        x++;
        y--;
    }
}
