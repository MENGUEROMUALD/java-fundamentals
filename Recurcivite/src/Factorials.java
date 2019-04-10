import java.math.BigInteger;

public class Factorials {
	public Factorials() {
		
	}
	public BigInteger factorial(BigInteger fact) {
		if (fact.compareTo(BigInteger.ONE)<=0)
		return BigInteger.ONE;
		return fact.multiply(factorial(fact.subtract(BigInteger.ONE)));
		
	}

}
