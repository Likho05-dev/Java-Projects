package runemployee;
import java.util.*;
/**
 *
 * @author likho
 */
public class RunEmployee {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        kbd.useLocale(Locale.ENGLISH);
        
        Manager man1 = new Manager();
        System.out.println(man1);
        System.out.println("-----------------------------------------");
        
        System.out.print("Please enter employee number: ");
        int empNr = kbd.nextInt();
        man1.setEmpNr(empNr);
        System.out.print("Please enter surname of employee: ");
        String surname = kbd.next();
        man1.setSurname(surname);
        System.out.print("Please enter employee salary: R");
        double salary = kbd.nextDouble();
        man1.steSalary(salary);
        
        System.out.print("Enter the depertment that the employee works: ");
        String dept = kbd.next();
        man1.setDept(dept);
        
        System.out.print("Enter the performance bonus: R");
        double performanceBonus = kbd.nextDouble();
        man1.setPerformanceBonus(performanceBonus);
        
        
        
        System.out.println("--------------------------------------------------");
        System.out.println(man1);
        
        System.out.println("--------------------------------------------------");
        man1.displayDetails();
        System.out.println("--------------------------------------------------");
    }
    
}
