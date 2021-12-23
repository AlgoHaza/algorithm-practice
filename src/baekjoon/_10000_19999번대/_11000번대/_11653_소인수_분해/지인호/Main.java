package baekjoon._10000_19999번대._11000번대._11653_소인수_분해.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int target = new Scanner(System.in).nextInt();
        int i = 2;

        while(target != 1) {
            if(target % i == 0) {
                System.out.println(i);
                target /= i;
            } else i++;
        }
    }
}
