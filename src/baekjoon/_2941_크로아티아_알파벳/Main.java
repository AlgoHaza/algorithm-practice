package baekjoon._2941_크로아티아_알파벳;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (String s : croatia)
            str = str.replaceAll(s, "*");
        System.out.println(str.length());
    }
}
