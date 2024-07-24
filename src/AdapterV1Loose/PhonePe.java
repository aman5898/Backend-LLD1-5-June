package AdapterV1Loose;

public class PhonePe {
    BankAPI yb;
    PhonePeLoan loan = new PhonePeLoan();
    FastTagRecharge ft = new FastTagRecharge();

    PhonePe(BankAPI yb) {
        this.yb = yb;
    }

    boolean checkLoanEligibility(){
        return loan.LoanCheck(yb);
    }

    boolean FastTagRecharge(int amount){
        if(ft.recharge(yb,amount)>=0){
            System.out.println("Recharge SuccessFull");
            return true;
        }else{
            return false;
        }
    }
}
