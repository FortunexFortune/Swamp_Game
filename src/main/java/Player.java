import java.util.Scanner;

public class Player {
	
	private String input;

	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	
	public void description(){
		System.out.println("Welcome brave warrior, find the treasure and I willlet you live :");
		System.out.println("To navigate your way though the map use comands n (North), s (South), e (Eaast) or w (West) :");
		}

	public void start() {
		System.out.println("");
		System.out.print(">");
		Scanner sc = new Scanner(System.in);
		input = sc.next();
	}

	public void  playerInput() {
			if ((input.equals("n")) || (input.equals("s")) || (input.equals("e")) || (input.equals("w"))) {
			}
			else {
				System.out.println("You have inserted an invalid input");
			}
	}
}
