package Integracion;



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

import dominioo.Usuario;

import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class FrameLogin extends JFrame {

	private JPanel contentPane;
	private ArrayList<Usuario> usuarios= new ArrayList<Usuario>(); 
	private JTextField textID;
	private JTextField textContraseña;

	public FrameLogin() {
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
		
		btnCerrar.setFont(new Font("Cerrar", Font.BOLD, 11));
		panelBotones.add(btnCerrar);
		
		JButton btnLimpiar = new JButton("Limpiar"); 
	
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
		gbl_panel_1.columnWidths = new int[]{160, 20, 25, 20, 0, 20, 20, 0, 45, 37, 0};
		gbl_panel_1.rowHeights = new int[]{25, 0, 0, 27, 25, 0, 0, 36, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblUsuario = new JLabel("ID:"); 
		lblUsuario.setFont(new Font("Usuario:", Font.BOLD, 13));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 2;
		panel_1.add(lblUsuario, gbc_lblUsuario);
		
		textID = new JTextField();
		textID.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); 
		textID.setBackground(SystemColor.scrollbar);
		textID.setFont(new Font("", Font.BOLD, 11));
		GridBagConstraints gbc_textID = new GridBagConstraints();
		gbc_textID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textID.gridwidth = 6;
		gbc_textID.insets = new Insets(0, 0, 5, 5);
		gbc_textID.gridx = 2;
		gbc_textID.gridy = 2;
		panel_1.add(textID, gbc_textID);
		textID.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:"); 
		lblContrasea.setFont(new Font("Contrase\\u00F1a:", Font.BOLD, 13)); 
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.fill = GridBagConstraints.VERTICAL;
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 0;
		gbc_lblContrasea.gridy = 4;
		panel_1.add(lblContrasea, gbc_lblContrasea);
		
		textContraseña = new JTextField();
		textContraseña.setFont(new Font("Dialog", Font.BOLD, 11));
		textContraseña.setColumns(10);
		textContraseña.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textContraseña.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_textContraseña = new GridBagConstraints();
		gbc_textContraseña.gridwidth = 6;
		gbc_textContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_textContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_textContraseña.gridx = 2;
		gbc_textContraseña.gridy = 4;
		panel_1.add(textContraseña, gbc_textContraseña);
		
		
	}
	
	

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			boolean bol =false;
		Usuario user=new Usuario();
		 Usuario[] users=user.obtenerListaDeBD();
		int guardo=0;
		for(int i=0;i<users.length;i++)
		{
			if((textID.getText().equals(users[i].getID()))&&textContraseña.getText().equals(users[i].getContraseña())) {
				bol=true;
			if(bol)guardo=i;
		}
		}
		final String nombre=users[guardo].getNombre();
			if(bol) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							JOptionPane.showMessageDialog(null,"Bienvenido");
							IntegracionMenu frame = new IntegracionMenu();
							frame.setlblID(textID.getText());
							frame.setlblNombre(nombre);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				dispose();
			}else {
				JOptionPane.showMessageDialog(null,"ID o contraseña incorrectos");
			}
			
		
		
	
	}
	}
	
	public String textID() {
		return textID.getText();
	}
	public String textNombre()
	{
		return textContraseña.getText();
	}
	}


























