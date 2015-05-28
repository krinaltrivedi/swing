import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.*;

import javax.swing.*;

/**
 * This class is responsible for starting and running the game. It initialises
 * the grid with user specified dimensions. It also initialises the frame; which runs 
 * the game.
 * @author Krinal
 *
 */
public class LifeGame  {
	
	/**
	 * This is the first method called when the program is run
	 * @param args command line arguments by the user
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		int height=Integer.parseInt(args[0]); //height of the grid
		int width=Integer.parseInt(args[1]); //width of the grid

		LifeGrid lg = LifeGrid.getInstance(width, height, "C:/Users/Krinal/My Documents/test.txt");
		LifeFrame lf = LifeFrame.getInstance(lg);
		lf.pack();				
	}


}
