package LoopingExercise2;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();
        final int exit = 0;
        final int add = 1;
        final int print = 2;
        int option = -1;



        while (option != exit) {
            System.out.println("Wybierz jedna z opcji: ");
            System.out.println("0 - Wyjscie z programu.");
            System.out.println("1 - Dopisanie pacjenta.");
            System.out.println("2 - Wyswiewtlenie zapisanych pacjentow.");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case exit:
                    System.out.println("Koniec programu.");
                    break;
                case add:
                    System.out.println("Podaj swoje imię: ");
                    String name = scanner.nextLine();
                    System.out.println("Podaj swoje nazwisko: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Podaj swoj Pesel: ");
                    String pesel = scanner.nextLine();
                    Patient patient = new Patient(name, lastName, pesel);
                    hospital.addPatient(patient);
                    System.out.println("Dodano do kolejki. Dziekujemy za rejestracje.");
                    break;
                case print:
                    hospital.printPatients();
                    break;

            }
        }
        scanner.close();
    }

}

