package ejercicio2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class CalculadoraTabla extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraTabla frame = new CalculadoraTabla();
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
	public CalculadoraTabla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setBounds(10, 11, 523, 82);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean bandera = true;
				
				for(int i=0; i<table.getRowCount() && bandera == true; i++) {
					
					for(int j=0; j<table.getColumnCount() && bandera == true; j++) {
						
						if(table.getValueAt(i, j) == null) {
							
							table.setValueAt("1", i, j);
							
							bandera = false;
							
						}
						
					}
					
				}
				
			}
		});
		btnNewButton.setBounds(10, 116, 109, 60);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean bandera = true;
				
				for(int i=0; i<table.getRowCount() && bandera == true; i++) {
					
					for(int j=0; j<table.getColumnCount() && bandera == true; j++) {
						
						if(table.getValueAt(i, j) == null) {
							
							table.setValueAt("2", i, j);
							
							bandera = false;
							
						}
						
					}
					
				}
				
			}
		});
		btnNewButton_1.setBounds(129, 116, 109, 60);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean bandera = true;
				
				for(int i=0; i<table.getRowCount() && bandera == true; i++) {
					
					for(int j=0; j<table.getColumnCount() && bandera == true; j++) {
						
						if(table.getValueAt(i, j) == null) {
							
							table.setValueAt("3", i, j);
							
							bandera = false;
							
						}
						
					}
					
				}
				
			}
		});
		btnNewButton_2.setBounds(248, 116, 109, 60);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("=");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(10, 187, 109, 60);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("+");
		btnNewButton_4.setBounds(129, 187, 109, 60);
		contentPane.add(btnNewButton_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 258, 860, 233);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.YELLOW);
		scrollPane.setColumnHeaderView(table);
		table.setModel(new DefaultTableModel(
				
				new Object[][] {
						
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null}
						
				},
				new String[] {
						"Title 1", "Title 2", "Title 3", "Title 4"
				}
				
				));
		
		scrollPane.setViewportView(table);
		
	}
}
