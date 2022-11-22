public class Cat extends Terrestrial {
    String subBreed;

    public Cat(String subBreed) {
        super("���");
        this.subBreed = subBreed;
    }

    @Override
    public void move() {
        if (super.getEnvironment() == Environment.earth) System.out.println("����� ����/������/�����/�������");
        if (super.getEnvironment() == Environment.water) {
            System.out.println("����� �����������");
            super.mood = Mood.angry;
        }
        }

    public void play(Person p) {
        if (isFriend(p)) {
            System.out.println("���� ���� � ������");
            super.mood = Mood.happy;
        }
        else System.out.println("�� ��������, ���� ���");
    }
}

