package homework;
/**
 * BasePlusCommision extends salary employees
 * @author Uduma Andreas Mokonchu
 *@since March 27 20019
 */

public class BasePlusComissionEmployee extends ComissionEmployee{
	
	private double baseSalary;
	
	public BasePlusComissionEmployee(String fname, String lname, int id, int age,boolean active, int sales,
			float commission, int limit, double baseSalary) {
		super(fname, lname, id, age, active, sales, commission, limit);
		setBaseSalary(baseSalary);
	}
	public BasePlusComissionEmployee(String fname, String lname, int id, int age,boolean active,
			int sales, float baseSalary) {
		super(fname, lname, id, age, active, sales);
		setBaseSalary(baseSalary);
	}
	/**
	 * Here the employee has fixed pay and also earns on comission
	 */
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public BasePlusComissionEmployee(){
		super();
	}
	@Override
	public double computeEarnings(){
		return getBaseSalary() + super.computeEarnings();
		}
	public String toString() {
		return String.format("=========== BasePlusCommission"+
			"Employee ============\n%s\nBase Salary: %,.2f"
			+ "", super.toString(), getBaseSalary());
			}

}
