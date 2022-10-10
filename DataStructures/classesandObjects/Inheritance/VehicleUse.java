package classesandObjects.Inheritance;

public class VehicleUse {

    public static void main(String args[]){
//        Vehicle v1 = new Vehicle(200);
        Vehicle v1;
//        v1.setColour("Silver");
//        v1.print();

        Car c1 = new Car(100);
        c1.setColour("Black");
        //c1.maxSpeed = 150;
        c1.numDoors = 4;
        //c1.printCar();
        c1.print(); //Function Overriding

        Bicycle b1 = new Bicycle(20);
        b1.setColour("Blue");
        //b1.maxSpeed = 40;
        b1.wheels = 2;
        b1.printCycle();
    }

}
