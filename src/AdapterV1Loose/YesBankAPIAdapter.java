package AdapterV1Loose;

public class YesBankAPIAdapter implements BankAPI{
    YesBankAPI yb = new YesBankAPI();

    @Override
    public int checkBalance() {
        return yb.getBalance();
    }

    @Override
    public void transferMoney(int money) {
        yb.moneyTransfer();
    }
}
