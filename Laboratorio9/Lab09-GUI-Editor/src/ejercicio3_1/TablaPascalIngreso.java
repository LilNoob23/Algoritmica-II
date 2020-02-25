package ejercicio3_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablaPascalIngreso extends JFrame {

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
					TablaPascalIngreso frame = new TablaPascalIngreso();
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
	public TablaPascalIngreso() {
		setTitle("Tabla con triángulo de Pascal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		panel.setLayout(null);
		contentPane.add(panel);

		textField = new JTextField();
		textField.setBounds(202, 20, 61, 38);
		panel.add(textField);
		textField.setColumns(10);

		String texto = "<html><body>Ingrese el orden de la tabla<br>cuadrada(Debe ser impar):</body></html>";

		JLabel lblTexto = new JLabel(texto);
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTexto.setBounds(20, 11, 170, 53);
		panel.add(lblTexto);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 62, 364, 166);
		panel.add(scrollPane);

		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setBackground(Color.DARK_GRAY);
		table.setForeground(Color.RED);
		table.setSize(new Dimension(200, 150));
		scrollPane.setViewportView(table);
		panel.add(scrollPane);
		
		JButton btnCrearTabla = new JButton("Crear tabla ");
		btnCrearTabla.setBackground(Color.GREEN);
		btnCrearTabla.setForeground(Color.WHITE);
		btnCrearTabla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				rellenarTabla();
			}
		});
		btnCrearTabla.setBounds(272, 19, 111, 39);
		panel.add(btnCrearTabla);

	}
	
	public void rellenarTabla() {
		
		String[][] data = getMatriz();
		String[] titles = getTitles();
		DefaultTableModel table = new DefaultTableModel(data, titles);
		this.table.setModel(table);
		
	}
	
	public String[][] getMatriz(){
        int rows = Integer.parseInt(textField.getText());
        int columns = Integer.parseInt(textField.getText());
        String [][] data = new String[rows][columns];
        int [][] intData = LogicaPascal.obtenerNumeros(rows);
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                if(intData[i][j]!=0){
                    data[i][j] = String.valueOf(intData[i][j]);
                }else{
                    data[i][j] = "";
                }
            }
        }
        return data;
    }
	
	public String[] getTitles() {
		int rows = Integer.parseInt(textField.getText());
		String[] titles = new String[rows];
		for(int i = 0; i < rows; i++) {
			titles[i] = " ";
		}
		return titles;
	}
	
}
