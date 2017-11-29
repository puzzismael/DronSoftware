package Persistencia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class GestorBD {

	private JFrame frame;
	public static final  String URL ="jdbc:mysql://localhost:3306/bd";
	public static final  String USERNAME="root";
	public static final  String PASSWORD="root";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorBD window = new GestorBD();
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
	public GestorBD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{52, 50, 50, 0, 50, 0, 0};
		gridBagLayout.rowHeights = new int[]{20, 20, 20, 19, 22, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				
				Connection con =null;
				con =getConection();
				
				
				PreparedStatement ps;
				
				ResultSet res = null; 
				ps=(PreparedStatement) con.prepareStatement("SELECT * FROM persona");
				res=ps.executeQuery();
				
				if(res.next()) {
					JOptionPane.showMessageDialog(null,res.getString("nombre")+" "+res.getString("domicilio"));
				} else {
					JOptionPane.showMessageDialog(null,"no existen datos");
				}
				con.close();
				}catch(Exception e) {
					System.out.println(e);
					
				}
			}
			
		});
		
		
		GridBagConstraints gbc_btnConectar = new GridBagConstraints();
		gbc_btnConectar.gridwidth = 2;
		gbc_btnConectar.insets = new Insets(0, 0, 0, 5);
		gbc_btnConectar.gridx = 3;
		gbc_btnConectar.gridy = 5;
		frame.getContentPane().add(btnConectar, gbc_btnConectar);
	}
	public static Connection getConection() {
		Connection con =null;
		
		
		try {
			
		Class.forName("com.mysql.jdbc.Driver");	
		con=(Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
		JOptionPane.showMessageDialog(null,"Conexion exitosa");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
