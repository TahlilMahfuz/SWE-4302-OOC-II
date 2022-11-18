import java.util.ArrayList;

public class Printer {
    <T extends Person> String printList(ArrayList<T> list) {
        String s = "";
        for (T e : list) {
            s += e.toString() + '\n';
        }
        return s;
    }
}
