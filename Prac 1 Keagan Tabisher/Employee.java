
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
  public String name;
  public int empNum;
  public String rank;
  // Emp variables
  
  
  public Employee(String name, int empNum, String rank)
  {
      this.name = name;
      this.empNum = empNum;
      this.rank = rank;
      // Paramatarized constructor
  }
  
  public String toString()
  {
      return ("Name of employee: " + name + " Employee number: " + empNum + " Rank of employee: " + rank + "\n");
  }
}
