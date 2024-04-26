import model.MoneyReceiver;

public class Main {
    public static void main(String[] args) {
        MoneyReceiver moneyReceiver = AppRunner.choosePaymentMethod();
        AppRunner.run(moneyReceiver);
    }
}
