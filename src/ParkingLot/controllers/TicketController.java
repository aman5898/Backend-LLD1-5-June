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

        // request obj, can have a lot of other details, so internally we don't send the
        // request dto everywhere.
        try{
            Ticket ticket = ticketService.issueTicket(requestDTO.getGateId(),
                    requestDTO.getVehicleNumber(),
                    requestDTO.getOwnerName(),
                    requestDTO.getVehicleType());
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setTicket(ticket);
        }catch(Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(ex.getMessage());
        }



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


//Client -> Controller -> Service -> Model


