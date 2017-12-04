package org.CreacionDeUsers.Presentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.MaskFormatter;

import org.CreacionDeUsers.Dominio.usuario;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.DropMode;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
import com.toedter.calendar.JDateChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
//import presentacion.Principal.BtnActualizarActionListener;
//import presentacion.Principal.ListListSelectionListener;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JTextArea;

public class PanelPacientes extends JPanel {
	private JList<usuario> list;
	private JButton btnGenerarReceta;
	private JButton btnActualizar;
	private ArrayList<usuario> users;
	private JButton btnLimpiar;
	private JScrollPane scrollPane;
	private JEditorPane textReceta;
	private JScrollPane scrollPane_1;
	private JButton btnImprimir;
	private ButtonGroup grupo1;
	private JPanel panel;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JRadioButton rdbtnF;
	private JRadioButton rdbtnM;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_4;
	private JScrollPane scrollPane_5;
	private JButton btnActualizarListaDe;
	private JLabel lblNacionalidad;
	private JTextField textNacionalidad;
	private JTextField textDireccion;
	private JTextField textMunicipio;
	private JTextField textDNI;
	private JLabel lblCp;
	private JTextField textCP;
	private JTextField textHistoria;
	private JTextArea textHistorial;
	private JTextArea textPruebas;
	private JTextArea textFavoritos;
	private JTextArea textTratamiento;
	private JTextField textId;
	private JTextField textField;

	
	public PanelPacientes(ArrayList<usuario> users) {
		setBackground(SystemColor.text);
		this.users=users;
		setBorder(null);
		list = new JList<usuario>();
		
		GridBagLayout gbl_GestiondePacientes = new GridBagLayout();
		gbl_GestiondePacientes.columnWidths = new int[]{120, 53, 0, 37, 40, 26, 73, 38, 37, 35, 30, 33, 46, 43, 43, 0, 0, 0};
		gbl_GestiondePacientes.rowHeights = new int[]{35, 30, 31, 31, 30, 46, 56, 0, 0, 0, 18, 0, 40, 0};
		gbl_GestiondePacientes.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_GestiondePacientes.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gbl_GestiondePacientes);
		actualizarDatos();
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setEnabled(false);
		scrollPane_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Listado De Usuarios", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$ //$NON-NLS-2$
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 12;
		gbc_scrollPane_1.gridwidth = 4;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 0;
		add(scrollPane_1, gbc_scrollPane_1);
		
		
		scrollPane_1.setViewportView(list);
		list.setBackground(SystemColor.menu);
		list.setFont(new Font("PanelPacientes.2", Font.BOLD, 11)); //$NON-NLS-1$
		list.setSelectionBackground(SystemColor.scrollbar);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListListSelectionListener());
		list.setBorder(null);
		
		
		grupo1 = new ButtonGroup();
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Panel usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 6;
		gbc_panel.gridwidth = 13;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 4;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		
		JLabel lblId = new JLabel("ID:"); //$NON-NLS-1$
		lblId.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblId.setBounds(73, 27, 23, 15);
		panel.add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre:"); //$NON-NLS-1$
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblNombre.setBounds(38, 65, 58, 15);
		panel.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad:"); //$NON-NLS-1$
		lblEdad.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblEdad.setBounds(52, 103, 44, 15);
		panel.add(lblEdad);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("PanelPacientes.10", Font.PLAIN, 12)); //$NON-NLS-1$
		textNombre.setColumns(10);
		textNombre.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textNombre.setBackground(SystemColor.scrollbar);
		textNombre.setBounds(106, 98, 186, 24);
		panel.add(textNombre);
		
		textApellidos = new JTextField();
		textApellidos.setFont(new Font("PanelPacientes.12", Font.PLAIN, 12)); //$NON-NLS-1$
		textApellidos.setColumns(10);
		textApellidos.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$ //$NON-NLS-2$
		textApellidos.setBackground(SystemColor.scrollbar);
		textApellidos.setBounds(106, 60, 186, 24);
		panel.add(textApellidos);
		
		JLabel lblNHistoria = new JLabel("Contraseña:"); //$NON-NLS-1$
		lblNHistoria.setForeground(Color.BLACK);
		lblNHistoria.setFont(new Font("PanelPacientes.16", Font.BOLD, 11)); //$NON-NLS-1$
		lblNHistoria.setBounds(145, 27, 73, 15);
		panel.add(lblNHistoria);
		
		JLabel lblAaa = new JLabel("nacionalidad"); //$NON-NLS-1$
		lblAaa.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAaa.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblAaa.setBounds(302, 27, 87, 15);
		panel.add(lblAaa);
		
		//textFecha = new JFormattedTextField();
		MaskFormatter formatoFecha;
		try {
			formatoFecha = new MaskFormatter("PanelPacientes.19"); //$NON-NLS-1$
			formatoFecha.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JLabel lblGenero = new JLabel("Genero"); //$NON-NLS-1$
		lblGenero.setForeground(Color.BLACK);
		lblGenero.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblGenero.setBounds(334, 65, 55, 15);
		panel.add(lblGenero);
		
		rdbtnF = new JRadioButton("F"); //$NON-NLS-1$
		rdbtnF.addActionListener(new RdbtnFActionListener());
		rdbtnF.setFont(new Font("PanelPacientes.25", Font.BOLD, 11)); //$NON-NLS-1$
		rdbtnF.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		rdbtnF.setBackground(SystemColor.scrollbar);
		rdbtnF.setBounds(399, 60, 33, 25);
		panel.add(rdbtnF);
		
		rdbtnM = new JRadioButton("M"); //$NON-NLS-1$
		rdbtnM.addActionListener(new RdbtnMActionListener());
		rdbtnM.setFont(new Font("PanelPacientes.28", Font.BOLD, 11)); //$NON-NLS-1$
		rdbtnM.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		rdbtnM.setBackground(SystemColor.scrollbar);
		rdbtnM.setBounds(460, 60, 35, 25);
		panel.add(rdbtnM);
		
		lblNacionalidad = new JLabel("Municipio"); //$NON-NLS-1$
		lblNacionalidad.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblNacionalidad.setBounds(325, 103, 64, 14);
		panel.add(lblNacionalidad);
		
		textNacionalidad = new JTextField();
		textNacionalidad.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textNacionalidad.setBackground(SystemColor.scrollbar);
		textNacionalidad.setFont(new Font("PanelPacientes.33", Font.PLAIN, 12)); //$NON-NLS-1$
		textNacionalidad.setBounds(393, 100, 102, 20);
		panel.add(textNacionalidad);
		textNacionalidad.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Código Postal"); //$NON-NLS-1$
		lblDireccin.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblDireccin.setBounds(9, 138, 101, 14);
		panel.add(lblDireccin);
		
		textDireccion = new JTextField();
		textDireccion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textDireccion.setBackground(SystemColor.scrollbar);
		textDireccion.setFont(new Font("PanelPacientes.37", Font.PLAIN, 12)); //$NON-NLS-1$
		textDireccion.setBounds(106, 136, 186, 20);
		panel.add(textDireccion);
		textDireccion.setColumns(10);
		
		JLabel lblMunicipio = new JLabel("Correo"); //$NON-NLS-1$
		lblMunicipio.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblMunicipio.setBounds(345, 138, 44, 15);
		panel.add(lblMunicipio);
		
		textMunicipio = new JTextField();
		textMunicipio.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textMunicipio.setBackground(SystemColor.scrollbar);
		textMunicipio.setFont(new Font("PanelPacientes.41", Font.PLAIN, 12)); //$NON-NLS-1$
		textMunicipio.setBounds(394, 136, 101, 20);
		panel.add(textMunicipio);
		textMunicipio.setColumns(10);
		
		JLabel lblDni = new JLabel("Estudios"); //$NON-NLS-1$
		lblDni.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblDni.setBounds(38, 170, 58, 14);
		panel.add(lblDni);
		
		textDNI = new JTextField();
		textDNI.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textDNI.setBackground(SystemColor.scrollbar);
		textDNI.setFont(new Font("PanelPacientes.45", Font.PLAIN, 12)); //$NON-NLS-1$
		textDNI.setBounds(106, 167, 186, 20);
		panel.add(textDNI);
		textDNI.setColumns(10);
		
		lblCp = new JLabel("C. Bancaria"); //$NON-NLS-1$
		lblCp.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblCp.setBounds(316, 170, 73, 14);
		panel.add(lblCp);
		
		textCP = new JTextField();
		textCP.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textCP.setBackground(SystemColor.scrollbar);
		textCP.setFont(new Font("PanelPacientes.49", Font.PLAIN, 12)); //$NON-NLS-1$
		textCP.setBounds(393, 167, 102, 20);
		panel.add(textCP);
		textCP.setColumns(10);
		
		textHistoria = new JTextField();
		textHistoria.setFont(new Font("PanelPacientes.52", Font.PLAIN, 12)); //$NON-NLS-1$
		textHistoria.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textHistoria.setBackground(SystemColor.scrollbar);
		textHistoria.setBounds(228, 24, 64, 20);
		panel.add(textHistoria);
		textHistoria.setColumns(10);
		
		textId = new JTextField();
		textId.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textId.setFont(new Font("PanelPacientes.55", Font.PLAIN, 12)); //$NON-NLS-1$
		textId.setBackground(SystemColor.scrollbar);
		textId.setBounds(106, 24, 33, 20);
		panel.add(textId);
		textId.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textField.setBackground(SystemColor.scrollbar);
		textField.setBounds(399, 25, 96, 24);
		panel.add(textField);
		
		scrollPane_5 = new JScrollPane();
		scrollPane_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Historial spotify", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		GridBagConstraints gbc_scrollPane_5 = new GridBagConstraints();
		gbc_scrollPane_5.gridwidth = 8;
		gbc_scrollPane_5.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_5.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_5.gridx = 4;
		gbc_scrollPane_5.gridy = 6;
		add(scrollPane_5, gbc_scrollPane_5);
		
		textHistorial = new JTextArea();
		textHistorial.setBackground(SystemColor.menu);
		textHistorial.setFont(new Font("PanelPacientes.57", Font.PLAIN, 11)); //$NON-NLS-1$
		scrollPane_5.setViewportView(textHistorial);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos favoritos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		GridBagConstraints gbc_scrollPane_4 = new GridBagConstraints();
		gbc_scrollPane_4.gridwidth = 5;
		gbc_scrollPane_4.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_4.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_4.gridx = 12;
		gbc_scrollPane_4.gridy = 6;
		add(scrollPane_4, gbc_scrollPane_4);
		
		textFavoritos = new JTextArea();
		textFavoritos.setFont(new Font("PanelPacientes.59", Font.PLAIN, 11)); //$NON-NLS-1$
		textFavoritos.setBackground(SystemColor.menu);
		scrollPane_4.setViewportView(textFavoritos);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Lista de deseados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.gridheight = 2;
		gbc_scrollPane_2.gridwidth = 8;
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 4;
		gbc_scrollPane_2.gridy = 7;
		add(scrollPane_2, gbc_scrollPane_2);
		
		textPruebas = new JTextArea();
		textPruebas.setBackground(SystemColor.menu);
		textPruebas.setFont(new Font("PanelPacientes.62", Font.PLAIN, 11)); //$NON-NLS-1$
		scrollPane_2.setViewportView(textPruebas);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "M\u00E1s comprados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$ //$NON-NLS-2$
		GridBagConstraints gbc_scrollPane_3 = new GridBagConstraints();
		gbc_scrollPane_3.gridheight = 2;
		gbc_scrollPane_3.gridwidth = 5;
		gbc_scrollPane_3.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_3.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_3.gridx = 12;
		gbc_scrollPane_3.gridy = 7;
		add(scrollPane_3, gbc_scrollPane_3);
		
		textTratamiento = new JTextArea();
		textTratamiento.setFont(new Font("PanelPacientes.65", Font.PLAIN, 11)); //$NON-NLS-1$
		textTratamiento.setBackground(SystemColor.menu);
		scrollPane_3.setViewportView(textTratamiento);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBackground(SystemColor.menu);
		scrollPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Notas sobre el cliente", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.gridwidth = 11;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 4;
		gbc_scrollPane.gridy = 9;
		add(scrollPane, gbc_scrollPane);
		
		textReceta = new JEditorPane();
		textReceta.setFont(new Font("PanelPacientes.68", Font.BOLD, 11)); //$NON-NLS-1$
		textReceta.setEnabled(false);
		textReceta.setBorder(null);
		textReceta.setBackground(SystemColor.menu);
		scrollPane.setViewportView(textReceta);
		
		btnImprimir = new JButton("Guardar"); //$NON-NLS-1$
		btnImprimir.setFont(new Font("Verdana", Font.BOLD, 11));
		btnImprimir.setEnabled(false);
		btnImprimir.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		//btnImprimir.setIcon(new ImageIcon(PanelPacientes.class.getResource("PanelPacientes.71"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnImprimir = new GridBagConstraints();
		gbc_btnImprimir.gridheight = 2;
		gbc_btnImprimir.gridwidth = 2;
		gbc_btnImprimir.fill = GridBagConstraints.BOTH;
		gbc_btnImprimir.insets = new Insets(0, 0, 5, 0);
		gbc_btnImprimir.gridx = 15;
		gbc_btnImprimir.gridy = 9;
		add(btnImprimir, gbc_btnImprimir);
		
		btnGenerarReceta = new JButton("imprimir"); //$NON-NLS-1$
		btnGenerarReceta.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		//btnGenerarReceta.setIcon(new ImageIcon(PanelPacientes.class.getResource("PanelPacientes.74"))); //$NON-NLS-1$
		btnGenerarReceta.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		btnGenerarReceta.addActionListener(new BtnGenerarRecetaActionListener());
		btnGenerarReceta.setEnabled(false);
		GridBagConstraints gbc_btnGenerarReceta = new GridBagConstraints();
		gbc_btnGenerarReceta.gridwidth = 2;
		gbc_btnGenerarReceta.insets = new Insets(0, 0, 5, 0);
		gbc_btnGenerarReceta.fill = GridBagConstraints.BOTH;
		gbc_btnGenerarReceta.gridx = 15;
		gbc_btnGenerarReceta.gridy = 11;
		add(btnGenerarReceta, gbc_btnGenerarReceta);
		
		btnActualizar = new JButton("Guardar Cambios"); //$NON-NLS-1$
		btnActualizar.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		btnActualizar.setEnabled(false);
		btnActualizar.addActionListener(new BtnActualizarActionListener());
		
		btnLimpiar = new JButton("Limpiar"); //$NON-NLS-1$
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		
		btnActualizarListaDe = new JButton("Actualizar lista de Usuarios"); //$NON-NLS-1$
		btnActualizarListaDe.addActionListener(new BtnActualizarListaDeActionListener());
		GridBagConstraints gbc_btnActualizarListaDe = new GridBagConstraints();
		gbc_btnActualizarListaDe.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnActualizarListaDe.gridwidth = 4;
		gbc_btnActualizarListaDe.anchor = GridBagConstraints.SOUTH;
		gbc_btnActualizarListaDe.insets = new Insets(0, 0, 0, 5);
		gbc_btnActualizarListaDe.gridx = 0;
		gbc_btnActualizarListaDe.gridy = 12;
		add(btnActualizarListaDe, gbc_btnActualizarListaDe);
		btnLimpiar.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		btnLimpiar.setEnabled(false);
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.anchor = GridBagConstraints.SOUTH;
		gbc_btnLimpiar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLimpiar.gridwidth = 4;
		gbc_btnLimpiar.insets = new Insets(0, 0, 0, 5);
		gbc_btnLimpiar.gridx = 4;
		gbc_btnLimpiar.gridy = 12;
		add(btnLimpiar, gbc_btnLimpiar);
		GridBagConstraints gbc_btnActualizar = new GridBagConstraints();
		gbc_btnActualizar.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnActualizar.gridwidth = 3;
		gbc_btnActualizar.gridx = 14;
		gbc_btnActualizar.gridy = 12;
		add(btnActualizar, gbc_btnActualizar);
		
	}
	
	public void actualizarDatos(){
		DefaultListModel modelo = new DefaultListModel();
		/*for(int i=0;i<users.size();i++){
			modelo.addElement(users.get(i).getApellidos()+"PanelPacientes.81"+users.get(i).getNombre()); //$NON-NLS-1$
		}*/
		list.setModel(modelo);
	}
	
	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
			int i=list.getSelectedIndex();
			if(i==-1){
				textNombre.setText("PanelPacientes.82"); //$NON-NLS-1$
				textApellidos.setText("PanelPacientes.83"); //$NON-NLS-1$
				textId.setText("PanelPacientes.84"); //$NON-NLS-1$
				textHistoria.setText("PanelPacientes.85"); //$NON-NLS-1$
				textReceta.setEnabled(false);
				textReceta.setText("PanelPacientes.86"); //$NON-NLS-1$
			//.setText("PanelPacientes.87"); //$NON-NLS-1$
				textDireccion.setText("PanelPacientes.88"); //$NON-NLS-1$
				textDNI.setText("PanelPacientes.89"); //$NON-NLS-1$
				textNacionalidad.setText("PanelPacientes.90"); //$NON-NLS-1$
				textMunicipio.setText("PanelPacientes.91"); //$NON-NLS-1$
				textCP.setText("PanelPacientes.92"); //$NON-NLS-1$
				textHistorial.setText("PanelPacientes.93"); //$NON-NLS-1$
				textFavoritos.setText("PanelPacientes.94"); //$NON-NLS-1$
				textPruebas.setText("PanelPacientes.95"); //$NON-NLS-1$
				textTratamiento.setText("PanelPacientes.96"); //$NON-NLS-1$
				btnActualizar.setEnabled(false);
				btnGenerarReceta.setEnabled(false);
				btnLimpiar.setEnabled(false);
				btnImprimir.setEnabled(false);
				//textFecha.setEnabled(false);
				grupo1.clearSelection();
				//labelFoto.setIcon(null);
				
			}else{
				textApellidos.setText(users.get(i).getApellidos());
				textNombre.setText(users.get(i).getNombre());
				//textId.setText("PanelPacientes.97"+users.get(i).getId()); //$NON-NLS-1$
				//textHistoria.setText(users.get(i).getHistoria());
				//textFecha.setText(users.get(i).getEdad());
				//if(users.get(i).getSexo().equals(Messages.getString("PanelPacientes.98"))){ //$NON-NLS-1$
					rdbtnM.setSelected(true);
					rdbtnF.setSelected(false);
			//	}else{
					rdbtnF.setSelected(true);
					rdbtnM.setSelected(false);
				//}
				//textDireccion.setText(users.get(i).getDireccion());
			//	textDNI.setText(users.get(i).getDni());
				//textNacionalidad.setText(pacientes.get(i).getNacionalidad());
				//textMunicipio.setText(pacientes.get(i).getMunicipio());
				//textCP.setText(pacientes.get(i).getCp());
			//	labelFoto.setIcon(pacientes.get(i).getImage());
				//textHistoria.setText(pacientes.get(i).getHistoria());
				//textTratamiento.setText(pacientes.get(i).getMedicaci�n());
				//textAlergias.setText(pacientes.get(i).getAlergias());
				//textPruebas.setText(pacientes.get(i).getPruebas());
				//textHistorial.setText(pacientes.get(i).getHistorial());
				btnActualizar.setEnabled(true);
				btnGenerarReceta.setEnabled(true);
				btnLimpiar.setEnabled(true);
				textReceta.setEnabled(true);
				btnImprimir.setEnabled(true);
				//textFecha.setEnabled(true);
				
			}
		}
	}
	private class BtnActualizarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int i=list.getSelectedIndex();
	/*		pacientes.get(i).setNombre(textNombre.getText());
			pacientes.get(i).setApellidos(textApellidos.getText());
			pacientes.get(i).setEdad(textFecha.getText());
			pacientes.get(i).setDni(textDNI.getText());
			pacientes.get(i).setId(textId.getText());
			pacientes.get(i).setHistoria(textHistoria.getText());
			pacientes.get(i).setNacionalidad(textNacionalidad.getText());
			pacientes.get(i).setDireccion(textDireccion.getText());
			pacientes.get(i).setMunicipio(textMunicipio.getText());
			pacientes.get(i).setCp(textCP.getText());
			pacientes.get(i).setHistorial(textHistorial.getText());
			pacientes.get(i).setAlergias(textAlergias.getText());
			pacientes.get(i).setPruebas(textPruebas.getText());
			pacientes.get(i).setPruebas(textPruebas.getText()); */
			if(rdbtnF.isSelected()){
			//	users.get(i).setSexo("PanelPacientes.99"); //$NON-NLS-1$
			}else{
				//pacientes.get(i).setSexo(Messages.getString("PanelPacientes.100")); //$NON-NLS-1$
			}
			
			actualizarDatos();
		}
	}
	private class BtnGenerarRecetaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(textReceta.getText().equals("PanelPacientes.101")){ //$NON-NLS-1$
				JOptionPane.showMessageDialog(new JFrame(), "PanelPacientes.102", //$NON-NLS-1$
						"PanelPacientes.103",JOptionPane.PLAIN_MESSAGE ); //$NON-NLS-1$
			}else{
				JFileChooser fcSave = new JFileChooser();
				int valorDevuelto = fcSave.showSaveDialog(new JPanel());
				if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
					String ruta=fcSave.getSelectedFile().getAbsolutePath();
					try {
						BufferedWriter bw=new BufferedWriter(new FileWriter(fcSave.getSelectedFile()));
						bw.write("PanelPacientes.104"+ textNombre.getText()+"PanelPacientes.105"+textApellidos.getText()+"PanelPacientes.106"+textReceta.getText()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						bw.flush();
						JOptionPane.showMessageDialog(new JPanel(),"PanelPacientes.107"+ruta); //$NON-NLS-1$
						bw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
									
			}
			
		}
	}
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			list.setSelectedIndex(-1);
			actualizarDatos();
		}
	}
	private class BtnActualizarListaDeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			actualizarDatos();
		}
	}
	private class RdbtnFActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(rdbtnF.isSelected()){
				rdbtnM.setSelected(false);
			}
		}
	}
	private class RdbtnMActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(rdbtnM.isSelected()){
				rdbtnF.setSelected(false);
			}
		}
	}
}
