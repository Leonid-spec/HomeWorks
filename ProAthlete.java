package homeWork_22;

public class ProAthlete extends Person{
    @Override
    public void run(){
        int speed = 25;
        System.out.println("Pro run with speed: " + speed + " km/h");
        rest(5);
    }
    @Override
    public void rest(int minutes){
        System.out.println("Pro rest: " + minutes + " minutes");
    }
}
