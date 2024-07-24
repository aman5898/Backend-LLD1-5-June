package AdapterV1Loose;

public class BankApiFactory {
    public static BankAPI getBankAPI(String bankAPIName) {
        if(bankAPIName.equals("YesBank")) {
            return new YesBankAPIAdapter();
        } else if (bankAPIName.equals("ICICIBank")) {
            return new ICICIBankAdapter();
        } else {
            throw new IllegalArgumentException("Your Bank is not available at the moment");
        }
    }
}
