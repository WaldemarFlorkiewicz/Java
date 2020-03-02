package Inheritance;

public class Part {
    private String numerIdentyfikacyjny;
    private String nazwaProducenta;
    private String model;
    private String seriaProduktu;


    public String getNumerIdentyfikacyjny() {
        return numerIdentyfikacyjny;
    }

    public void setNumerIdentyfikacyjny(String numerIdentyfikacyjny) {
        this.numerIdentyfikacyjny = numerIdentyfikacyjny;
    }

    public String getNazwaProducenta() {
        return nazwaProducenta;
    }

    public void setNazwaProducenta(String nazwaProducenta) {
        this.nazwaProducenta = nazwaProducenta;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeriaProduktu() {
        return seriaProduktu;
    }

    public void setSeriaProduktu(String seriaProduktu) {
        this.seriaProduktu = seriaProduktu;
    }

    public void printInfo(){
        System.out.println(getNumerIdentyfikacyjny() + " " + getNazwaProducenta() + " " + getModel() + " " + getSeriaProduktu());
    }
}
