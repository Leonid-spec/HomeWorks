package homeWork_22;

public class AmateurAtleth extends Person{
    @Override
    public void run(){
        int speed = 15;
        System.out.println("Amateur run with speed: " + speed + " km/h");
        rest(10);
    }
    @Override
    public void rest(int minutes){
        System.out.println("Amateur rest: " + minutes + " minutes");
    }
}
