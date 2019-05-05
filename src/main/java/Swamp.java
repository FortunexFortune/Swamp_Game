import java.util.Random;

public class Swamp {
	Player player = new Player();
	Random rand = new Random();
	
	private int xCoord = rand.nextInt(20) + 0;;
	private int yCoord = rand.nextInt(20) + 0;;

	
	public int getXCoord() {
		return xCoord;
	}
	public void setXCoord(int xCoord) {
		this.xCoord = xCoord;
	}
	public int getyCoord() {
		return yCoord;
	}
	public void setY(int yCoord) {
		this.yCoord = yCoord;
	}

	public void updatePlayerPosition(Player player){
		
		if (player.getInput().equals("n")) {
			yCoord+=1;
		}
		else if (player.getInput().equals("s")) {
			yCoord-=1;
		}
		else if (player.getInput().equals("e")) {
			xCoord+=1;	
		}
		else if (player.getInput().equals("w")) {
			xCoord-=1;
		}
		System.out.print("Your X value is : "+ xCoord + " Your Y value is at : " + yCoord );
		System.out.println("						 |||||commands list : n (North), s (South), e (Eaast) or w (West)|||");
	}

}
