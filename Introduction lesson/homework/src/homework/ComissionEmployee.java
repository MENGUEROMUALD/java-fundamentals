package homework;

public class ComissionEmployee extends Employee {
	
	private int sales;
	private double commission;
	private final int SALES_LIMIT;
	
	
	//8-argument constructor
	public ComissionEmployee(String fname, String lname, int id, int age,boolean active, int sales, double commission,
			int limit) {
		super(fname, lname, id, age, active, sales );
		SALES_LIMIT = limit;
		setSales(sales);
		setCommission(commission);
	}
	//6-argument constructor
	public ComissionEmployee(String fname, String lname, int id, int age,boolean active, int sales){
		super(fname, lname, id, age, active, sales);
		SALES_LIMIT = 10000;
	}
	
	//default constructor
	public ComissionEmployee(){
		super();
		SALES_LIMIT = 1000;
	}
	
	public int getSales() {
		return sales;
		}
	
		public void setSales(int sales) {
		if(sales > SALES_LIMIT)
		this.sales = SALES_LIMIT;
		else
		this.sales = sales;
		}
		
		public double getCommission() {
		return commission;
		}
		
			/**
			* @param commission2 the salesPercentage to set
			*/
			public void setCommission(double commission2) {
			this.commission = commission2;
			}
			@Override
			public double computeEarnings() {
			return getSales() * getCommission();
			}
				public String toString() {
				return String.format("=========== Commission Employee"+
				"============\nFirst Name: %s\n"
				+ "Last Name: %s\n"
				+ "Employee ID: %d\n"
				+ "Employee Age: %d\n"
				+ "Employed: %b\n"
				+ "Commission: %,.2f"
				+ "Sales: %d"
				+ "Earnings: %,.2f"
				+ "", getFirstName(), getLastName(), getEmployeeId(),
				getAge(), getCommission(), getSales(), getHoursWorked(), computeEarnings()
				);
				}
			
			private ComissionEmployee getHoursWorked() {
					return null;
				}
			
			@Override
			public double computeSalary() {
				return 0;
			}
}
