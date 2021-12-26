package baekjoon._1000_9999번대._1000번대._1002_터렛.지인호;

    import java.util.Scanner;

    import static java.lang.Math.sqrt;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int x1 = sc.nextInt(),
                        y1 = sc.nextInt(),
                        r1 = sc.nextInt(),
                        x2 = sc.nextInt(),
                        y2 = sc.nextInt(),
                        r2 = sc.nextInt();

                int distanceSquare = (Math.abs(x1 - x2) * Math.abs(x1 - x2))  + (Math.abs(y1-y2) * Math.abs(y1-y2));
                if(square(r2 - r1) < distanceSquare && distanceSquare < square(r1 + r2)) {
                    System.out.println(2);
                }else if(square(r1 - r2) == distanceSquare && distanceSquare != 0) {
                    System.out.println(1);
                }else if(square(r1 + r2) == distanceSquare) {
                    System.out.println(1);
                }else if(distanceSquare < square(r2 - r1)) {
                    System.out.println(0);
                }else if(distanceSquare > square(r1 + r2)) {
                    System.out.println(0);
                }else if(distanceSquare == 0 && r1 == r2) {
                    System.out.println(-1);
                }
            }
        }

        private static int square(int i) {
            return i * i;
        }
    }
