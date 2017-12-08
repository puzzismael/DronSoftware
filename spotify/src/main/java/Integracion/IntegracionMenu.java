package Integracion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.border.TitledBorder;
import Presentacion.*;
import presentación.PanelUsuarios;
import org.AdquisicionProductos.Presentacion.*;


import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntegracionMenu extends JFrame {
	private JPanel panelCardLayout;
	private JPanel contentPane;
	 static JLabel lblID;
	static JLabel lblNombre;
	 
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public IntegracionMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1123, 633);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		mnInicio.setForeground(Color.BLACK);
		mnInicio.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnInicio);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setForeground(Color.BLACK);
		mnArchivo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnArchivo);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setForeground(Color.BLACK);
		mnAyuda.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnAyuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{209, 0};
		gbl_panel.rowHeights = new int[]{150, 45, 45, 45, 45, 45, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton button = new JButton("Panel Principal");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(panelCardLayout.getLayout());
				cl.show(panelCardLayout, "panel inicio"); //$NON-NLS-1$
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		panel.add(panel_1, gbc_panel_1);
		
		lblID = new JLabel("");
		lblID.setBounds(74, 59, 107, 14);
		panel_1.add(lblID);
		
		
		lblNombre= new JLabel("");
		lblNombre.setBounds(74, 96, 125, 14);
		panel_1.add(lblNombre);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(10, 59, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setBounds(10, 96, 54, 14);
		panel_1.add(lblNombre_1);
		
		JLabel lblDatosDelLogin = new JLabel("Datos del login");
		lblDatosDelLogin.setBounds(74, 11, 125, 14);
		panel_1.add(lblDatosDelLogin);
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setPreferredSize(new Dimension(209, 45));
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setFont(new Font("Verdana", Font.BOLD, 13));
		button.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.gridx = 0;
		gbc_button.gridy = 1;
		panel.add(button, gbc_button);
		
		JButton btnGestionUsuarios = new JButton("Gestión De Usuarios");
		btnGestionUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(panelCardLayout.getLayout());
				cl.show(panelCardLayout, "Gestion de usuarios");
				
			}
		});
		btnGestionUsuarios.setPreferredSize(new Dimension(209, 45));
		btnGestionUsuarios.setHorizontalTextPosition(SwingConstants.LEADING);
		btnGestionUsuarios.setHorizontalAlignment(SwingConstants.LEFT);
		btnGestionUsuarios.setFont(new Font("Verdana", Font.BOLD, 13));
		btnGestionUsuarios.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_btnGestionUsuarios = new GridBagConstraints();
		gbc_btnGestionUsuarios.insets = new Insets(0, 0, 5, 0);
		gbc_btnGestionUsuarios.gridx = 0;
		gbc_btnGestionUsuarios.gridy = 2;
		panel.add(btnGestionUsuarios, gbc_btnGestionUsuarios);
		
		JButton btnCreacinDeUsuarios = new JButton("Creación de Usuarios");
		btnCreacinDeUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CardLayout cl = (CardLayout)(panelCardLayout.getLayout());
				cl.show(panelCardLayout, "panel creacion users"); //$NON-NLS-1$
			}
		});
		btnCreacinDeUsuarios.setPreferredSize(new Dimension(209, 45));
		btnCreacinDeUsuarios.setHorizontalTextPosition(SwingConstants.LEADING);
		btnCreacinDeUsuarios.setHorizontalAlignment(SwingConstants.LEFT);
		btnCreacinDeUsuarios.setFont(new Font("Verdana", Font.BOLD, 13));
		btnCreacinDeUsuarios.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_btnCreacinDeUsuarios = new GridBagConstraints();
		gbc_btnCreacinDeUsuarios.insets = new Insets(0, 0, 5, 0);
		gbc_btnCreacinDeUsuarios.gridx = 0;
		gbc_btnCreacinDeUsuarios.gridy = 3;
		panel.add(btnCreacinDeUsuarios, gbc_btnCreacinDeUsuarios);
		
		JButton btnModificarProductos = new JButton("Modificar Productos");
		btnModificarProductos.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnModificarProductos.setHorizontalTextPosition(SwingConstants.LEADING);
		btnModificarProductos.setHorizontalAlignment(SwingConstants.LEFT);
		btnModificarProductos.setFont(new Font("Verdana", Font.BOLD, 13));
		btnModificarProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(panelCardLayout.getLayout());
				cl.show(panelCardLayout, "modificar producto"); //$NON-NLS-1$
			}
		});
		btnModificarProductos.setPreferredSize(new Dimension(209, 45));
		GridBagConstraints gbc_btnModificarProductos = new GridBagConstraints();
		gbc_btnModificarProductos.insets = new Insets(0, 0, 5, 0);
		gbc_btnModificarProductos.gridx = 0;
		gbc_btnModificarProductos.gridy = 4;
		panel.add(btnModificarProductos, gbc_btnModificarProductos);
		
		JButton btnListadoDeCompradores = new JButton("Listado de compradores");
		btnListadoDeCompradores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(panelCardLayout.getLayout());
				cl.show(panelCardLayout,"panel Compradores"	); //$NON-NLS-1$

				
			}
		});
		btnListadoDeCompradores.setPreferredSize(new Dimension(209, 45));
		btnListadoDeCompradores.setHorizontalTextPosition(SwingConstants.LEADING);
		btnListadoDeCompradores.setHorizontalAlignment(SwingConstants.LEFT);
		btnListadoDeCompradores.setFont(new Font("Verdana", Font.BOLD, 13));
		btnListadoDeCompradores.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_btnListadoDeCompradores = new GridBagConstraints();
		gbc_btnListadoDeCompradores.insets = new Insets(0, 0, 5, 0);
		gbc_btnListadoDeCompradores.gridx = 0;
		gbc_btnListadoDeCompradores.gridy = 5;
		panel.add(btnListadoDeCompradores, gbc_btnListadoDeCompradores);
		
		panelCardLayout= new JPanel();
		panelCardLayout.setPreferredSize(new Dimension(104, 18));
		contentPane.add(panelCardLayout, BorderLayout.CENTER);
		panelCardLayout.setLayout(new CardLayout(0, 0));
		
		JPanel panelInicio = new PanelPrincipal();
	     
		panelCardLayout.add(panelInicio, "panel inicio");
		
		JPanel panelCreacionDeUsers = new PanelUsuarios(null);
		panelCardLayout.add(panelCreacionDeUsers, "panel creacion users");
		
		JPanel panelModificarProductos = new ModificarProducto();
		panelCardLayout.add(panelModificarProductos, "modificar producto");
		
		JPanel panelListadoCompradores = new ListadoCompradores();
		panelCardLayout.add(panelListadoCompradores, "panel Compradores"); //$NON-NLS-1$
			
		JPanel panelGestionUsuarios = new GestionDeUsuarios();
		panelCardLayout.add(panelGestionUsuarios, "Gestion de usuarios");
		
		
	}

   public void setlblID(String text)
   {
	   lblID.setText(text);
   }
   public void setlblNombre(String text)
   {
	   lblNombre.setText(text);
   }
}
