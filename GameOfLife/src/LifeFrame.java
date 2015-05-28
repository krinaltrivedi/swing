import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Random;

import javax.swing.*;
/**
 * This class is responsible for the contents on the frame, including the buttons and listeners of the 
 * buttons. It contains an inner class which defines what the button should do when clicked. The grid
 * is painted based on the contents of the grid, which is in LifeGrid.
 * @author Krinal
 *
 */
public class LifeFrame extends JFrame {
	/**
	 * A label which shows the current generation of the game
	 */
	private JLabel generation = new JLabel("Generation: ");
	/**
	 * A button with "Start" as the text
	 */
	private JButton start = new JButton("Start");
	/**
	 * A button with "Stop" as the text
	 */
	private JButton stop = new JButton("Stop");
	/**
	 * A Button with "Randomise" as the text.
	 */
	private JButton randomise = new JButton("Randomise");
	/**
	 * A single instance of this class is stored in this field
	 */
	private static LifeFrame frame;
	/**
	 * The LifeGrid object determines the contents to be printed on the frame
	 */
	private LifeGrid lg;
	
	/**
	 * The size of each square, which represents a cell in the grid will be 10 pixels when painted
	 */
	private static final int SQUARE_SIZE = 10;
	
	/**
	 * A private constructor which will initialise the frame. It will set the frame to 600x600 pixels, initialise
	 * the LifeGrid object, set the title of the frame, and add the buttons on the bottom of the grid. The listeners
	 * of the buttons will also be set.
	 * @param lg the lifegrid object which will be used to paint the frame.
	 * @throws FileNotFoundException if filepath is invalid when trying to load pattern.
	 */
	private LifeFrame(LifeGrid lg) throws FileNotFoundException {
		this.lg = lg;
		LifeListener listener = new LifeListener();
		setTitle("Conway's Game of life");
		setSize(600, 600);
		
		//add listeners to buttons
		start.addActionListener(listener);
		stop.addActionListener(listener);
		randomise.addActionListener(listener);
		
		LifeComponent lc = new LifeComponent(SQUARE_SIZE, lg);
		
		//add buttons and label to container
		Container container = new Container();
		container.setLayout(new GridLayout(1, 3));
		container.add(start);
		container.add(stop);
		container.add(randomise);
		container.add(generation);
		add(lc);
		lg.show();
		
		//add container to bottom of the frame.
		add(container, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/**
	 * This method is called when a LifeFrame object is required. If the single instance is not
	 * initialised, then it will initialise it. It then returns the instance of LifeFrame.
	 * @param lg the LifeGrid object that will be used to paint the frame
	 * @return the single instance of LifeFrame.
	 * @throws FileNotFoundException if filepath of pattern is invalid
	 */
	public static LifeFrame getInstance(LifeGrid lg) throws FileNotFoundException {
		if(frame == null) {
			frame = new LifeFrame(lg);
		}
		
		return frame;
	}
	
	/**
	 * This class is used to define the actions to be performed when a button is clicked. It also
	 * contains a Timer object which allows the code to be executed by itself.
	 * @author Krinal
	 *
	 */
	private class LifeListener implements ActionListener {
		/**
		 * The Timer object is used to execute the code by itself every 500 milliseconds
		 */
		private Timer timer = new Timer(500, this);
		
		/**
		 * This method will be executed when a button is clicked. If the start button is pressed, 
		 * then the game is executed. If the stop button is pressed, then the timer is stopped. 
		 * If randomise is pressed, then the grid is filled randomly, and the game is executed.
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			//if start button is pressed
			if(!e.getSource().equals(stop) && !e.getSource().equals(randomise)) { 
				lg.run();
			    frame.repaint();  
			    generation.setText("generation: " + lg.getGeneration());
			    timer.start();
			}
			
			//if stop button is pressed
			if(e.getSource().equals(stop)) {
				timer.stop();
			}
			
			//if randomise button is pressed
			if(e.getSource().equals(randomise)) {
				System.out.println("true");
				Random r = new Random();
				
				//goes through each cell in the grid and selects a random x and random y co-ordinate.
				//if specified co-ordinates have a 0, then set it to 1.
				for(int i =0; i<lg.getGrid().length; i++) {
					for(int j=0; j<lg.getGrid()[i].length; j++) {
						int randX = r.nextInt(lg.getGrid().length);
						int randY =r.nextInt(lg.getGrid()[i].length);
						
						if(lg.getGrid()[randX][randY]==0) {
							lg.getGrid()[randX][randY]=1;
						}
						
					}
				}
				repaint();
			} 
		}
		
	}
}
