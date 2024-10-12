package homeWork_22;

public class Person {
    public void run(){
        int speed = 10;
        System.out.println("Person run with speed: " + speed + " km/h");
        rest(15);
    }

    public void rest(int minutes){
        System.out.println("Person rest: " + minutes + " minutes");
    }
}
