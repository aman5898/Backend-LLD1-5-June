package ParkingLot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Date exitDate;
    private int amount;
    private Gate gate;
    private Operator operator;
    private Ticket ticket;
    private List<Payment> payment;
}

//cash : 30, UPI : 20
//Coupon : 10, UPI : 40

