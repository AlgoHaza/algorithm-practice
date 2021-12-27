package practice.baekjoon._1000_9999번대._1000번대._1018_체스판_다시_칠하기.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Character[] chessLineA = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
        Character[] chessLineB = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};

        Character[][] chessA = new Character[8][8];
        Character[][] chessB = new Character[8][8];


        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        char[][] chessX = new char[n][m];

        for (int i = 0; i < n; i++) {
            chessX[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < chessA.length; i++) {
            chessA[i] = i % 2 == 0 ? chessLineA : chessLineB;
            chessB[i] = i % 2 == 0 ? chessLineB : chessLineA;
        }

        int min = Integer.MAX_VALUE;
        int aSum = 0, bSum = 0;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                for (int y = i; y < i + 8; y++) {
                    for (int x = j; x < j + 8; x++) {
                        if(chessA[y-i][x-j] != chessX[y][x]) aSum++;
                        if(chessB[y-i][x-j] != chessX[y][x]) bSum++;
                    }
                }
                min = Math.min(Math.min(min, aSum), bSum);
                aSum = bSum = 0;
            }
        }

        System.out.println(min);
    }
}
