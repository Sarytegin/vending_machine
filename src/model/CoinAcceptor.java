package model;
public class CoinAcceptor implements MoneyReceiver {
    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void acceptMoney(int amount) {
        this.amount += amount;
    }
}

