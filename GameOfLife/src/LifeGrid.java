import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;


/**
 * This class is responsible for implementing the logic of the game. It also stores the contents
 * and generation of the game. The grid is stored as a two dimensional array. The dimensions are 
 * provided via command line arguments. 
 * @author Krinal
 *
 */
public class LifeGrid {
	/**
	 * This field stores the width of the grid
	 */
	private int width;
	/**
	 * This field stores the height of the grid
	 */
	private int height; 
	/**
	 * This field stores the number of generations in the grid
	 */
	private int generation;
	/**
	 * This is the grid which is used to store a local copy of the contents of the grid
	 */
	private int originalG [][];
	/**
	 * A single instance of the LifeGrid object. This is the only object in the program.
	 */
	private static LifeGrid grid;
	
	/**
	 * Private constructor used to initialise the LifeGrid object if it hasn't already been initialised. It creates
	 * the grid with the specified dimensions.
	 * @param height - the height of the grid
	 * @param width - the width of the grid
	 * @param filepath - the path from where to load the pattern, which determines the contents on the grid
	 * @throws FileNotFoundException if file cannot be found at specified path
	 */
	private LifeGrid(int height, int width, String filepath) throws FileNotFoundException {
		this.height = height;
		this.width = width;
		
		
		originalG = new int[height][width];
		
		File file = new File(filepath);
		Scanner scanner = new Scanner(file);
		
		for (int row =0; scanner.hasNextLine(); row++) {
			String string = scanner.nextLine();
			
			for(int column=0; column<originalG[row].length; column++) {
				if(string.charAt(column) == '*') {
					originalG[row][column] = 1;
				} else {
					originalG[row][column] = 0;
				}
				
			}
		}
		scanner.close();		
	}
	
	/**
	 * This method will create the single instance of LifeGrid if it hasn't been created. Otherwise it will
	 * create it, and then return the newly created object.
	 * @param width - the width of the grid that is to be initialised
	 * @param height - the height of the grid that is to be initialised
	 * @param filepath - the file path from which pattern is to be loaded
	 * @return instance of LifeGrid
	 * @throws FileNotFoundException if pattern of file cannot be found
	 */
	public static LifeGrid getInstance(int width, int height, String filepath) throws FileNotFoundException {
		if(grid == null) {
			grid = new LifeGrid(width, height, filepath);
		}
		
		return grid;
	}
	
