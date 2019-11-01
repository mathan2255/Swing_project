import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Studentreport {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table;
	private JTable table_1;
	JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentreport window = new Studentreport();
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
	public Studentreport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Student Report");
		frame.getContentPane().setBackground(new Color(0, 0, 255));
		frame.setBackground(new Color(0, 0, 255));
		frame.setBounds(100, 100, 698, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 390, 284);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setBounds(6, 38, 58, 14);
		panel.add(lblStudentid);
		
		textField = new JTextField();
		textField.setBounds(86, 35, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Firstname");
		lblNewLabel.setBounds(6, 69, 62, 14);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 66, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(6, 103, 46, 14);
		panel.add(lblSurname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(86, 100, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setBounds(6, 134, 71, 14);
		panel.add(lblCourseCode);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setBounds(6, 189, 62, 14);
		panel.add(lblTotalScore);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setBounds(6, 225, 58, 14);
		panel.add(lblAverage);
		
		textField_4 = new JTextField();
		textField_4.setBounds(86, 186, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(86, 222, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setBounds(6, 255, 46, 14);
		panel.add(lblRanking);
		
		textField_6 = new JTextField();
		textField_6.setBounds(86, 252, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setBounds(204, 38, 46, 14);
		panel.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setBounds(204, 69, 46, 14);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setBounds(204, 103, 46, 14);
		panel.add(lblBiology);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setBounds(204, 134, 62, 14);
		panel.add(lblComputer);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setBounds(204, 159, 62, 14);
		panel.add(lblChemistry);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setBounds(204, 200, 46, 14);
		panel.add(lblPhysics);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setBounds(208, 225, 58, 14);
		panel.add(lblTamil);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setBounds(204, 252, 59, 14);
		panel.add(lblMalayalam);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"19101A", "19102B", "19103C", "19104D", "19105E"}));
		comboBox.setBounds(86, 131, 86, 20);
		panel.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
				public void keyTyped(java.awt.event.KeyEvent evt) {
	                char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                
	            }
				
			}
		});
		textField_3.setBounds(290, 35, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_7.setBounds(290, 66, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_8.setBounds(290, 100, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_9.setBounds(290, 131, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_10.setBounds(290, 160, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_11.setBounds(290, 191, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_12.setBounds(290, 222, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_13.setBounds(290, 252, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 166, 76, 14);
		panel.add(separator);
		
		JButton btnAddReport = new JButton("Add Report");
		btnAddReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double r[]=new double[15];
				r[0]=Double.parseDouble(textField_3.getText());
				r[1]=Double.parseDouble(textField_7.getText());
				r[2]=Double.parseDouble(textField_8.getText());
						r[3]=Double.parseDouble(textField_9.getText());
						r[4]=Double.parseDouble(textField_10.getText());
						r[5]=Double.parseDouble(textField_11.getText());
						r[6]=Double.parseDouble(textField_12.getText());
						r[7]=Double.parseDouble(textField_13.getText());
						
				
				r[8]=(r[0]+r[1]+r[2]+r[3]+r[4]+r[5]+r[6]+r[7]);
				r[9]=r[8]/8;
				String t=String.format("%.2f",r[8]);
				String a=String.format("%.2f",r[9]);
				textField_4.setText(t);
				textField_5.setText(a);
				if(r[8]<800&&r[8]>700)
				{
				textField_6.setText("1");
				}
				if(r[8]<700&&r[8]>600)
				{
				textField_6.setText("2");
				}
				if(r[8]<600&&r[8]>500)
				{
				textField_6.setText("3");
				}
				if(r[8]<500&&r[8]>400)
				{
				textField_6.setText("4");
				}
				if(r[8]<400&&r[8]>300)
				{
				textField_6.setText("5");
				}
				
				 DefaultTableModel model=( DefaultTableModel) table_1.getModel();
				 model.addRow(new String[] {
						     textField.getText(),
						     (String) comboBox.getSelectedItem(),
							
							textField_3.getText(),
							
							textField_7.getText(),
							textField_8.getText(),
							textField_9.getText(),
							textField_10.getText(),
							textField_11.getText(),
							textField_12.getText(),
							textField_13.getText(),
							textField_4.getText(),
							textField_5.getText(),
							textField_6.getText()
							
						 
				 });
				
				
			}
			
		});
		btnAddReport.setForeground(Color.GREEN);
		btnAddReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddReport.setBounds(23, 401, 89, 23);
		frame.getContentPane().add(btnAddReport);
		
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
				/*if(table_1.getSelectedRow()!=0)
				{
					 DefaultTableModel model=( DefaultTableModel) table_1.getModel();
				model.removeRow(table.getSelectedRow());	
				}*/

			}
		});
		btnDelete.setForeground(Color.RED);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setBounds(170, 401, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnShowReport = new JButton("Show Report");
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Record\n"
						+"Student Name: \t\t"+textField_1.getText()+" "+textField_2.getText()
								+ "==============================================\n"
								+"\nMath: \t\t"+textField_3.getText()
								+"\nEnglish: \t\t"+textField_7.getText()
								+"\nBiology: \t\t"+textField_8.getText()
								+"\nComputer: \t\t"+textField_9.getText()
								+"\nChemistry: \t\t"+textField_10.getText()
								+"\nPhysics: \t\t"+textField_11.getText()
								+"\nTamil: \t\t"+textField_12.getText()
								+"\nMalayalam: \t\t"+textField_13.getText()
								+"\n=============================================\n"
								+"\nTotal Score: \t\t"+textField_4.getText()
								+"\nAverage: \t\t"+textField_5.getText()
								+"\nRank: \t\t"+textField_6.getText()+"\n");
				
			}
		});
		btnShowReport.setForeground(new Color(0, 0, 255));
		btnShowReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnShowReport.setBounds(311, 401, 89, 23);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame=new JFrame("Exit");
				int confirmed=JOptionPane.showConfirmDialog(null,"Exit","EXIT",JOptionPane.YES_NO_OPTION);
				//if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION==JOptionPane.YES_NO_OPTION))
				if(confirmed==JOptionPane.YES_OPTION)
				{	System.exit(0);
			}}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(440, 401, 89, 23);
		frame.getContentPane().add(btnExit);
		
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
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				comboBox.setName(null);
				
				
				
			}
		});
		btnReset.setForeground(new Color(106, 90, 205));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.setBounds(569, 401, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 255));
		panel_1.setBounds(0, 295, 682, 100);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 1, 1);
		panel_1.add(table);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Course_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total_Score", "Average", "Ranking"},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Student_ID", "Course_name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total_Score", "Average", "Ranking"
			}
		));
		table_1.setBounds(0, 11, 682, 78);
		panel_1.add(table_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Student Record", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_2.setBackground(new Color(0, 0, 255));
		panel_2.setBounds(390, 0, 292, 284);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		
		textArea.setBounds(10, 11, 272, 230);
		panel_2.add(textArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});
		btnClear.setBounds(82, 250, 89, 23);
		panel_2.add(btnClear);
		
		
		
	}
}
