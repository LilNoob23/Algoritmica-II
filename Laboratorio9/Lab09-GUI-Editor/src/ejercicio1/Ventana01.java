package ejercicio1;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ventana01 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	public String acum="";
	public double op;
	private double a;
	public String c="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana01 frame = new Ventana01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana01() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 373);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		
		JPanel pantalla = new JPanel();
		pantalla.setBackground(Color.GRAY);
		pantalla.setBounds(10, 11, 289, 66);
		pantalla.setLayout(null);
		contentPane.add(pantalla);
		
		textField = new JTextField();
		textField.setBackground(new Color(154, 205, 50));
		textField.setFont(new Font("Lucida Bright", Font.PLAIN, 25));
		textField.setBounds(10, 11, 269, 44);
		pantalla.add(textField);
		textField.setColumns(10);
		
		JPanel botones = new JPanel();
		botones.setBackground(Color.GRAY);
		botones.setBounds(10, 86, 289, 248);
		botones.setLayout(null);
		contentPane.add(botones);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setForeground(Color.WHITE);
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(10, 11, 60, 50);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText()+"7";
				textField.setText(acum);
				
			}
		});
		botones.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setForeground(Color.WHITE);
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(80, 11, 60, 50);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText()+"8";
				textField.setText(acum);
				
			}
		});
		botones.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setForeground(Color.WHITE);
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(150, 11, 60, 50);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText()+"9";
				textField.setText(acum);
				
			}
		});
		botones.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setForeground(Color.WHITE);
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(10, 72, 60, 50);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText()+"4";
				textField.setText(acum);
				
			}
		});
		botones.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setForeground(Color.WHITE);
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(80, 71, 60, 51);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText()+"5";
				textField.setText(acum);
				
			}
		});
		botones.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setForeground(Color.WHITE);
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(150, 72, 60, 50);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText()+"6";
				textField.setText(acum);
				
			}
		});
		botones.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(10, 133, 60, 50);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText()+"1";
				textField.setText(acum);
				
			}
		});
		botones.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(80, 133, 60, 50);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText()+"2";
				textField.setText(acum);
				
			}
		});
		botones.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(150, 133, 60, 50);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText()+"3";
				textField.setText(acum);
				
			}
		});
		botones.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setForeground(Color.WHITE);
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0.setBounds(10, 194, 60, 50);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText()+"0";
				textField.setText(acum);
				
			}
		});
		botones.add(btn0);
		
		JButton btnBorrar = new JButton("C");
		btnBorrar.setBackground(Color.LIGHT_GRAY);
		btnBorrar.setForeground(Color.WHITE);
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBorrar.setBounds(80, 194, 60, 50);
		btnBorrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				acum = "";
				textField.setText("");
				textField.setText(acum);
				
			}
			
		});
		botones.add(btnBorrar);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setBackground(Color.RED);
		btnIgual.setForeground(Color.WHITE);
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIgual.setBounds(150, 194, 60, 50);
		btnIgual.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText();
				
			    double b=(Double.parseDouble(acum));
			    
			    llamado obj=new llamado();
			    
			    if(c == "+"){
			 
			      textField.setText(String.valueOf(obj.suma(a,b)));
			      
			     }else if(c == "-"){
			    	
			    	 textField.setText(String.valueOf(obj.resta(a,b)));
			    	 
			     }else if(c == "x") {
			    	 
			    	 textField.setText(String.valueOf(obj.multiplicacion(a,b)));
			    	 
			     }else if(c == "/") {
			    	 
			    	 textField.setText(String.valueOf(obj.division(a,b)));
			    	 
			     }
				
			}
			
		});
		botones.add(btnIgual);
		
		JButton btnDividir = new JButton("/");
		btnDividir.setBackground(Color.CYAN);
		btnDividir.setForeground(Color.WHITE);
		btnDividir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDividir.setBounds(219, 11, 60, 50);
		btnDividir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText();
				
				a = (Double.parseDouble(acum));
				c = "/";
				
				textField.setText("");
				
			}
			
		});
		botones.add(btnDividir);
		
		JButton btnMultiplicar = new JButton("x");
		btnMultiplicar.setBackground(Color.CYAN);
		btnMultiplicar.setForeground(Color.WHITE);
		btnMultiplicar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMultiplicar.setBounds(220, 72, 60, 50);
		btnMultiplicar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText();
				
				a = (Double.parseDouble(acum));
				c = "x";
				
				textField.setText("");
				
			}
			
		});
		botones.add(btnMultiplicar);
		
		JButton btnRestar = new JButton("-");
		btnRestar.setBackground(Color.CYAN);
		btnRestar.setForeground(Color.WHITE);
		btnRestar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRestar.setBounds(219, 133, 60, 50);
		btnRestar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText();
				
				a = (Double.parseDouble(acum));
				c = "-";
				
				textField.setText("");
				
			}
			
		});
		botones.add(btnRestar);
		
		JButton btnSumar = new JButton("+");
		btnSumar.setBackground(Color.CYAN);
		btnSumar.setForeground(Color.WHITE);
		btnSumar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSumar.setBounds(220, 194, 60, 50);
		btnSumar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				acum = textField.getText();
				
				a = (Double.parseDouble(acum));
				c = "+";
				
				textField.setText("");
				
			}
			
		});
		botones.add(btnSumar);
	}
}

