public abstract class Pet {
    // true - �����, false - ��������
    private boolean bellyful;

    private boolean health; // ��������� �������� true - ������, false - �����, ���� � ����������
    private String breed; //������

    private Environment env;

    enum Environment {
        water,
        earth, //��������� ������, ��������� ��� ��������� �� ���������
        air
    }


    public Pet(boolean bellyful, boolean health, String breed, Environment env) {
        this.bellyful = bellyful;
        this.health = health;
        this.breed = breed;
        this.env = env;
    }

    public boolean isBellyful() {
        return bellyful;
    }

    public void setBellyful(boolean bellyful) {
        this.bellyful = bellyful;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {

        this.health = health;
        if (this.health == false) {/*����� ������ ���� ����� ������� "��� �����, ���� � �����"*/}
    }

    public String getBreed() {
        return breed;
    }

    public abstract void eat();

    public abstract void move();

    public void wc() {
        System.out.println("������");
        //����� ����� ����� �������: ����� �� ����!
    }

    public void sleep() {
        System.out.println("zzzz");
    };

    public Environment getEnvironment() {
        return this.env;
    }

    public abstract void setEnvironment(Environment env);

}
