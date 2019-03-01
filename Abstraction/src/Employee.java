public abstract class Employee {
public String firstName;
public String lastName;
public int employeeId;
public boolean isEmployed;
Employee(String fname, String lname, int id, boolean active, int age1){
firstName = fname; 
lastName = lname; 
employeeId = id; isEmployed = active;
	} 
public void setFirstName(String fname){
firstName = fname; }
public String getFirstName(){
return firstName; }
public void setLastName(String lname){
lastName = lname; }
public String getLastName(){
return lastName; }
public void setEmployeeId(int id){
employeeId = id; }
public int getEmployeeId(){
return employeeId; }
public void setEmployed(boolean isEmployed){
this.isEmployed = isEmployed; }
public boolean getEmployed(){
return isEmployed; }
public abstract double computeSalary();
double computeEarnings() {
	// TODO Auto-generated method stub
	return 0;
}
}