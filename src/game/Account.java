package game;

public class Account {

	private int gold;

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public void addGold(int gold){
		gold += this.gold;
	}
}
