package practice.baekjoon._1000_9999번대._2580_스도쿠.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static List<SimpleEntry<Integer, Integer>> zeros = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] map = new int[9][9];
        for (int y = 0; y < 9; y++) {
            map [y] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int x = 0; x < 9; x++) {
                if(map[y][x] == 0) zeros.add(new SimpleEntry<>(y, x));
            }
        }

        bt(0, map);

    }

    private static void bt(int depth, int[][] map) {
        if(depth < zeros.size()) {
            SimpleEntry<Integer, Integer> coord = zeros.get(depth);
            int y = coord.getKey();
            int x = coord.getValue();
            for (int value = 1; value <= 9; value++) {
                if(checkNumber(value, x, y, map)) {
                    map[y][x] = value;
                    bt(depth + 1, map);
                    map[y][x] = 0;
                }
            }
        } else {
            for (int[] ints : map) {
                for (int anInt : ints) {
                    System.out.printf("%d ", anInt);
                }
                System.out.println();
            }
            System.exit(0);
        }
    }

    //반복 : 9 + 9 = 18 조회 : 9 * 4 + 9  * 2 = 54
    private static boolean checkNumber(int number, int x, int y, int[][] map) {
        for (int weight = 0; weight < 9; weight++) { //스도쿠 표의 한 변의 길이(9) 만큼 반복
            if(weight != x && map[y][weight] == number)
                return false; //가로줄 안에 있는 값과 같을경우 값을 추가할 수 없다.
            if(weight != y && map[weight][x] == number)
                return false; //세로줄 안에 있는 값과 같을경우 값을 추가할 수 없다.
        }
        int xGrid = x / 3, yGrid = y / 3;//모든 Grid 는 0, 1, 2 의 값을 가질 수 있다.
        for (int yWeight = 0; yWeight < 3; yWeight++) { //박스의 세로줄 수(3) 만큼 반복
            for (int xWeight = 0; xWeight < 3; xWeight++) { //박스의 가로줄 수(3) 만큼 반복
                int compareX = xGrid * 3 + xWeight; //박스 내 비교할 대상의 x값
                int compareY = yGrid * 3 + yWeight; //박스 내 비교할 대상의 y값
                if(!(compareX == x && compareY == y) && map[compareY][compareX] == number)  //박스 안에 있는 값과 같을경우
                    return false; //값을 추가할 수 없다.
            }
        }
        return true; //모든 필터링에서 통과하면 true 를 반환한다.
    }
}
