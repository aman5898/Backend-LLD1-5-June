package AdapterV0Tight;

public class PhonePe {
    YesBankAPI yb = new YesBankAPI();
    PhonePeLoan pl = new PhonePeLoan();
    FastTagRecharge ft = new FastTagRecharge();

    boolean checkLoanEligibility(){
        return pl.LoanCheck(yb);
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
