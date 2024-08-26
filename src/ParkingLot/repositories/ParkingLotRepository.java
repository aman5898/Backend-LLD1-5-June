package ParkingLot.repositories;

import ParkingLot.models.Gate;
import ParkingLot.models.ParkingLot;

import java.util.TreeMap;

public class ParkingLotRepository {
    private TreeMap<Integer, ParkingLot> parkingLots = new TreeMap<>();

    public ParkingLot findParkingLotBeEntryGate(Gate gateToCheck){
        for(ParkingLot parkingLot:parkingLots.values()){
            for(Gate gate:parkingLot.getEntryGates()){
                if(gate.getId()== gateToCheck.getId()){
                    return parkingLot;
                }
            }
        }
        return null;
    }

    public ParkingLot findParkingLotByid(int parkingLotId){
        if(parkingLots.containsKey(parkingLotId)){
            return parkingLots.get(parkingLotId);
        }

        return null;
    }
}

// which DS resembles our db very closely
// TreeMap
