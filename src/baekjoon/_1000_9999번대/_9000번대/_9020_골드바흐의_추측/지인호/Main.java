package baekjoon._1000_9999번대._9000번대._9020_골드바흐의_추측.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int mod = n / 2;
            int focus = 0;
            while (focus < n / 2) {
                if(isPrime(mod - focus) && isPrime(mod + focus)) {
                    System.out.printf("%d %d\n", mod - focus, mod + focus);
                    break;
                }
                focus++;
            }
        }
    }
    public static boolean isPrime(int i) {
        if(i <= 2) return i == 2; //...0, 1, 2 에서 소수는 2 뿐이다.
        for(int j = 2; j < i; j++)
            if(i % j == 0) return false;
        return true;
    }
}

