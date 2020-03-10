package Generics;

public class Pair<T, V> {

    private T girlName;
    private V boyName;

    public Pair(T girlName, V boyName) {
        this.girlName = girlName;
        this.boyName = boyName;
    }

    public T getGirlName() {
        return girlName;
    }

    public void setGirlName(T girlName) {
        this.girlName = girlName;
    }

    public V getBoyName() {
        return boyName;
    }

    public void setBoyName(V boyName) {
        this.boyName = boyName;
    }

    public void printPair(){
        System.out.println(girlName  + " " + boyName);
    }

}
