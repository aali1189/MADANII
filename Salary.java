
//package salary;

import java.util.Scanner;


public class Salary {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter regular hours : ");
        double RegularHours = sc.nextDouble();
        System.out.print("Enter pay rate : ");
        double PayRate = sc.nextDouble();
        System.out.print("Enter overtime  : ");
        double Overtime = sc.nextDouble();
        
        System.out.println(" The weekly salary is : " + cal_saraly( RegularHours, PayRate,  Overtime ));
    }
    
    
    static double cal_saraly(double RegularHours, double PayRate, double Overtime ){
        
        return (PayRate  * RegularHours ) + ((Overtime * 1.5) * RegularHours ) ;
    
    
    }
    
}
