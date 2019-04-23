package homework;

/**
 * This is an extended class from the employee class called the hourlyEmployees
 * @author Uduma Andreas Mokonchu
 *@since March 27 2019
 */
public class HourlyEmployee extends Employee{
	
	private double hourlyPay;
	private int hoursWorked;
	static double earn;
	
	public HourlyEmployee(String fname, String lname, int id, int age,boolean active, double pay, int hours) {
	
		super(fname, lname, id, age, active, pay);
		setHourlyPay(pay);
		setHoursWorked(hours);
	}
	/**
	 * The houly employees are another set of employees extending the employee class.
	 */

	@Override
	public double computeSalary() {
		earn = (hourlyPay * hoursWorked);
		return earn;
	}
	
	public double getSalary() {
		double hourlyPay = getHourlyPay();
		int hoursWorked = getHoursWorked();
		int overTime = getOverTime();
		return (hoursWorked * hourlyPay ) + (overTime * 1.5 *hourlyPay); //adjust the actual salary
		}

		public int getOverTime() {
		return hoursWorked - 40 > 0 ? hoursWorked - 40 : 0; //getoverTime
		}
		
		public void setHourlyPay(double hourlyPay) {
			this.hourlyPay = hourlyPay;
			}
			public int getHoursWorked() {
			return hoursWorked;
			}
			public void setHoursWorked(int hoursWorked) {
			this.hoursWorked = hoursWorked;
			}
			
			public String toString() {
				return String.format("=========== Hourly Employee"+
				"============\nFirst Name: %s\n"
				+ "Last Name: %s\n"
				+ "Employee ID: %d\n"
				+ "Employee Age: %d\n"
				+ "Employed: %b\n"
				+ "Hourly Pay: %,.2f "
				+ "Hours Worked: %d "
				+ "Earnings: %,.2f"
				+ "", getFirstName(), getLastName(),getEmployeeId(), getAge(), getEmployed(), getHourlyPay(),
				getHoursWorked(), computeSalary() );
				}

			

			public HourlyEmployee(String fname, String lname, int id, boolean active, int empage, double hrPay,
					int hoursWorked, double earn) {
				super(fname, lname, id, active, empage, hrPay, earn);
				this.hourlyPay = hourlyPay;
				this.hoursWorked = hoursWorked;
			}
			
}
