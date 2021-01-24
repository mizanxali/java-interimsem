import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.
function.Function;
import java.util.
function.Predicate;
import java.util.stream.Collectors;

class Employee {
  private String firstName;
  private String lastName;
  private double salary;
  private String department;

  // constructor
  public Employee(String firstName, String lastName, double salary, String department) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.department = department;
  }
  // set firstName
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  // get firstName
  public String getFirstName() {
    return firstName;
  }

  // set lastName
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  // get lastName
  public String getLastName() {
    return lastName;
  }

  // set salary
  public void setSalary(double salary) {
    this.salary = salary;
  }

  // get salary
  public double getSalary() {
    return salary;
  }

  // set department
  public void setDepartment(String department) {
    this.department = department;
  }

  // get department
  public String getDepartment() {
    return department;
  }

  // return Employee's first and last name combined
  public String getName() {
    return String.format("%s %s", getFirstName(), getLastName());
  }

  // return a String containing the Employee's information
  @Override
  public String toString() {
    return String.format("%-8s %-8s %8.2f %s", getFirstName(), getLastName(), getSalary(), getDepartment());
  } // end method toString

} // end class Employee

public class ProcessingEmployees {
  public static void main(String[] args) {
    // initialize array of Employees
    Employee[] employees = {
      new Employee("Jason", "Red", 5000, "IT"),
      new Employee("Ashley", "Green", 7600, "IT"),
      new Employee("Matthew", "Indigo", 3587.5, "Sales"),
      new Employee("James", "Indigo", 4700.77, "Marketing"),
      new Employee("Luke", "Indigo", 6200, "IT"),
      new Employee("Jason", "Blue", 3200, "Sales"),
      new Employee("Wendy", "Brown", 4236.4, "Marketing")
    };
    // get List view of the Employees
    List < Employee > list = Arrays.asList(employees);
    
    //display all Employees
    System.out.println("Complete Employee list:");

    //Creating an array of Employees, converting it to a List and displaying the List.
    list.stream().forEach(System.out::println);

    //Predicate that returns true for salaries in the range $4000-$6000
    Predicate < Employee > fourToSixThousand = e ->(e.getSalary() >= 4000 && e.getSalary() <= 6000);

    // Display Employees with salaries in the range $4000-$6000
    // sorted into ascending order by salary
    System.out.printf("%nEmployees earning $4000-$6000 per month sorted by salary:%n");
    list.stream().filter(fourToSixThousand).sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

    // Display first Employee with salary in the range $4000-$6000
    System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n", list.stream().filter(fourToSixThousand).findFirst().get());
  }
}