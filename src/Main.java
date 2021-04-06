public class Main {
    public static void main(String[] args) {
        int Balance = 300;
        int Payment = 1200;
        boolean hasBonus = Payment > 1000;
        int Bonus = hasBonus ?  Payment / 100 : 0;
                int Total = Balance + Payment + Bonus;
        System.out.println("Бонус = " + Bonus + ". Итоговый баланс на счету: " + Total);
    }
}
