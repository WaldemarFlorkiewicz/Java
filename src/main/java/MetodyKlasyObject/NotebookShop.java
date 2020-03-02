package MetodyKlasyObject;

public class NotebookShop {
    public static void main(String[] args) {

        DataStore dataStore = new DataStore();
        //Computer computer1 = new Computer("Benq", 5);
        //Computer computer2 = new Computer("Benq", 5);
        //Computer computer3 = new Computer("Benq", 5);
        //Computer computer4 = new Computer("Benq", 5);
        //Computer computer5 = new Computer("Acer", 1);
        //Computer computer6 = new Computer("Asus", 2);
        //Computer computer7 = new Computer("Dell", 3);

        dataStore.add(new Computer("Benq", 5));
        dataStore.add(new Computer("Benq", 5));
        dataStore.add(new Computer("Benq", 5));
        dataStore.add(new Computer("Benq", 5));
        dataStore.add(new Computer("Acer", 1));
        dataStore.add(new Computer("Asus", 2));
        dataStore.add(new Computer("Dell", 3));

        //dataStore.checkAvailability(computer1);
        Computer computerToFind = new Computer("Benq", 5);
        System.out.println(dataStore.checkAvailability(computerToFind));
        //dataStore.printInfo();
        for (Computer com : dataStore.getComputers()){
            System.out.println(com);
        }


    }
}
