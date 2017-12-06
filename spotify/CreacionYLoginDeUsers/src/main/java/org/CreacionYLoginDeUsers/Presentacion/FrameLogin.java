package org.CreacionYLoginDeUsers.Presentacion;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;

import org.CreacionYLoginDeUsers.Dominio.Usuario;

import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class FrameLogin extends JFrame {

	private JPanel contentPane;
	private ArrayList<Usuario> usuarios= new ArrayList<Usuario>(); 
	private JTextField textUsuario;
	private JPasswordField textContraseña; 

	public FrameLogin(ArrayList<Usuario> usuarios) {
		setTitle("Spotify");
		this.usuarios=usuarios;
		setLocationRelativeTo(null);
		setBackground(SystemColor.text);
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrameLogin.class.getResource(""))); 
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 231);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.SOUTH); 
		panelBotones.setLayout(new GridLayout(1, 4, 5, 0));
		
		JButton btnCerrar = new JButton("Cerrar"); 
		btnCerrar.addActionListener(new BtnCerraActionListener());
		btnCerrar.setFont(new Font("Cerrar", Font.BOLD, 11));
		panelBotones.add(btnCerrar);
		
		JButton btnLimpiar = new JButton("Limpiar"); 
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		btnLimpiar.setFont(new Font("Limpiar", Font.BOLD, 11)); 
		panelBotones.add(btnLimpiar);
		
		JButton btnEntrar = new JButton("Entrar"); 
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		btnEntrar.setFont(new Font("Entrar", Font.BOLD, 11)); 
		panelBotones.add(btnEntrar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{160, 0, 25, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{25, 0, 0, 27, 25, 0, 36, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblUsuario = new JLabel("Usuario:"); 
		lblUsuario.setFont(new Font("Usuario:", Font.BOLD, 13));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 2;
		panel_1.add(lblUsuario, gbc_lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); 
		textUsuario.setBackground(SystemColor.scrollbar);
		textUsuario.setFont(new Font("", Font.BOLD, 11));
		GridBagConstraints gbc_textUsuario = new GridBagConstraints();
		gbc_textUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_textUsuario.gridwidth = 5;
		gbc_textUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_textUsuario.gridx = 2;
		gbc_textUsuario.gridy = 2;
		panel_1.add(textUsuario, gbc_textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:"); 
		lblContrasea.setFont(new Font("Contrase\\u00F1a:", Font.BOLD, 13)); 
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.fill = GridBagConstraints.VERTICAL;
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 0;
		gbc_lblContrasea.gridy = 4;
		panel_1.add(lblContrasea, gbc_lblContrasea);
		textContraseña = new JPasswordField();
		textContraseña.setBorder(new TitledBorder(null,"", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop)); 
		textContraseña.setBackground(SystemColor.scrollbar);
		textContraseña.setFont(new Font(".20", Font.BOLD, 11)); 
		textContraseña.addActionListener(new TextContraseñaActionListener());
		GridBagConstraints gbc_textContraseña = new GridBagConstraints();
		
		gbc_textContraseña.fill = GridBagConstraints.BOTH;
		gbc_textContraseña.gridwidth = 4;
		gbc_textContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_textContraseña.gridx = 2;
		gbc_textContraseña.gridy = 4;
		panel_1.add(textContraseña, gbc_textContraseña);
		
		
	}
	
	public Usuario esUsuario(){
		Usuario user=null;
			for(int i=0;i<usuarios.size();i++){
				if(usuarios.get(i).getUsuario().equals(textUsuario.getText())&&(usuarios.get(i).getContraseña().equals((textContraseña.getText())))){
					return usuarios.get(i);
				}
			}
		return user;
	}
	public boolean isUsuario(){
		boolean user=false;
			for(int i=0;i<usuarios.size();i++){
				if(usuarios.get(i).getUsuario().equals(textUsuario.getText())&&(usuarios.get(i).getContraseña().equals(textContraseña.getText()))){
					user=true;
				}
			}
		return user;
	}
	public void limpiar(){
		textContraseña.setText("");
		textUsuario.setText(""); 
	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
		/*	Usuario usuar=esUsuario();
			if(isUsuario()){
				JOptionPane.showMessageDialog(contentPane,"FrameLogin.23"+usuar.getNombre()+"FrameLogin.24"+usuar.getApellidos()); 
				//FramePrincipal ventanaPrincipal = new FramePrincipal(doctor,usuarios);
			//	ventanaPrincipal.setVisible(true);
				dispose();
			}else{
				JOptionPane.showMessageDialog(contentPane,"FrameLogin.25", "FrameLogin.26", JOptionPane.ERROR_MESSAGE);	 
				limpiar();
			}
		}*/
	}
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			limpiar();
		}
	}
	private class BtnCerraActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
	private class TextContraseñaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Usuario usuari=esUsuario();
			if(isUsuario()){
				JOptionPane.showMessageDialog(contentPane,"FrameLogin.27"+usuari.getNombre()+"FrameLogin.28"+usuari.getApellidos()); 
			//	FramePrincipal ventanaPrincipal = new FramePrincipal(doctor,usuarios);
			//	ventanaPrincipal.setVisible(true);
				dispose();
			}else{
				JOptionPane.showMessageDialog(contentPane,"FrameLogin.29","FrameLogin.30", JOptionPane.ERROR_MESSAGE);	 
				limpiar();
			
			}
				
		}
	}
}
