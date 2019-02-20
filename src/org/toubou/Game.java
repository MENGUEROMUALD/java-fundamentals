package org.toubou;

import org.toubou.WhoWinsAMillion;
import org.toubou.User;
public class Game {


	public static void main(String[] args) {
		
		String[] questions = {"What is your nation?","Who was the star of the movie titled White Christmas?","Stollen is the traditional fruit cake of which country?"};
        String[] answers ={"Cameroon","Crosby","Germany"};
        
        User user1,user2=new User();
        
        
		WhoWinsAMillion.play(questions,answers);
		
}
}
