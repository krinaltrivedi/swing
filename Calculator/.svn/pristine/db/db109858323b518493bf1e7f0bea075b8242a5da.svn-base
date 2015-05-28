package cs2800;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class CalcController {
	/**
	 * Instance of CalcModel
	 */
	private CalcModel model;
	/**
	 * Instance of CalcView
	 */
	private CalcView view;
	/**
	 * Determines which type of calculator to use; reverse polish
	 * or infix
	 */
	private boolean isInfix;
	/**
	 * Instance of CalcController
	 */
	private static CalcController controller;
	
	/**
	 * Private constructor to create an instance of calcController.
	 * Initialises the view and the model. Adds listeners to the view
	 * @param mod the model to add to the controller
	 * @param myView to add to the controller
	 */
	private CalcController(final CalcModel mod, final CalcView myView) {
		model = mod;
		view = myView;
		view.addCalculateListener(new CalculateListener());
		view.addInfixListener(new InfixListener());
		view.addRevPolListener(new RevPolListener());
	}
	/**
	 * Creates an instance of CalcController if it has not been created.
	 * Returns the instance
	 * @return the instance of CalcController
	 */
	public static CalcController getInstance() {
		if (controller == null) {
			controller = new CalcController(new CalcModel(), 
					CalcView.getInstance());
		}
		return controller;
	}
	/**
	 * Creates a CalcController instance and creates the view.
	 * @param args
	 */
	public static void main(final String[] args) {
			final CalcController cont = CalcController.getInstance();
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						cont.view.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});

	}
	/**
	 * An inner class to implement a listener for the button
	 * @author Krinal
	 *
	 */
	private class CalculateListener implements ActionListener {
		/**
		 * Refreshes the view if an exception has occurred.
		 * Sets the answer in the output text field. If an exception has 
		 * occurred, then it will repaint the text field red.
		 */
		@Override
		public void actionPerformed(final ActionEvent e) {
			String userInput = view.getUserInput();
			try {
				view.refreshView();
				Float answer = model.evaluate(userInput, isInfix);
				//converts float answer to string and sets it.
				view.setAnswer(answer.toString());
				
			} catch (BadException e1) {
				//sets view accordingly to when there is a BadException
				view.setAnswerWhenBadTypeException();
			} catch (InvalidExpression e1) {
				//sets view accordingly to where there is an InvalidExpression
				view.setAnswerWhenInvalidException();
			}
			
			
		}
		
	}
	/**
	 * An inner class to implement the listener for the infix radio button
	 * @author Krinal
	 *
	 */
	private class InfixListener implements ActionListener {
		/**
		 * Sets isInfix to true so that an infix expression can be calculated.
		 */
		@Override
		public void actionPerformed(final ActionEvent e) {
			isInfix = true;
		}
	}
	/**
	 * An inner class to implement the RevPolishCalc radio button listener.
	 * @author Krinal
	 *
	 */
	private class RevPolListener implements ActionListener {
		/**
		 * sets isInfix to fault so that a reverse polish expression
		 * can be calculated
		 */
		@Override
		public void actionPerformed(final ActionEvent e) {
			// TODO Auto-generated method stub
			isInfix = false;
		} 
		
		
	}
	


}
