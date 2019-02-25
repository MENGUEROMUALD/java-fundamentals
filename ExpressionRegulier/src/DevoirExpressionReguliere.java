import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DevoirExpressionReguliere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int compteur = 0, debut = 0;
		System.out.println("Bienvenu , nous allons compter combien de vois il ya le mots ''have'' dans la scene 1 suivante ");
		String scene ="SCENE I. Rousillon. The COUNT's palace. \r\n" + 
				"\r\n" + 
				"Enter BERTRAM, the COUNTESS of Rousillon, HELENA, and LAFEU, all in black  \r\n" + 
				"COUNTESS  \r\n" + 
				"In delivering my son from me, I bury a second husband. \r\n" + 
				"\r\n" + 
				"BERTRAM  \r\n" + 
				"And I in going, madam, weep o'er my father's death \r\n" + 
				"anew: but I must attend his majesty's command, to \r\n" + 
				"whom I am now in ward, evermore in subjection. \r\n" + 
				"\r\n" + 
				"LAFEU  \r\n" + 
				"You shall find of the king a husband, madam; you, \r\n" + 
				"sir, a father: he that so generally is at all times \r\n" + 
				"good must of necessity hold his virtue to you; whose \r\n" + 
				"worthiness would stir it up where it wanted rather \r\n" + 
				"than lack it where there is such abundance. \r\n" + 
				"\r\n" + 
				"COUNTESS  \r\n" + 
				"What hope is there of his majesty's amendment? \r\n" + 
				"\r\n" + 
				"LAFEU  \r\n" + 
				"He hath abandoned his physicians, madam; under whose \r\n" + 
				"practises he hath persecuted time with hope, and \r\n" + 
				"finds no other advantage in the process but only the \r\n" + 
				"losing of hope by time. \r\n" + 
				"\r\n" + 
				"COUNTESS  \r\n" + 
				"This young gentlewoman had a father,--O, that \r\n" + 
				"'had'! how sad a passage 'tis!--whose skill was \r\n" + 
				"almost as great as his honesty; had it stretched so \r\n" + 
				"far, would have made nature immortal, and death \r\n" + 
				"should have play for lack of work. Would, for the \r\n" + 
				"king's sake, he were living! I think it would be \r\n" + 
				"the death of the king's disease.";
		
		Pattern contrainte = Pattern.compile("have", Pattern.LITERAL);
		Matcher controleur = contrainte.matcher(scene);
		 
		while(controleur.find(debut)){
		    compteur++;
		    debut = controleur.start() + 1;
		}
		 
		System.out.println("have a ete trouver : " + compteur);
		
		
	}

}
