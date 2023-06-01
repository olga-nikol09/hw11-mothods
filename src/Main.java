import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
           task1();
           task2();
           task3();
    }
    public static void checkYear (int year1) {
        if (year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0) {
            System.out.println(year1 + " год - високостный год");
        }else {
            System.out.println(year1 + " год — невисокосный год");
        }
    }
    public static void task1() {
        System.out.println("Задача1");
        int year1 = 2023;
        checkYear(year1);
        System.out.println();
    }
    public static void checkOS(int clientOS, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            System.out.print("Установите облегченную версию ");
        } else {
            System.out.print("Установите обычную версию ");
        }
        if (clientOS == 0) {
            System.out.println("для IOS");
        }
        else {
            System.out.println("для Android");
        }


    }
    public static void task2(){
        System.out.println("Задача 2");

        int clientOS = 0;
        int clientDeviceYear = 2015;
        checkOS(clientOS, clientDeviceYear);
    }

    public static int calculationDelivery(int deliveryDistance) {
        int day = 0;
        if (deliveryDistance <20) {
            day++;
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day = day + 2;
        }
         if (deliveryDistance >=60 && deliveryDistance < 100) {
             day = day + 3;
        }
         return day;
    }
    public static void task3() {
        System.out.println();
        System.out.println("Задача3");
        int deliveryDistance = 77;

        if (calculationDelivery(deliveryDistance) == 1) {
            System.out.println("Доставка 1 сутки");
        } else if (calculationDelivery(deliveryDistance) == 2) {
            System.out.println("Доставка 2 дня");
        } else if (calculationDelivery(deliveryDistance) == 3) {
            System.out.println("Доставка 3 дня");
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}