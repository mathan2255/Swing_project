import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class calculatorrr {

	private JFrame frame;
	private JComboBox comboBox;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt1;
	double num1;
	double num2;
	double result;
	String op;
	String ans;
	double usd=70.955;
	double eur=78.886;
	double bpound=91.3899;
	double singdolar=52.0904;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorrr window = new calculatorrr();
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
	public calculatorrr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 788, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 544, 20);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStanderd = new JMenuItem("standerd");
		mntmStanderd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.setBounds(100, 100, 313, 420);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				
				JMenuBar menuBar = new JMenuBar();
				menuBar.setBounds(0, 0, 418, 43);
				frame.getContentPane().add(menuBar);
				
				JMenu mnFile = new JMenu("File");
				menuBar.add(mnFile);
				
				JMenuItem mntmStanderd = new JMenuItem("standerd");
				
			}
		});
		mnFile.add(mntmStanderd);
		
		JMenuItem mntmScientific = new JMenuItem("scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			frame.setBounds(100, 100, 562, 420);
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmUnitConversion = new JMenuItem("unit conversion");
		mntmUnitConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.setBounds(100, 100, 787, 378);	
				
				
				
			}
		});
		mnFile.add(mntmUnitConversion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				int confirmed=JOptionPane.showConfirmDialog(null,"Exit","EXIT",JOptionPane.YES_NO_OPTION);
				
				if(confirmed==JOptionPane.YES_OPTION)
				{	
				System.exit(0);
			}}
		});
		mnFile.add(mntmExit);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.setBounds(10, 54, 50, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button.getText();
				txt1.setText(Number);
			}
		});
		button.setBounds(10, 108, 50, 41);
		frame.getContentPane().add(button);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText(null);
			}
		});
		btnCe.setBounds(62, 54, 50, 43);
		frame.getContentPane().add(btnCe);
		
		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_2.getText();
				txt1.setText(Number);
			}
		});
		button_2.setBounds(62, 108, 50, 41);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_3.getText();
				txt1.setText(Number);
			}
		});
		button_3.setBounds(10, 160, 50, 37);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_4.getText();
				txt1.setText(Number);
			}
		});
		button_4.setBounds(62, 160, 50, 37);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("1");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=txt1.getText()+button_5.getText();
				txt1.setText(Number);
				
			}
		});
		button_5.setBounds(10, 214, 50, 37);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=txt1.getText()+button_6.getText();
				txt1.setText(Number);
			}
		});
		button_6.setBounds(62, 214, 50, 37);
		frame.getContentPane().add(button_6);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
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
		btnC.setBounds(122, 55, 50, 41);
		frame.getContentPane().add(btnC);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_8.getText();
				txt1.setText(Number);
			}
		});
		button_8.setBounds(122, 107, 50, 43);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_9.getText();
				txt1.setText(Number);
			}
		});
		button_9.setBounds(122, 160, 50, 37);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("3");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_10.getText();
				txt1.setText(Number);
			}
		});
		button_10.setBounds(122, 214, 50, 37);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("+/-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_11.getText();
				txt1.setText(Number);
				
			}
		});
		button_11.setBounds(170, 54, 50, 41);
		frame.getContentPane().add(button_11);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				
				num2=Double.parseDouble(txt1.getText());
				result=Math.sqrt(num2);
				ans=String.format("%.2f",result);
				txt1.setText(ans);
				
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSqrt.setBounds(230, 54, 64, 41);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(304, 54, 50, 41);
		frame.getContentPane().add(btnL);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  num1=Double.parseDouble(txt1.getText());
	                num1=Math.sin(num1);
	                txt1.setText(String.valueOf(num1));
			}
		});
		btnSin.setBounds(364, 54, 50, 43);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
                num1=Math.sinh(num1);
                txt1.setText(String.valueOf(num1));
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSinh.setBounds(424, 54, 50, 43);
		frame.getContentPane().add(btnSinh);
		
		JButton btnMod = new JButton("mod");
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnMod.setBounds(484, 54, 60, 43);
		frame.getContentPane().add(btnMod);
		
		JButton button_17 = new JButton("/");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
				txt1.setText("");
				op="/";
			}
		});
		button_17.setBounds(170, 106, 50, 43);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("%");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt2.getText());
				txt2.setText("");
				op="%";
			}
		});
		button_18.setFont(new Font("Tahoma", Font.PLAIN, 6));
		button_18.setBounds(230, 106, 64, 43);
		frame.getContentPane().add(button_18);
		
		JButton btnPie = new JButton("pie");
		btnPie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=3.14;
				String s=String.format("%.2f", a);
				txt1.setText(s);
			}
		});
		btnPie.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnPie.setBounds(304, 106, 50, 43);
		frame.getContentPane().add(btnPie);
		
		JButton btnSinh_1 = new JButton("cos");
		btnSinh_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
                num1=Math.cos(num1);
                txt1.setText(String.valueOf(num1));
			}
		});
		btnSinh_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSinh_1.setBounds(364, 108, 50, 41);
		frame.getContentPane().add(btnSinh_1);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
                num1=Math.cosh(num1);
                txt1.setText(String.valueOf(num1));
			}
			
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCosh.setBounds(424, 108, 50, 41);
		frame.getContentPane().add(btnCosh);
		
		JButton btnLnx = new JButton("lnx");
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
				result=Math.log(num2);
				ans=String.format("%.2f",result);
				txt1.setText(ans);
				
			}
		});
		btnLnx.setBounds(484, 106, 60, 43);
		frame.getContentPane().add(btnLnx);
		
		JButton button_23 = new JButton("*");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(txt1.getText());
				txt1.setText("");
				op="*";
			}
		});
		button_23.setBounds(170, 160, 50, 37);
		frame.getContentPane().add(button_23);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
				result=1/num1;
				ans=String.format("%.2f",result);
				txt1.setText(ans);
			}
		});
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnx.setBounds(230, 160, 64, 37);
		frame.getContentPane().add(btnx);
		
		JButton btnX = new JButton("x^y");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
				txt1.setText("");
				op="x^y";
				
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnX.setBounds(304, 160, 50, 37);
		frame.getContentPane().add(btnX);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
                num1=Math.tan(num1);
                txt1.setText(String.valueOf(num1));
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnTan.setBounds(364, 160, 50, 37);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
                num1=Math.tanh(num1);
                txt1.setText(String.valueOf(num1));
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnTanh.setBounds(424, 160, 50, 43);
		frame.getContentPane().add(btnTanh);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC_1.setBounds(484, 160, 60, 43);
		frame.getContentPane().add(btnC_1);
		
		JButton button_29 = new JButton("-");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
				txt1.setText("");
				op="-";
				
			}
		});
		button_29.setBounds(170, 214, 50, 37);
		frame.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("=");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
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
				if(op=="%")
				{
				result=num1%num2;
				ans=String.format("%.2f",result);
				txt1.setText(ans);
				}
				if(op=="cbr")
				{
					result=(num1/num2)*100;
							ans=String.format("%.2f",result);
					txt1.setText(ans);
				}
				if(op=="x^y")
				{
					result=Math.pow(num1,num2);
					ans=String.format("%.2f",result);
					txt1.setText(ans);
				}
				
				
			}
		});
		button_30.setBounds(230, 214, 64, 99);
		frame.getContentPane().add(button_30);
		
		JButton btnX_1 = new JButton("x^2");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Double.parseDouble(txt1.getText());
				result=Math.pow(num2,2);
				ans=String.format("%.2f",result);
				txt1.setText(ans);
			}
		});
		btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnX_1.setBounds(304, 214, 50, 37);
		frame.getContentPane().add(btnX_1);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
				txt1.setText("");
				op="cbr";
			}
		});
		btnCbr.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCbr.setBounds(364, 214, 50, 37);
		frame.getContentPane().add(btnCbr);
		
		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
				num1=Math.round(num1);
				txt1.setText(String.valueOf(num1));
			}
		});
		btnRund.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnRund.setBounds(424, 218, 50, 43);
		frame.getContentPane().add(btnRund);
		
		JButton btnpi = new JButton("2^pi");
		btnpi.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnpi.setBounds(484, 218, 60, 43);
		frame.getContentPane().add(btnpi);
		
		JButton btnX_2 = new JButton("x^3");
		btnX_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Double.parseDouble(txt1.getText());
				result=Math.pow(num2,3);
				ans=String.format("%.2f",result);
				txt1.setText(ans);
			}
		});
		btnX_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnX_2.setBounds(304, 270, 50, 43);
		frame.getContentPane().add(btnX_2);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(txt1.getText());
				txt1.setText(Integer.toBinaryString(a));
			}
		});
		btnBin.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnBin.setBounds(364, 270, 50, 43);
		frame.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(txt1.getText());
				txt1.setText(Integer.toHexString(a));
				
			}
		});
		btnHex.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnHex.setBounds(424, 272, 50, 41);
		frame.getContentPane().add(btnHex);
		
		JButton btnOct = new JButton("Oct");
		btnOct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(txt1.getText());
				txt1.setText(Integer.toOctalString(a));
			}
		});
		btnOct.setBounds(484, 270, 60, 43);
		frame.getContentPane().add(btnOct);
		
		JButton button_1 = new JButton("0");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_1.getText();
				txt1.setText(Number);
			}
		});
		button_1.setBounds(10, 273, 90, 40);
		frame.getContentPane().add(button_1);
		
		JButton button_7 = new JButton(".");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txt1.getText()+button_7.getText();
				txt1.setText(Number);
				
			}
		});
		button_7.setBounds(122, 273, 50, 40);
		frame.getContentPane().add(button_7);
		
		JButton button_12 = new JButton("+");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txt1.getText());
				txt1.setText("");
				op="+";
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_12.setBounds(170, 272, 50, 41);
		frame.getContentPane().add(button_12);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(554, 11, 203, 302);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCurrencyConverter.setBounds(10, 11, 187, 33);
		panel.add(lblCurrencyConverter);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USD", "EUR", "BPOUND", "SINGDOLAR"}));
		comboBox.setSelectedIndex(0);
		comboBox.setToolTipText("select");
		comboBox.setBounds(10, 68, 168, 35);
		panel.add(comboBox);
		
		txt2 = new JTextField();
		txt2.setBounds(43, 121, 135, 20);
		panel.add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBounds(43, 172, 135, 25);
		panel.add(txt3);
		txt3.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(txt2.getText());
				if(comboBox.getSelectedItem().equals("USD"))
				{
					String c=String.format("Rs%.2f",bp*usd);
					txt3.setText(c);
				}
				if(comboBox.getSelectedItem().equals("EUR"))
				{
					String c=String.format("Rs%.2f",bp*eur);
					txt3.setText(c);
				}                                                           
				
				if(comboBox.getSelectedItem().equals("BPOUND"))
				{
					String c=String.format("Rs%.2f",bp*bpound);
					txt3.setText(c);
				}
				if(comboBox.getSelectedItem().equals("SINGDOLAR"))
				{
					String c=String.format("Rs%.2f",bp*singdolar);
					txt3.setText(c);
				}
				
			}
		});
		btnConvert.setBounds(10, 238, 79, 35);
		panel.add(btnConvert);
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt2.setText(null);
				txt3.setText(null);
			}
		});
		btnClear.setBounds(113, 238, 80, 35);
		panel.add(btnClear);
		
		txt1 = new JTextField();
		txt1.setBounds(0, 22, 544, 29);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
	}
	public JComboBox getComboBox() {
		return comboBox;
	}
}
