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

import org.CreacionDeUsers.Dominio.Usuario;
import org.IntroducirAlbum.Dominio.Album;

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

public class PanelUsuarios extends JPanel {

	private JButton btnGenerarReceta;
	private JButton btnActualizar;
	private ArrayList<Usuario> users;
	private JButton btnLimpiar;
	private JScrollPane scrollPane;
	private JEditorPane textReceta;
	private JScrollPane scrollPane_1;
	private ButtonGroup grupo1;
	private JPanel panel;
	private JTextField textEdad;
	private JTextField textNombr;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_4;
	private JScrollPane scrollPane_5;
	private JButton btnActualizarListaDe;
	private JLabel lblNacionalidad;
	private JTextField textMunicip;
	private JTextField textCodigoPostal;
	private JTextField textCorreo;
	private JTextField textEstudios;
	private JLabel lblCp;
	private JTextField textCBanc;
	private JTextField textContraseña;
	private JTextArea textHistorial;
	private JTextArea textPruebas;
	private JTextArea textFavoritos;
	private JTextArea textTratamiento;
	private JTextField textId;
	private JTextField TextNacionalidad;
	private JTextField textGenero;
	private JButton btnGuardar;
	private Usuario usuario=new Usuario();
	private Usuario[] usuarios =usuario.obtenerListaDeBD();
	private JList list ;
	
	public PanelUsuarios(ArrayList<Usuario> users) {
		setBackground(SystemColor.text);
		this.users=users;
		setBorder(null);
		list = new JList();
		
		GridBagLayout gbl_GestiondePacientes = new GridBagLayout();
		gbl_GestiondePacientes.columnWidths = new int[]{120, 53, 0, 37, 40, 26, 73, 38, 37, 35, 30, 33, 46, 43, 43, 0, 0, 0};
		gbl_GestiondePacientes.rowHeights = new int[]{35, 30, 31, 31, 30, 46, 56, 0, 0, 0, 18, 0, 40, 0};
		gbl_GestiondePacientes.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_GestiondePacientes.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gbl_GestiondePacientes);
		
		
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
		
		list.setBorder(null);
		
DefaultListModel modelo = new DefaultListModel();
		
		for(int i = 0; i<usuarios.length; i++){
		        modelo.addElement("Nombre:"+ usuarios[i].getNombre());
		}
		list.setModel(modelo);
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
		
		textEdad = new JTextField();
		textEdad.setFont(new Font("PanelPacientes.10", Font.PLAIN, 12)); //$NON-NLS-1$
		textEdad.setColumns(10);
		textEdad.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textEdad.setBackground(SystemColor.scrollbar);
		textEdad.setBounds(106, 98, 186, 24);
		panel.add(textEdad);
		
		textNombr = new JTextField();
		textNombr.setFont(new Font("PanelPacientes.12", Font.PLAIN, 12)); //$NON-NLS-1$
		textNombr.setColumns(10);
		textNombr.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$ //$NON-NLS-2$
		textNombr.setBackground(SystemColor.scrollbar);
		textNombr.setBounds(106, 60, 186, 24);
		panel.add(textNombr);
		
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
		
		lblNacionalidad = new JLabel("Municipio"); //$NON-NLS-1$
		lblNacionalidad.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblNacionalidad.setBounds(325, 103, 64, 14);
		panel.add(lblNacionalidad);
		
		textMunicip = new JTextField();
		textMunicip.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textMunicip.setBackground(SystemColor.scrollbar);
		textMunicip.setFont(new Font("PanelPacientes.33", Font.PLAIN, 12)); //$NON-NLS-1$
		textMunicip.setBounds(393, 100, 102, 20);
		panel.add(textMunicip);
		textMunicip.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Código Postal"); //$NON-NLS-1$
		lblDireccin.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblDireccin.setBounds(9, 138, 101, 14);
		panel.add(lblDireccin);
		
		textCodigoPostal = new JTextField();
		textCodigoPostal.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textCodigoPostal.setBackground(SystemColor.scrollbar);
		textCodigoPostal.setFont(new Font("PanelPacientes.37", Font.PLAIN, 12)); //$NON-NLS-1$
		textCodigoPostal.setBounds(106, 136, 186, 20);
		panel.add(textCodigoPostal);
		textCodigoPostal.setColumns(10);
		
		JLabel lblMunicipio = new JLabel("Correo"); //$NON-NLS-1$
		lblMunicipio.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblMunicipio.setBounds(345, 138, 44, 15);
		panel.add(lblMunicipio);
		
		textCorreo = new JTextField();
		textCorreo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textCorreo.setBackground(SystemColor.scrollbar);
		textCorreo.setFont(new Font("PanelPacientes.41", Font.PLAIN, 12)); //$NON-NLS-1$
		textCorreo.setBounds(394, 136, 101, 20);
		panel.add(textCorreo);
		textCorreo.setColumns(10);
		
		JLabel lblDni = new JLabel("Estudios"); //$NON-NLS-1$
		lblDni.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblDni.setBounds(38, 170, 58, 14);
		panel.add(lblDni);
		
