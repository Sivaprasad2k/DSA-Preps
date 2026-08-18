package Basics;

public class Vehicle {
    String color;
    int maxSpeed;

    Vehicle(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Red", 120);
        v.displayInfo();
    }
}