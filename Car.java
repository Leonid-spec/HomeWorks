package homeWork_22;

public class Car extends Vehicle{
    public Car(String name) {
        super(name);
    }
    @Override
    public void startEngine(){
        System.out.println(getName() + ": Engine start");
    }
}
