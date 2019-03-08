package homework;

public class Card {
	
	
	String symbol;
	String type;
	int point;
	
	public void setPoint(int point) {
		this.point = point;
	}
	public int getPoint() {
		return point;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public Card(String symbol, String type) {
		super();
		this.symbol = symbol;
		this.type = type;
		setCardPoint(symbol);
	}
	
	private void setCardPoint(String symbol) {
		
		switch(symbol) {
		
		case "2":
			point =2;
			break;
		case "3":
			point =3;
			break;
		case "4":
			point =4;
			break;
		case "5":
			point =5;
			break;
		case "6":
			point =6;
			break;
		case "7":
			point =7;
			break;
		case "8":
			point =8;
			break;
		case "9":
			point =9;
			break;
		case "10":
			point =10;
			break;
		case "J":
			point =11;
			break;
		case "Q":
			point =12;
			break;
		case "K":
			point =13;
			break;
		case "A":
			point =14;
			break;
		case "JOKER":
			point =20;
			break;
			
		}
	}
	

}
