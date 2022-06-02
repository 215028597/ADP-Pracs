
/**
 * Write a description of class EmpDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class EmpDriver
{
  public static void main(String []args)
  {
   Employee[]Emp = 
    { 
    new Employee ("Keagan", 1, "Supervisor"),
    new Employee ("Asheligh", 2, "Team Leader"),
    new Employee ("Amanda", 3, "Human Resources"),
    new Employee ("Max", 4, "Security"),
    };
   
   List<Employee> empList = new ArrayList<Employee>();
    
   for(int i = 0; i < Emp.length; i++)
   {
     empList.add(Emp[i]);
   }
   
   System.out.println(" Displaying unsorted list of Employees" + empList);
  
      
   }
    
}

