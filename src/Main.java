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

        System.out.println("Задача № 2");
        int clientDeviceYear = 2013;
        int OS = 0;
        OSAndClientDeviceYear(OS, clientDeviceYear);
        System.out.println();
    }
    public static void OSAndClientDeviceYear(int OS, int clientDeviceYear) {
        if (OS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (OS == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (OS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
}


