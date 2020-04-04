package MethodReferences;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("Tomasz", "Jan", "Waldemar", "Aneta", "Kazimierz");
        //name.add("Tomasz");
        //name.add("Jan");
        //name.add("Waldemar");
        //name.add("Aneta");
        //name.add("Kazimierz");

        Collections.sort(name, String::compareToIgnoreCase);
        for (String names : name){
            System.out.print(names + " ");
        }

    }

    


}
