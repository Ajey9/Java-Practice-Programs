package Java_programs;

class Sportscar implements Drivable, Fuelvehicle{

    @Override
    public void drive() {
        System.out.println("Vehicle is moving");
    }

    @Override
    public void refuel() {
        System.out.println("You need a fuel");
    }
}
public class CastingwithObject {
    public static void main(String[] args) {
        Drivable drivable = new Sportscar();
        drivable.drive();

        Fuelvehicle fuelvehicle = (Fuelvehicle) drivable;
        fuelvehicle.refuel();
    }
}

