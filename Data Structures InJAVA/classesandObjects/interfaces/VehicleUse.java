package classesandObjects.interfaces;

public class VehicleUse {

    public static void main(String args[]){

        Vehicle v1 = new Vehicle();
        v1.print();

        VehicleInterface v2;
        CarInterface c1;

        c1 = new Car();
        c1.numGears();

        v2 = new Car();
        v2.getCompany();
    }
}
