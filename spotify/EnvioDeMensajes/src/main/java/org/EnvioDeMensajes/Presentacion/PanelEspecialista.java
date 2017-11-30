package org.EnvioDeMensajes.Presentacion;

import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;




import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JTextArea;
import java.awt.Cursor;
import org.EnvioDeMensajes.Dominio.Especialista;
import org.EnvioDeMensajes.Dominio.Usuario;
public class PanelEspecialista extends JPanel {
	private JLabel lblAdjunto;
	private String text=Messages.getString("PanelEspecialista.0"); //$NON-NLS-1$
	private JTextField textNombre;
	
	private ArrayList<Especialista> especialistas;
	private JList<Especialista> list;
	private JTextField textApellidos;
	private JTextField textContraseña;
	private JTextField textId;
	private JTextField textTlf;
	private JTextField textDomicilio;
	private JTextField textEmail;
	private JTextField textDespacho;
	private JTextField textGenero;
	private JTextField textAñoDeNacimiento;
	private JTextField textCuentaBancaria;
	private JTextField textEspecialidad;
	private JTextField textTitulacion;
	private JTextField textDir;
	private JTextField textEntra;
	private JTextField textSale;
	private JTextField textTlfClinica;
	private JTextField textColegiado;
	private JEditorPane textConsulta;
	private JTextArea textExperiencia;
	private JButton btnLimpiar;
	private JButton btnAdjuntar;
	private JButton btnGuardar;
	private JButton btnEnviar;

