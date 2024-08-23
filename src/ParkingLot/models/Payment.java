package ParkingLot.models;

import java.util.Date;

public class Payment extends BaseModel{
    private int amount;
    private Date time;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private String refNumber;
}
