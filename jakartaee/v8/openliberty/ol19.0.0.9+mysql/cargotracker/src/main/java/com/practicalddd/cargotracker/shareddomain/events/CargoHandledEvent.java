package com.practicalddd.cargotracker.shareddomain.events;


public class CargoHandledEvent  {

    private CargoHandledEventData cargoHandledEventData;
    public CargoHandledEvent(){}
    public void setContent(CargoHandledEventData cargoHandledEventData) { this.cargoHandledEventData = cargoHandledEventData; }
    public CargoHandledEventData getContent() {
        return cargoHandledEventData;
    }
}
