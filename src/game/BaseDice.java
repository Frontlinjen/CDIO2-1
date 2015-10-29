package game;
import java.util.Random;


public class BaseDice {
	int result;
	int firstDie;
	int secondDie;
	Random psudoGen = new Random(System.currentTimeMillis());


	
	
	public void rollDice()
	{
		firstDie = psudoGen.nextInt(6)+1; //Returns a number between 1 and 6 since 6 is exclusive. 
		secondDie = psudoGen.nextInt(6)+1;
 	}
	
	public int result(){
		result = firstDie + secondDie;
		return result;
	}
}
