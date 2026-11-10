package pms_hw;


import java.time.LocalDate;

public abstract class Employee implements Comparable<Employee>, Taxable, BonusCalculable {
    private String id;
    private String name;
    protected double baseSalary;
    private LocalDate joinDate;

    public Employee(String id, String name, double baseSalary, LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.joinDate = joinDate;
    }
    
    public abstract double calculatNetSalary();
    
    public double calculateTax(Employee other){
    return Double.compare(other.calculatNetSalary(), this.calculatNetSalary());
    }
    
    @Override
    public double calculateTax(){
    return baseSalary * Taxable.TAX_RATE; 
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", baseSalary=" + baseSalary + ", joinDate=" + joinDate + '}';
    }

}
