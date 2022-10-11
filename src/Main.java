public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к уроку 8");

        //Домашняя работа 1
        System.out.println("Домашняя работа 1");
        // Задание 1
        System.out.println("Задание 1");
        int total = 0;
        int totalFinish = 2_459_000;
        int contribution = 15_000;
        int month = 0;
        while (total<=totalFinish){
            total = total + contribution; // в этой задаче не требовалось начесления процента
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна "
                + total + " рублей");

        // Задание 2
        System.out.println("Задание 2");
        int number = 1;
        String numbers = "";
        while (number <= 10){
            numbers = numbers + number + " "; // убрал Integer.toString()
            number++;
        }
        System.out.println(numbers);
        numbers = "";
        for (number = 10;number >= 1; number = number - 1){
            numbers = numbers + number + " "; // убрал Integer.toString()
        }
        System.out.println(numbers);

        // Задание 3
        System.out.println("Задание 3");

        number = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int year = 1;
        int yearFinish = 10;
        while (year <= yearFinish){
            System.out.println("Год " + year + ", численность населения составляет " + number);
            number = number + (fertility - mortality)*number/1000;
            year++;
        }

        // Домашня работа 2
        System.out.println("Домашняя работа 2");
        // Задание 1
        System.out.println("Задание 1");
        total = 0;
        int percent = 7;
        totalFinish = 12_000_000;
        contribution = 15_000;
        month = 0;
        while (total<=totalFinish){
            total = total + contribution; // изменил порядок расчета, чтобы за первый месяц начислялись проценты
            total = total + total*percent/100;
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

        // Домашняя работа 3
        System.out.println("Домашняя работа 3");
        // Задание 1
        System.out.println("Задание 1");
        year = 0;
        int yearNow = 2022;
        do {
            if (year >= yearNow - 200 && year <= yearNow + 100) {
                System.out.println(year);
            }
            year = year + 79;
        } while (year <= 2122); // сделал условие согласно заданию

        // Задание 2
        System.out.println("Задание 2");
        int resoult;
        for (int i = 1; i <= 10; i++) {
            resoult = 2 * i;
            System.out.println("2" + "*" + i + "=" + resoult);
        }
    }

}
