public class Main {

    public static void main(String[] args) {

        // Начальная сумма на счёте клиента
        int totalBalance = 500;

        // Сумма пополнения счёта
        int topUp = 301;

        // Размер бонуса
        int bonus;

        if (topUp <= 100) {
            bonus = 0;
        } else {
            bonus = topUp / 100;
        }

        System.out.println("Количество денег на счёте после пополнения = " + (totalBalance + topUp + bonus));

    }
}