package classesandObjects.Inheritance;

public class Car extends Vehicle{

    int numDoors;

    public Car(int maxSpeed){
        super(maxSpeed);
        System.out.println("Car's Constructor");

    }

    public void print(){
        super.print();
        System.out.println("Car colour is - "+ getColour() + ", MaxSpeed "+maxSpeed+"km/hr, Number of doors: "+numDoors);
    }

    @Override
    public boolean isMotorized() {
        return true;
    }
}
