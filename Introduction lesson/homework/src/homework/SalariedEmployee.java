package homework;

/**
 * Salaried employees extends employees
 * @author Uduma Andreas Mokonchu
 *@since March 27 20019
 */

public class SalariedEmployee extends Employee {

	private double weeklySalary;
	
	public SalariedEmployee(String fname, String lname, int id,boolean active, int age, double weeklySalary ){
		super(fname, lname, id, age, active, weeklySalary);
		setWeeklySalary(weeklySalary);
	}
	public void setWeeklySalary(double salary){
		if(salary >= 0.0d)
			weeklySalary = salary;
	}
	/**
	 * This class extends the employee class and but its just for salaried employees.
	 */
	@Override
	public double computeSalary(){
		return getWeeklySalary();
	}
	private double getWeeklySalary() {
		return weeklySalary >= 0.0d ? weeklySalary : 0.0d;
	}
	@Override
	public String toString(){
	return String.format("=========== Salaried Employee"+
	"============\nFirst Name: %s\n Last Name: %s\nEmployee ID:"+
	"%d\nEmployee Age: %d\nEmployed: %b\nEarnings: %,.2f", getFirstName(),
	getLastName(), getEmployeeId(), getAge(), getEmployed(),
	computeSalary() );
	}
	public SalariedEmployee(String fname, String lname, int id,int age, boolean active, double weeklySalary) {
		super(fname, lname, id,age, active, weeklySalary);
		this.weeklySalary = weeklySalary;
	}
	

}
