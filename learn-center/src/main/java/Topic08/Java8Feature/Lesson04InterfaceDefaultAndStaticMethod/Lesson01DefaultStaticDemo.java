package Topic08.Java8Feature.Lesson04InterfaceDefaultAndStaticMethod;


interface Vehicle {
    String getBrand();

    String speedUp();

    String slowDown();

    // with default method can save backward compatibility
    default String turnAlarmOn() {
        return "turning vehicle alarm on";
    }

    default String turnAlarmOff() {
        return "turning vehicle alarm off";
    }

    static String getCompany(){
        return "BMW Company";
    }
}

class Car implements Vehicle {

    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public String speedUp() {
        return "The car is speed up";
    }

    @Override
    public String slowDown() {
        return "The car is speed down";
    }
}

public class Lesson01DefaultStaticDemo {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.speedUp());
        System.out.println(vehicle.slowDown());

        System.out.println(vehicle.turnAlarmOn());
        System.out.println(vehicle.turnAlarmOff());

        System.out.println(Vehicle.getCompany());
    }
}
