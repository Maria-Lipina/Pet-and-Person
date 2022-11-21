import java.util.Hashtable;

public class TheirSignals {

    Hashtable<String, String> signals;

    public TheirSignals() {
        signals = new Hashtable<>();
        signals.put("кот", "м€у!");
        signals.put("собака", "гав!");
        signals.put("птица", "чирик!");
    }

    public void put(String animal, String signal) {
        signals.put(animal, signal);
    }

    public void remove(String animal) {
        signals.remove(animal);
    }

    public String get(String animal) {
        return signals.get(animal);
    }

    public boolean find(String animal) {
        return signals.contains(animal);
    }

}
