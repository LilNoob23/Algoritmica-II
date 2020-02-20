package ejercicio3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class PascalTabla extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table_1;
	private JButton btnLlenarTabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PascalTabla frame = new PascalTabla();
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
	public PascalTabla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 139);
		contentPane.add(scrollPane);

		table_1 = new JTable();
		table_1.setBackground(Color.YELLOW);
		scrollPane.setColumnHeaderView(table_1);
		table_1.setModel(new DefaultTableModel(

				new Object[][] {

						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }

				}, new String[] { "Title 1", "Title 2", "Title 3", "Title 4", "Title 3", "Title 3", "Title 7" }

		));

		scrollPane.setViewportView(table_1);

		btnLlenarTabla = new JButton("Llenar Tabla");
		btnLlenarTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < table_1.getRowCount(); i++) {

					for (int j = 0; j < table_1.getColumnCount(); j++) {

						table_1.setValueAt(0, i, j);

					}

				}

				table_1.setValueAt(1, 0, table_1.getColumnCount() / 2);

				for (int i = 1; i < table_1.getRowCount() / 2+1; i++) {

					for (int j = 0; j < table_1.getColumnCount(); j++) {

						if(j == 0) {

							int valorAnt = 0;
							int valorPos = (int)(table_1.getValueAt(i-1, j+1));
							int valorFin = valorAnt + valorPos;
							table_1.setValueAt(valorFin, i, j);
							
							
						}else if(j == (table_1.getColumnCount()-1)){
							
							int valorAnt = (int)(table_1.getValueAt(i-1, j-1));
							int valorPos = 0;
							int valorFin = valorAnt + valorPos;
							table_1.setValueAt(valorFin, i, j);
							
						}else {
							
							int valorAnt = (int)(table_1.getValueAt(i-1, j-1));
							int valorPos = (int)(table_1.getValueAt(i-1, j+1));
							int valorFin = valorAnt + valorPos;
							table_1.setValueAt(valorFin, i, j);
	
							
						}
							
						}
						
					}
				
				for(int i=0; i<table_1.getRowCount(); i++) {
					for(int j=0; j<table_1.getColumnCount(); j++) {
						int valorGuardado = (int)(table_1.getValueAt(i, j));
						if(valorGuardado == 0) {
							table_1.setValueAt(null, i, j);
						}
					}
				}

				}

		});
		
		btnLlenarTabla.setBounds(150,179,134,51);contentPane.add(btnLlenarTabla);

}

}
