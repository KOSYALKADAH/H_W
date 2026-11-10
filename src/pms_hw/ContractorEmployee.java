package pms_hw;


import java.time.LocalDate;

public class ContractorEmployee extends Employee {
    private int hourlyRate; 
    private int hoursWorked; 

    public ContractorEmployee(String id, String name, LocalDate joinDate, int hourlyRate, double hoursWorked) {
        super(id, name, 0.0, joinDate); 
        this.hourlyRate = hourlyRate;
        this.hoursWorked = (int) hoursWorked;
    }

    public double calculateNetSalary() {
        return (hourlyRate * hoursWorked) - calculateTax();
    }

    public double calculateBonus(double performanceScore) {
        if (performanceScore > 4.0) {
            return 500.0;
        }
        return 0.0;
    }

    public int getHourlyRate() { 
        return hourlyRate;
    }
    
    public int getHoursWorked() { 
        return hoursWorked;
    }

    @Override
    public double calculatNetSalary() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int compareTo(Employee o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double claculateBonus(double performanceScore) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
