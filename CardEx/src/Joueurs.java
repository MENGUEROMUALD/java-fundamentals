import java.util.ArrayList;
import java.util.List;

public class Joueurs {
	
	CardEx[] card ;

	public Joueurs() {
		card = new CardEx[5];
	}
	public void setCard(CardEx...c) {
		for(int i =0;i<5;i++) {
			this.card[i] = c[i];
				
		}
	}
	public CardEx[] getCard() {
		return card;
	}
	
}
