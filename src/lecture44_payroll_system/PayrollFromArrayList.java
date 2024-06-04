package lecture44_payroll_system;

import java.util.ArrayList;

public class PayrollFromArrayList {
    public static void main(String[] args) {
        // GET DATA FROM DATABASE or FILE
        ArrayList<Employee> employees = new ArrayList<>();

        // Employee which has salary-based calculation
        employees.add(new Programmer(1, "Yll", "Gashi", 100.00, "C#, Java, JavaScript"));
        employees.add(new Programmer(2, "Anda", "Rexhepi", 200.00, "C#, VueJs, JavaScript"));
        // Employee which has hour * hour-price calculation
        employees.add(new Consultant(3, "Fatlind", "Gashi", 10, 2.00, "Consultant course 1"));
        employees.add(new Consultant(4, "Arijane", "Syla", 10, 3.00, "Consultant course 2"));

        System.out.println("####################");
        showEmployeesInformation(employees);
        System.out.println("####################");
        calculatePayroll(employees);

    }

    public static void showEmployeesInformation(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }

    public static void calculatePayroll(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).pay());
        }
    }
}
