package ParkingLot.services;

import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.strategies.SlotAssignmentStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository,
    TicketRepository ticketRepository){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(
            int gateId,
            String vehicleNumber,
            String ownerName,
            VehicleType vehicleType
    ) throws Exception {
        // to create a ticket object, what all info we are going to need.

        // 1. Properly create ticket object with required details.
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());


        // Now Set the Gate
        Optional<Gate> gateOptional = gateRepository.findGatById(gateId);

        if(gateOptional.isEmpty()){
            throw new Exception("Gate not Found");
        }

        Gate gate = gateOptional.get();
        ticket.setGate(gate);
        ticket.setOperator(gate.getOperator());

        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehiclebyNumber(vehicleNumber);

        Vehicle vehicle;
        if(vehicleOptional.isEmpty()){
            vehicle = new Vehicle();
            vehicle.setLicencePlate(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleType(vehicleType);
            vehicle = vehicleRepository.save(vehicle);
        }else{
            vehicle = vehicleOptional.get();
        }

        ticket.setVehicle(vehicle);


        // 2. Assign. Slot
         ParkingLot parkingLot = gate.getParkingLot();
         ParkingSlot parkingSlot = SlotAssignmentStrategyFactory.
                 getSlotAssignmentStrategyByType(parkingLot.getSlotAssignmentStrategyType())
                 .assignSlot(parkingLot,vehicleType);

         ticket.setParkingSlot(parkingSlot);

        // 3. Return the Data

        return ticketRepository.save(ticket);
    }
}

// IssueTicket

// Code models
// Contoller : TicketController
// DTO's

// Set up the controller with Proper argument
// Handled the exception in controller
// Ticket Service for Business logic implementation.
// String preparing all the data required for the Ticket Object.
// Created a repository for Gate to ge the object from id
// Discussed about why Optionals are better than basic null checks
// Setup the Vehicle
// Assign the slot
// Created the Strategy
// Strategy Needs Parking Lot
//          1 either get it through gateId
//          2. get the Parking Lot id from the Customer
//          3. Have the Parking Lot ref in the gate so when you get the gate, you automatically get the Parking Lot.

//H.w.Complete Gate Repo and Vehicle Repo