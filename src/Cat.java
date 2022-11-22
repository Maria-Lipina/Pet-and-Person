public class Cat extends Terrestrial {
    String subBreed;

    public Cat(String subBreed) {
        super("кот");
        this.subBreed = subBreed;
    }

    @Override
    public void move() {
        if (super.getEnvironment() == Environment.earth) System.out.println("кошка идет/ползет/бежит/прыгает");
        if (super.getEnvironment() == Environment.water) {
            System.out.println("кошка барахтается");
            super.mood = Mood.angry;
        }
        }

    public void play(Person p) {
        if (isFriend(p)) {
            System.out.println("идет игра с другом");
            super.mood = Mood.happy;
        }
        else System.out.println("не доверяет, игры нет");
    }
}

