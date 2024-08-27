import java.util.Scanner;

public class zad42408 {
            public static void main(String[] args) {
                int n = 100;
                boolean[] s = new boolean[n + 1];
                for (int i = 2; i <= n; i++) {
                    s[i] = true;
                }
                for (int i = 2; i * i <= n; i++) {
                    if (s[i]) {
                        for (int j = i * i; j <= n; j += i) {
                            s[j] = false;
                        }
                    }
                }
                for (int i = 2; i <= n; i++) {
                    if (s[i]) {
                        System.out.println(i);
                    }
                }
            }
        }


