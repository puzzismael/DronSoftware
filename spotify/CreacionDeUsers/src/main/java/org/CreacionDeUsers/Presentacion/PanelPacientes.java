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
	private JFormattedTextField textFecha;
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
	private JPanel panelFoto;
	private JLabel labelFoto;
	private JTextField textHistoria;
	private JTextArea textHistorial;
	private JTextArea textPruebas;
	private JTextArea textAlergias;
	private JTextArea textTratamiento;
	private JTextField textId;

	
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
		scrollPane_1.setBorder(new TitledBorder(UIManager.getBorder("PanelPacientes.0"),"PanelPacientes.1", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK)); //$NON-NLS-1$ //$NON-NLS-2$
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
		panel.setBorder(new TitledBorder(null, "PanelPacientes.3", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK)); //$NON-NLS-1$
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 6;
		gbc_panel.gridwidth = 13;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 4;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		
		JLabel label = new JLabel("PanelPacientes.4"); //$NON-NLS-1$
		label.setFont(new Font("PanelPacientes.5", Font.BOLD, 11)); //$NON-NLS-1$
		label.setBounds(54, 27, 23, 15);
		panel.add(label);
		
		JLabel label_1 = new JLabel("PanelPacientes.6"); //$NON-NLS-1$
		label_1.setFont(new Font("PanelPacientes.7", Font.BOLD, 11)); //$NON-NLS-1$
		label_1.setBounds(9, 64, 68, 15);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("PanelPacientes.8"); //$NON-NLS-1$
		label_2.setFont(new Font("PanelPacientes.9", Font.BOLD, 11)); //$NON-NLS-1$
		label_2.setBounds(18, 102, 59, 15);
		panel.add(label_2);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("PanelPacientes.10", Font.PLAIN, 12)); //$NON-NLS-1$
		textNombre.setColumns(10);
		textNombre.setBorder(new TitledBorder(null, "PanelPacientes.11", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK)); //$NON-NLS-1$
		textNombre.setBackground(SystemColor.scrollbar);
		textNombre.setBounds(78, 98, 181, 24);
		panel.add(textNombre);
		
		textApellidos = new JTextField();
		textApellidos.setFont(new Font("PanelPacientes.12", Font.PLAIN, 12)); //$NON-NLS-1$
		textApellidos.setColumns(10);
		textApellidos.setBorder(new TitledBorder(UIManager.getBorder("PanelPacientes.13"), "PanelPacientes.14", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK)); //$NON-NLS-1$ //$NON-NLS-2$
		textApellidos.setBackground(SystemColor.scrollbar);
		textApellidos.setBounds(78, 60, 181, 24);
		panel.add(textApellidos);
		
		JLabel lblNHistoria = new JLabel("PanelPacientes.15"); //$NON-NLS-1$
		lblNHistoria.setForeground(Color.BLACK);
		lblNHistoria.setFont(new Font("PanelPacientes.16", Font.BOLD, 11)); //$NON-NLS-1$
		lblNHistoria.setBounds(112, 27, 87, 15);
		panel.add(lblNHistoria);
		
		JLabel label_4 = new JLabel("PanelPacientes.17"); //$NON-NLS-1$
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		label_4.setFont(new Font("PanelPacientes.18", Font.BOLD, 11)); //$NON-NLS-1$
		label_4.setBounds(267, 27, 124, 15);
		panel.add(label_4);
		
		//textFecha = new JFormattedTextField();
		MaskFormatter formatoFecha;
		try {
			formatoFecha = new MaskFormatter("PanelPacientes.19"); //$NON-NLS-1$
			formatoFecha.setPlaceholderCharacter('_');
			textFecha = new JFormattedTextField(formatoFecha);
			textFecha.setBorder(new TitledBorder(null,"PanelPacientes.20", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
			textFecha.setBackground(SystemColor.scrollbar);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		textFecha.setBounds(393, 24, 87, 20);
		panel.add(textFecha);
		textFecha.setEnabled(false);
		textFecha.setFont(new Font("PanelPacientes.21", Font.PLAIN, 11)); //$NON-NLS-1$
		
		JLabel label_5 = new JLabel("PanelPacientes.22"); //$NON-NLS-1$
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("PanelPacientes.23", Font.BOLD, 11)); //$NON-NLS-1$
		label_5.setBounds(328, 64, 55, 15);
		panel.add(label_5);
		
		rdbtnF = new JRadioButton("PanelPacientes.24"); //$NON-NLS-1$
		rdbtnF.addActionListener(new RdbtnFActionListener());
		rdbtnF.setFont(new Font("PanelPacientes.25", Font.BOLD, 11)); //$NON-NLS-1$
		rdbtnF.setBorder(new TitledBorder(null, "PanelPacientes.26", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		rdbtnF.setBackground(SystemColor.scrollbar);
		rdbtnF.setBounds(393, 59, 33, 25);
		panel.add(rdbtnF);
		
		rdbtnM = new JRadioButton("PanelPacientes.27"); //$NON-NLS-1$
		rdbtnM.addActionListener(new RdbtnMActionListener());
		rdbtnM.setFont(new Font("PanelPacientes.28", Font.BOLD, 11)); //$NON-NLS-1$
		rdbtnM.setBorder(new TitledBorder(null, "PanelPacientes.29", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		rdbtnM.setBackground(SystemColor.scrollbar);
		rdbtnM.setBounds(436, 59, 35, 25);
		panel.add(rdbtnM);
		
		lblNacionalidad = new JLabel("PanelPacientes.30"); //$NON-NLS-1$
		lblNacionalidad.setFont(new Font("PanelPacientes.31", Font.BOLD, 11)); //$NON-NLS-1$
		lblNacionalidad.setBounds(291, 102, 92, 14);
		panel.add(lblNacionalidad);
		
		textNacionalidad = new JTextField();
		textNacionalidad.setBorder(new TitledBorder(null, "PanelPacientes.32", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
		textNacionalidad.setBackground(SystemColor.scrollbar);
		textNacionalidad.setFont(new Font("PanelPacientes.33", Font.PLAIN, 12)); //$NON-NLS-1$
		textNacionalidad.setBounds(394, 100, 86, 20);
		panel.add(textNacionalidad);
		textNacionalidad.setColumns(10);
		
		JLabel lblDireccin = new JLabel("PanelPacientes.34"); //$NON-NLS-1$
		lblDireccin.setFont(new Font("PanelPacientes.35", Font.BOLD, 11)); //$NON-NLS-1$
		lblDireccin.setBounds(9, 138, 77, 14);
		panel.add(lblDireccin);
		
		textDireccion = new JTextField();
		textDireccion.setBorder(new TitledBorder(null,"PanelPacientes.36", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
		textDireccion.setBackground(SystemColor.scrollbar);
		textDireccion.setFont(new Font("PanelPacientes.37", Font.PLAIN, 12)); //$NON-NLS-1$
		textDireccion.setBounds(78, 136, 181, 20);
		panel.add(textDireccion);
		textDireccion.setColumns(10);
		
		JLabel lblMunicipio = new JLabel("PanelPacientes.38"); //$NON-NLS-1$
		lblMunicipio.setFont(new Font("PanelPacientes.39", Font.BOLD, 11)); //$NON-NLS-1$
		lblMunicipio.setBounds(314, 138, 77, 15);
		panel.add(lblMunicipio);
		
		textMunicipio = new JTextField();
		textMunicipio.setBorder(new TitledBorder(null, "PanelPacientes.40", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
		textMunicipio.setBackground(SystemColor.scrollbar);
		textMunicipio.setFont(new Font("PanelPacientes.41", Font.PLAIN, 12)); //$NON-NLS-1$
		textMunicipio.setBounds(394, 136, 86, 20);
		panel.add(textMunicipio);
		textMunicipio.setColumns(10);
		
		JLabel lblDni = new JLabel("PanelPacientes.42"); //$NON-NLS-1$
		lblDni.setFont(new Font("PanelPacientes.43", Font.BOLD, 11)); //$NON-NLS-1$
		lblDni.setBounds(43, 169, 34, 14);
		panel.add(lblDni);
		
		textDNI = new JTextField();
		textDNI.setBorder(new TitledBorder(null, "PanelPacientes.44", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
		textDNI.setBackground(SystemColor.scrollbar);
		textDNI.setFont(new Font("PanelPacientes.45", Font.PLAIN, 12)); //$NON-NLS-1$
		textDNI.setBounds(78, 167, 181, 20);
		panel.add(textDNI);
		textDNI.setColumns(10);
		
		lblCp = new JLabel("PanelPacientes.46"); //$NON-NLS-1$
		lblCp.setFont(new Font("PanelPacientes.47", Font.BOLD, 11)); //$NON-NLS-1$
		lblCp.setBounds(354, 169, 33, 14);
		panel.add(lblCp);
		
		textCP = new JTextField();
		textCP.setBorder(new TitledBorder(null,"PanelPacientes.48", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
		textCP.setBackground(SystemColor.scrollbar);
		textCP.setFont(new Font("PanelPacientes.49", Font.PLAIN, 12)); //$NON-NLS-1$
		textCP.setBounds(393, 167, 86, 20);
		panel.add(textCP);
		textCP.setColumns(10);
		
		panelFoto = new JPanel();
		panelFoto.setBorder(new TitledBorder(null,"PanelPacientes.50", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
		panelFoto.setBounds(517, 24, 153, 163);
		panel.add(panelFoto);
		
		labelFoto = new JLabel("PanelPacientes.51"); //$NON-NLS-1$
		panelFoto.add(labelFoto);
		
		textHistoria = new JTextField();
		textHistoria.setFont(new Font("PanelPacientes.52", Font.PLAIN, 12)); //$NON-NLS-1$
		textHistoria.setBorder(new TitledBorder(null,"PanelPacientes.53", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
		textHistoria.setBackground(SystemColor.scrollbar);
		textHistoria.setBounds(195, 25, 64, 20);
		panel.add(textHistoria);
		textHistoria.setColumns(10);
		
		textId = new JTextField();
		textId.setBorder(new TitledBorder(null, "PanelPacientes.54", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
		textId.setFont(new Font("PanelPacientes.55", Font.PLAIN, 12)); //$NON-NLS-1$
		textId.setBackground(SystemColor.scrollbar);
		textId.setBounds(77, 25, 23, 20);
		panel.add(textId);
		textId.setColumns(10);
		
		scrollPane_5 = new JScrollPane();
		scrollPane_5.setBorder(new TitledBorder(null, "PanelPacientes.56", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
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
		scrollPane_4.setBorder(new TitledBorder(null, "PanelPacientes.58", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
		GridBagConstraints gbc_scrollPane_4 = new GridBagConstraints();
		gbc_scrollPane_4.gridwidth = 5;
		gbc_scrollPane_4.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_4.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_4.gridx = 12;
		gbc_scrollPane_4.gridy = 6;
		add(scrollPane_4, gbc_scrollPane_4);
		
		textAlergias = new JTextArea();
		textAlergias.setFont(new Font("PanelPacientes.59", Font.PLAIN, 11)); //$NON-NLS-1$
		textAlergias.setBackground(SystemColor.menu);
		textAlergias.setText("PanelPacientes.60"); //$NON-NLS-1$
		scrollPane_4.setViewportView(textAlergias);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(new TitledBorder(null,"PanelPacientes.61", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
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
		scrollPane_3.setBorder(new TitledBorder(UIManager.getBorder("PanelPacientes.63"),"PanelPacientes.64", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$ //$NON-NLS-2$
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
		textTratamiento.setText("PanelPacientes.66"); //$NON-NLS-1$
		scrollPane_3.setViewportView(textTratamiento);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBackground(SystemColor.menu);
		scrollPane.setBorder(new TitledBorder(null,"PanelPacientes.67", TitledBorder.CENTER, TitledBorder.TOP, null, null)); //$NON-NLS-1$
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
		
		btnImprimir = new JButton("PanelPacientes.69"); //$NON-NLS-1$
		btnImprimir.setEnabled(false);
		btnImprimir.setBorder(new TitledBorder(null, "PanelPacientes.70", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		//btnImprimir.setIcon(new ImageIcon(PanelPacientes.class.getResource("PanelPacientes.71"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnImprimir = new GridBagConstraints();
		gbc_btnImprimir.gridheight = 2;
		gbc_btnImprimir.gridwidth = 2;
		gbc_btnImprimir.fill = GridBagConstraints.BOTH;
		gbc_btnImprimir.insets = new Insets(0, 0, 5, 0);
		gbc_btnImprimir.gridx = 15;
		gbc_btnImprimir.gridy = 9;
		add(btnImprimir, gbc_btnImprimir);
		
		btnGenerarReceta = new JButton("PanelPacientes.72"); //$NON-NLS-1$
		btnGenerarReceta.setBorder(new TitledBorder(null, "PanelPacientes.73", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		//btnGenerarReceta.setIcon(new ImageIcon(PanelPacientes.class.getResource("PanelPacientes.74"))); //$NON-NLS-1$
		btnGenerarReceta.setFont(new Font("PanelPacientes.75", Font.BOLD, 11)); //$NON-NLS-1$
		btnGenerarReceta.addActionListener(new BtnGenerarRecetaActionListener());
		btnGenerarReceta.setEnabled(false);
		GridBagConstraints gbc_btnGenerarReceta = new GridBagConstraints();
		gbc_btnGenerarReceta.gridwidth = 2;
		gbc_btnGenerarReceta.insets = new Insets(0, 0, 5, 0);
		gbc_btnGenerarReceta.fill = GridBagConstraints.BOTH;
		gbc_btnGenerarReceta.gridx = 15;
		gbc_btnGenerarReceta.gridy = 11;
		add(btnGenerarReceta, gbc_btnGenerarReceta);
		
		btnActualizar = new JButton("PanelPacientes.76"); //$NON-NLS-1$
		btnActualizar.setFont(new Font("PanelPacientes.77", Font.BOLD, 11)); //$NON-NLS-1$
		btnActualizar.setEnabled(false);
		btnActualizar.addActionListener(new BtnActualizarActionListener());
		
		btnLimpiar = new JButton("PanelPacientes.78"); //$NON-NLS-1$
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		
		btnActualizarListaDe = new JButton("PanelPacientes.79"); //$NON-NLS-1$
		btnActualizarListaDe.addActionListener(new BtnActualizarListaDeActionListener());
		GridBagConstraints gbc_btnActualizarListaDe = new GridBagConstraints();
		gbc_btnActualizarListaDe.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnActualizarListaDe.gridwidth = 4;
		gbc_btnActualizarListaDe.anchor = GridBagConstraints.SOUTH;
		gbc_btnActualizarListaDe.insets = new Insets(0, 0, 0, 5);
		gbc_btnActualizarListaDe.gridx = 0;
		gbc_btnActualizarListaDe.gridy = 12;
		add(btnActualizarListaDe, gbc_btnActualizarListaDe);
		btnLimpiar.setFont(new Font("PanelPacientes.80", Font.BOLD, 11)); //$NON-NLS-1$
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
				textFecha.setText("PanelPacientes.87"); //$NON-NLS-1$
				textDireccion.setText("PanelPacientes.88"); //$NON-NLS-1$
				textDNI.setText("PanelPacientes.89"); //$NON-NLS-1$
				textNacionalidad.setText("PanelPacientes.90"); //$NON-NLS-1$
				textMunicipio.setText("PanelPacientes.91"); //$NON-NLS-1$
				textCP.setText("PanelPacientes.92"); //$NON-NLS-1$
				textHistorial.setText("PanelPacientes.93"); //$NON-NLS-1$
				textAlergias.setText("PanelPacientes.94"); //$NON-NLS-1$
				textPruebas.setText("PanelPacientes.95"); //$NON-NLS-1$
				textTratamiento.setText("PanelPacientes.96"); //$NON-NLS-1$
				btnActualizar.setEnabled(false);
				btnGenerarReceta.setEnabled(false);
				btnLimpiar.setEnabled(false);
				btnImprimir.setEnabled(false);
				textFecha.setEnabled(false);
				grupo1.clearSelection();
				labelFoto.setIcon(null);
				
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
				textFecha.setEnabled(true);
				
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
