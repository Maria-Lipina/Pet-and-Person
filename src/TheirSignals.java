import java.util.Hashtable;

public class TheirSignals {

    Hashtable<String, String> signals;

    public TheirSignals() {
        signals = new Hashtable<>();
        signals.put("���", "���!");
        signals.put("������", "���!");
        signals.put("�����", "�����!");
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
