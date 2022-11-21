public class Fish extends Pet {

    public Fish () {
    super(true, true, "�����", Environment.water);
    }

    @Override
    public void eat() {
        System.out.println("����� ���-���");
        super.setBellyful(true);
    }

    @Override
    public void move() {
        System.out.println("����� ������");
    }

    @Override
    public void setEnvironment(Environment env) {
        if (env != Environment.water) this.setHealth(false);
    }

}
