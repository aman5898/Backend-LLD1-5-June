package AdapterV1Loose;

import java.util.Scanner;

public class Client {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String bankName = scanner.nextLine();

        BankAPI yb = BankApiFactory.getBankAPI(bankName);
        PhonePe ph = new PhonePe(yb);

    }
}
