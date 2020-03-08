package FileOperations;

import java.io.*;
        import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Employee employee = null;
        Company company = new Company();
        boolean flag = true;
        while (flag) {
            options();
            int options = scanner.nextInt();
            scanner.nextLine();

            switch (options) {
                case 1:
                    System.out.println("File name to save Employee");
                    String fileName = scanner.nextLine();
                    try (
                            var fileOutputStream = new FileOutputStream(fileName);
                            var objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    ) {
                        employee = createEmployee();
                        if (employee != null) {
                            company.employeeAdd(employee);
                        }
                        objectOutputStream.writeObject(employee);

                    } catch (IOException e) {
                        System.out.println("Somethings wrong !");
                    } catch (NoMoreSpaceException e) {
                        e.getMessage();
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("No more spaces in company");
                    }
                    break;
                case 2:
                    System.out.println("From witch file read Employee?");
                    String file = scanner.nextLine();
                    Employee employeee = null;

                    try (
                            var fileInputStream = new FileInputStream(file);
                            var objectInputStream = new ObjectInputStream(fileInputStream);
                    ) {
                        employeee = (Employee)objectInputStream.readObject();
                        System.out.println(employeee.toString());
                    }catch (FileNotFoundException e){
                        System.out.println("Nie znaleziono pliku.");
                    }
                    break;
                case 3:
                    company.allEmployes();
                    break;


            }
        }


    }

    public static Employee createEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put first name of employee: ");
        String name = scanner.nextLine();
        System.out.println("Put surname of employee: ");
        String surname = scanner.nextLine();
        System.out.println("Put his sallary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        Employee employee = new Employee(name, surname, salary);
        return employee;
    }

    public static void options() {
        System.out.println("1 - Utworz pracownika i dodaj go do pliku");
        System.out.println("2 - odczytaj pracownika z pliku");
        System.out.println("3 - wyswietl liste pracownikow");
    }

}
