package classesandObjects.Inheritance;

public abstract class Vehicle {

    private String colour;
    int maxSpeed;
    int wheels;

    public Vehicle(int maxSpeed){
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle's Constructor");
    }

    public void print(){
        System.out.println("Vehicle colour is - "+ colour + ", MaxSpeed "+maxSpeed+"km/hr.");
    }

    //getters and setters
    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }

    public abstract boolean isMotorized();

}
