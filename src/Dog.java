public class Dog extends Cat{

    public Dog(String subBreed) {
        super("������");
        this.subBreed = subBreed;
    }

    @Override
    public void move() {
        if (super.getEnvironment() == Environment.earth) System.out.println("������ ����/������/�����/�������");
        if (super.getEnvironment() == Environment.water) System.out.println("������ ������ ��������� �����");
    }

    public void guard (Person stranger) {
        if (!isFriend(stranger)) System.out.println("���������������, ����� �������/�������");
    }
}
