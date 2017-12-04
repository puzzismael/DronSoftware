package org.modificarPrecioYMetadatos.Presentacion;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextPane;

public class ModificarProducto extends JPanel {
	private JTextField textID;
	private JTextField textApellidos;
	private JTextField textNombre;
	private JTextField textDireccion;
	private JTextField textDNI;
	private JTextField textNHistoria;
	private JTextField textFechaNacimiento;
	private JTextField textGenero;
	private JTextField textNacionalidad;
	private JTextField textMunicipio;
	private JTextField textCP;

	/**
	 * Create the panel.
	 */
	public ModificarProducto() {
		setBackground(UIManager.getColor("Button.disabledShadow"));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{57, 35, 32, 107, -47, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{35, 30, 31, 31, 30, 46, 51, 40, 32, 40, 27, 30, 45, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Listado De Canciones", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 12;
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		list.setBackground(SystemColor.control);
		scrollPane.setViewportView(list);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Cancion/album", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 6;
		gbc_panel.gridwidth = 21;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 4;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		
		JLabel lblID = new JLabel("ID :");
		lblID.setFont(new Font("Verdana", Font.BOLD, 11));
		lblID.setBounds(71, 41, 23, 15);
		panel.add(lblID);
		
		JLabel lblApellidos = new JLabel("Apellidos :");
		lblApellidos.setFont(new Font("Verdana", Font.BOLD, 11));
		lblApellidos.setBounds(26, 78, 68, 15);
		panel.add(lblApellidos);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNombre.setBounds(35, 104, 59, 15);
		panel.add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setFont(new Font("Verdana", Font.BOLD, 11));
		lblDireccion.setBounds(26, 130, 68, 14);
		panel.add(lblDireccion);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Verdana", Font.BOLD, 11));
		lblDni.setBounds(71, 161, 28, 14);
		panel.add(lblDni);
		
		textID = new JTextField();
		textID.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textID.setBackground(SystemColor.activeCaptionBorder);
		textID.setBounds(113, 39, 23, 20);
		panel.add(textID);
		textID.setColumns(10);
		
		textApellidos = new JTextField();
		textApellidos.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textApellidos.setBackground(SystemColor.activeCaptionBorder);
		textApellidos.setBounds(113, 76, 172, 20);
		panel.add(textApellidos);
		textApellidos.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textNombre.setBackground(SystemColor.activeCaptionBorder);
		textNombre.setBounds(113, 102, 172, 20);
		panel.add(textNombre);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textDireccion.setBackground(SystemColor.activeCaptionBorder);
		textDireccion.setBounds(113, 128, 172, 20);
		panel.add(textDireccion);
		
		textDNI = new JTextField();
		textDNI.setColumns(10);
		textDNI.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textDNI.setBackground(SystemColor.activeCaptionBorder);
		textDNI.setBounds(113, 159, 172, 20);
		panel.add(textDNI);
		
		JLabel lblNHistoria = new JLabel("N\u00BA Historia: ");
		lblNHistoria.setForeground(Color.BLACK);
		lblNHistoria.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNHistoria.setBounds(156, 42, 87, 15);
		panel.add(lblNHistoria);
		
		textNHistoria = new JTextField();
		textNHistoria.setColumns(10);
		textNHistoria.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textNHistoria.setBackground(SystemColor.activeCaptionBorder);
		textNHistoria.setBounds(240, 39, 45, 20);
		panel.add(textNHistoria);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento :");
		lblFechaNacimiento.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFechaNacimiento.setFont(new Font("Verdana", Font.BOLD, 11));
		lblFechaNacimiento.setBounds(310, 47, 124, 15);
		panel.add(lblFechaNacimiento);
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setColumns(10);
		textFechaNacimiento.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textFechaNacimiento.setBackground(SystemColor.activeCaptionBorder);
		textFechaNacimiento.setBounds(444, 45, 86, 20);
		panel.add(textFechaNacimiento);
		
		JLabel lblGenero = new JLabel("G\u00E9nero :");
		lblGenero.setForeground(Color.BLACK);
		lblGenero.setFont(new Font("Verdana", Font.BOLD, 11));
		lblGenero.setBounds(379, 78, 55, 15);
		panel.add(lblGenero);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad :");
		lblNacionalidad.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNacionalidad.setBounds(344, 104, 92, 14);
		panel.add(lblNacionalidad);
		
		JLabel lblMunicipio = new JLabel("Municipio :");
		lblMunicipio.setFont(new Font("Verdana", Font.BOLD, 11));
		lblMunicipio.setBounds(364, 130, 77, 15);
		panel.add(lblMunicipio);
		
		JLabel lblCP = new JLabel("C.P :");
		lblCP.setFont(new Font("Verdana", Font.BOLD, 11));
		lblCP.setBounds(401, 162, 33, 14);
		panel.add(lblCP);
		
		textGenero = new JTextField();
		textGenero.setColumns(10);
		textGenero.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textGenero.setBackground(SystemColor.activeCaptionBorder);
		textGenero.setBounds(444, 76, 86, 20);
		panel.add(textGenero);
		
		textNacionalidad = new JTextField();
		textNacionalidad.setColumns(10);
		textNacionalidad.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textNacionalidad.setBackground(SystemColor.activeCaptionBorder);
		textNacionalidad.setBounds(444, 102, 86, 20);
		panel.add(textNacionalidad);
		
		textMunicipio = new JTextField();
		textMunicipio.setColumns(10);
		textMunicipio.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textMunicipio.setBackground(SystemColor.activeCaptionBorder);
		textMunicipio.setBounds(444, 130, 86, 20);
		panel.add(textMunicipio);
		
		textCP = new JTextField();
		textCP.setColumns(10);
		textCP.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textCP.setBackground(SystemColor.activeCaptionBorder);
		textCP.setBounds(444, 159, 86, 20);
		panel.add(textCP);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Mensaje", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 3;
		gbc_panel_1.gridwidth = 12;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 4;
		gbc_panel_1.gridy = 6;
		add(panel_1, gbc_panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTextPane textPane = new JTextPane();
		panel_1.add(textPane, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Datos econ\u00F3micos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(UIManager.getColor("Button.background"));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridheight = 3;
		gbc_panel_2.gridwidth = 9;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 16;
		gbc_panel_2.gridy = 6;
		add(panel_2, gbc_panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JTextPane textPane_1 = new JTextPane();
		panel_2.add(textPane_1, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Datos spotify", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 12;
		gbc_panel_3.gridheight = 2;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 4;
		gbc_panel_3.gridy = 9;
		add(panel_3, gbc_panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JTextPane textPane_2 = new JTextPane();
		panel_3.add(textPane_2, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Datos Calidad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridwidth = 9;
		gbc_panel_4.gridheight = 2;
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 16;
		gbc_panel_4.gridy = 9;
		add(panel_4, gbc_panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JTextPane textPane_3 = new JTextPane();
		panel_4.add(textPane_3, BorderLayout.CENTER);
		
		JButton btnActualizarListaDe = new JButton("Actualizar lista de productos");
		GridBagConstraints gbc_btnActualizarListaDe = new GridBagConstraints();
		gbc_btnActualizarListaDe.gridwidth = 4;
		gbc_btnActualizarListaDe.insets = new Insets(0, 0, 0, 5);
		gbc_btnActualizarListaDe.gridx = 0;
		gbc_btnActualizarListaDe.gridy = 12;
		add(btnActualizarListaDe, gbc_btnActualizarListaDe);
		
		JButton button_1 = new JButton("Limpiar");
		button_1.setFont(new Font("Verdana", Font.BOLD, 11));
		button_1.setEnabled(false);
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.gridwidth = 4;
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 4;
		gbc_button_1.gridy = 12;
		add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("Guardar Cambios");
		button_2.setFont(new Font("Verdana", Font.BOLD, 11));
		button_2.setEnabled(false);
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.gridwidth = 5;
		gbc_button_2.insets = new Insets(0, 0, 0, 5);
		gbc_button_2.gridx = 18;
		gbc_button_2.gridy = 12;
		add(button_2, gbc_button_2);

	}
}
