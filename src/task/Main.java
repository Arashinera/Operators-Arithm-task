package task;

import java.util.Scanner;
import java.util.Locale;

public class Main {

//    Домашнє завдання
//
//    Operators Arithmetic
//----------------------
//    Сума продажів товару дорівнює добутку кількості (шт) та ціни.
//    Ціна має грошовий формат, два знаки після десяткового
//    роздільника.
//    Середньоденна сума продажів дорівнює результату від поділу
//    загальної суми продажів на кількість днів проведення торгівлі.
//    Реалізуйте функціонал розрахунку суми продажів за певний період
//    та середньоденної суми продажів.
//    Виведення в консоль тексту замовлень має такий вигляд:
//
//    Product No 1: smartphone,
//    total sales for 5 days is EUR 12153,41,
//    sales by day is EUR 2430,68.
//    Product No 2: laptop,
//    total sales for 7 days is EUR 10486,85,
//    sales by day is EUR 1498,12.
//
//    При реалізації функціоналу зверніть увагу на створення
//    та перевикористання певних змінних для відповідних даних
//    товарів.
//    Для округлення значень розрахункових сум можете скористатись
//    можливостями System.out.printf().


    //Створюємо статичні змінні :
    public static final String CURRENCY = "EUR";
    static String name;
    static double price;
    static int sales;
    static int days;
    static double totalSales;
    static double average;

    public static void main(String[] args) {

        //Налаштовуємо наш сканер та локейл :
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        //Перше замовлення :
        System.out.println("Order №1. Please, tell me the name product : ");
        name = input.nextLine();
        System.out.println("Please, tell me " + name + "'s price : ");
        price = input.nextDouble();
        System.out.println("Please, tell how many sales of " + name + "s do you have?");
        sales = input.nextInt();
        System.out.println("Please, tell me how many days you've been selling " + name + "s?");
        days = input.nextInt();

        //Рахуємо суму та середньоденний продаж для першого замовлення :
        totalSales = price * sales;
        average = totalSales / days;

        //Виводимо замовлення на екран :
        System.out.printf("Product №1: %s%n"
                + "total sales for %d days is %s %.2f,%n"
                + "sales by day is %s %.2f.%n%n", name, days, CURRENCY, totalSales, CURRENCY, average);

        //Очищуємо сканер переносом строки для переходу з Integer на String :
        input.nextLine();

        //Друге замовлення :
        System.out.println("Order №2. Please, tell me the name product : ");
        name = input.nextLine();
        System.out.println("Please, tell me " + name + "'s price : ");
        price = input.nextDouble();
        System.out.println("Please, tell how many sales of " + name + "s do you have?");
        sales = input.nextInt();
        System.out.println("Please, tell me how many days you've been selling " + name + "s?");
        days = input.nextInt();

        //Рахуємо суму та середньоденний продаж для другого замовлення :
        totalSales = price * sales;
        average = totalSales / days;

        //Виводимо замовлення на екран :
        System.out.printf("Product №2: %s%n"
                + "total sales for %d days is %s %.2f,%n"
                + "sales by day is %s %.2f.%n", name, days, CURRENCY, totalSales, CURRENCY, average);
    }
}
