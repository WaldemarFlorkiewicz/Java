package TabliceWielowymiarowe;

public class Cwiczenie {
    public static void main(String[] args) {
        double[] tab1 = {1.0, 1.5, 2.0};
        double[] tab2 = {1.5, 2.0, 2.5};
        double[] tab3 = {2.0, 2.5, 3.0};

        double[][] tablica = {tab1, tab2, tab3};

        // drugi sposob na stworzenie tablicy wielowymiarowej z przypisaniem tablic do jej indeksow bez deklaracji ich wielkosci.
        // double[][] tablica = new double[3][];
        // tablica[0] = tab1;
        // tablica[1] = tab2;
        // tablica[2] = tab3;

        double sum = (tablica[0][0] * tablica[1][1] * tablica[2][2]) + (tablica[0][2] * tablica[1][1] * tablica[2][0]);
        System.out.println(sum);

        double sum2 = (tablica[1][0] + tablica[1][1] + tablica[1][2]) * (tablica[0][1] + tablica[1][1] + tablica[2][1]);
        System.out.println(sum2);

        double sum3 = tablica[0][0] + tablica[0][1] + tablica[0][2] + tablica[1][0] + tablica[1][2] + tablica[2][0]
                + tablica[2][1] + tablica[2][2];
        System.out.println(sum3);
    }
}
