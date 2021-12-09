package com.coder.gallery.lld.parking_lot.models;

import java.util.List;

public class ParkingLot extends BaseModel {
    String name;
    String address;
    List<ParkingFloor> floors;
    List<EntryGate> entryGates;
    List<ExitGate> exitGates;
}
