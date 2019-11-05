import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;

public class Hotelmanage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txt3;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField txt1;
	double num1,num2,b,c;
	double a;
	String op;
	String ans;
	double result;
	JLabel lblNewLabel = new JLabel("");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotelmanage window = new Hotelmanage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hotelmanage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 831, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHotelManagementSystem = new JLabel("Hotel Management Systems");
		lblHotelManagementSystem.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblHotelManagementSystem.setBounds(193, 0, 255, 36);
		frame.getContentPane().add(lblHotelManagementSystem);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 46, 300, 193);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChickenBurger.setBounds(10, 11, 94, 14);
		panel.add(lblChickenBurger);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setBounds(171, 8, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblChickenBurgerMeal = new JLabel("ChicKen Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChickenBurgerMeal.setBounds(10, 42, 122, 14);
		panel.add(lblChickenBurgerMeal);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setBounds(171, 39, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCheeseBurger.setBounds(10, 73, 101, 14);
		panel.add(lblCheeseBurger);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_2.setBounds(171, 70, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 101, 247, 2);
		panel.add(separator);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDrink.setBounds(10, 112, 46, 14);
		panel.add(lblDrink);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT....", "Tea", "Cola", "Coffee", "Pepsi"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setBounds(10, 137, 94, 20);
		panel.add(comboBox);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setBounds(171, 112, 46, 14);
		panel.add(lblQty);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setBounds(171, 137, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnHomeDelivery = new JRadioButton("Home delivery");
		rdbtnHomeDelivery.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnHomeDelivery.setBounds(10, 163, 112, 23);
		panel.add(rdbtnHomeDelivery);
		
		JRadioButton rdbtnTax = new JRadioButton("Tax");
		rdbtnTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnTax.setBounds(171, 164, 109, 23);
		panel.add(rdbtnTax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(320, 46, 223, 193);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCurrencyConverter.setBounds(31, 11, 170, 20);
		panel_1.add(lblCurrencyConverter);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT....", "USD", "EURO", "BPOUND", "SINGAPOORDOLLAR"}));
		comboBox_1.setBounds(31, 42, 170, 20);
		panel_1.add(comboBox_1);
		
		txt3 = new JTextField();
		txt3.setBounds(31, 73, 170, 20);
		panel_1.add(txt3);
		txt3.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double bp=Double.parseDouble(txt3.getText());
				double usd=70.955;
				double eur=78.886;
				double bpound=91.3899;
				double singdolar=52.0904;
				double c1 = 0;
				if(comboBox_1.getSelectedItem().equals("USD"))
				{
					 c1=bp*usd;
					String c=String.format("Rs%.2f",c1);
					lblNewLabel.setText(c);
					textField_9.setText(String.valueOf(c1));

				}
				if(comboBox_1.getSelectedItem().equals("EUR"))
				{
					c1=bp*eur;
					String c=String.format("Rs%.2f",c1);
					lblNewLabel.setText(c);
					textField_9.setText(String.valueOf(c1));

				}                                                           
				
				if(comboBox_1.getSelectedItem().equals("BPOUND"))
				{
					c1=bp*bpound;
					String c=String.format("Rs%.2f",c1);
					lblNewLabel.setText(c);
					textField_9.setText(String.valueOf(c1));

				}
				if(comboBox_1.getSelectedItem().equals("SINGDOLAR"))
				{
					c1=bp*singdolar;
					String c=String.format("Rs%.2f",c1);
					lblNewLabel.setText(c);
					textField_9.setText(String.valueOf(c1));
					

				}
				double tax;
			
				if(rdbtnTax.isSelected())
				{
				
			    	tax=(c1*18)/100;
				String taxamount=String.format("%.2f", tax);
			    textField_8.setText(taxamount);
				
				}
				else
				{
					tax=0;
					 textField_8.setText(String.valueOf(tax));
				}
				
				double x=Double.parseDouble(textField_8.getText());
				double y=c1;
				double z=x+y;
				
				textField_10.setText(String.valueOf(z));
				//double a1=Double.parseDouble(lblNewLabel.getText());
								
				
				
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConvert.setBounds(10, 159, 89, 23);
		panel_1.add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt3.setText(null);
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.setBounds(124, 159, 89, 23);
		panel_1.add(btnClear);
		
		
		lblNewLabel.setBounds(31, 112, 170, 20);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 250, 300, 121);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfDrinks.setBounds(10, 11, 91, 14);
		panel_2.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfMeal.setBounds(10, 50, 91, 14);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfDelivery.setBounds(10, 93, 91, 14);
		panel_2.add(lblCostOfDelivery);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_4.setBounds(176, 8, 86, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_5.setBounds(176, 47, 86, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_6.setBounds(176, 90, 86, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(320, 250, 223, 121);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTax.setBounds(10, 11, 46, 14);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSubTotal.setBounds(10, 48, 76, 14);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(10, 84, 65, 14);
		panel_3.add(lblTotal);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_8.setBounds(127, 8, 86, 20);
		panel_3.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_9.setBounds(127, 45, 86, 20);
		panel_3.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_10.setBounds(127, 81, 86, 20);
		panel_3.add(textField_10);
		textField_10.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(553, 46, 240, 322);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 220, 300);
		panel_4.add(tabbedPane);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblRestaurentManagementSystem = new JLabel("Restaurent Management System:");
		lblRestaurentManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRestaurentManagementSystem.setBounds(10, 11, 195, 24);
		panel_7.add(lblRestaurentManagementSystem);
		
		JLabel lblChickenBueger = new JLabel("Chicken Bueger");
		lblChickenBueger.setBounds(10, 57, 88, 14);
		panel_7.add(lblChickenBueger);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(146, 57, 46, 14);
		panel_7.add(lblNewLabel_1);
		
		JLabel lblChickenBurger_1 = new JLabel("Chicken Burger");
		lblChickenBurger_1.setBounds(10, 107, 88, 14);
		panel_7.add(lblChickenBurger_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(146, 107, 46, 14);
		panel_7.add(lblNewLabel_2);
		
		JLabel lblBaconAndCheese = new JLabel("Bacon and Cheese Burger");
		lblBaconAndCheese.setBounds(10, 151, 124, 14);
		panel_7.add(lblBaconAndCheese);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(146, 151, 46, 14);
		panel_7.add(lblNewLabel_3);
		
		JLabel lblThanksForUsing = new JLabel("Thanks for Using Estimator");
		lblThanksForUsing.setBounds(10, 198, 182, 14);
		panel_7.add(lblThanksForUsing);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_8, null);
		panel_8.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 11, 205, 263);
		panel_8.add(panel_6);
		panel_6.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(10, 11, 189, 38);
		panel_6.add(txt1);
		txt1.setColumns(10);
		
		JButton btnNewButton = new JButton("B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(txt1.getText().length()>0)
				{
				StringBuilder srb=new StringBuilder(txt1.getText());
				srb.deleteCharAt(txt1.getText().length()-1);
				b=srb.toString();
				txt1.setText(b);
				}
			}
		});
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(10, 60, 41, 38);
		panel_6.add(btnNewButton);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnC.setBackground(new Color(224, 255, 255));
		btnC.setBounds(61, 60, 39, 38);
		panel_6.add(btnC);
		
		JButton button_1 = new JButton("...");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBackground(new Color(224, 255, 255));
		button_1.setBounds(110, 60, 41, 38);
		panel_6.add(button_1);
		
		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(txt1.getText());
				txt1.setText("");
				op="+";
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_2.setBackground(new Color(224, 255, 255));
		button_2.setBounds(158, 60, 41, 38);
		panel_6.add(button_2);
		
		JButton button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_3.getText();
				txt1.setText(Number);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setBackground(new Color(224, 255, 255));
		button_3.setBounds(10, 97, 41, 38);
		panel_6.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_4.getText();
				txt1.setText(Number);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setBackground(new Color(224, 255, 255));
		button_4.setBounds(10, 135, 41, 38);
		panel_6.add(button_4);
		
		JButton button_5 = new JButton("1");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_5.getText();
				txt1.setText(Number);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_5.setBackground(new Color(224, 255, 255));
		button_5.setBounds(10, 173, 41, 38);
		panel_6.add(button_5);
		
		JButton button_6 = new JButton("0");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_6.getText();
				txt1.setText(Number);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_6.setBackground(new Color(224, 255, 255));
		button_6.setBounds(10, 210, 41, 38);
		panel_6.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_7.getText();
				txt1.setText(Number);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_7.setBackground(new Color(224, 255, 255));
		button_7.setBounds(61, 97, 41, 38);
		panel_6.add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_8.getText();
				txt1.setText(Number);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_8.setBackground(new Color(224, 255, 255));
		button_8.setBounds(61, 135, 41, 38);
		panel_6.add(button_8);
		
		JButton button_9 = new JButton("2");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_9.getText();
				txt1.setText(Number);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_9.setBackground(new Color(224, 255, 255));
		button_9.setBounds(61, 173, 41, 38);
		panel_6.add(button_9);
		
		JButton button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_10.getText();
				txt1.setText(Number);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_10.setBackground(new Color(224, 255, 255));
		button_10.setBounds(61, 210, 41, 38);
		panel_6.add(button_10);
		
		JButton button_11 = new JButton("9");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_11.getText();
				txt1.setText(Number);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_11.setBackground(new Color(224, 255, 255));
		button_11.setBounds(110, 97, 41, 38);
		panel_6.add(button_11);
		
		JButton button_12 = new JButton("6");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_12.getText();
				txt1.setText(Number);
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_12.setBackground(new Color(224, 255, 255));
		button_12.setBounds(110, 135, 41, 38);
		panel_6.add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_13.getText();
				txt1.setText(Number);
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_13.setBackground(new Color(224, 255, 255));
		button_13.setBounds(110, 173, 41, 38);
		panel_6.add(button_13);
		
		JButton button_14 = new JButton("...");
		button_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_14.setBackground(new Color(224, 255, 255));
		button_14.setBounds(110, 210, 41, 38);
		panel_6.add(button_14);
		
		JButton button_15 = new JButton("-");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
				txt1.setText("");
				op="-";
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_15.setBackground(new Color(224, 255, 255));
		button_15.setBounds(158, 97, 41, 38);
		panel_6.add(button_15);
		
		JButton button_16 = new JButton("*");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
				txt1.setText("");
				op="*";
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_16.setBackground(new Color(224, 255, 255));
		button_16.setBounds(158, 135, 41, 38);
		panel_6.add(button_16);
		
		JButton button_17 = new JButton("/");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
				txt1.setText("");
				op="/";
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_17.setBackground(new Color(224, 255, 255));
		button_17.setBounds(158, 173, 41, 38);
		panel_6.add(button_17);
		
		JButton button_18 = new JButton("=");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2=Double.parseDouble(txt1.getText());
				if(op=="+")
				{
				result=num1+num2;
				ans=String.format("%.2f",result);
				txt1.setText(ans);
				}
				if(op=="-")
				{
				result=num1-num2;
				ans=String.format("%.2f",result);
				txt1.setText(ans);
				}
				if(op=="/")
				{
				result=num1/num2;
				ans=String.format("%.2f",result);
				txt1.setText(ans);
				}
				if(op=="*")
				{
				result=num1*num2;
				ans=String.format("%.2f",result);
				txt1.setText(ans);
				}
				
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_18.setBackground(new Color(224, 255, 255));
		button_18.setBounds(158, 210, 41, 38);
		panel_6.add(button_18);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 398, 762, 56);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pepsi=60;
				double tea=10;
				double cola=60;
				double coffee=20;
				double cb=50;
				double chb=100;
				double cbm=80;
				double hd=50;
				double tax;
				double total;
				String s1=(String) comboBox.getSelectedItem();
				int i=Integer.parseInt(textField_3.getText());
				if(s1.equals("Tea"))
				{
					total = tea*i;
				}
				else if(s1.equals("Cola"))
				{
					total=cola*i;
					
				}
				else if(s1.equals("Coffee"))
				{
					total = coffee*i;
				}
				else if(s1.equals("Pepsi"))
				{
					total=pepsi*i;
					
				}
				else
				{
					total=0;
				}
				String tdrink=String.format("%.2f",total);
				textField_4.setText(tdrink);
				 a=Double.parseDouble(textField.getText());
				 b=Double.parseDouble(textField_1.getText());
				 c=Double.parseDouble(textField_2.getText());
				double totalfood=0;
				totalfood=(cb*a)+(cbm*b)+(chb*c);
				String food=String.format("%.2f",totalfood);
				textField_5.setText(food);
				double gdt;
				
				if(rdbtnHomeDelivery.isSelected())
				{
					textField_6.setText(String.valueOf(hd));
					gdt=totalfood+total+hd;
				}
				else
				{
					gdt=totalfood+total;
				}
				
				/*if(rdbtnTax.isSelected())
				{
				double gdtotal=total+totalfood;
				tax=(gdtotal*18)/100;
				String taxamount=String.format("%.2f", tax);
			    textField_8.setText(taxamount);
				
				}*/
				
				txt3.setText(String.valueOf(gdt));
				/*double a1=Double.parseDouble(lblNewLabel.getText());
				textField_9.setText(String.valueOf(a1));
				
				double x=Double.parseDouble(textField_8.getText());
				double y=Double.parseDouble(textField_9.getText());
				double z=x+y;
				
				textField_10.setText(String.valueOf(z));
				//txt3.setText(String.valueOf(z));*/
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTotal.setBounds(52, 11, 89, 23);
		panel_5.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText(String.valueOf(a));
				lblNewLabel_2.setText(String.valueOf(b));
				lblNewLabel_3.setText(String.valueOf(c));
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReceipt.setBounds(213, 13, 89, 23);
		panel_5.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				rdbtnHomeDelivery.setSelected(false);
				rdbtnTax.setSelected(false);
				comboBox.setName(null);
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(376, 13, 89, 23);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				int confirmed=JOptionPane.showConfirmDialog(null,"Exit","EXIT",JOptionPane.YES_NO_OPTION);
				//if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION==JOptionPane.YES_NO_OPTION))
				if(confirmed==JOptionPane.YES_OPTION)
				{	System.exit(0);
				
				}	
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(553, 15, 89, 23);
		panel_5.add(btnExit);
	}
}
