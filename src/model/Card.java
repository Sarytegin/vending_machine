package model;

public class Card implements MoneyReceiver {
    private String cardNumber;
    private String pin;
    private int balance;

    public Card(String cardNumber, String pin, int balance) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public int getAmount() {
        return balance;
    }

    @Override
    public void acceptMoney(int amount) {
        balance += amount;
    }

    public boolean charge(int amount, String enteredPin) {
        if (!pin.equals(enteredPin)) {
            System.out.println("Неверный PIN-код");
            return false;
        }

        if (balance < amount) {
            System.out.println("Недостаточно средств на карте");
            return false;
        }

        balance -= amount;
        System.out.println("Списание средств успешно выполнено");
        return true;
    }
}
