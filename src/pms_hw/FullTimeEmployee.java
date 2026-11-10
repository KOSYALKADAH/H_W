package pms_hw;

import java.time.LocalDate;

    public abstract class FullTimeEmployee extends Employee{
        private final  double allowance;
        
        public FullTimeEmployee(String id, String name, double baseSalary, LocalDate joinDate, double allowance){
        super(id, name, baseSalary, joinDate);
        this.allowance = allowance;
        }
        
        
        public double calaculateNetSalary(){
        return baseSalary + allowance - calculateTax();
        }
        
     
        public double calculateBonus(double performanceScore){
        return (baseSalary * 0.10) * performanceScore;
        }        

        @Override
        public double calculatNetSalary() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
