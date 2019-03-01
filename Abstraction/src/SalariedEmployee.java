public class SalariedEmployee extends Employee{
private double weeklySalary;

public SalariedEmployee(String fname, String lname, int id, boolean active, int age, double weeklySalary ,boolean active1, int age1, double weeklySalary1 ){
	super(fname, lname, id, active1, age1); 
	setWeeklySalary(weeklySalary1);
}
public void setWeeklySalary(double salary){
	
if(salary >= 0.0d) weeklySalary = salary;

}
@Override
public double computeSalary() {
	// TODO Auto-generated method stub
	return 0;
}
public double getWeeklySalary(double salary){
return weeklySalary >= 0.0d ? weeklySalary : 0.0d; }
@Override
public String toString(){
return String.format("=========== Salaried Employee ============\nFirst Name: %s\n Last Name: %s\nEmployee ID: %d\nEmployee Age: %d\nEmployed: %b\nEarnings: %,.2f", getFirstName(), getLastName(), getEmployeeId(), getEmployed(), computeSalary() );
}

}