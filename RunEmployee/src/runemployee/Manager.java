package runemployee;

/**
 *
 * @author likho
 */
public class Manager extends Employee {
    private String dept;
    private double performanceBonus;
    
    public Manager() {
        
    }
    public Manager(int empNr, String surname, double salary, String dept, double performanceBonus) {
                
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setPerformanceBonus(double performanceBonus) {
        this.performanceBonus = performanceBonus;
    }
    public String getDept() {
        return this.dept;
    }
    public double getPerformanceBonus() {
        return this.performanceBonus;
    }
    @Override
    public String toString() {
        String managerStr;
        managerStr = super.toString() + ", Manager of: " + this.dept + ", Performance bonus: R" + this.performanceBonus;
        return managerStr;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Manager of: "+  this.dept);
        System.out.println("Performance bonus: R" + this.performanceBonus);
        System.out.println("==================================");
        System.out.println("Total salary: R" + (getSalary() + performanceBonus));
    }
}
