package cl.inacap.jtableconscrollswingapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class StartFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
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
	public StartFrame() {
		setTitle("JTableConScrollSwingApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(); //1. Se crea el ScrollPane.
		scrollPane.setBounds(10, 11, 345, 242); //2. Se le asignan dimensiones al ScrollPane.
		contentPane.add(scrollPane);
		
		table = new JTable(); //3. Se crea la tabla.
		scrollPane.setViewportView(table); //4. Se a�ade la tabla al ScrollPane.
		
		DefaultTableModel mo = new DefaultTableModel(); //5. Se crea el modelo de la tabla.
		
		mo.addColumn("Nombre");
		mo.addColumn("NickName");
		
		Object []fila = new Object[2];
		
		for (int i = 0; i < 50; i++) { //6. Se a�aden elementos a la tabla.
			for (int j = 0; j < fila.length; j++) {
				if (j == 0) {
					fila[j] = "Daniel Alvarez " + (i+1);
				}
				else {
					fila[j] = "MelchioT " + (i+1);
				}	
			}
			mo.addRow(fila); //7. Se le a�ade la fila a la tabla.
		}
		table.setModel(mo); //8. Se le carga el modelo a la tabla.
	}
}
