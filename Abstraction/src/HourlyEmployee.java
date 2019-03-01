public class HourlyEmployee extends Employee{ private double hourlyPay;
private int hoursWorked;
public HourlyEmployee(String fname, String lname, int id, int age, boolean active, double pay, int hours) {
super(fname, lname, id, active, age);
setHourlyPay(pay);
setHoursWorked(hours);

}

@Override
public double computeSalary() {
	// TODO Auto-generated method stub
	return 0;
}
}
  