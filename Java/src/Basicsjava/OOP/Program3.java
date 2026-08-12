package Basicsjava.OOP;

class Vehicles {
    Vehicles() {
        System.out.println("This is a Vehicle");
    }
}
class FourWheeler extends Vehicle {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}
class Cars extends FourWheeler {
    Cars() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}
public class Program3 {
    public static void main(String[] args) {
        Cars obj = new Cars(); // Triggers all constructors in order
    }
}
