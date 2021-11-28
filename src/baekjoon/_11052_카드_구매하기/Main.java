package baekjoon._11052_카드_구매하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//축약적으로 설명하면 브루트 포싱 기법을 사용하여 값들을 구하되, 그 값들을 구하는 동시에 서로 비교해서 최대값만 저장하는거다
                /*
                내가 이해한 Dynamic Programming 의 개념은 분할과 병합이다. 해당 예제에서는 가능태를 기반으로 분할한 뒤, 최대값을 기준으로 병합하였다.
                 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /*
        i : 구매해야하는 카드의 개수
        j : 카드팩에 들어있는 카드의 개수
         */
        int[] dp = new int[n+1]; // dp[i] = 카드를 i개 구매하는데 드는 비용의 최대값
        int[] p = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray(); //p[j] = 카드가 j개 들어있는 카드팩의 가격
        //카드가 j개가 있는 카드팩을 구매하면 다음에 구매해야하는 카드의 개수의 총합은 i-j 이어야한 다.
        //따라서 dp[i] = dp[i-j] + p[j] 이다
        // 해설 : i개의 카드를 구매하는데 드는 비용의 최대값 = i-j개의 카드를 구매하는데 드는 비용의 최대값 + 카드가 j개 들어있는 카드팩의 가격 가격
        for(int i =1 ; i < n+1;i++) {
            for(int j=1 ; j<=i;j++) {
                dp[i] = Math.max(dp[i],p[j]+dp[i-j]); //기존에 구한 카드를 i개 구매하는데 드는 비용의 최대값과 새로 구한 카드를 i개 구매하는데 드는 비용의 최대값중 더 큰값을 dp[i] 에 저장한다
                //즉, 현재까지 구한 dp[i] 는 이중 for문이 끝나기 전까지 "카드를 i개 구매하는데 드는 비용의 최대값" 가 될 수 있는 후보값이다
            }
        }
        System.out.println(dp[n]); //확정된 최대값을 출력한다
    }
}
/*
public class Main {
    // 카드별 가격을 수량으로 나누어서 효율을 구한다
    // 효율이 높은 카드를 우선적으로 선택하고, 만약 해당 카드팩의 카드 수가 더 소지할 수 있는 카드수보다 적다면,
    // 다른 카드들중 효율이 가장 높은 카드를 선택한다
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] p = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<SimpleEntry<Integer, Double>> costs = new ArrayList<>(10); // Key : 카드 번호(카드 개수) , Value : 개당 가격 (효율)
        for (int i = 0; i < n; i++) { // 입력값을 통해 costs 를 초기화한다
            costs.add(i, new SimpleEntry(i+1, (double)p[i] / (i + 1))); // 카드 번호는 1부터 시작하므로 +1
        }

        //costs.forEach((entry) -> System.out.println(entry.getKey() + " |" + entry.getValue()));
        costs.sort((o1, o2) -> {
            double a;
            if((a = o2.getValue() - o1.getValue()) != 0) return (int)a;
            else return o1.getKey() - o2.getKey();
        }); // 개당 가격을 기준으로 오름차순 정렬 (효율이 높은 카드가 가장 뒤에 나온다)
        //System.out.println("sorted");
        //costs.forEach((entry) -> System.out.println(entry.getKey() + " |" + entry.getValue()));
        int remainCard = n; //현재 구매 가능한 남은 카드의 개수를 저장한다
        int totalCost = 0; // 현재 총 구매 가격을 저장한다
        int pointer = 0; // 현재 선택한 카드의 인덱스를 저장한다
        while (remainCard != 0) { //만약 더이상 카드를 구매할 수 없는 경우 반복문을 빠져나간다
            //오름차순 정렬로 인해 효율이 가장 높은 카드를 자동으로 선택한다
            //ERROR 원인 파악, 카드 효율이 동일한 카드 A(Key = 4), B(Key = 3) 가 존재할 경우, 남은 카드가 10개 일경우 A, A  를 구매하게 된다 (최대효율 : B, B, B)
            //ERROR 해결 방법, 만약 카드 효율이 동일한 카드가 존재할 경우, Key 를 기준으로 오름차순 정렬을 하면? (근데 이경우에도 예외는 생기지 않나? n이 13일때 B, B, B, B 보단 A, B, B, B가 더 좋으니까
            if (costs.get(pointer).getKey() <= remainCard) { // 현재 선택한 카드의 수가 남은 카드의 수보다 적다면 해당 카드를 구매한다
                remainCard -= costs.get(pointer).getKey(); // 남은 카드의 수를 차감한다
                totalCost += costs.get(pointer).getKey() * costs.get(pointer).getValue();
                //System.out.println("remainCard: " + remainCard);
                //System.out.println("totalCost: " + totalCost);
            } else {
                if(pointer < costs.size())
                    pointer++; //그 다음으로 효율이 높은 카드를 선택한다
            }
        }

        System.out.println(totalCost);
    }
}
 */
