public class Main {
    public static void calculateLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static String installingOsAndYear(int clientOs, int clientDeviceYear) {
        if (clientOs == 1) {
            if (clientDeviceYear < 2015) {
                return "Установите облегченную версию приложения для Android по ссылке";
            } else {
                return "Установите версию приложения для Android по ссылке";
            }
        } else if (clientOs == 0) {
            if (clientDeviceYear < 2015) {
                return "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                return "Установите версию приложения для iOS по ссылке";
            }
        }
        return "Такой ОC не существует";
    }

    public static String calculatingDeliveryDays(int deliveryDistance) {
        int timeOneZoneDelivery = 1;
        if (deliveryDistance > 100) {
            return "Доставки нет";
        } else if (deliveryDistance > 60) {
            timeOneZoneDelivery += 2;
        } else if (deliveryDistance > 20) {
            timeOneZoneDelivery += 1;
        }
        return "Потребуется дней доставки: " + timeOneZoneDelivery;

    }

    public static void main(String[] args) {

        System.out.println("Задача 1");
        calculateLeapYear(2024);

        System.out.println("Задача 2");
        System.out.println(installingOsAndYear(1, 2014));

        System.out.println("Задача 3");
        System.out.println(calculatingDeliveryDays(40));

    }
}






