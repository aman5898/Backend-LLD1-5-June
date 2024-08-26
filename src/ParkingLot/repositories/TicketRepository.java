package ParkingLot.repositories;

import ParkingLot.models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    private Map<Integer, Ticket> tickets = new TreeMap<>();
    private static int previousID = 0;

    public Ticket save(Ticket ticket){
        previousID += 1;
        ticket.setId(previousID);
        tickets.put(previousID,ticket);
        return ticket;
    }
}
