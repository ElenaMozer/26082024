import java.util.Scanner;

public class zad12408 {
    public static void main(String[] args) {
        int a, j, i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадрата");
        a = scanner.nextInt();
        char asteriks = '*';
        for (j = 1; j <= a; j++) {
            for (i = 1; i <= a; i++) {
                System.out.print(asteriks);
            }
            System.out.println();
        }
    }
}
