public class Bird extends Pet {

    String signal;

    public Bird(String breed) {
        super(true, true, breed, Environment.air);
        this.signal = new TheirSignals().get(breed);;
    }

    public Bird(boolean bellyful, boolean health, String breed, Environment env) {
        super(bellyful, health, breed, env);
    }

    @Override
    public void eat() {
        System.out.println("������ �����");
        super.setBellyful(true);
    }

    @Override
    public void move() {
        if (super.getEnvironment() == Environment.air) System.out.println("������ �����");
        if (super.getEnvironment() == Environment.water) System.out.println("������ ����� ��������");
    }

    @Override
    public void setEnvironment(Environment env) {
        this.setEnvironment(env);
        if (env != Environment.water) this.setHealth(false);
    }
}
