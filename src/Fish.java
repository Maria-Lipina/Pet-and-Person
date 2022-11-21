public class Fish extends Pet {

    public Fish () {
    super(true, true, "клоун", Environment.water);
    }

    @Override
    public void eat() {
        System.out.println("рыбка сюп-сюп");
        super.setBellyful(true);
    }

    @Override
    public void move() {
        System.out.println("рыбка плывет");
    }

    @Override
    public void setEnvironment(Environment env) {
        if (env != Environment.water) this.setHealth(false);
    }

}
