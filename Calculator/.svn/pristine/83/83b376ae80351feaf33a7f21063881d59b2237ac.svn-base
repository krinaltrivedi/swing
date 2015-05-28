package cs2800;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JRadioButton;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.SystemColor;
import java.awt.event.ActionListener;

public final class CalcView extends JFrame {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Panel to hold components
	 */
	private JPanel contentPane;
	/**
	 * Input textfield for user input
	 */
	private JTextField input;
	/**
	 * Output textfield to present results
	 */
	private JTextField output;
	/**
	 * Calculate button to calculate expression
	 */
	private JButton calculateButton;
	/**
	 * Standard calculator radio button
	 */
	private JRadioButton rdbtnStandard;
	/**
	 * Reverse polish calculator radio button
	 */
	private JRadioButton rdbtnReversePolish;
	/**
	 * Button group to store radio buttons
	 */
	private ButtonGroup group;
	/**
	 * static field to maintain singleton pattern
	 */
	private static CalcView myView;
	/**
	 * Font size of title in frame
	 */
	private static final int FONT_SIZE = 18;
	/**
	 * Border dimensions
	 */
	private static final int BORDER = 5;
	/**
	 * Length of text field box
	 */
	private static final int TEXT_FIELD_SIZE = 10;
	/**
	 * Starting X co-ordinate of component 
	 */
	private static final int X_COORDINATE = 100;
	/**
	 * Starting Y co-ordinate of component
	 */
	private static final int Y_COORDINATE = 100;
	/**
	 * Width of component
	 */
	private static final int WIDTH = 450;
	/**
	 * Height of component
	 */
	private static final int HEIGHT = 233;


	/**
	 * Create the frame.
	 */
	private CalcView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(X_COORDINATE, Y_COORDINATE, WIDTH, HEIGHT);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(BORDER, BORDER, BORDER, BORDER));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][][]", 
				"[][][][][][]"));
		
		JLabel lblCalculator = new JLabel("Calculator");
		lblCalculator.setFont(new Font("Tahoma", Font.BOLD, FONT_SIZE));
		contentPane.add(lblCalculator, "cell 0 0 5 1,alignx center");
		
		rdbtnReversePolish = new JRadioButton("Reverse Polish");
		rdbtnReversePolish.setBackground(SystemColor.activeCaptionBorder);
		contentPane.add(rdbtnReversePolish, "cell 1 1");
		
		rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setBackground(SystemColor.activeCaptionBorder);
		contentPane.add(rdbtnStandard, "cell 2 1");
		group = new ButtonGroup();
		
		group.add(rdbtnReversePolish);
		group.add(rdbtnStandard);
		JLabel lblInput = new JLabel("Input");
		contentPane.add(lblInput, "cell 1 3,alignx trailing");
		
		input = new JTextField();
		contentPane.add(input, "cell 2 3 3 1,growx");
		input.setColumns(TEXT_FIELD_SIZE);
		
		JLabel lblOutput = new JLabel("Output");
		contentPane.add(lblOutput, "cell 1 4,alignx trailing");
		
		output = new JTextField();
		output.setBackground(SystemColor.menu);
		output.setEditable(false);
		contentPane.add(output, "cell 2 4 3 1,growx");
		output.setColumns(TEXT_FIELD_SIZE);
		
		calculateButton = new JButton("Calculate");
		contentPane.add(calculateButton, "cell 4 5");
	}
	/**
	 * Returns the instance created of calcView or constructs it
	 * @return an instance of CalcView
	 */
	public static CalcView getInstance() {
		if (myView == null) {
			myView = new CalcView();
		}
		return myView;
	}
	/**
	 * Adds listener to the calculateButton
	 * @param calc the listener to add
	 */
	public void addCalculateListener(final ActionListener calc) {
		calculateButton.addActionListener(calc);
	}
	/**
	 * Adds listener to the infix radio button
	 * @param infix the listener to add to the radio button
	 */
	public void addInfixListener(final ActionListener infix) {
		rdbtnStandard.addActionListener(infix);
	}
	/**
	 * Adds listener to the reverse polish listener
	 * @param revPol the listener to add to the radio button
	 */
	public void addRevPolListener(final ActionListener revPol) {
		rdbtnReversePolish.addActionListener(revPol);
	}
	/**
	 * Returns the expression inserted by the user
	 * @return
	 */
	public String getUserInput() {
		return input.getText();
	}
	/**
	 * Sets the output text field to the result of the expression.
	 * Refreshes output text field from any exception that may have 
	 * occurred
	 * @param newTotal the result of the calculation
	 */
	public void setAnswer(final String newTotal) {
		output.setText(newTotal);
	}
	/**
	 * Writes Undefined Expression in output text field when expression
	 * is of bad type. Colour of output text field is changed to red.
	 */
	public void setAnswerWhenBadTypeException() { 
		setAnswer("Undefined Expression");
		output.setBackground(Color.RED);
	}
	/**
	 * Writes Invalid Expression in output text field when expression is
	 * invalid. Colour of output text field is changed to red.
	 */
	public void setAnswerWhenInvalidException() { 
		setAnswer("Invalid Expression");
		output.setBackground(Color.RED);
	}
	/**
	 * Resets the background of the output text field after exception has 
	 * occurred.
	 */
	public void refreshView() {
		output.setBackground(SystemColor.menu);
	}
	
	

}
