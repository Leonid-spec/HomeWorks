package homeWork_22.vehicle;

    public class Motorcycle extends Vehicle{
        public Motorcycle(String name){
            super(name);
        }
        @Override
        public void startEngine(){
            System.out.println(getName() + ": Engine of Motorcycle was started");
        }
    }


