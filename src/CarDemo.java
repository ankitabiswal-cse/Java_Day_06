class Car {
    String brand;
    String model;

    void display() {
        System.out.println("Brand Of The Car Is =" + brand);
        System.out.println("Model Of The Car Is =" + model);
    }
}
public class CarDemo{
    public static void main(String[] args){
        Car c1 = new Car();
        c1.brand = "Toyato";
        c1.model = "Fortuner";

        c1.display();
    }
}

