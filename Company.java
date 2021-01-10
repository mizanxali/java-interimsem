//Inheritance sub-classing implementation 
//Subclass Constructor creation
// Overriding example
class Employee {
	private String en;
	private String eid;
	private double salary;
	// Employee class constructor
	public Employee(String en, String eid, double salary) {
		this.en = en;
		this.eid = eid;
		this.salary = salary;
	}
	
	public void setName(String en){
		this.en = en;
	}
	String getName() {
		return en;
	}
	public void setEid(String eid) {
		
		this.eid = eid;
	}
	
	String getEid() {
		return eid;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	double getSalary() {					//this method returns the basic salary of Employee and Manager etc.
		return salary;
	}
}
class Manager extends Employee {                // Manager class inherited from Employee
	
	private double bonus;
	
	//Manager class constructor
		Manager(String en, String eid, double salary, double bonus){
			super(en, eid, salary);
			this.bonus = bonus;
		}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getBonus() {
		return bonus;
	}
	
	double getSalary() { 	//this phenomenon of redefining the method of parent class is known as method overriding.
	return super.getSalary()+bonus;
	}

}

//class ProjectManager extends Manager {
//}

public class Company {
	public static void main(String[] args) {
			
		//Employee e = new Employee(); // This operation is said invalid;
		Manager boss = new Manager("anand", "89820", 100000.00, 7000.00);
		Manager pmgr = new Manager("Xuz", "89920", 120000, 9000);
		
		System.out.println(boss.getSalary());
		System.out.println(pmgr.getSalary());
		
		//boss.setName("XYZ");
		//boss.setBonus(2000);
		//System.out.println("Bonus to boss:"+boss.getBonus());
		//Employee[] staff = new Employee[3];            //Array of Employee objects
		}
}

