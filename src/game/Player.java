package game;

import desktop_resources.GUI;

public class Player {
	protected String name;
	protected int points = 0;
	/**
	 * Each player has their own set of dice which keeps track of their rolls. 
	 */
	protected BaseDice dice = new DicePair();
	Account account = new Account();
	
	public Player(String s)
	{
		name = s;
	}
	public String getName()
	{
		return name;	
	}
	public int getPoints()
	{
		return account.getGold();
	}
	public void setPoints(int p)
	{
		//GUI.removeAllCars(name);
		account.setGold(p);
		//GUI.setCar(Math.min(points, 40), name);
		GUI.setBalance(name, points);
	}
	public void addPoints(int p)
	{
		account.addGold(p);
	}
	public BaseDice getDice()
	{
		return dice;
	}
	
}
 