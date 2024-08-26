package ParkingLot.services;

import ParkingLot.models.Gate;
import ParkingLot.models.Ticket;
import ParkingLot.models.Vehicle;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
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

        // 3. Return the Date

        return null;
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
