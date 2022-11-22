import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Terrestrial extends Pet {

    protected Mood mood;
    enum Mood {
        angry, //здесь к angry можно приравнять как испуг, так и агрессию, так и просто настороженность
        happy,
        sad,
    }

    String signal;

    ArrayList<Person> friends;

    public Terrestrial(String breed) {
        super(true, true, breed, Environment.earth);
        if (Pet.theirSignals.find(breed)) this.signal = Pet.theirSignals.get(breed);
        else this.signal = "сигнала нет в базе, но можно добавить";
        this.mood = Mood.happy;
    }

    public boolean isFriend(Person p) {
        return friends.contains(p);
    }

    public void addFriend(Person p) {
        this.friends.add(p);
    }

    @Override
    public void eat() {
        System.out.println("зверушка ест");
        super.setBellyful(true);
        this.mood = Mood.happy;
    }

    @Override
    public void move() {
        if (super.getEnvironment() == Environment.earth) System.out.println("зверушка идет/ползет/бежит/прыгает");
        if (super.getEnvironment() == Environment.water) System.out.println("зверушка плавает немножко");
    }

    @Override
    public void setEnvironment(Environment env) {
        this.setEnvironment(env);
    }
}
