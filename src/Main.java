import java.time.LocalDate;

public class Main {
    private static Object args;

    public static void calculateLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void installingOsAndYear(int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для системы iOS по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите приложение для системы iOS по ссылке");
        }
        if (clientOs == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для системы Android по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите приложение для системы Android по ссылке");
        }
    }

    public static int calculatingDeliveryDays(int deliveryDistance) {
        int totalDays = 1;
        if (deliveryDistance > 100) {
            return -1;
        } else if (deliveryDistance > 60) {
            totalDays += 2;
        } else if (deliveryDistance > 20) {
            totalDays += 1;
        }
        return totalDays;
    }


    public static void main(String[] args) {

        System.out.println("Задача 1");
        calculateLeapYear(2024);

        System.out.println("Задача 2");
        installingOsAndYear(0, 2025);

        System.out.println("Задача 3");

            int deliveryDistance = 110;  // выбери нужное расстояние

            int days = calculatingDeliveryDays(deliveryDistance);
            if (days == -1) {
                System.out.println("Доставки нет");
            } else {
                System.out.println("Потребуется дней: " + days);
            }
        }
}




