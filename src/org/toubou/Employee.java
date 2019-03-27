package org.toubou;
/**
 * 
 * @author jeansylvain.toubou
 *@version 1.0
 *@since 01.03.2019
 *
 */
public abstract class Employee {

	public String firstName;
	public String lastName;				
	public int employeeId;
	public int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public boolean isEmployed;
	
	//intitial 4 param constructor to initialize the general fields of the class
	Employee(String fname, String lname, int id,int eage, boolean active){
	
			firstName = fname;						
			lastName = lname;				
			employeeId = id;	
			eage=age;
			isEmployed = active;
	}

	public void setFirstName(String fname){
	
		firstName = fname;
	}
	public String getFirstName(){
	
		return firstName;
	}
	public void setLastName(String lname){
	
		lastName = lname;
	}
	public String getLastName(){
	
		return lastName;
	} 

	public void setEmployeeId(int id){
	
		employeeId = id;
	}
	public int getEmployeeId(){
	
		return employeeId;
	}
	public void setEmployed(boolean isEmployed){
	
		this.isEmployed = isEmployed;
	}
	public boolean getEmployed(){
	
		return isEmployed;
	} 
	//general abstract method
	public abstract double computeSalary();


}
