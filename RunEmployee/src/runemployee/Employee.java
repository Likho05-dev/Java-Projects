package runemployee;

/**
 *
 * @author likho
 */
public class Employee {
   private int empNr;
   private String surname;
   private double salary;
   
   public Employee() {
       this.empNr = 12345678;
       this.surname = "Issac";
       this.salary = 0.0;
   }
   public Employee(int empNr, String surname, double salary) {
       this.empNr = empNr;
       this.surname = surname;
       this.salary = salary;
   }
   public void setEmpNr(int empNr) {
       this.empNr = empNr;
   }
   public void setSurname(String surname) {
       this.surname = surname;
   }
   public void steSalary(double salary) {
       this.salary = salary;
   }
   public int getEmpNr() {
       return empNr;
   }
   public String getSurname() {
       return surname;
   }
   public double getSalary() {
       return salary;
   }
   @Override
   public String toString() {
       String str;
       str = "Emp#: " + this.empNr + ", Surname: " + this.surname + ", Salary: R" + salary;
       return str;
   }
   public void displayDetails() {
       System.out.println("Employee number: " + this.empNr);
       System.out.println("Surname: " + this.surname);
       System.out.println("Salary: R" + salary);
   }
}
