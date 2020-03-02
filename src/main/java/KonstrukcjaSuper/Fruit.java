package KonstrukcjaSuper;

public class Fruit {
    private double wagaWGramach;
    private String typOwocu;

    public Fruit(double wagaWGramach, String typOwocu) {
        this.wagaWGramach = wagaWGramach;
        this.typOwocu = typOwocu;
    }


    public double getWagaWGramach() {
        return wagaWGramach;
    }

    public String getTypOwocu() {
        return typOwocu;
    }

    public String printInfo(){
        return wagaWGramach + " " + typOwocu;
    }
}