	/**
	 * This method will print the contents of the grid, and the current generation.
	 */
	public void show() {
		
		for(int i = 0; i<originalG.length; i++) {
			for(int j=0; j<originalG[i].length; j++) {
				System.out.print(originalG[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("Generation: " + generation);
		
	}
	
	/**
	 * Returns the width of the grid
	 * @return width of grid
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Returns the grid
	 * @return the grid
	 */
	public int [][] getGrid() {
		return originalG;
	}
	
	/**
	 * Returns the height of the grid
	 * @return height of grid
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Returns the current generation
	 * @return generation
	 */
	public int getGeneration() {
		return generation;
	}
	
	/**
	 * Returns the contents on the grid at the specified co-ordinates
	 * @param x the x co-ordinate of the element to retrieve
	 * @param y the y co-ordinate of the element to retrieve
	 * @return the contents at the co-ordinates
	 */
	public int getContents(int x, int y) {
		return originalG[x][y];
	}
	
	/**
	 * Counts and returns the number of neighbours at the specified co-ordinates
	 * @param x the x co-ordinate of the position that we want to count the neighbours
	 * @param y the y co-ordinate of the position that we want to count the neighbours
	 * @return the total number of neighbours at the specified position
	 */
	public int neighbours(int x, int y) {
		int neighbour=0;
		
		//executes if there is a 1 in middle of grid
		if(x<getHeight() && x>=1 && y<getWidth() && y>=1) {
			if(originalG[x][y+1] ==1) {
				neighbour++;
			}
			if(originalG[x][y-1] ==1) {
				neighbour++;
			}
			
			if(originalG[x-1][y] ==1) {
				neighbour++;
			}
			
			if(originalG[x+1][y] ==1) {
				neighbour++;
			}
			
			if(originalG[x-1][y+1] ==1) {
				neighbour++;
			}
			
			if(originalG[x-1][y-1] ==1) {
				neighbour++;
			}
			
			if(originalG[x+1][y-1] ==1) {
				neighbour++;
			}
			
			if(originalG[x+1][y+1] ==1) {
				neighbour++;
			}
			
		}	
		//executes if there is 1 top left corner
		else if(x==0 && y==0) {
			if(originalG[x][y+1] ==1) {
				neighbour++;
			}
					
			if(originalG[x+1][y] == 1) {
				neighbour++;
			}
					
					
			if(originalG[x+1][y+1] ==1) {
				neighbour++;
			}
		}
				
		//executes if there is a 1 in bottom left corner
		else if(x==getHeight()-1 && x>0 && y==0) {
			if(originalG[x-1][y] ==1) {
				neighbour++;
			}
					
			if(originalG[x][y+1] ==1) {
				neighbour++;
			}
					

			if(originalG[x-1][y+1] ==1) {
				neighbour++;
			}
		}
		
		//executes if there is a 1 top right corner
		else if(x==0 && y==getWidth()-1 && y>0) {
			if(originalG[x][y-1] ==1) {
				neighbour++;
			}
					
			if(originalG[x+1][y] == 1) {
				neighbour++;
			}
					
			if(originalG[x+1][y-1] ==1) {
				neighbour++;
			}
		}
				
		//executes if there is a 1 bottom right corner
		else if(x==getHeight()-1 && x>0 && y==getWidth()-1 && y>0) {
			if(originalG[x-1][y] ==1) {
				neighbour++;
			}
					
			if(originalG[x][y-1] ==1) {
				neighbour++;
			}
					
			if(originalG[x-1][y-1] ==1) {
				neighbour++;
			}
		}	

		//executes if there are 1s top horizontal line
		else if(x==0 && y<getWidth() && y>=1)
		{
			if(originalG[x+1][y-1] ==1) {
				neighbour++;
			}
			
			if(originalG[x+1][y+1] ==1) {
				neighbour++;
			}
			
			if(originalG[x+1][y] ==1) {
				neighbour++;
			}
			
			if(originalG[x][y-1] ==1) {
				neighbour++;
			}
			
			if(originalG[x][y+1] ==1) {
				neighbour++;
			}
		}

		//executes if there is a 1 bottom horizontal line
		else if(x==getHeight()-1 && y<getWidth() && y>0){
			if(originalG[x-1][y+1] ==1) {
				neighbour++;
			}
					
			if(originalG[x-1][y-1] ==1) {
				neighbour++;
			}
					
			if(originalG[x-1][y] ==1) {
				neighbour++;
			}
					
			if(originalG[x][y+1] ==1) {
				neighbour++;
			}
					
			if(originalG[x][y-1] ==1) {
				neighbour++;
			}
		}
		
		//executes if any right vertical line has 1
		else if(x<getHeight() && x>0 && y ==getWidth()-1) {
			if(originalG[x-1][y] ==1) {
				neighbour++;
			}
			
			if(originalG[x+1][y] ==1) {
				neighbour++;
			}
			
			if(originalG[x-1][y-1] ==1) {
				neighbour++;
			}
					
			if(originalG[x+1][y-1] ==1) {
				neighbour++;
			}
					
			if(originalG[x][y-1] ==1) {
				neighbour++;
			}
					
		}
		
		//executes if any left vertical line has 1
		else if(x<getHeight() && x>0 && y==0) {
			if(originalG[x-1][y] ==1) {
				neighbour++;
			}
					
			if(originalG[x+1][y] ==1) {
				neighbour++;
			}
					
			if(originalG[x][y+1] ==1) {
				neighbour++;
			}
					
			if(originalG[x-1][y+1] ==1) {
				neighbour++;
			}
					
			if(originalG[x+1][y+1] ==1) {
				neighbour++;
			}
		}
		
		return neighbour;
	}
	
	/**
	 * This method implements the logic of the game. It goes through each cell in the grid, and checks if the 
	 * cell is either 0	or 1. If the cell as a 0 and it has three neighbours, then the cell on the new grid 
	 * has a 1.If the cell has a 0 and it has 0 neighbours, then the position on the new grid has a 0. If 
	 * the cell has a 1, and it has 1 or less neighbours, or if the grid has a 1 and it has more than 4 neighbours,
	 * then the position on the new grid has a 0. Finally, if the cell has a 1 and has 2 neighbours or the cell has 
	 * a 1 and it has three neighbours, then the position on the new grid is 1. After this the generation is 
	 * incremented, and the new array and the old array are swapped, via a third array called swap. A text version
	 * of the grid and the current generation can be shown via the show() method.
	 */
	public void run() {
		
		int [][] newG = new int [height][width];
		for (int i =0; i<originalG.length-1; i++) {
			for(int j=0; j<originalG[i].length-1; j++) {
				
				if(originalG[i][j] == 0 && neighbours(i ,j) == 3) {
					newG[i][j] = 1;
				} else if (originalG[i][j] ==0 && neighbours(i,j)==0) {
					newG[i][j]=0;
				} else if((originalG[i][j] == 1 && neighbours(i,j)<=1)||originalG[i][j]==1 && neighbours(i,j)>=4) {
					newG[i][j] = 0;
				} else if((originalG[i][j] == 1 && neighbours(i, j) == 2)||originalG[i][j] == 1 && neighbours(i, j) == 3) {
					newG[i][j] = 1;
				}
			}
		}
		generation++;
		
		int swap[][];
		swap = originalG;
		originalG = newG;
		newG = swap;
		
		show();
		
	}
}
