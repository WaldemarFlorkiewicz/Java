package Maps;

import java.util.HashMap;
import java.util.Scanner;

public class Company {
    static HashMap<String, Employee> companyMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public  void addEmpplyee() {
            System.out.println("Podaj imie pracownika: ");
            String name = scanner.nextLine().toLowerCase();
            System.out.println("Podaj nazwisko pracownika:");
            String surname = scanner.nextLine().toLowerCase();
            System.out.println("Podaj jego wypłate: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            Employee employee = new Employee(name, surname, salary);
            StringBuilder stringBuilder = new StringBuilder();
            String fullKey = String.valueOf(stringBuilder.append(name + surname)).toLowerCase();
            companyMap.put(fullKey, employee);

    }

    public void serachEmployee() {
        System.out.println("Podaj imie pracownika: ");
        String name = scanner.nextLine().toLowerCase();
        System.out.println("Podaj nazwisko pracownika: ");
        String surname = scanner.nextLine().toLowerCase();
        String fullname = String.valueOf(new StringBuilder().append(name + surname));
        System.out.println(companyMap.get(fullname).toString());

    }

    public void getSizeOfMap(){
        System.out.println(companyMap.size());
    }


}
