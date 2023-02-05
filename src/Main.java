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


    public static void task1() {
        System.out.println("Task 1");
        int year = 2200;
        determineYear(year);

    }


    public static void task2() {

    }

    public static void task3() {

    }

}