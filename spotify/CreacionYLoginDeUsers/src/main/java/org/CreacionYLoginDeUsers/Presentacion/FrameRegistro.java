package org.CreacionYLoginDeUsers.Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import org.CreacionYLoginDeUsers.Dominio.Usuario;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FrameRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JPasswordField password;
	private JPasswordField passwordRepite;
	private JLabel tic;
	private JButton btnRegistrar;
	ArrayList<Usuario> usuarios=new ArrayList<Usuario>();

	
	public FrameRegistro(ArrayList<Usuario> usuarios) {
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 256);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{123, 113, 121, 108, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 0;
		gbc_btnCancelar.gridy = 0;
		panel.add(btnCancelar, gbc_btnCancelar);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new BtnCheckActionListener());
		GridBagConstraints gbc_btnComprobar = new GridBagConstraints();
		gbc_btnComprobar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnComprobar.insets = new Insets(0, 0, 0, 5);
		gbc_btnComprobar.gridx = 1;
		gbc_btnComprobar.gridy = 0;
		panel.add(btnComprobar, gbc_btnComprobar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLimpiar.insets = new Insets(0, 0, 0, 5);
		gbc_btnLimpiar.gridx = 2;
		gbc_btnLimpiar.gridy = 0;
		panel.add(btnLimpiar, gbc_btnLimpiar);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new BtnRegistrarActionListener()); 
		btnRegistrar.setEnabled(false);
		GridBagConstraints gbc_btnRegistrar = new GridBagConstraints();
		gbc_btnRegistrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRegistrar.gridx = 3;
		gbc_btnRegistrar.gridy = 0;
		panel.add(btnRegistrar, gbc_btnRegistrar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Nuevo usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.WEST);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 91, 87, 30, 80, 82, 35, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario:");
		GridBagConstraints gbc_lblNombreDeUsuario = new GridBagConstraints();
		gbc_lblNombreDeUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblNombreDeUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreDeUsuario.gridx = 1;
		gbc_lblNombreDeUsuario.gridy = 1;
		panel_1.add(lblNombreDeUsuario, gbc_lblNombreDeUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_textUsuario = new GridBagConstraints();
		gbc_textUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_textUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_textUsuario.gridx = 2;
		gbc_textUsuario.gridy = 1;
		panel_1.add(textUsuario, gbc_textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 4;
		gbc_lblContrasea.gridy = 1;
		panel_1.add(lblContrasea, gbc_lblContrasea);
		
		password = new JPasswordField();
		password.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_password = new GridBagConstraints();
		gbc_password.insets = new Insets(0, 0, 5, 5);
		gbc_password.fill = GridBagConstraints.HORIZONTAL;
		gbc_password.gridx = 5;
		gbc_password.gridy = 1;
		panel_1.add(password, gbc_password);
		
		JLabel lblRepite = new JLabel("Repite contrase\u00F1a:");
		GridBagConstraints gbc_lblRepite = new GridBagConstraints();
		gbc_lblRepite.anchor = GridBagConstraints.EAST;
		gbc_lblRepite.gridwidth = 2;
		gbc_lblRepite.insets = new Insets(0, 0, 5, 5);
		gbc_lblRepite.gridx = 3;
		gbc_lblRepite.gridy = 2;
		panel_1.add(lblRepite, gbc_lblRepite);
		
		passwordRepite = new JPasswordField();
		passwordRepite.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_passwordRepite = new GridBagConstraints();
		gbc_passwordRepite.insets = new Insets(0, 0, 5, 5);
		gbc_passwordRepite.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordRepite.gridx = 5;
		gbc_passwordRepite.gridy = 2;
		panel_1.add(passwordRepite, gbc_passwordRepite);
		
		JLabel tic = new JLabel("");
		tic.setEnabled(false);
		tic.setIcon(new ImageIcon(FrameRegistro.class.getResource("tick.png")));
		GridBagConstraints gbc_tic = new GridBagConstraints();
		gbc_tic.insets = new Insets(0, 0, 5, 0);
		gbc_tic.gridx = 6;
		gbc_tic.gridy = 2;
		panel_1.add(tic, gbc_tic);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 4;
		panel_1.add(lblNombre, gbc_lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 2;
		gbc_textNombre.gridy = 4;
		panel_1.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 4;
		gbc_lblApellidos.gridy = 4;
		panel_1.add(lblApellidos, gbc_lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 5;
		gbc_textApellidos.gridy = 4;
		panel_1.add(textApellidos, gbc_textApellidos);
		textApellidos.setColumns(10);
	}

	
	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			FrameLogin login =new FrameLogin(usuarios);
			login.setVisible(true);
			dispose();
		}
		
	}
	
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textUsuario.setText("");;
			passwordRepite.setText(""); 
			password.setText(""); 
			textNombre.setText(""); 
			textApellidos.setText(""); 
			tic.setVisible(false);
		
		}
	}
	
	private class BtnCheckActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			boolean usuario=false,pass=false;
			if(passwordRepite.getText().equals(password.getText())&& (!passwordRepite.getText().equals("")) ){ 
				tic.setVisible(true);
				btnRegistrar.setEnabled(true);
				pass=true;
			}else{
				JOptionPane.showMessageDialog(contentPane,"Contrase�a incorrecta.\n","Por favor, introduzca la contrase�a correcta.\n", JOptionPane.ERROR_MESSAGE); 
				password.setText(""); 
				passwordRepite.setText(""); 
				tic.setVisible(false);
				
			}
			
			
			if(usuario==true && pass==true ){
				btnRegistrar.setEnabled(true);
			}	
		}
	}
	
	private class BtnRegistrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String usuario,pass,nombre,apell;

			if(textNombre.getText().equals("")&& (textApellidos.getText().equals(""))){ 
				JOptionPane.showMessageDialog(contentPane,"Error, faltan datos por introducir.\n", " Por favor, introduzca su nombre y sus apellidos.\n", JOptionPane.ERROR_MESSAGE); 
			}else{
				usuario=textUsuario.getText();
				pass=password.getText();
				nombre=textNombre.getText();
				apell=textApellidos.getText();
				Usuario user = new Usuario(usuario,pass,nombre,apell);
				usuarios.add(user);
				JOptionPane.showMessageDialog(contentPane," Bienvenido "+user.getNombre()+" "+user.getApellidos()+ ", ha sido registrado correctamente.\n" ); 
				dispose();
				//FramePrincipal q = new FramePrincipal(doctor,usuarios);
				//q.setVisible(true);
				dispose();
			}	
		}
	}
}
