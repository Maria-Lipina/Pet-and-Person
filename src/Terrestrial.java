import java.util.Hashtable;
import java.util.Map;

public class Terrestrial extends Pet {

    public Mood mood;
    enum Mood {
        angry,
        happy,
        sad
    }

    String signal;

    public Terrestrial(String breed) {
        super(true, true, breed, Environment.earth);
        this.signal = new TheirSignals().get(breed);
        this.mood = Mood.happy;
    }

    @Override
    public void eat() {
        System.out.println("�������� ���� ����");
        super.setBellyful(true);
        this.mood = Mood.happy;
    }

    @Override
    public void move() {
        if (super.getEnvironment() == Environment.earth) System.out.println("�������� ����/������/�����");
        if (super.getEnvironment() == Environment.water) System.out.println("�������� ������� ��������");
    }

    @Override
    public void setEnvironment(Environment env) {
        this.setEnvironment(env);
    }
}
