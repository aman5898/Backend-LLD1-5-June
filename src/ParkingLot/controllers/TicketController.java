package ParkingLot.controllers;

import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.ParkingLot;
import ParkingLot.models.Ticket;
import ParkingLot.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    IssueTicketResponseDTO issueTicket(
            IssueTicketRequestDTO requestDTO
    ){

        IssueTicketResponseDTO response = new IssueTicketResponseDTO();

        Ticket ticket = ticketService.issueTicket(requestDTO.getGateId(), requestDTO.getVehicleNumber());
        response.setResponseStatus(ResponseStatus.SUCCESS);
        response.setTicketID(ticket.getId());


        return response;
    }
}


// using the model directly with the client is not suggested.

// DTO : Data Transfer Object

// Try implementing IssueTicket Service

//1   M
//I   S
//1    1
//
//   1  1
//   G  O
//   1   1


