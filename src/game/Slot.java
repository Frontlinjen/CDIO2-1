package game;

import java.util.ResourceBundle;

public class Slot {

	private int value;
	private String name;
	private String description;
	
	public Slot(){
		value = 0;
		name = "";
		description = "";
	}

	public int getValue() {
		return value;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
	
}