		textEstudios = new JTextField();
		textEstudios.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textEstudios.setBackground(SystemColor.scrollbar);
		textEstudios.setFont(new Font("PanelPacientes.45", Font.PLAIN, 12)); //$NON-NLS-1$
		textEstudios.setBounds(106, 167, 186, 20);
		panel.add(textEstudios);
		textEstudios.setColumns(10);
		
		lblCp = new JLabel("C. Bancaria"); //$NON-NLS-1$
		lblCp.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblCp.setBounds(316, 170, 73, 14);
		panel.add(lblCp);
		
		textCBanc = new JTextField();
		textCBanc.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textCBanc.setBackground(SystemColor.scrollbar);
		textCBanc.setFont(new Font("PanelPacientes.49", Font.PLAIN, 12)); //$NON-NLS-1$
		textCBanc.setBounds(393, 167, 102, 20);
		panel.add(textCBanc);
		textCBanc.setColumns(10);
		
		textContraseña = new JTextField();
		textContraseña.setFont(new Font("PanelPacientes.52", Font.PLAIN, 12)); //$NON-NLS-1$
		textContraseña.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textContraseña.setBackground(SystemColor.scrollbar);
		textContraseña.setBounds(228, 24, 64, 20);
		panel.add(textContraseña);
		textContraseña.setColumns(10);
		
		textId = new JTextField();
		textId.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textId.setFont(new Font("PanelPacientes.55", Font.PLAIN, 12)); //$NON-NLS-1$
		textId.setBackground(SystemColor.scrollbar);
		textId.setBounds(106, 24, 33, 20);
		panel.add(textId);
		textId.setColumns(10);
		
		TextNacionalidad = new JTextField();
		TextNacionalidad.setFont(new Font("Dialog", Font.PLAIN, 12));
		TextNacionalidad.setColumns(10);
		TextNacionalidad.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		TextNacionalidad.setBackground(SystemColor.scrollbar);
		TextNacionalidad.setBounds(399, 25, 96, 24);
		panel.add(TextNacionalidad);
		
		textGenero = new JTextField();
		textGenero.setFont(new Font("Dialog", Font.PLAIN, 12));
		textGenero.setColumns(10);
		textGenero.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textGenero.setBackground(SystemColor.scrollbar);
		textGenero.setBounds(399, 63, 96, 24);
		panel.add(textGenero);
		
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
		
		btnGenerarReceta = new JButton("imprimir"); //$NON-NLS-1$
		btnGenerarReceta.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		//btnGenerarReceta.setIcon(new ImageIcon(PanelPacientes.class.getResource("PanelPacientes.74"))); //$NON-NLS-1$
		btnGenerarReceta.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean bol=true;
				 if((textId.getText().replace(" ","")).equals("")||(textContraseña.getText().replace(" ","")).equals("")||
					(TextNacionalidad.getText().replace(" ","")).equals("")||(textNombr.getText().replace(" ","")).equals("")||
					(textGenero.getText().replaceAll(" ", "")).equals("")||(textEdad.getText().replace(" ","")).equals("")||
					(textMunicip.getText().replace(" ","")).equals("")||(textCodigoPostal.getText().replace(" ","")).equals("")||
					(textCorreo.getText().replace(" ","")).equals("")||(textEstudios.getText().replace(" ","")).equals("")||
					(textCBanc.getText().replace(" ","")).equals(""))
				 {
					 JOptionPane.showMessageDialog(null,"No deje espacios en blanco");
					 
				 }else {
						Usuario user= new Usuario();
						Usuario [] users=user.obtenerListaDeBD();
						for(int i=0;i<users.length;i++)
						{
							if(users[i].getID().equals(textId.getText())) {
								JOptionPane.showMessageDialog(null,"Ese usuario ya existe, cambie su id");
						bol=false;
							}
						}
					if(bol)
					{
				String  ID,contraseña,nacionalidad,nombre,Genero,edad,municipio,CodigoPostal,correo,estudios,cuentaBancaria;
				ID=textId.getText();
				contraseña=textContraseña.getText();
				nacionalidad=TextNacionalidad.getText();
				nombre=textNombr.getText();
				Genero=textGenero.getText();
				edad=textEdad.getText();
				municipio=textMunicip.getText();
				CodigoPostal=textCodigoPostal.getText();
				correo=textCorreo.getText();
				estudios=textEstudios.getText();
				cuentaBancaria=textCBanc.getText();
				Usuario use=new Usuario(  ID,contraseña,nacionalidad,nombre,Genero,edad,municipio,CodigoPostal,correo,estudios,cuentaBancaria);
				use.insertarBD();
			}
				 }
			}
		});
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 0);
		gbc_btnGuardar.gridx = 16;
		gbc_btnGuardar.gridy = 9;
		add(btnGuardar, gbc_btnGuardar);
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
						
			//actualizarDatos();
		}
	}
	
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	private class BtnActualizarListaDeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Usuario us=new Usuario();
			Usuario [] u =us.obtenerListaDeBD();
			DefaultListModel modelo = new DefaultListModel();
			
			for(int i = 0; i<u.length; i++){
			        modelo.addElement("Nombre:"+ u[i].getNombre());
			}
			list.setModel(modelo);
		}
		}
	}

