import java.util.Random;
import java.lang.Math;

public class PoI {
	
	private Swamp swamp = new Swamp();
	Random rand = new Random();

	private  int treasureX = rand.nextInt(20) + 1;
	private  int treasureY = rand.nextInt(20) + 1;
	private double distance;
	private boolean lookingForTreasure = true;


	public  int getTreasureX() {
		return treasureX;
	}
	public void setTreasureX(int  treasureX) {
	}
	public  int getTreasureY() {
		return treasureY;
	}
	public void setTreasureY(int treasureY) {
	}
	
	public boolean eventNotifier(Swamp swamp) {
		
		 int xPythagoras = (treasureX - swamp.getXCoord()) * (treasureX - swamp.getXCoord());
		 int ypythagoras = (treasureY - swamp.getyCoord()) * (treasureY - swamp.getyCoord());
		 double  pythagorasDistance = Math.sqrt( xPythagoras + ypythagoras  );
		 distance = pythagorasDistance;
		
		if ((swamp.getXCoord() == treasureX) && (swamp.getyCoord() == treasureY)) {
			System.out.println("You have found the Treasure!!");
			lookingForTreasure = false;

		}
		System.out.println("								|| Hint -->" + "You are"+ distance +"m away   |||||  The secret location is : " + " X : " + treasureX + " Y : " + treasureY + " ||");
		return lookingForTreasure;

	}

	public boolean lookingForTreasure(){
		return lookingForTreasure;
	}
	
}
