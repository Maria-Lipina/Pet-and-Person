public abstract class Pet {
    // true - сытый, false - голодный
    private boolean bellyful;

    private boolean health; // состо€ние здоровь€ true - хорошо, false - плохо, пора к ветеринару
    private String breed; //порода

    private Environment env;

    enum Environment {
        water,
        earth, //отдельный вопрос, насколько это правильно по конвенции
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
        if (this.health == false) {/*здесь должен быть вызов хоз€ина "мне плохо, пора к врачу"*/}
    }

    public String getBreed() {
        return breed;
    }

    public abstract void eat();

    public abstract void move();

    public void wc() {
        System.out.println("готово");
        //«десь нужен вызов хоз€ина: убери за мной!
    }

    public void sleep() {
        System.out.println("zzzz");
    };

    public Environment getEnvironment() {
        return this.env;
    }

    public abstract void setEnvironment(Environment env);

}
