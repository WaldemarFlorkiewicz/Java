package OnedimensionalArrays;

public class Tablice {
    public static void main(String[] args) {

        Tablice tablice = new Tablice();
        int[] tab1 = {1,2,3};
        int[] tab2 = {4,5,6};

        String[] name = {"Jan"};

        int sumTab1 = tab1[0] + tab1[1] + tab1[2];
        int sumTab2 = tab2[0] + tab2[1] + tab2[2];

        System.out.println(sumTab1 + sumTab2);

        System.out.println(tablice.sumaLiczbTablic(tab1, tab2));

        System.out.println( name[0].toString());

        int suma = sumaLiczbTablic(tab1,tab2);
        System.out.println(suma);



    }
     public static int sumaLiczbTablic(int[] tab1, int[] tab2){
        int sumaTablic = tab1[0] + tab1[1] + tab1[2] + tab2[0] + tab2[1] + tab2[2];
        return sumaTablic;
     }
}
