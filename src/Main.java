public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к уроку 8");
        System.out.println("Домашняя работа 3");
        // Задание 1
        System.out.println("Задание 1");
        int year = 0;
        int yearNow = 2022;
        do {
            if (year >= yearNow - 200 && year <= yearNow + 100) {
                System.out.println(year);
            }
            year = year + 79;
        } while (year < 3000);

        // Задание 2
        System.out.println("Задание 2");
        int number = 0;
        int resoult;
        for (int i = 1; i <= 10; i++) {
            resoult = 2 * i;
            System.out.println("2" + "*" + i + "=" + resoult);
        }

    }
}
