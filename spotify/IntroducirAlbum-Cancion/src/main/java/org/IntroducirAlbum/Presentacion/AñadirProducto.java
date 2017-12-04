package org.IntroducirAlbum.Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import org.IntroducirAlbum.Dominio.Usuario;



import java.util.ArrayList;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import java.awt.Rectangle;
import java.awt.GridLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Cursor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AñadirProducto extends JFrame {

	private JPanel contentPane;
	private JButton btnCancelar;
	private JLabel lblNombre;
	private JTextField textNombre;
	private JLabel lblTipo;
	private JLabel lblID;
	private JTextField textID;
	private JLabel lblPrecio;
	private JTextField textPrecio;
	private JLabel lblPrecAlbum;
	private JTextField textPrecAlbum;
	private JLabel lblDireccin;
	private JTextField textDireccion;
	private JLabel lblFechaLanz;
	private JTextField textFechaLanz;
	private JLabel lblRanking;
	private JTextField textRanking;
	private JLabel lblGnero;
	private JLabel lblNumeroDeVentas;
	private JButton btnAñadir;
	private JButton btnLimpiar;
	private JTextField textNumeroVentas;
	ArrayList<Usuario> users;
	private JTextField textField;

	public AñadirProducto(ArrayList<Usuario> users) {
		this.users=users;
		setType(Type.POPUP);
		setResizable(false);
		setTitle("AñadirPaciente.0"); //$NON-NLS-1$
		//setIconImage(Toolkit.getDefaultToolkit().getImage(AñadirProducto.class.getResource("AñadirPaciente.1"))); //$NON-NLS-1$
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 731, 391);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(10, 10, 0, 0));
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A\u00F1adir Producto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$ //$NON-NLS-2$
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		panelBotones.setPreferredSize(new Dimension(10, 35));
		panelBotones.setBackground(SystemColor.menu);
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		
		btnCancelar = new JButton("Cancelar"); //$NON-NLS-1$
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setBounds(229, 5, 89, 25);
		btnCancelar.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		panelBotones.setLayout(null);
		btnCancelar.setFont(new Font("AñadirPaciente.6", Font.BOLD, 11)); //$NON-NLS-1$
		panelBotones.add(btnCancelar);
		
		btnLimpiar = new JButton("Limpiar"); //$NON-NLS-1$
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.setBounds(323, 5, 81, 25);
		btnLimpiar.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		btnLimpiar.setFont(new Font("AñadirPaciente.9", Font.BOLD, 11)); //$NON-NLS-1$
		panelBotones.add(btnLimpiar);
		
		btnAñadir = new JButton("Añadir"); //$NON-NLS-1$
		btnAñadir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAñadir.setBounds(409, 5, 75, 25);
		btnAñadir.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		btnAñadir.addActionListener(new BtnAñadirActionListener());
		btnAñadir.setFont(new Font("AñadirPaciente.12", Font.BOLD, 11)); //$NON-NLS-1$
		panelBotones.add(btnAñadir);
		panelBotones.setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos del nuevo producto:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblNombre = new JLabel("Nombre"); //$NON-NLS-1$
		lblNombre.setBounds(34, 45, 55, 36);
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(99, 52, 129, 29);
		textNombre.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textNombre.setBackground(SystemColor.scrollbar);
		textNombre.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		lblTipo = new JLabel("Tipo:"); //$NON-NLS-1$
		lblTipo.setBounds(262, 45, 64, 36);
		lblTipo.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblTipo);
		
		lblID = new JLabel("ID:"); //$NON-NLS-1$
		lblID.setBounds(534, 45, 28, 36);
		lblID.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblID);
		
		textID = new JTextField();
		textID.setBounds(572, 52, 120, 29);
		textID.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textID.setBackground(SystemColor.scrollbar);
		textID.setFont(new Font("AñadirPaciente.25", Font.BOLD, 11)); //$NON-NLS-1$
		textID.setColumns(10);
		panel.add(textID);
		
		lblPrecio = new JLabel("Precio Canci\u00F3n"); //$NON-NLS-1$
		lblPrecio.setBounds(29, 116, 120, 36);
		lblPrecio.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblPrecio);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(155, 123, 73, 29);
		textPrecio.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textPrecio.setBackground(SystemColor.scrollbar);
		textPrecio.setFont(new Font("AñadirPaciente.29", Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(textPrecio);
		textPrecio.setColumns(10);
		
		lblPrecAlbum = new JLabel("PrecioAlbum"); //$NON-NLS-1$
		lblPrecAlbum.setBounds(238, 116, 88, 36);
		lblPrecAlbum.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblPrecAlbum);
		
		textPrecAlbum = new JTextField();
		textPrecAlbum.setBounds(336, 123, 151, 29);
		textPrecAlbum.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textPrecAlbum.setBackground(SystemColor.scrollbar);
		textPrecAlbum.setFont(new Font("AñadirPaciente.33", Font.BOLD, 11)); //$NON-NLS-1$
		textPrecAlbum.setColumns(10);
		panel.add(textPrecAlbum);
		
		lblDireccin = new JLabel("Artista"); //$NON-NLS-1$
		lblDireccin.setBounds(497, 116, 65, 36);
		lblDireccin.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblDireccin);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(572, 123, 120, 29);
		textDireccion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textDireccion.setBackground(SystemColor.scrollbar);
		textDireccion.setFont(new Font("AñadirPaciente.37", Font.BOLD, 11)); //$NON-NLS-1$
		textDireccion.setColumns(10);
		panel.add(textDireccion);
		
		lblFechaLanz = new JLabel("Estreno"); //$NON-NLS-1$
		lblFechaLanz.setBounds(34, 190, 65, 37);
		lblFechaLanz.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblFechaLanz);
		
		textFechaLanz = new JTextField();
		textFechaLanz.setBounds(109, 194, 119, 31);
		textFechaLanz.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textFechaLanz.setBackground(SystemColor.scrollbar);
		textFechaLanz.setFont(new Font("AñadirPaciente.41", Font.BOLD, 11)); //$NON-NLS-1$
		textFechaLanz.setColumns(10);
		panel.add(textFechaLanz);
		
		lblRanking = new JLabel("Ranking"); //$NON-NLS-1$
		lblRanking.setBounds(238, 188, 92, 37);
		lblRanking.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblRanking);
		
		textRanking = new JTextField();
		textRanking.setBounds(336, 194, 151, 31);
		textRanking.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textRanking.setBackground(SystemColor.scrollbar);
		textRanking.setFont(new Font("AñadirPaciente.45", Font.BOLD, 11)); //$NON-NLS-1$
		textRanking.setColumns(10);
		panel.add(textRanking);
		
		lblGnero = new JLabel("Pais:"); //$NON-NLS-1$
		lblGnero.setBounds(511, 190, 51, 37);
		lblGnero.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblGnero);
		
		
		lblNumeroDeVentas = new JLabel("NºVentas"); //$NON-NLS-1$
		lblNumeroDeVentas.setBounds(81, 260, 73, 36);
		lblNumeroDeVentas.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblNumeroDeVentas);
		
		textNumeroVentas = new JTextField();
		textNumeroVentas.setEditable(false);
		textNumeroVentas.setBounds(159, 266, 69, 30);
		textNumeroVentas.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textNumeroVentas.setBackground(SystemColor.scrollbar);
		textNumeroVentas.setFont(new Font("AñadirPaciente.58", Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(textNumeroVentas);
		textNumeroVentas.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Canci\u00F3n", "Album"}));
		comboBox.setBounds(336, 54, 73, 20);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setForeground(Color.WHITE);
		textField.setBounds(572, 199, 120, 28);
		panel.add(textField);
		textField.setColumns(10);
		
	}
	
	public void limpiar(){
		textNombre.setText("AñadirPaciente.59"); //$NON-NLS-1$
		
		textID.setText("AñadirPaciente.61"); //$NON-NLS-1$
		textPrecio.setText("AñadirPaciente.62"); //$NON-NLS-1$
		textPrecAlbum.setText("AñadirPaciente.63"); //$NON-NLS-1$
		textDireccion.setText("AñadirPaciente.64"); //$NON-NLS-1$
		textFechaLanz.setText("AñadirPaciente.65"); //$NON-NLS-1$
		textRanking.setText("AñadirPaciente.66"); //$NON-NLS-1$
		textNumeroVentas.setText("AñadirPaciente.67"+(users.size()+1)); //$NON-NLS-1$
		
	}

	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			limpiar();
		}
	}
	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
	private class BtnAñadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String nombre=textNombre.getText();
			
			String DNI= textID.getText();
			String fecha= textPrecio.getText();
			String nacion = textPrecAlbum.getText();
			String direccion = textDireccion.getText();
			String municipio= textFechaLanz.getText();
			String cp = textRanking.getText();
			String npaciente= textNumeroVentas.getText();
			String sexo;
			if(nombre.equals("AñadirPaciente.68")){ //$NON-NLS-1$
				JOptionPane.showMessageDialog(new JFrame(),"AñadirPaciente.69", //$NON-NLS-1$
						"AñadirPaciente.70",JOptionPane.PLAIN_MESSAGE ); //$NON-NLS-1$
			}else{
				
			//	Paciente paciente = new Paciente(npaciente,nombre,nacion,direccion,municipio,cp ,DNI,fecha,sexo);
				if(JOptionPane.showConfirmDialog(new JFrame (), "AñadirPaciente.73", "AñadirPaciente.74",  //$NON-NLS-1$ //$NON-NLS-2$
						JOptionPane.OK_CANCEL_OPTION)==JOptionPane.YES_OPTION){
				//	pacientes.add(paciente);
					JOptionPane.showMessageDialog(new JFrame (), "AñadirPaciente.75"); //$NON-NLS-1$
					limpiar();
				}
				
			}
		}
	}
}
