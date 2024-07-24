package AdapterV1Loose;

public class ICICIBankAdapter implements BankAPI {
    ICICIBankApi yb = new ICICIBankApi();

    ICICIBankAdapter(){

    }

    @Override
    public int checkBalance() {
        return yb.checkBalance();
    }

    @Override
    public void transferMoney(int money) {
        yb.TransferMoney();
    }
}