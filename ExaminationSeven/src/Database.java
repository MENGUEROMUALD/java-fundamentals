import java.io.Serializable;

public class Database implements Serializable {
	int lastNumber;

	
	public Database(int lastNumber) {
		super();
		this.lastNumber = lastNumber;
	}

	public int getLastNumber() {
		return lastNumber;
	}

	public void setLastNumber(int lastNumber) {
		this.lastNumber = lastNumber;
	}
	
	@Override
    public String toString() {
        String value = "le chiffre est : " + lastNumber ;
        return value;
    }
	

}
