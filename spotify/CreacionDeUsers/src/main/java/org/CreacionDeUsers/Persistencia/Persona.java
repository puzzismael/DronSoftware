package Persistencia;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;



import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Persona {

	private JFrame frame;
	private JTextField txtClave;
	private JTextField txtFecha_Nacimiento;
	private JTextField txtEmail;
	private JTextField txtTelefono;
	private JTextField txtNombre;
	private JTextField txtDomicilio;
	private JTextField textId;
	PreparedStatement ps;
	JComboBox cbxGenero;
	ResultSet rs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Persona window = new Persona();
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
	public Persona() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(10, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Clave:");
		frame.getContentPane().add(lblNewLabel_1);
		
		txtClave = new JTextField();
		frame.getContentPane().add(txtClave);
		txtClave.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		frame.getContentPane().add(lblNewLabel_2);
		
		txtNombre = new JTextField();
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Domicilio");
		frame.getContentPane().add(lblNewLabel_3);
		
		txtDomicilio = new JTextField();
		frame.getContentPane().add(txtDomicilio);
		txtDomicilio.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Telefono:");
		frame.getContentPane().add(lblNewLabel_4);
		
		txtTelefono = new JTextField();
		frame.getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		frame.getContentPane().add(lblNewLabel_5);
		
		txtEmail = new JTextField();
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Fecha Nacimiento:");
		frame.getContentPane().add(lblNewLabel);
		
		txtFecha_Nacimiento = new JTextField();
		frame.getContentPane().add(txtFecha_Nacimiento);
		txtFecha_Nacimiento.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Genero:");
		frame.getContentPane().add(lblNewLabel_6);
		
		 cbxGenero = new JComboBox();
		cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"Selecciona", "Masculino", "Femenino"}));
		frame.getContentPane().add(cbxGenero);
		
		JButton btnGuarda = new JButton("Guarda");
		btnGuarda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con =null;
				GestorBD c=new GestorBD();
				try {
					con =c.getConection();
					ps =(PreparedStatement) con.prepareStatement("INSERT INTO persona (clave,nombre,domicilio,telefono,correo_electronico,fecha_nacimiento,genero)VALUES(?,?,?,?,?,?,?)");
					ps.setString(1, txtClave.getText());
					ps.setString(2, txtNombre.getText());
					ps.setString(3, txtDomicilio.getText());
					ps.setString(4, txtTelefono.getText());
					ps.setString(5, txtEmail.getText());
					ps.setDate(6,Date.valueOf( txtFecha_Nacimiento.getText()));
					ps.setString(7,cbxGenero.getSelectedItem().toString());
					
					int res =ps.executeUpdate();
					
					
					if(res >0)
						
					{	limpiarCajas();
						JOptionPane.showMessageDialog(null,"Persona guardada");
					} else {
						limpiarCajas();
						JOptionPane.showMessageDialog(null,"Error al guardar persona ");
					}
				}catch(Exception exc){
					System.err.println(exc);
					
				}
			}
		});
		frame.getContentPane().add(btnGuarda);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con =null;
				GestorBD c=new GestorBD();
				try {
					con =c.getConection();
					ps =(PreparedStatement) con.prepareStatement("UPDATE persona SET clave=?,nombre=?,domicilio=?,telefono=?,correo_electronico=?,fecha_nacimiento=?,genero=? where id=?");
					ps.setString(1, txtClave.getText());
					ps.setString(2, txtNombre.getText());
					ps.setString(3, txtDomicilio.getText());
					ps.setString(4, txtTelefono.getText());
					ps.setString(5, txtEmail.getText());
					ps.setDate(6,Date.valueOf( txtFecha_Nacimiento.getText()));
					ps.setString(7,cbxGenero.getSelectedItem().toString());
					ps.setString(8,textId.getText());
					
					int res =ps.executeUpdate();
					
					
					if(res >0)
						
					{	limpiarCajas();
						JOptionPane.showMessageDialog(null,"Persona modificada");
					} else {
						limpiarCajas();
						JOptionPane.showMessageDialog(null,"Error al modificar persona ");
					}
				}catch(Exception exc){
					System.err.println(exc);
					
				}
				
			}
		});
		frame.getContentPane().add(btnModificar);
		
		JButton btnElimina = new JButton("Elimina");
		btnElimina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection con =null;
				GestorBD c=new GestorBD();
				try {
					con =c.getConection();
					ps =(PreparedStatement) con.prepareStatement("DELETE FROM PERSONA where id=?");
				
					ps.setInt(1,Integer.parseInt(textId.getText()));
					
					int res =ps.executeUpdate();
					
					
					if(res >0)
						
					{	limpiarCajas();
						JOptionPane.showMessageDialog(null,"Persona eliminada");
					} else {
						limpiarCajas();
						JOptionPane.showMessageDialog(null,"Error al eliminar persona ");
					}
				}catch(Exception exc){
					System.err.println(exc);
					
				}
			}
		});
		frame.getContentPane().add(btnElimina);
		
		JButton btnLimpia = new JButton("Limpia");
		btnLimpia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limpiarCajas();
			}
		});
		frame.getContentPane().add(btnLimpia);
		
		textId = new JTextField();
		textId.setVisible(false);
		textId.setEnabled(false);
		frame.getContentPane().add(textId);
		textId.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con =null;
				GestorBD c=new GestorBD();
				try {
					con =c.getConection();
					ps =(PreparedStatement) con.prepareStatement("SELECT * from persona where clave=?");
					ps.setString(1, txtClave.getText());
					rs=ps.executeQuery();
					
					if(rs.next())
					{
						textId.setText(rs.getString("id"));
						txtNombre.setText(rs.getString("nombre"));
						txtDomicilio.setText(rs.getString("domicilio"));
						txtTelefono.setText(rs.getString("telefono"));
						txtEmail.setText(rs.getString("correo_electronico"));
						txtFecha_Nacimiento.setText(rs.getString("fecha_nacimiento"));
						cbxGenero.setSelectedItem(rs.getString("genero"));
					}else {
						JOptionPane.showMessageDialog(null,"No existe una persona con la clave");
					}
			}catch(Exception ex){
				System.err.println(ex);
				
			}
			}
		});
		frame.getContentPane().add(btnBuscar);
	}
	public void limpiarCajas()
	{
		txtClave.setText(null);
		txtNombre.setText(null);
		txtDomicilio.setText(null);
		txtTelefono.setText(null);
		txtEmail.setText(null);
		txtFecha_Nacimiento.setText(null);
		cbxGenero.setSelectedIndex(0);
			
	}
}
