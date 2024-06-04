package lecture44_payroll_system;

public class PayrollExample {
    public static void main(String[] args) {


        // Employee which has salary-based calculation
        Employee employee1 = new Programmer(1, "Yll", "Gashi", 100.00, "C#, Java, JavaScript");

        Employee employee2 = new Programmer(2, "Anda", "Rexhepi", 200.00, "C#, VueJs, JavaScript");

        // Employee which has hour * hour-price calculation
        Employee employee3 = new Consultant(3, "Fatlind", "Gashi", 10, 2.00, "Consultant course 1");
        Employee employee4 = new Consultant(4, "Arijane", "Syla", 10, 3.00, "Consultant course 2");

        // calculate payroll of company employees based on two different calculations
        System.out.println(employee1.pay());
        System.out.println(employee2.pay());
        System.out.println(employee3.pay());
        System.out.println(employee4.pay());

        // show employees informations
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());
    }
}
