import java.util.Scanner;

public class zad22408 {
        public static void main(String[] args) {
            char asteriks = '*';
            Scanner scanner = new Scanner(System.in);
            int x;
            System.out.print("Введите размер квадрата");
            x = scanner.nextInt();
            //этот цикл делает 1ую строку с *
            int a = 0;
            while(a < x) {
                System.out.print(asteriks) ;
                a++;
            }
            //этот цикл повторяет 3 нижних цикла
            int e = 0;
            while(e < x) {
                //1 - абзац + крайние левые Б
                int b = 0;
                while(b < 1) {
                    System.out.print("\n" + asteriks);
                    b++;
                }
                //2 - заполнение пробелами
                int c = 0;
                while(c < x) {
                    System.out.print(" ");
                    c++;
                }
                //3 - крайние правые Б
                int d = 0;
                while(d < 1) {
                    System.out.print(asteriks);
                    d++;
                }
                e++;
            }
            //цикл для абзаца мпть его за ногу
            int g = 0;
            while(g < 1) {
                System.out.println("");
                g++;
            }
            //цикл для нижней строки с Б
            int f = 0;
            while(f < x) {
                System.out.print(asteriks);
                f++;
            }


        }
    }

