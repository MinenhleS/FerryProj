package AnyPack;

public class Car {

    String colour;
    int passengerCount;

    public Car(String colour, int passengerCount){

        this.colour = colour;
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public String getColour() {
        return colour;
    }
}
