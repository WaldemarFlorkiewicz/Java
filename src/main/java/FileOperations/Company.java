package FileOperations;

import java.io.Serializable;

public class Company implements Serializable {

    private static final int MAX_EMPLOYEES = 3;
    private int employeesInCompany = 0;

    Employee[] employees = new Employee[MAX_EMPLOYEES];


    public void employeeAdd (Employee employee){

            employees[employeesInCompany] = employee;
            employeesInCompany++;

    }

    public void allEmployes (){
        if (employees[0] == null){
            System.out.println("Lista jest pusta");
        }else {
            for (int i = 0; i < employeesInCompany ; i++) {
                System.out.println(employees[i].toString());
            }
        }

    }
}
