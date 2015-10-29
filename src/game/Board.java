package game;

import java.awt.Color;

import desktop_fields.Field;
import desktop_fields.Tax;
import desktop_resources.GUI;

public class Board {
	private void initializeBoard()
    {
            Field[] fields = new Field[11];
            for (int i = 0; i < fields.length; i++) {
                    Color col;
                    if (i%2 == 0)
                    {
                            col = Color.pink;
                    }
                    else
                    {
                            col = Color.magenta;
                    }
                    Tax t = new Tax.Builder().setBgColor(col).build();
                    fields[i] = t;
            }
            GUI.create(fields);
           
           
    }
	public void startGame()
	{
		initializeBoard();
		GUI.showMessage("Hi");
		//Write logic here!
	}
	public static void main(String[] args) {
		Board board = new Board();
		board.startGame();

	}

}
