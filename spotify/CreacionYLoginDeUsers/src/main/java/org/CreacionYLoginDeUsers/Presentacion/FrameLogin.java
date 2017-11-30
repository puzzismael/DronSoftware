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

import org.CreacionYLoginDeUsers.Dominio.Supervisor;

import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class FrameLogin extends JFrame {

	private JPanel contentPane;
	private ArrayList<Supervisor> usuarios= new ArrayList<Supervisor>(); 
	private JTextField textUsuario;
	private JPasswordField textContraseña;

	public FrameLogin(ArrayList<Supervisor> usuarios) {
		this.usuarios=usuarios;
		setLocationRelativeTo(null);
		setBackground(SystemColor.text);
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrameLogin.class.getResource("FrameLogin.0"))); 
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
		
		JButton btnRegistar = new JButton("FrameLogin.1");
		btnRegistar.addActionListener(new BtnRegistarActionListener());
		btnRegistar.setFont(new Font("FrameLogin.2", Font.BOLD, 11));
		panelBotones.add(btnRegistar);
		
		JButton btnCerrar = new JButton("FrameLogin.3"); 
		btnCerrar.addActionListener(new BtnCerraActionListener());
		btnCerrar.setFont(new Font("FrameLogin.4", Font.BOLD, 11));
		panelBotones.add(btnCerrar);
		
		JButton btnLimpiar = new JButton("FrameLogin.5"); 
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		btnLimpiar.setFont(new Font("FrameLogin.6", Font.BOLD, 11)); 
		panelBotones.add(btnLimpiar);
		
		JButton btnEntrar = new JButton("FrameLogin.7"); 
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		btnEntrar.setFont(new Font("FrameLogin.8", Font.BOLD, 11)); 
		panelBotones.add(btnEntrar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{160, 0, 25, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{25, 0, 0, 27, 25, 0, 26, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblIcon = new JLabel("FrameLogin.9"); 
		lblIcon.setIcon(new ImageIcon(FrameLogin.class.getResource("FrameLogin.10"))); 
		GridBagConstraints gbc_lblIcon = new GridBagConstraints();
		gbc_lblIcon.gridheight = 7;
		gbc_lblIcon.insets = new Insets(0, 0, 0, 5);
		gbc_lblIcon.gridx = 0;
		gbc_lblIcon.gridy = 0;
		panel_1.add(lblIcon, gbc_lblIcon);
		
		JLabel label = new JLabel("FrameLogin.11"); 
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 1;
		panel_1.add(label, gbc_label);
		
		JLabel lblUsuario = new JLabel("FrameLogin.12"); 
		lblUsuario.setFont(new Font("FrameLogin.13", Font.BOLD, 13));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 3;
		panel_1.add(lblUsuario, gbc_lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setBorder(new TitledBorder(null,"FrameLogin.14", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK)); 
		textUsuario.setBackground(SystemColor.scrollbar);
		textUsuario.setFont(new Font("FrameLogin.15", Font.BOLD, 11));
		GridBagConstraints gbc_textUsuario = new GridBagConstraints();
		gbc_textUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_textUsuario.gridwidth = 3;
		gbc_textUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_textUsuario.gridx = 3;
		gbc_textUsuario.gridy = 3;
		panel_1.add(textUsuario, gbc_textUsuario);
		textUsuario.setColumns(10);
		
		JLabel label_1 = new JLabel("FrameLogin.16"); 
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.gridwidth = 5;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 4;
		panel_1.add(label_1, gbc_label_1);
		
		JLabel lblContrasea = new JLabel("FrameLogin.17"); 
		lblContrasea.setFont(new Font("FrameLogin.18", Font.BOLD, 13)); 
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.fill = GridBagConstraints.VERTICAL;
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 2;
		gbc_lblContrasea.gridy = 5;
		panel_1.add(lblContrasea, gbc_lblContrasea);
		textContraseña = new JPasswordField();
		textContraseña.setBorder(new TitledBorder(null,"FrameLogin.19", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop)); 
		textContraseña.setBackground(SystemColor.scrollbar);
		textContraseña.setFont(new Font("FrameLogin.20", Font.BOLD, 11)); 
		textContraseña.addActionListener(new TextContraseñaActionListener());
		GridBagConstraints gbc_textContraseña = new GridBagConstraints();
		
		gbc_textContraseña.fill = GridBagConstraints.BOTH;
		gbc_textContraseña.gridwidth = 3;
		gbc_textContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_textContraseña.gridx = 3;
		gbc_textContraseña.gridy = 5;
		panel_1.add(textContraseña, gbc_textContraseña);
		
		
	}
	
	public Supervisor esSupervisor(){
		Supervisor supervisor=null;
			for(int i=0;i<usuarios.size();i++){
				if(usuarios.get(i).getUsuario().equals(textUsuario.getText())&&(usuarios.get(i).getContraseña().equals((textContraseña.getText())))){
					return usuarios.get(i);
				}
			}
		return supervisor;
	}
	public boolean isDoctor(){
		boolean doctor=false;
			for(int i=0;i<usuarios.size();i++){
				if(usuarios.get(i).getUsuario().equals(textUsuario.getText())&&(usuarios.get(i).getContraseña().equals(textContraseña.getText()))){
					doctor=true;
				}
			}
		return doctor;
	}
	public void limpiar(){
		textContraseña.setText("FrameLogin.21");
		textUsuario.setText("FrameLogin.22"); //$NON-NLS-1$
	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Supervisor supervisor=esSupervisor();
			if(isDoctor()){
				JOptionPane.showMessageDialog(contentPane,"FrameLogin.23"+supervisor.getNombre()+"FrameLogin.24"+supervisor.getApellidos()); //$NON-NLS-1$ //$NON-NLS-2$
				//FramePrincipal ventanaPrincipal = new FramePrincipal(doctor,usuarios);
			//	ventanaPrincipal.setVisible(true);
				dispose();
			}else{
				JOptionPane.showMessageDialog(contentPane,"FrameLogin.25", "FrameLogin.26", JOptionPane.ERROR_MESSAGE);	 //$NON-NLS-1$ //$NON-NLS-2$
				limpiar();
			}
		}
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
			Supervisor supervisor=esSupervisor();
			if(isDoctor()){
				JOptionPane.showMessageDialog(contentPane,"FrameLogin.27"+supervisor.getNombre()+"FrameLogin.28"+supervisor.getApellidos()); //$NON-NLS-1$ //$NON-NLS-2$
			//	FramePrincipal ventanaPrincipal = new FramePrincipal(doctor,usuarios);
			//	ventanaPrincipal.setVisible(true);
				dispose();
			}else{
				JOptionPane.showMessageDialog(contentPane,"FrameLogin.29","FrameLogin.30", JOptionPane.ERROR_MESSAGE);	 //$NON-NLS-1$ //$NON-NLS-2$
				limpiar();
			
			}
				
		}
	}
	private class BtnRegistarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		//	FrameRegistro registro =new FrameRegistro(usuarios);
			//registro.setVisible(true);
			dispose();
		}
	}
}
