package classesandObjects.generics;

public class Vehicle implements PrintInterface {
    String company;
    int maxSpeed;

    public Vehicle(int maxSpeed, String company) {
        this.maxSpeed = maxSpeed;
        this.company = company;

    }

    @Override
    public void print() {
        System.out.println(maxSpeed + " " + company);
    }
}
