public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача № 1");
        int year = 2024;
        years(year);
        System.out.println();
    }

    public static void years(int year) {
        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}


