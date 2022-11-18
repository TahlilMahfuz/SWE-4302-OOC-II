import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrintController pc1 = new PrintController(new Print1());
        pc1.p.print("HELLO");
        PrintController pc2 = new PrintController(new Print2());
        pc2.p.print("HI");
    }
}