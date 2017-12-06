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

import org.IntroducirAlbum.Persistencia.GestorAlbum;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarProducto extends JPanel {
	private JTextField textID;
	private JTextField textNombre;
	private JTextField textPrecioCanc;
	private JTextField textPrecioAlb;
	private JTextField textArtista;
	private JTextField textEstreno;
	private JTextField textRanking;
	private JTextField textPais;
	private JTextField textNVentas;
	private JTextField textTipo;

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
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNombre.setBounds(35, 104, 59, 15);
		panel.add(lblNombre);
		
		textID = new JTextField();
		textID.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textID.setBackground(SystemColor.activeCaptionBorder);
		textID.setBounds(113, 39, 23, 20);
		panel.add(textID);
		textID.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textNombre.setBackground(SystemColor.activeCaptionBorder);
		textNombre.setBounds(113, 102, 172, 20);
		panel.add(textNombre);
		
		textPrecioCanc = new JTextField();
		textPrecioCanc.setColumns(10);
		textPrecioCanc.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textPrecioCanc.setBackground(SystemColor.activeCaptionBorder);
		textPrecioCanc.setBounds(113, 128, 172, 20);
		panel.add(textPrecioCanc);
		
		textPrecioAlb = new JTextField();
		textPrecioAlb.setColumns(10);
		textPrecioAlb.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textPrecioAlb.setBackground(SystemColor.activeCaptionBorder);
		textPrecioAlb.setBounds(113, 159, 172, 20);
		panel.add(textPrecioAlb);
		
		textArtista = new JTextField();
		textArtista.setColumns(10);
		textArtista.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textArtista.setBackground(SystemColor.activeCaptionBorder);
		textArtista.setBounds(240, 39, 45, 20);
		panel.add(textArtista);
		
		textEstreno = new JTextField();
		textEstreno.setColumns(10);
		textEstreno.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textEstreno.setBackground(SystemColor.activeCaptionBorder);
		textEstreno.setBounds(444, 45, 86, 20);
		panel.add(textEstreno);
		
		textRanking = new JTextField();
		textRanking.setColumns(10);
		textRanking.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textRanking.setBackground(SystemColor.activeCaptionBorder);
		textRanking.setBounds(444, 76, 86, 20);
		panel.add(textRanking);
		
		textPais = new JTextField();
		textPais.setColumns(10);
		textPais.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textPais.setBackground(SystemColor.activeCaptionBorder);
		textPais.setBounds(444, 102, 86, 20);
		panel.add(textPais);
		
		textNVentas = new JTextField();
		textNVentas.setColumns(10);
		textNVentas.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textNVentas.setBackground(SystemColor.activeCaptionBorder);
		textNVentas.setBounds(444, 130, 86, 20);
		panel.add(textNVentas);
		
		JLabel label = new JLabel("Tipo:");
		label.setFont(new Font("Verdana", Font.BOLD, 11));
		label.setBounds(61, 57, 33, 36);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Precio Canción");
		label_1.setFont(new Font("Verdana", Font.BOLD, 11));
		label_1.setBounds(-2, 119, 96, 36);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("PrecioAlbum");
		label_2.setFont(new Font("Verdana", Font.BOLD, 11));
		label_2.setBounds(15, 151, 88, 36);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Artista");
		label_3.setFont(new Font("Verdana", Font.BOLD, 11));
		label_3.setBounds(185, 30, 45, 36);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Estreno");
		label_4.setFont(new Font("Verdana", Font.BOLD, 11));
		label_4.setBounds(375, 40, 59, 29);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Ranking");
		label_5.setFont(new Font("Verdana", Font.BOLD, 11));
		label_5.setBounds(375, 67, 59, 37);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Pais:");
		label_6.setFont(new Font("Verdana", Font.BOLD, 11));
		label_6.setBounds(397, 93, 33, 37);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("NºVentas");
		label_7.setFont(new Font("Verdana", Font.BOLD, 11));
		label_7.setBounds(375, 119, 73, 36);
		panel.add(label_7);
		
		textTipo = new JTextField();
		textTipo.setColumns(10);
		textTipo.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textTipo.setBackground(SystemColor.activeCaptionBorder);
		textTipo.setBounds(113, 70, 172, 20);
		panel.add(textTipo);
		
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
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID,nombre ,tipo,PrecioCancion,PrecioAlbum, artista, estreno,ranking,pais,NVentas;
				ID=textID.getText();
				nombre=textNombre.getText();
				tipo=textTipo.getText();
				PrecioCancion=textPrecioCanc.getText();
				PrecioAlbum=textPrecioAlb.getText();
				artista=textArtista.getText();
				estreno=textEstreno.getText();
				ranking=textRanking.getText();
				pais=textPais.getText();
				NVentas=textNVentas.getText();
				GestorAlbum gestAl=new GestorAlbum();
				gestAl.Insertar(ID, nombre, tipo, PrecioCancion, PrecioAlbum, artista, estreno, ranking, pais, NVentas);
			}
		});
		button_2.setFont(new Font("Verdana", Font.BOLD, 11));
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.gridwidth = 5;
		gbc_button_2.insets = new Insets(0, 0, 0, 5);
		gbc_button_2.gridx = 18;
		gbc_button_2.gridy = 12;
		add(button_2, gbc_button_2);

	}
}
