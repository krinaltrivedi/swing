import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.*;


/**
 * This class is responsible for painting the component by calling the paintComponent() method. 
 * @author Krinal
 *
 */
public class LifeComponent extends JComponent {
	/**
	 * The size of each square in pixels
	 */
	private int squareSize;
	/**
	 * The LifeGrid object which is used to paint the component
	 */
	private LifeGrid lg;
	
	/**
	 * Initialises the squareSize and LifeGrid fields
	 * @param squareSize the size of each square
	 * @param lg the LifeGrid object that determines which component gets painted.
	 * @throws FileNotFoundException if filepath of pattern is invalid
	 */
	public LifeComponent(int squareSize, LifeGrid lg) throws FileNotFoundException {
		this.squareSize=squareSize;
		this.lg=lg;
		
	}
	
	/**
	 * This method will go through each element in the grid and paint the component red if the cell has
	 * a 1 in it.
	 */
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for(int column=0; column<lg.getWidth(); column++) {
			for(int row=0; row<lg.getHeight(); row++) {
				if(lg.getGrid()[column][row] == 1) {
					g.setColor(Color.RED);
					g.fillRect(row * squareSize,column * squareSize, squareSize, squareSize);
				}
			}
		}
	}
	
}
