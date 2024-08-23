package ParkingLot.models;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private String floorNumber;
    private List<ParkingSlot> parkingSlots;
    private ParkingFloorStatus parkingFloorStatus;
    private List<SupportedVehicleType> vehicleTypes;
}
