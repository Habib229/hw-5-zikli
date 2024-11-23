public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");
        System.out.println("Задача 1");
        for (int a = 1; a <= 10; a = a + 1) {
            System.out.println(a);
        }

        System.out.println();

        System.out.println("Задача 2");
        for (int b = 10; b >=1; b = b - 1) {
            System.out.println(b);
        }

        System.out.println();

        System.out.println("Задача 3");
        for (int c = 0; c <= 17; c = c + 1) {
            System.out.println(c);
        }

        System.out.println();

        System.out.println("Задача 4");
        for (int d = 10; d >= -10; d = d -1) {
            System.out.println(d);
        }

        System.out.println();

        System.out.println("Задача 5");
        for (int e = 1904; e <= 2096; e = e + 4) {
            System.out.println(e + " год является високосным");
        }

        System.out.println();

        System.out.println("Задача 6");
        for (int f = 7; f <= 98; f = f + 7) {
            System.out.println(f);
        }

        System.out.println();

        System.out.println("Задача 7");
        for (int g = 1; g <= 512; g = g + g) {
            System.out.println(g);
        }

        System.out.println();

        System.out.println("Задача 8");
        int postpone = 29000;
        int savings = 0;
        for (int h = 1; h <= 12; h = h + 1){
            savings = postpone * h;
            System.out.println("Месяц " + h + ", сумма накоплений равна " + savings + " рублей");
        }

        System.out.println();

        System.out.println("Задача 9");
        int postpone1 = 29000;
        int saving1 = 0;
        for (int i = 1; i <= 12; i = i + 1){
            postpone1 = postpone1 + postpone1 / 100;
            saving1 = postpone1 * i;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + saving1 + " рублей");
        }

        System.out.println();

        System.out.println("Задача 10");
        int j = 2;
        int k = 0;
        for (int l = 1; l <= 10; l = l + 1) {
            k = j * l;
            System.out.println(j + "*" + l + "=" + k);
        }
    }
}