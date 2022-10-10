package classesandObjects.interfaces;

public class Car extends Vehicle implements VehicleInterface, CarInterface{

    @Override
    public int numGears() {
        return 6;
    }

    @Override
    public boolean isMotorized() {
        return true;
    }

    @Override
    public String getCompany() {
        return null;
    }
}


