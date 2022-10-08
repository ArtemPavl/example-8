public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к уроку 8");
        System.out.println("Домашняя работа 1");
        // Задание 1
        System.out.println("Задание 1");
        int total = 0;
        int totalFinish = 2_459_000;
        int contribution = 15_000;
        int month = 0;
        while (total<=totalFinish){
            total = total + contribution;
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна "
                + total + " рублей");

        // Задание 2
        System.out.println("Задание 2");
        int number = 1;
        String numbers = "";
        while (number <= 10){
            numbers = numbers + Integer.toString(number) + " ";
            number++;
        }
        System.out.println(numbers);
        numbers = "";
        for (number = 10;number >= 1; number = number - 1){
            numbers = numbers + Integer.toString(number) + " ";
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
    }
}