package classesandObjects.Inheritance;

public class Bicycle extends Vehicle{

    public Bicycle(int maxSpeed){
        super(maxSpeed);
        System.out.println("Bicycle's Constructor");
    }

    @Override
    public boolean isMotorized() {
        return false;
    }

    public void printCycle(){
        System.out.println("Bicycle colour is - "+ getColour() + ", MaxSpeed "+maxSpeed+"km/hr, Wheels: "+ wheels);
    }
}
