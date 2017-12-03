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

import org.CreacionDeUsers.Presentacion.PanelPacientes;

import org.AdquisicionProductos.Presentacion.*;
import org.CreacionDeUsers.Dominio.*;

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
	private JPanel panelEspecialistas;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntegracionMenu frame = new IntegracionMenu();
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
	public IntegracionMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1124, 709);
		
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
		gbl_panel.rowHeights = new int[]{186, 45, 45, 45, 45, 45, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JButton button = new JButton("Panel Principal");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(panelCardLayout.getLayout());
				cl.show(panelCardLayout, "panel inicio"); //$NON-NLS-1$
			}
		});
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setPreferredSize(new Dimension(209, 45));
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setFont(new Font("Verdana", Font.BOLD, 13));
		button.setBorder(null);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.gridx = 0;
		gbc_button.gridy = 1;
		panel.add(button, gbc_button);
		
		JButton button_1 = new JButton("Mi Perfil");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setPreferredSize(new Dimension(209, 45));
		button_1.setHorizontalTextPosition(SwingConstants.LEADING);
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setFont(new Font("Verdana", Font.BOLD, 13));
		button_1.setBorder(null);
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 0);
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 2;
		panel.add(button_1, gbc_button_1);
		
		JButton btnCreacinDeUsuarios = new JButton("oo");
		btnCreacinDeUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CardLayout cl = (CardLayout)(panelCardLayout.getLayout());
				cl.show(panelCardLayout, "panel usuarios"); //$NON-NLS-1$
			}
		});
		btnCreacinDeUsuarios.setPreferredSize(new Dimension(209, 45));
		btnCreacinDeUsuarios.setHorizontalTextPosition(SwingConstants.LEADING);
		btnCreacinDeUsuarios.setHorizontalAlignment(SwingConstants.LEFT);
		btnCreacinDeUsuarios.setFont(new Font("Verdana", Font.BOLD, 13));
		btnCreacinDeUsuarios.setBorder(null);
		GridBagConstraints gbc_btnCreacinDeUsuarios = new GridBagConstraints();
		gbc_btnCreacinDeUsuarios.insets = new Insets(0, 0, 5, 0);
		gbc_btnCreacinDeUsuarios.gridx = 0;
		gbc_btnCreacinDeUsuarios.gridy = 3;
		panel.add(btnCreacinDeUsuarios, gbc_btnCreacinDeUsuarios);
		
		JButton btnCreacinDeUsuarios_1 = new JButton("Creación de Usuarios");
		btnCreacinDeUsuarios_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(panelCardLayout.getLayout());
				cl.show(panelCardLayout, "panel usuarios"); //$NON-NLS-1$
			}
		});
		btnCreacinDeUsuarios_1.setPreferredSize(new Dimension(209, 45));
		btnCreacinDeUsuarios_1.setHorizontalTextPosition(SwingConstants.LEADING);
		btnCreacinDeUsuarios_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnCreacinDeUsuarios_1.setFont(new Font("Verdana", Font.BOLD, 13));
		btnCreacinDeUsuarios_1.setBorder(null);
		GridBagConstraints gbc_btnCreacinDeUsuarios_1 = new GridBagConstraints();
		gbc_btnCreacinDeUsuarios_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnCreacinDeUsuarios_1.gridx = 0;
		gbc_btnCreacinDeUsuarios_1.gridy = 4;
		panel.add(btnCreacinDeUsuarios_1, gbc_btnCreacinDeUsuarios_1);
		
		JButton button_4 = new JButton("Drs. Especialistas \r");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setPreferredSize(new Dimension(209, 45));
		button_4.setHorizontalTextPosition(SwingConstants.LEADING);
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setFont(new Font("Verdana", Font.BOLD, 13));
		button_4.setBorder(null);
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 0);
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 5;
		panel.add(button_4, gbc_button_4);
		
		JButton btnListadoDeCompradores = new JButton("Listado de compradores");
		btnListadoDeCompradores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListadoDeCompradores.setPreferredSize(new Dimension(209, 45));
		btnListadoDeCompradores.setHorizontalTextPosition(SwingConstants.LEADING);
		btnListadoDeCompradores.setHorizontalAlignment(SwingConstants.LEFT);
		btnListadoDeCompradores.setFont(new Font("Verdana", Font.BOLD, 13));
		btnListadoDeCompradores.setBorder(null);
		GridBagConstraints gbc_btnListadoDeCompradores = new GridBagConstraints();
		gbc_btnListadoDeCompradores.gridx = 0;
		gbc_btnListadoDeCompradores.gridy = 6;
		panel.add(btnListadoDeCompradores, gbc_btnListadoDeCompradores);
		
		panelCardLayout= new JPanel();
		panelCardLayout.setPreferredSize(new Dimension(104, 18));
		contentPane.add(panelCardLayout, BorderLayout.CENTER);
		panelCardLayout.setLayout(new CardLayout(0, 0));
		
		JPanel panelInicio = new PanelPrincipal();
		panelCardLayout.add(panelInicio, "panel inicio");
		usuario users=new usuario();
		panelEspecialistas = new PanelPacientes(null);
		panelCardLayout.add(panelEspecialistas, "FramePrincipal.3");
		
	
		
		JPanel panelAyuda = new JPanel();
		panelCardLayout.add(panelAyuda, "name_34805679265668");
		
		JPanel panelPacientes = new PanelPacientes(null);
		panelPacientes.setBorder(new TitledBorder(UIManager.getBorder("FramePrincipal.5"), "FramePrincipal.6", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255))); //$NON-NLS-1$ //$NON-NLS-2$
		panelCardLayout.add(panelPacientes, "panel usuarios"); //$NON-NLS-1$
			
		JPanel panelConsultas = new JPanel();
		panelCardLayout.add(panelConsultas, "name_34805739852261");
		
		JPanel panelPerfil = new JPanel();
		panelCardLayout.add(panelPerfil, "name_34805762748779");
	}

}
