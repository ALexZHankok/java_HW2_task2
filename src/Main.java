public class Main {
    public static void main(String[] args) {
        int mainBalance = 500; //начальный баланс телефона
        int refill = 1500; //пополнение счета телефона
        double bonus = refill / 100; //бонус за пополнение счета от 1000 руб.

        if (refill > 1000) {
            System.out.println("Ваш текущий баланс " + (mainBalance + refill + bonus) + " рублей");
            System.out.print("Бонусов начислено " + (bonus) + " рублей");
        } else {
            System.out.println("Ваш текущий баланс " + (mainBalance + refill) + " рублей");
            System.out.print("Пополните баланс от 1000 руб. и получите бонус 1 руб. за каждые 100 руб.");
        }

    }
}

