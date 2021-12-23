package baekjoon._1000_9999번대._4000번대._4673_셀프_넘버.지인호;

public class Main {
    public static void main(String[] args) {
        boolean[] sieve = new boolean[10000];
        for (int i = 0; i < 10000; i++) {
            int n;
            if((n = d(i)) < 10000)
                sieve[n] = true;
        }

        for (int i = 0; i < sieve.length; i++) {
            if(!sieve[i]) System.out.println(i);
        }
    }
    public static int d(int n) {
        int sum = n;
        for (char c : (n + "").toCharArray()) {
            sum += (c - 48);
        }
        return sum;
    }
}
