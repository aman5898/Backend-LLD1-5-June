package ParkingLot.models;

import java.util.List;

public class ParkingSlot extends BaseModel{
    private String slotNumber;
    private ParkingSlotStatus parkingSlotStatus;
//    private List<SupportedVehicleType> vehicleTypes;
    private VehicleType vehicleType;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

//    public List<SupportedVehicleType> getVehicleTypes() {
//        return vehicleTypes;
//    }
//
//    public void setVehicleTypes(List<SupportedVehicleType> vehicleTypes) {
//        this.vehicleTypes = vehicleTypes;
//    }
}
