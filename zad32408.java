import java.util.Scanner;

public class zad32408 {
        public static void main(String[] args) {
            String s = "Б";
            Scanner scanner = new Scanner(System.in);
            int x,y;
            System.out.print("Введите высоту прямоугольника");
            x = scanner.nextInt();
            System.out.print("Введите ширину прямоугольника");
            y = scanner.nextInt();
            //этот цикл делает 1ую строку с *
            int a = 0;
            while(a < y) {
                System.out.print(s) ;
                a++;
            }
            //этот цикл повторяет 3 нижних цикла
            int e = 0;
            while(e < x) {
                //1 - абзац + крайние левые Б
                int b = 0;
                while(b < 1) {
                    System.out.print("\n" + s);
                    b++;
                }
                //2 - заполнение пробелами
                int c = 0;
                while(c < y) {
                    System.out.print(" ");
                    c++;
                }
                //3 - крайние правые Б
                int d = 0;
                while(d < 1) {
                    System.out.print(s);
                    d++;
                }
                e++;
            }
            //цикл для абзаца
            int g = 0;
            while(g < 1) {
                System.out.println("");
                g++;
            }
            //цикл для нижней строки с Б
            int f = 0;
            while(f < y) {
                System.out.print(s);
                f++;
            }


        }
    }

