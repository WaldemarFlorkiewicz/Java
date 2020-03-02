package MethodsClassObject;

public class DataStore {

    private static final int MAX_COMPUTERS = 100;
    Computer[] computers = new Computer[MAX_COMPUTERS];
    private int computersInList = 0;

    public void add(Computer computer){
        if (computersInList < MAX_COMPUTERS && computer != null) {
            computers[computersInList] = computer;
            computersInList++;
        }
    }

    public Computer[] getComputers (){
        Computer[] comps = new Computer[computersInList];
        for (int i = 0; i < computersInList ; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }


    public int checkAvailability(Computer computer){
        if (computer == null){
            return 0;
        }
        int sameComputersInStore = 0;
        for (int i = 0; i < computersInList ; i++) {
            if (computers[i].equals(computer)){
                sameComputersInStore++;
            }
        }
        return sameComputersInStore;
    }

    //public void printInfo(){
    //    for (int i = 0; i < computersInList; i++){
    //        System.out.println(computers[i].toString());
    //    }
    //}
}
