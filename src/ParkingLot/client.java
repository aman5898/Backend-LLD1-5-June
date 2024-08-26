package ParkingLot;

import ParkingLot.controllers.TicketController;
import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Gate;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.TicketService;

public class client {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketRepository ticketRepository = new TicketRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                ticketRepository
        );

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDTO request = new IssueTicketRequestDTO();
        request.setGateId(1);
        request.setVehicleNumber("DL 1vc 0001");
        request.setVehicleType(VehicleType.TWO_WHEELER);
        request.setOwnerName("Aman Kumar");

        IssueTicketResponseDTO responseDTO = ticketController.issueTicket(request);

        if(responseDTO.getResponseStatus().equals(ResponseStatus.SUCCESS)){
            System.out.println("Ticket Generated Successfully");
            System.out.println(responseDTO.getTicket().getParkingSlot().getSlotNumber());
        }else{
            System.out.println("Ticket is not Generated due to "+responseDTO.getFailureMessage());
        }
    }
}

// creation of ticket : CRUD

//Ticket : TicketController
//Floor : FloorController

//Client -> TicketController -> TicketService -> Repository

//1. Complete your code so its in running state and raise a PR.
//2. Implement the generate Bill Function and Raise a PR
