package homeWork_22;

public class TestMain {
    public static void main(String[] args) {
        Person person = new Person();
        AmateurAtleth amateur = new AmateurAtleth();
        ProAthlete pro = new ProAthlete();

        person.run();
        amateur.run();
        pro.run();
    }
}
