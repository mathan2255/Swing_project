import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Ticketbooking {

	private JFrame frame;
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField7;
	private JTextField textField8;
	private JTextField textField9;
	private JTextField textField10;
	private JTextField textField11;
	private JTextField textField12;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTable table;
	private JTable table_1;
	JComboBox comboBox_2 = new JComboBox();
	double standerd=100;
	double ac=200;
	double sleeper=100;
	double firstclass=100;
	double adult=100;
	double child=10;
	double tax=2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticketbooking window = new Ticketbooking();
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
	public Ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(220, 220, 220));
		frame.setBounds(100, 100, 738, 644);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(140, 21, 372, 61);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTicketBooking.setBounds(69, 11, 222, 39);
		panel.add(lblTicketBooking);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(379, 93, 333, 321);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblName.setBounds(34, 31, 46, 14);
		panel_1.add(lblName);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblFrom.setBounds(34, 86, 46, 14);
		panel_1.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTo.setBounds(34, 142, 46, 14);
		panel_1.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblDate.setBounds(34, 206, 46, 14);
		panel_1.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTime.setBounds(34, 265, 46, 14);
		panel_1.add(lblTime);
		
		textField5 = new JTextField();
		textField5.setBounds(104, 28, 86, 20);
		panel_1.add(textField5);
		textField5.setColumns(10);
		
		textField6 = new JTextField();
		textField6.setBounds(104, 86, 86, 20);
		panel_1.add(textField6);
		textField6.setColumns(10);
		
		textField7 = new JTextField();
		textField7.setBounds(104, 139, 86, 20);
		panel_1.add(textField7);
		textField7.setColumns(10);
		
		textField8 = new JTextField();
		textField8.setBounds(104, 203, 86, 20);
		panel_1.add(textField8);
		textField8.setColumns(10);
		
		textField9 = new JTextField();
		textField9.setBounds(104, 262, 86, 20);
		panel_1.add(textField9);
		textField9.setColumns(10);
		
		textField10 = new JTextField();
		textField10.setBounds(237, 139, 86, 20);
		panel_1.add(textField10);
		textField10.setColumns(10);
		
		textField11 = new JTextField();
		textField11.setBounds(237, 200, 86, 20);
		panel_1.add(textField11);
		textField11.setColumns(10);
		
		textField12 = new JTextField();
		textField12.setBounds(237, 262, 86, 20);
		panel_1.add(textField12);
		textField12.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTicketNo.setBounds(249, 109, 61, 14);
		panel_1.add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblPrice.setBounds(249, 175, 74, 14);
		panel_1.add(lblPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblRoute.setBounds(249, 237, 61, 14);
		panel_1.add(lblRoute);
		
		JComboBox comboBox = new JComboBox();
		JRadioButton rdbtnReturnTicket = new JRadioButton("AC");
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 Calendar timer=Calendar.getInstance();
	                timer.getTime();
	                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
	               textField9.setText(tTime.format(timer.getTime()));
	                //Date
	                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
	                textField8.setText(tdate.format(timer.getTime()));
				 DefaultTableModel model=( DefaultTableModel) table_1.getModel();
				 String v;
				 if(rdbtnReturnTicket.isSelected())
				 {
					 v="AC";
				 }
				 else
				 {
					 v="nonAC";
				 }
				 model.addRow(new String[] {
						 
						     textField5.getText(),//1
						     textField10.getText(),//2
							
							textField6.getText(),//3
							
							textField7.getText(),//4
						  (String) comboBox_2.getSelectedItem(),
						
							textField9.getText(),
							textField8.getText(),
						    v,
							textField4.getText(),
							
							
						 
				 });
				
			}
		});
		btnConfirm.setBounds(151, 287, 89, 23);
		panel_1.add(btnConfirm);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblName_1.setBounds(24, 114, 46, 14);
		frame.getContentPane().add(lblName_1);
		
		textField1 = new JTextField();
		textField1.setBounds(152, 111, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(10, 142, 358, 2);
		frame.getContentPane().add(separator);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnStandard.setBounds(24, 165, 109, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnSingleTicket.setBounds(140, 165, 109, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnAdult.setBounds(259, 165, 109, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnFirstClass.setBounds(24, 219, 86, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnReturnTicket.setBounds(112, 219, 76, 23);
		frame.getContentPane().add(rdbtnReturnTicket);
		JRadioButton rbtnsleeper = new JRadioButton("Sleeper");
		rbtnsleeper.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rbtnsleeper.setBounds(193, 219, 76, 23);
		frame.getContentPane().add(rbtnsleeper);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnChild.setBounds(271, 219, 86, 23);
		frame.getContentPane().add(rdbtnChild);
		
	
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"From", "Kerala", "TamilNadu", "Karnataka", "Andhra Predesh"}));
		comboBox.setBounds(24, 268, 86, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"To", "Kerala", "Tamil Nadu", "Karnataka", "Andhra"}));
		comboBox_1.setBounds(140, 268, 86, 20);
		frame.getContentPane().add(comboBox_1);
		
		
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox_2.setBounds(259, 268, 86, 20);
		frame.getContentPane().add(comboBox_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setBounds(10, 309, 358, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTax.setBounds(24, 336, 46, 14);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSubTotal.setBounds(24, 361, 76, 14);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(24, 386, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		textField2 = new JTextField();
		textField2.setBounds(110, 333, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(110, 358, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setBounds(110, 383, 86, 20);
		frame.getContentPane().add(textField4);
		textField4.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 0, 0));
		separator_2.setBounds(10, 408, 358, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(new Color(0, 0, 0));
		separator_3.setBounds(368, 142, 1, 272);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(new Color(0, 0, 0));
		separator_4.setBounds(368, 142, 1, 303);
		frame.getContentPane().add(separator_4);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField1.getText();
				String s3=textField4.getText();
				textField11.setText(s3);
				String a="",b="";
				textField5.setText(s);
				String s1= (String) comboBox.getSelectedItem();
				String s2=(String) comboBox_1.getSelectedItem();
				if(s1.equals("Kerala"))
					a="kerala";
				if(s1.equals("TamilNadu"))
					a="tamilnadu";
				if(s1.equals("karnataka"))
					a="karnataka";
				if(s1.equals("Andhra Predesh"))
					a="Andhra";
				if(s2.equals("Kerala"))
					b="keral";
				if(s2.equals("Tamil Nadu"))
					b="tamilnadu";
				if(s2.equals("karnataka"))
					b="karnataka";
				if(s2.equals("Andhra"))
					b="Andhra";
					
				textField6.setText(a);
				textField7.setText(b);
				
				
				Calendar timer=Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
               textField9.setText(tTime.format(timer.getTime()));
                //Date
                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
                textField8.setText(tdate.format(timer.getTime()));
				
				
				int num1;
				String q1="";
				num1=1326+(int)(Math.random()*4238);
				q1+=num1+1325;
				textField10.setText(q1);
				
				textField12.setText(a+b);
				
				
				
				
				
				
			  double total=0;
				int i=Integer.parseInt((String) comboBox_2.getSelectedItem());
				if(rdbtnReturnTicket.isSelected())
				{tax=tax+200;
					if(rbtnsleeper.isSelected())
					{
				      if(rdbtnSingleTicket.isSelected())
				         {
					
					   total=tax+(3400*i);
				        }
				      else
			        	{
					    total=4000*i;
				         }}
					if(rdbtnStandard.isSelected()&&rdbtnSingleTicket.isSelected())
					{
						total=3200*i;
					}
					else
					{
						total=3800*i;
					}
						
				     }
				      else if(rbtnsleeper.isSelected()&&rdbtnSingleTicket.isSelected())
				      { tax=tax+100;
				    	 total=(tax+3000)*i; 
				      }
				      else if(rbtnsleeper.isSelected())
				      {tax=tax+100;
				    	 total=(tax+3400)*i;
				    	 
				      }
				    	 
				      
				
						
				   
				    
				      
			/*	if(rdbtnSingleTicket.isSelected()==true&&rbtnsleeper.isSelected()==true)
				{
					total=3000*i;
					
				}
				else
				{
					total=3400*i;
					
				}
				if(rdbtnStandard.isSelected()==true&&rdbtnReturnTicket.isSelected()==true&&rdbtnSingleTicket.isSelected()==true)
				{
					total=3200*i;
				}
				else
				{
					total=3800*i;
				}
				if(rdbtnReturnTicket.isSelected()==true&&rdbtnSingleTicket.isSelected()==true)
				{
					total=2800*i;
				}
				else
				{
					total=3200*i;
				}*/
				String t1=String.format("%.2f",total);
	            textField3.setText(t1);
	            String tax1=String.format("%.2f",tax);
				textField2.setText(tax1);
				double gt1=total+tax;
				String gt=String.format("%.2f",gt1);
				textField4.setText(gt);
				textField11.setText(gt);
				
				
				
			}
		});
		btnTotal.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTotal.setBackground(new Color(211, 211, 211));
		btnTotal.setBounds(10, 421, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(null);
				textField1.setText(null);
				textField2.setText(null);
				textField3.setText(null);
				textField4.setText(null);
				textField5.setText(null);
				textField6.setText(null);
				textField7.setText(null);
				textField8.setText(null);
				textField9.setText(null);
				textField10.setText(null);
				textField11.setText(null);
				textField12.setText(null);
				comboBox.setName(null);
				comboBox_1.setName(null);
				comboBox_2.setName(null);
				rdbtnStandard.setSelected(false);
				rdbtnSingleTicket.setSelected(false);
				rdbtnAdult.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				rdbtnChild.setSelected(false);
				rbtnsleeper.setSelected(false);
				
				
			}
		});
		btnReset.setBackground(new Color(211, 211, 211));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnReset.setBounds(140, 422, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				int confirmed=JOptionPane.showConfirmDialog(null,"Exit","EXIT",JOptionPane.YES_NO_OPTION);
				
				if(confirmed==JOptionPane.YES_OPTION)
				{	
					System.exit(0);
				
				}
			}
		});
		btnExit.setBackground(new Color(211, 211, 211));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnExit.setBounds(256, 422, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 255));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 255)));
		panel_2.setBounds(10, 456, 702, 81);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBounds(351, 5, 0, 0);
		panel_2.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(10, 5, 682, 65);
		panel_2.add(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No_of_Seats", "Time", "Date", "AC/nonAC", "Price"},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Name", "Booking No", "From", "To", "No_of_Seats", "Time", "Date", "AC/nonAC", "Price"
			}
		));
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(379, 142, 1, 2);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(379, 142, 1, 2);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBackground(new Color(0, 0, 0));
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(368, 142, 1, 272);
		frame.getContentPane().add(separator_7);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
	             try
	              {
	                  int rownum = table.getSelectedRow();
	                  model.removeRow(rownum);
	              }
	              catch(Exception msg)
	              {
	                  JOptionPane.showMessageDialog(null,"Please choose the particular row");
	              }
			

			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDelete.setForeground(Color.DARK_GRAY);
		btnDelete.setBackground(Color.RED);
		btnDelete.setBounds(140, 548, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPrint.setBackground(Color.GREEN);
		btnPrint.setBounds(379, 548, 89, 23);
		frame.getContentPane().add(btnPrint);
		
		
	}
}
