package Generics;

public class Main {
    public static void main(String[] args) {

        Pair<String, Integer> p1 = new Pair<>("Kinga", 1994);
        Pair<String, Integer> p2 = new Pair<>("Waldemar", 1993);
        printPair(p1);
        printPair(p2);

    }

    static <T, V> void printPair(Pair<T, V> pair) {
        System.out.println(pair.getT() + " + " + pair.getV());
    }
}
