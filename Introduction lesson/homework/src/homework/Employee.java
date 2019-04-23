package homework;

//HourlyEmployee, SalariedEmployee, comissionEmployee, BasePlusComissionEmployee, mainprojectClass

/** This class is extended by the hourlyEmployee , ComissionEmployee, BasePlusComissionEmployee and SalariedEmployee.
 * It basically connects all the workers and computes their earnings each pay period.
 * @author Uduma Andreas Mokonchu
 * @since March 27 2019
 * {@link homework.SalariedEmployee}
 * {@link homework.HourlyEmployee}
 * {@link homework.ComissionEmployee}
 * {@link homework.BasePlusComissionEmployee}
*/
public abstract class Employee {
	public String firstName;
	public String lastName;
	public int employeeId;
	public int age;
	public boolean isEmployed;
	static double hourlyPay;
	int hoursWorked;
	
	public Employee(String fname, String lname, int id, boolean active, int empage, double hrPay, double earn){
	firstName = fname;
	lastName = lname;
	employeeId = id;
	isEmployed = active;
	age = empage;
	hourlyPay = hrPay;
	
	/**
	 * Employee: the above is a constructor with 7 parameters.
	 */
	
	}


	public Employee(String firstName, String lastName, int employeeId, int age, boolean isEmployed, double hourlyPay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.age = age;
		this.isEmployed = isEmployed;
		this.hourlyPay = hourlyPay;
	}

	public Employee(String fname, String lname, int id, int age2, boolean active) {
	}
	public Employee() {
	}
	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	public double getHourlyPay() {
		return hourlyPay;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
	}
	public boolean getEmployed() {
		return isEmployed;
	}
	
	//general abstract method
	public abstract double computeSalary();

	public double computeEarnings() {
		double earn = (hourlyPay * hoursWorked);
		return earn;
	}
}