	public PanelEspecialista(ArrayList<Especialista> especialistas) {
		this.especialistas=especialistas;
		setBackground(SystemColor.text);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{153, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 41, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		list = new JList<Especialista>();
		list.addListSelectionListener(new ListListSelectionListener());
		list.setBackground(SystemColor.menu);
		list.setFont(new Font(Messages.getString("PanelEspecialista.1"), Font.BOLD, 11)); //$NON-NLS-1$
		list.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Usuarios", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$ //$NON-NLS-2$
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 13;
		gbc_list.gridwidth = 4;
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 0;
		add(list, gbc_list);
		actualizarDatos();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.4"), TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK)); //$NON-NLS-1$
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 3;
		gbc_panel.gridwidth = 21;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 4;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		
		JLabel lblNombre = new JLabel(Messages.getString("PanelEspecialista.5")); //$NON-NLS-1$
		lblNombre.setFont(new Font(Messages.getString("PanelEspecialista.6"), Font.BOLD, 11)); //$NON-NLS-1$
		lblNombre.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNombre.setBounds(138, 23, 68, 14);
		panel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font(Messages.getString("PanelEspecialista.7"), Font.PLAIN, 11)); //$NON-NLS-1$
		textNombre.setForeground(new Color(0, 0, 0));
		textNombre.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.8"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textNombre.setBackground(SystemColor.scrollbar);
		textNombre.setBounds(216, 21, 86, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		textApellidos = new JTextField();
		textApellidos.setFont(new Font(Messages.getString("PanelEspecialista.9"), Font.PLAIN, 11)); //$NON-NLS-1$
		textApellidos.setForeground(new Color(0, 0, 0));
		textApellidos.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.10"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textApellidos.setBackground(SystemColor.scrollbar);
		textApellidos.setBounds(388, 21, 111, 20);
		panel.add(textApellidos);
		textApellidos.setColumns(10);
		
		JLabel lblApellidos = new JLabel(Messages.getString("PanelEspecialista.11")); //$NON-NLS-1$
		lblApellidos.setHorizontalAlignment(SwingConstants.TRAILING);
		lblApellidos.setFont(new Font(Messages.getString("PanelEspecialista.12"), Font.BOLD, 11)); //$NON-NLS-1$
		lblApellidos.setBounds(300, 23, 78, 14);
		panel.add(lblApellidos);
		
		textContraseña = new JTextField();
		textContraseña.setFont(new Font(Messages.getString("PanelEspecialista.13"), Font.PLAIN, 11)); //$NON-NLS-1$
		textContraseña.setForeground(new Color(0, 0, 0));
		textContraseña.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.14"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textContraseña.setBackground(SystemColor.scrollbar);
		textContraseña.setBounds(56, 52, 68, 20);
		panel.add(textContraseña);
		textContraseña.setColumns(10);
		
		textId = new JTextField();
		textId.setFont(new Font(Messages.getString("PanelEspecialista.15"), Font.PLAIN, 11)); //$NON-NLS-1$
		textId.setForeground(new Color(0, 0, 0));
		textId.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.16"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textId.setBackground(SystemColor.scrollbar);
		textId.setBounds(56, 21, 21, 20);
		panel.add(textId);
		textId.setColumns(10);
		
		JLabel lblId = new JLabel(Messages.getString("PanelEspecialista.17")); //$NON-NLS-1$
		lblId.setFont(new Font(Messages.getString("PanelEspecialista.18"), Font.BOLD, 11)); //$NON-NLS-1$
		lblId.setForeground(new Color(0, 0, 0));
		lblId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblId.setBounds(6, 23, 46, 14);
		panel.add(lblId);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a:"); //$NON-NLS-1$
		lblContraseña.setHorizontalAlignment(SwingConstants.TRAILING);
		lblContraseña.setFont(new Font(Messages.getString("PanelEspecialista.20"), Font.BOLD, 11)); //$NON-NLS-1$
		lblContraseña.setBounds(6, 54, 46, 14);
		panel.add(lblContraseña);
		
		JLabel lblTelefono = new JLabel(Messages.getString("PanelEspecialista.21")); //$NON-NLS-1$
		lblTelefono.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTelefono.setFont(new Font(Messages.getString("PanelEspecialista.22"), Font.BOLD, 11)); //$NON-NLS-1$
		lblTelefono.setBounds(509, 23, 68, 14);
		panel.add(lblTelefono);
		
		textTlf = new JTextField();
		textTlf.setFont(new Font(Messages.getString("PanelEspecialista.23"), Font.PLAIN, 11)); //$NON-NLS-1$
		textTlf.setForeground(new Color(0, 0, 0));
		textTlf.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.24"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textTlf.setBackground(SystemColor.scrollbar);
		textTlf.setBounds(583, 21, 92, 20);
		panel.add(textTlf);
		textTlf.setColumns(10);
		
		JLabel lblDomicilio = new JLabel("Domicilio:"); //$NON-NLS-1$
		lblDomicilio.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDomicilio.setFont(new Font(Messages.getString("PanelEspecialista.26"), Font.BOLD, 11)); //$NON-NLS-1$
		lblDomicilio.setBounds(138, 54, 68, 14);
		panel.add(lblDomicilio);
		
		textDomicilio = new JTextField();
		textDomicilio.setFont(new Font(Messages.getString("PanelEspecialista.27"), Font.PLAIN, 11)); //$NON-NLS-1$
		textDomicilio.setForeground(new Color(0, 0, 0));
		textDomicilio.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.28"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textDomicilio.setBackground(SystemColor.scrollbar);
		textDomicilio.setBounds(216, 52, 86, 20);
		panel.add(textDomicilio);
		textDomicilio.setColumns(10);
		
		JLabel lblEmail = new JLabel(Messages.getString("PanelEspecialista.29")); //$NON-NLS-1$
		lblEmail.setFont(new Font(Messages.getString("PanelEspecialista.30"), Font.BOLD, 11)); //$NON-NLS-1$
		lblEmail.setBounds(332, 54, 46, 14);
		panel.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font(Messages.getString("PanelEspecialista.31"), Font.PLAIN, 11)); //$NON-NLS-1$
		textEmail.setForeground(new Color(0, 0, 0));
		textEmail.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.32"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textEmail.setBackground(SystemColor.scrollbar);
		textEmail.setBounds(388, 52, 287, 20);
		panel.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblGenero = new JLabel("G\u00E9nero:"); //$NON-NLS-1$
		lblGenero.setFont(new Font(Messages.getString("PanelEspecialista.34"), Font.BOLD, 11)); //$NON-NLS-1$
		lblGenero.setBounds(141, 86, 65, 14);
		panel.add(lblGenero);
		
		textGenero = new JTextField();
		textGenero.setFont(new Font(Messages.getString("PanelEspecialista.35"), Font.PLAIN, 11)); //$NON-NLS-1$
		textGenero.setForeground(new Color(0, 0, 0));
		textGenero.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.36"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textGenero.setBackground(SystemColor.scrollbar);
		textGenero.setBounds(216, 84, 86, 20);
		panel.add(textGenero);
		textGenero.setColumns(10);
		
		JLabel lblAñoDeNacimiento = new JLabel("A\u00F1o de nacimiento:"); //$NON-NLS-1$
		lblAñoDeNacimiento.setFont(new Font(Messages.getString("PanelEspecialista.38"), Font.BOLD, 11)); //$NON-NLS-1$
		lblAñoDeNacimiento.setBounds(312, 86, 68, 14);
		panel.add(lblAñoDeNacimiento);
		
		textAñoDeNacimiento = new JTextField();
		textAñoDeNacimiento.setFont(new Font(Messages.getString("PanelEspecialista.39"), Font.PLAIN, 11)); //$NON-NLS-1$
		textAñoDeNacimiento.setForeground(new Color(0, 0, 0));
		textAñoDeNacimiento.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.40"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textAñoDeNacimiento.setBackground(SystemColor.scrollbar);
		textAñoDeNacimiento.setBounds(388, 83, 111, 20);
		panel.add(textAñoDeNacimiento);
		textAñoDeNacimiento.setColumns(10);
		
		JLabel lblNCuentaBancaria = new JLabel("N\u00BA de cuenta Bancaria:"); //$NON-NLS-1$
		lblNCuentaBancaria.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNCuentaBancaria.setFont(new Font(Messages.getString("PanelEspecialista.42"), Font.BOLD, 11)); //$NON-NLS-1$
		lblNCuentaBancaria.setBounds(489, 86, 86, 14);
		panel.add(lblNCuentaBancaria);
		
		textCuentaBancaria = new JTextField();
		textCuentaBancaria.setFont(new Font(Messages.getString("PanelEspecialista.43"), Font.PLAIN, 11)); //$NON-NLS-1$
		textCuentaBancaria.setForeground(new Color(0, 0, 0));
		textCuentaBancaria.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.44"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textCuentaBancaria.setBackground(SystemColor.scrollbar);
		textCuentaBancaria.setBounds(583, 84, 92, 20);
		panel.add(textCuentaBancaria);
		textCuentaBancaria.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.45"), TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK)); //$NON-NLS-1$
		panel_3.setLayout(null);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridheight = 4;
		gbc_panel_3.gridwidth = 21;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 4;
		gbc_panel_3.gridy = 3;
		add(panel_3, gbc_panel_3);
		
		JLabel lblEspecialidad = new JLabel(Messages.getString("PanelEspecialista.46")); //$NON-NLS-1$
		lblEspecialidad.setFont(new Font(Messages.getString("PanelEspecialista.47"), Font.BOLD, 11)); //$NON-NLS-1$
		lblEspecialidad.setBounds(10, 24, 97, 14);
		panel_3.add(lblEspecialidad);
		
		textEspecialidad = new JTextField();
		textEspecialidad.setFont(new Font(Messages.getString("PanelEspecialista.48"), Font.PLAIN, 11)); //$NON-NLS-1$
		textEspecialidad.setForeground(new Color(0, 0, 0));
		textEspecialidad.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.49"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textEspecialidad.setBackground(SystemColor.scrollbar);
		textEspecialidad.setBounds(97, 22, 112, 20);
		panel_3.add(textEspecialidad);
		textEspecialidad.setColumns(10);
		
		JLabel lblTitulacin = new JLabel(Messages.getString("PanelEspecialista.50")); //$NON-NLS-1$
		lblTitulacin.setFont(new Font(Messages.getString("PanelEspecialista.51"), Font.BOLD, 11)); //$NON-NLS-1$
		lblTitulacin.setBounds(219, 24, 68, 14);
		panel_3.add(lblTitulacin);
		
		textTitulacion = new JTextField();
		textTitulacion.setFont(new Font(Messages.getString("PanelEspecialista.52"), Font.PLAIN, 11)); //$NON-NLS-1$
		textTitulacion.setForeground(new Color(0, 0, 0));
		textTitulacion.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.53"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textTitulacion.setBackground(SystemColor.scrollbar);
		textTitulacion.setBounds(297, 22, 136, 20);
		panel_3.add(textTitulacion);
		textTitulacion.setColumns(10);
		
		JLabel lblExperienciaProfesionl = new JLabel(Messages.getString("PanelEspecialista.54")); //$NON-NLS-1$
		lblExperienciaProfesionl.setFont(new Font(Messages.getString("PanelEspecialista.55"), Font.BOLD, 11)); //$NON-NLS-1$
		lblExperienciaProfesionl.setBounds(10, 90, 163, 14);
		panel_3.add(lblExperienciaProfesionl);
		
		JLabel lblClnica = new JLabel("Despacho:"); //$NON-NLS-1$
		lblClnica.setBounds(20, 55, 72, 14);
		panel_3.add(lblClnica);
		lblClnica.setFont(new Font(Messages.getString("PanelEspecialista.57"), Font.BOLD, 11)); //$NON-NLS-1$
		lblClnica.setHorizontalAlignment(SwingConstants.TRAILING);
		
		textDespacho = new JTextField();
		textDespacho.setFont(new Font(Messages.getString("PanelEspecialista.58"), Font.PLAIN, 11)); //$NON-NLS-1$
		textDespacho.setForeground(new Color(0, 0, 0));
		textDespacho.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.59"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textDespacho.setBackground(SystemColor.scrollbar);
		textDespacho.setBounds(97, 53, 112, 20);
		panel_3.add(textDespacho);
		textDespacho.setColumns(10);
		
		JLabel lblLugarDeTrabajo = new JLabel(Messages.getString("PanelEspecialista.60")); //$NON-NLS-1$
		lblLugarDeTrabajo.setFont(new Font(Messages.getString("PanelEspecialista.61"), Font.BOLD, 11)); //$NON-NLS-1$
		lblLugarDeTrabajo.setBounds(219, 53, 68, 18);
		panel_3.add(lblLugarDeTrabajo);
		
		textDir = new JTextField();
		textDir.setFont(new Font(Messages.getString("PanelEspecialista.62"), Font.PLAIN, 11)); //$NON-NLS-1$
		textDir.setForeground(new Color(0, 0, 0));
		textDir.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.63"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textDir.setBackground(SystemColor.scrollbar);
		textDir.setBounds(297, 53, 118, 20);
		panel_3.add(textDir);
		textDir.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel(Messages.getString("PanelEspecialista.64")); //$NON-NLS-1$
		lblNewLabel_4.setFont(new Font(Messages.getString("PanelEspecialista.65"), Font.BOLD, 11)); //$NON-NLS-1$
		lblNewLabel_4.setBounds(443, 24, 145, 14);
		panel_3.add(lblNewLabel_4);
		
		textEntra = new JTextField();
		textEntra.setFont(new Font(Messages.getString("PanelEspecialista.66"), Font.PLAIN, 11)); //$NON-NLS-1$
		textEntra.setForeground(new Color(0, 0, 0));
		textEntra.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.67"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textEntra.setBackground(SystemColor.scrollbar);
		textEntra.setBounds(591, 22, 43, 20);
		panel_3.add(textEntra);
		textEntra.setColumns(10);
		
		JLabel lblA = new JLabel(Messages.getString("PanelEspecialista.68")); //$NON-NLS-1$
		lblA.setFont(new Font(Messages.getString("PanelEspecialista.69"), Font.BOLD, 11)); //$NON-NLS-1$
		lblA.setBounds(644, 24, 12, 14);
		panel_3.add(lblA);
		
		textSale = new JTextField();
		textSale.setFont(new Font(Messages.getString("PanelEspecialista.70"), Font.PLAIN, 11)); //$NON-NLS-1$
		textSale.setForeground(new Color(0, 0, 0));
		textSale.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.71"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textSale.setBackground(SystemColor.scrollbar);
		textSale.setBounds(666, 22, 43, 20);
		panel_3.add(textSale);
		textSale.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Tlf. Despacho:"); //$NON-NLS-1$
		lblNewLabel_5.setFont(new Font(Messages.getString("PanelEspecialista.73"), Font.BOLD, 11)); //$NON-NLS-1$
		lblNewLabel_5.setBounds(494, 55, 72, 14);
		panel_3.add(lblNewLabel_5);
		
		textTlfClinica = new JTextField();
		textTlfClinica.setFont(new Font(Messages.getString("PanelEspecialista.74"), Font.PLAIN, 11)); //$NON-NLS-1$
		textTlfClinica.setForeground(new Color(0, 0, 0));
		textTlfClinica.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.75"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textTlfClinica.setBackground(SystemColor.scrollbar);
		textTlfClinica.setBounds(576, 53, 119, 20);
		panel_3.add(textTlfClinica);
		textTlfClinica.setColumns(10);
		
		textExperiencia = new JTextArea();
		textExperiencia.setFont(new Font(Messages.getString("PanelEspecialista.76"), Font.PLAIN, 13)); //$NON-NLS-1$
		textExperiencia.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.77"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textExperiencia.setBackground(SystemColor.scrollbar);
		textExperiencia.setBounds(30, 111, 425, 69);
		panel_3.add(textExperiencia);
		
		JLabel lblNColegiado = new JLabel(Messages.getString("PanelEspecialista.78")); //$NON-NLS-1$
		lblNColegiado.setFont(new Font(Messages.getString("PanelEspecialista.79"), Font.BOLD, 11)); //$NON-NLS-1$
		lblNColegiado.setBounds(485, 90, 81, 14);
		panel_3.add(lblNColegiado);
		
		textColegiado = new JTextField();
		textColegiado.setFont(new Font(Messages.getString("PanelEspecialista.80"), Font.PLAIN, 11)); //$NON-NLS-1$
		textColegiado.setForeground(new Color(0, 0, 0));
		textColegiado.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.81"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textColegiado.setBackground(SystemColor.scrollbar);
		textColegiado.setBounds(576, 88, 86, 20);
		panel_3.add(textColegiado);
		textColegiado.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.82"), TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK)); //$NON-NLS-1$
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.gridwidth = 21;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 4;
		gbc_scrollPane.gridy = 7;
		add(scrollPane, gbc_scrollPane);
		
		textConsulta = new JEditorPane();
		textConsulta.setFont(new Font(Messages.getString("PanelEspecialista.83"), Font.PLAIN, 11)); //$NON-NLS-1$
		textConsulta.setBackground(SystemColor.scrollbar);
		scrollPane.setViewportView(textConsulta);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridheight = 2;
		gbc_panel_2.gridwidth = 21;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 4;
		gbc_panel_2.gridy = 10;
		add(panel_2, gbc_panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblAdjunto = new JLabel(Messages.getString("PanelEspecialista.84")); //$NON-NLS-1$
		lblAdjunto.setFont(new Font(Messages.getString("PanelEspecialista.85"), Font.PLAIN, 11)); //$NON-NLS-1$
		lblAdjunto.setBorder(new TitledBorder(null, Messages.getString("PanelEspecialista.86"), TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK)); //$NON-NLS-1$
		panel_2.add(lblAdjunto);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 21;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 4;
		gbc_panel_1.gridy = 12;
		add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));
		
