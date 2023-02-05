public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
    }

    public static int determineYear(int year) {
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Год " + year + " является високосным");
        } else if (year % 100 == 0) {
            System.out.println("Год " + year + " не является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
        return year;
    }

    public static void installApp(int clientOS, int clientDeviceYear, int currentYear) {
                if (clientOS == 1 && currentYear <= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке ниже");
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && currentYear > clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке ниже");
        } else if (clientOS == 0 && currentYear <= clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке ниже");
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке ниже");
        }
    }

    public static void deliveryTime (int i) {
        if (i < 20) {
            System.out.println("Доставка займет сутки");
        } else if (i < 60) {
            System.out.println("Доставка займет двое суток");
        } else if (i < 100) {
            System.out.println("Доставка займет трое суток");
        } else {
            System.out.println("Доставка в вашу зону не осущетствляется");
        }
    }
    public static void task1() {
        System.out.println("Task 1");
        int year = 2200;
        determineYear(year);

    }

    public static void task2() {
        System.out.println("Task 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        int currentYear = 2023;
        installApp(clientOS, clientDeviceYear, currentYear);
    }

    public static void task3() {
        System.out.println("Task 3");
        int deliveryDistance = 95;
        deliveryTime (deliveryDistance);
    }

}