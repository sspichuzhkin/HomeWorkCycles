package pro.sky;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }

    public static void Task1() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (; i > 0; i--) {
            if (i != 11) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void Task2() {
        int fridayDate = 7;
        for (int i = fridayDate; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void Task3() {
        int startYear = 0;
        int currentYear = 2022;
        int pastYear = currentYear - 200;
        int futureYear = currentYear + 100;

        for (int i = startYear; i <= futureYear; ) {
            if (i >= pastYear && i <= currentYear) {
                System.out.println(i);
            } else if (i > currentYear && i <= futureYear) {
                System.out.println(i);
            }
            i = i + 79;
        }
    }
}