		btnLimpiar = new JButton(Messages.getString("PanelEspecialista.87")); //$NON-NLS-1$
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.setEnabled(false);
		btnLimpiar.setFont(new Font(Messages.getString("PanelEspecialista.88"), Font.BOLD, 11)); //$NON-NLS-1$
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		panel_1.add(btnLimpiar);
		
		btnAdjuntar = new JButton(Messages.getString("PanelEspecialista.89")); //$NON-NLS-1$
		btnAdjuntar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdjuntar.setEnabled(false);
		btnAdjuntar.setFont(new Font(Messages.getString("PanelEspecialista.90"), Font.BOLD, 11)); //$NON-NLS-1$
		btnAdjuntar.addActionListener(new BtnAdjuntarActionListener());
		btnAdjuntar.setToolTipText(Messages.getString("PanelEspecialista.91")); //$NON-NLS-1$
		panel_1.add(btnAdjuntar);
		
		btnGuardar = new JButton(Messages.getString("PanelEspecialista.92")); //$NON-NLS-1$
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.setEnabled(false);
		btnGuardar.setFont(new Font(Messages.getString("PanelEspecialista.93"), Font.BOLD, 11)); //$NON-NLS-1$
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		panel_1.add(btnGuardar);
		
		btnEnviar = new JButton(Messages.getString("PanelEspecialista.94")); //$NON-NLS-1$
		btnEnviar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEnviar.addActionListener(new BtnEnviarActionListener());
		btnEnviar.setEnabled(false);
		btnEnviar.setFont(new Font(Messages.getString("PanelEspecialista.95"), Font.BOLD, 11)); //$NON-NLS-1$
		panel_1.add(btnEnviar);

	}

	private class BtnAdjuntarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(new PanelEspecialista(especialistas));
			//Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				text= text+Messages.getString("PanelEspecialista.96") +file.getName(); //$NON-NLS-1$
				lblAdjunto.setText(text);
			}
		}
	}
	
	public void actualizarDatos(){
		DefaultListModel modelo = new DefaultListModel();
		for(int i=0;i<especialistas.size();i++){
			modelo.addElement(especialistas.get(i).getApellidos()+Messages.getString("PanelEspecialista.97")+especialistas.get(i).getNombre()); //$NON-NLS-1$
		}
		list.setModel(modelo);
	}
	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
			int i=list.getSelectedIndex();
			if(i==-1){
				textId.setText(Messages.getString("PanelEspecialista.98")); //$NON-NLS-1$
				textNombre.setText(Messages.getString("PanelEspecialista.99")); //$NON-NLS-1$
				textApellidos.setText(Messages.getString("PanelEspecialista.100")); //$NON-NLS-1$
				textContraseña.setText(Messages.getString("PanelEspecialista.101")); //$NON-NLS-1$
				textTlf.setText(Messages.getString("PanelEspecialista.102")); //$NON-NLS-1$
				textDomicilio.setText(Messages.getString("PanelEspecialista.103")); //$NON-NLS-1$
				textEmail.setText(Messages.getString("PanelEspecialista.104")); //$NON-NLS-1$
				textGenero.setText(Messages.getString("PanelEspecialista.105")); //$NON-NLS-1$
				textAñoDeNacimiento.setText(Messages.getString("PanelEspecialista.106")); //$NON-NLS-1$
				textCuentaBancaria.setText(Messages.getString("PanelEspecialista.107")); //$NON-NLS-1$
				textEspecialidad.setText(Messages.getString("PanelEspecialista.108")); //$NON-NLS-1$
				textTitulacion.setText(Messages.getString("PanelEspecialista.109")); //$NON-NLS-1$
				textEntra.setText(Messages.getString("PanelEspecialista.110")); //$NON-NLS-1$
				textSale.setText(Messages.getString("PanelEspecialista.111")); //$NON-NLS-1$
				textDespacho.setText(Messages.getString("PanelEspecialista.112")); //$NON-NLS-1$
				textDir.setText(Messages.getString("PanelEspecialista.113")); //$NON-NLS-1$
				textTlfClinica.setText(Messages.getString("PanelEspecialista.114")); //$NON-NLS-1$
				textExperiencia.setText(Messages.getString("PanelEspecialista.115")); //$NON-NLS-1$
				textColegiado.setText(Messages.getString("PanelEspecialista.116")); //$NON-NLS-1$
				textConsulta.setText(Messages.getString("PanelEspecialista.117")); //$NON-NLS-1$
				lblAdjunto.setText(Messages.getString("PanelEspecialista.118")); //$NON-NLS-1$
				text=Messages.getString("PanelEspecialista.119"); //$NON-NLS-1$
				btnLimpiar.setEnabled(false);
				btnAdjuntar.setEnabled(false);
				btnGuardar.setEnabled(false);
				btnEnviar.setEnabled(false);
				
			}else{
				textId.setText(especialistas.get(i).getId());
				textNombre.setText(especialistas.get(i).getNombre());
				textApellidos.setText(especialistas.get(i).getApellidos());
				textContraseña.setText(especialistas.get(i).getDni());
				textTlf.setText(especialistas.get(i).getTlf());
				textDomicilio.setText(especialistas.get(i).getMovil());
				textEmail.setText(especialistas.get(i).getEmail());
				textGenero.setText(especialistas.get(i).getDireccion());
				textAñoDeNacimiento.setText(especialistas.get(i).getLocalidad());
				textCuentaBancaria.setText(especialistas.get(i).getProvincia());
				textEspecialidad.setText(especialistas.get(i).getEspecialidad());
				textTitulacion.setText(especialistas.get(i).getTitulacion());
				textEntra.setText(especialistas.get(i).getEntra());
				textSale.setText(especialistas.get(i).getSale());
				textDespacho.setText(especialistas.get(i).getClinica());
				textDir.setText(especialistas.get(i).getDirClinica());
				textTlfClinica.setText(especialistas.get(i).getTlfClinica());
				textExperiencia.setText(especialistas.get(i).getExpe());
				textColegiado.setText(especialistas.get(i).getColegiado());
				btnLimpiar.setEnabled(true);
				btnAdjuntar.setEnabled(true);
				btnGuardar.setEnabled(true);
				btnEnviar.setEnabled(true);
			}
		}
	}
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			list.setSelectedIndex(-1);
			actualizarDatos();
		}
	}
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcSave = new JFileChooser();
			int valorDevuelto = fcSave.showSaveDialog(new PanelEspecialista(especialistas));
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				String ruta=fcSave.getSelectedFile().getAbsolutePath();
				try {
					BufferedWriter bw=new BufferedWriter(new FileWriter(fcSave.getSelectedFile()));
					bw.write(textConsulta.getText()+Messages.getString("PanelEspecialista.120")+ lblAdjunto.getText()); //$NON-NLS-1$
					bw.flush();
					JOptionPane.showMessageDialog(new PanelEspecialista(especialistas),Messages.getString("PanelEspecialista.121")+ruta); //$NON-NLS-1$
					bw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
	private class BtnEnviarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int i=list.getSelectedIndex();
			if(textConsulta.getText().equals(Messages.getString("PanelEspecialista.122"))){ //$NON-NLS-1$
				JOptionPane.showMessageDialog(new JFrame(), Messages.getString("PanelEspecialista.123"), //$NON-NLS-1$
						Messages.getString("PanelEspecialista.124"),JOptionPane.PLAIN_MESSAGE ); //$NON-NLS-1$
			}else{
				if((JOptionPane.showConfirmDialog(new JFrame (), Messages.getString("PanelEspecialista.125"), Messages.getString("PanelEspecialista.126"),JOptionPane.OK_CANCEL_OPTION)==JOptionPane.YES_OPTION)){ //$NON-NLS-1$ //$NON-NLS-2$
					
					JOptionPane.showMessageDialog(new JFrame(), Messages.getString("PanelEspecialista.127"), //$NON-NLS-1$
							Messages.getString("PanelEspecialista.128"),JOptionPane.PLAIN_MESSAGE ); //$NON-NLS-1$
					list.setSelectedIndex(-1);
					actualizarDatos();
				}
					
			}
		}
	}
}
