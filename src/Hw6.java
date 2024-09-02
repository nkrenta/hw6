public class Hw6 {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //int q = 0;
        //while (q < 10){
        //    q+=1;
        //    System.out.println(q);
        //}

        System.out.println();

        //Task 2
        System.out.println("Task 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();

        //Task 3
        System.out.println("Task 3");

        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        //Task 4
        System.out.println("Task 4");

        for (int i = 10; i >= -10; i--) {
            if (i >= 0) {
                System.out.println(" " + i);
            } else {
                System.out.println(i);
            }
        }

        System.out.println();

        //Task 5
        System.out.println("Task 5");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным!");
        }

        System.out.println();

        //Task 6
        System.out.println("Task 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        System.out.println();

        //Task 7
        System.out.println("Task 7");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println();

        //Task 8
        System.out.println("Task 8");

        int income = 29000;
        int total1 = 0;

        for (int i = 0; i <= 12; i++) {
            total1 += income;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей.");
        }

        System.out.println();

        //Task 9
        System.out.println("Task 9");

        int total2 = 0;
        for (int i = 0; i <= 12; i++) {
            total2 += total2 / 100;
            total2 += income;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей.");
        }

        System.out.println();

        //Task 10
        System.out.println("Task 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (i * 2));
        }

    }
}
