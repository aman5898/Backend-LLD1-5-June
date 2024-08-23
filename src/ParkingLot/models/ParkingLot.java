package ParkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String name;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    // Vehicle Types : Capacity
    // Let's use HashMap : don't
    // better to create another class
    private List<SupportedVehicleType> vehicleTypes;
}
