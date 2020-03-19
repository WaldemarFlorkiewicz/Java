package Maps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyApp {
    private static Scanner scanner = new Scanner(System.in);
    private static final int ADD_EMPLOYEE = 1;
    private static final int FIND_EMPLOYEE = 2;
    private static final int GET_NUMBERS_OF_EMPLOYESS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        boolean loop = true;
        Company company = new Company();

        while (loop){
            System.out.println("Wybierz jedna z 4 opcji programu: ");
            System.out.println("1 - Dodaj nowego pracownika do firmy.");
            System.out.println("2 - Wyszukaj pracownika na podstawie imienia i nazwiska.");
            System.out.println("3 - pobierz ilosc pracownikow.");
            System.out.println("4 - wyjdz z programu.");
            try {
                int choose = scanner.nextInt();
                scanner.nextLine();
                switch (choose){
                    case ADD_EMPLOYEE:
                        company.addEmpplyee();
                        break;
                    case FIND_EMPLOYEE:
                        company.serachEmployee();
                        break;
                    case GET_NUMBERS_OF_EMPLOYESS:
                        company.getSizeOfMap();
                        break;
                    case EXIT:
                        loop = false;
                }
            }catch (InputMismatchException | IllegalArgumentException e){
                System.err.println("Nie podano liczby lub wyrazu. Spruboj jeszcze raz !");
                scanner.nextLine();
            }

        }

    }

}
