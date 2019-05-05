
public class Game {
	
	public void start(){

		Player player = new Player();
		Swamp swamp  = new Swamp();
		PoI poi = new PoI();
		player.description();
		poi.lookingForTreasure(); //true

		
		while (poi.lookingForTreasure() == true) {
			player.start();
			player.playerInput();
			swamp.updatePlayerPosition(player);
			poi.eventNotifier(swamp);
		}  
		
	}
	

}


