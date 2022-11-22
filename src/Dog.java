public class Dog extends Cat{

    public Dog(String subBreed) {
        super("собака");
        this.subBreed = subBreed;
    }

    @Override
    public void move() {
        if (super.getEnvironment() == Environment.earth) System.out.println("собака идет/ползет/бежит/прыгает");
        if (super.getEnvironment() == Environment.water) System.out.println("собака плывет насколько умеет");
    }

    public void guard (Person stranger) {
        if (!isFriend(stranger)) System.out.println("настороженность, готов куснуть/рыкнуть");
    }
}
