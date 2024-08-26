package ParkingLot.strategies;

import ParkingLot.models.ParkingLot;
import ParkingLot.models.ParkingSlot;
import ParkingLot.models.VehicleType;

public interface SlotAssignmentStrategy {
    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
