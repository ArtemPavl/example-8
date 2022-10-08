public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к уроку 8");
        System.out.println("Домашняя работа 2");
        // Задание 1
        System.out.println("Задание 1");
        int total = 0;
        int percent = 7;
        int totalFinish = 12_000_000;
        int contribution = 15_000;
        int month = 0;
        while (total<=totalFinish){
            total = total + total*percent/100;
            total = total + contribution;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна "
                    + total + " рублей");

        }

        // Задание 2
        System.out.println("Задание 2");
        total = 0;
        percent = 7;
        totalFinish = 12_000_000;
        contribution = 15_000;
        month = 0;
        while (total<=totalFinish) {
            total = total + total * percent / 100;
            total = total + contribution;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна "
                        + total + " рублей");
            }
        }

            // Задание 3
            System.out.println("Задание 3");
            total = 0;
            percent = 7;
            int monthFinish = 9*12;
            contribution = 15_000;
            month = 0;
            while (month<=monthFinish) {
                total = total + total * percent / 100;
                total = total + contribution;
                month++;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна "
                            + total + " рублей");
                }
            }

        // Задание 4
        System.out.println("Задание 4");
        int friday = 3;
        while (friday<=31) {
            System.out.println("Сегодня пятница, " + friday
                    + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }
    }

}
