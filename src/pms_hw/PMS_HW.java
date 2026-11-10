
package pms_hw;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PMS_HW {

    
    public static void main(String[] args) {
       
        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("E001", "AHMED", 1200.0, LocalDate.of(2021, 5, 10), 300.0));
        employees.add(new ContractorEmployee("E002", "SARA", LocalDate.of(2023, 1, 15), 25, 160));
        employees.add(new FullTimeEmployee("E003", "KHALED", 1500.0, LocalDate.of(2019, 8, 1), 400.0));
        employees.add(new ContractorEmployee("E004", "NOOR", LocalDate.of(2022, 11, 20), 30, 140));

        System.out.println("=== Basic Staff List ===");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        
        Collections.sort(employees);
        System.out.println("\n===   based on Net Salar  ===");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - Net Salary: " + emp.calculateNetSalary());
        }

       
        employees.sort(Comparator.comparing(Employee::getJoinDate));
        System.out.println("\n=== Sort by date Of Joining (Oldest) ===");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - Join Date: " + emp.getJoinDate());
        }

        
        double totalTax = 0;
        double totalBonus = 0;
        double score = 4.5;

        for (Employee emp : employees) {
            totalTax += emp.calculateTax();
            totalBonus += emp.claculateBonus(score);
        }

        System.out.println("\n===  Overall Report  ===");
        System.out.println("Total Tax : " + totalTax);
        System.out.println("Total Bonus : " + totalBonus);
    }
}

