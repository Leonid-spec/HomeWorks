package homeWork_22.vehicle;

public class Bicycle extends Vehicle{
    public Bicycle(String name){
        super(name);
    }
    @Override
    public void startEngine(){
        System.out.println(getName() + ": Bicycle has no engine");
    }
}
