package AdapterV1Loose;

import AdapterV0Tight.YesBankAPI;

public class PhonePeLoan {
    public boolean LoanCheck(BankAPI yb){
        if(yb.checkBalance()>100){
            return true;
        }

        return false;
    }
}
