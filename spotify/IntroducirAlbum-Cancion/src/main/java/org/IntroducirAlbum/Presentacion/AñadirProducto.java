package org.IntroducirAlbum.Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import org.IntroducirAlbum.Dominio.usuario;

import com.mysql.jdbc.Messages;

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
	ArrayList<usuario> users;
	private JTextField textField;

	public AñadirProducto(ArrayList<usuario> users) {
		this.users=users;
		setType(Type.POPUP);
		setResizable(false);
		setTitle(Messages.getString("AñadirPaciente.0")); //$NON-NLS-1$
		setIconImage(Toolkit.getDefaultToolkit().getImage(AñadirProducto.class.getResource(Messages.getString("AñadirPaciente.1")))); //$NON-NLS-1$
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 841, 427);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(10, 10, 0, 0));
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new TitledBorder(UIManager.getBorder(Messages.getString("AñadirPaciente.2")), Messages.getString("AñadirPaciente.3"), TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$ //$NON-NLS-2$
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		panelBotones.setPreferredSize(new Dimension(10, 35));
		panelBotones.setBackground(SystemColor.menu);
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		
		btnCancelar = new JButton(Messages.getString("AñadirPaciente.4")); //$NON-NLS-1$
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setBounds(229, 5, 89, 25);
		btnCancelar.setBorder(new TitledBorder(null, Messages.getString("AñadirPaciente.5"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		panelBotones.setLayout(null);
		btnCancelar.setFont(new Font(Messages.getString("AñadirPaciente.6"), Font.BOLD, 11)); //$NON-NLS-1$
		panelBotones.add(btnCancelar);
		
		btnLimpiar = new JButton(Messages.getString("AñadirPaciente.7")); //$NON-NLS-1$
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.setBounds(323, 5, 81, 25);
		btnLimpiar.setBorder(new TitledBorder(null, Messages.getString("AñadirPaciente.8"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		btnLimpiar.setFont(new Font(Messages.getString("AñadirPaciente.9"), Font.BOLD, 11)); //$NON-NLS-1$
		panelBotones.add(btnLimpiar);
		
		btnAñadir = new JButton(Messages.getString("AñadirPaciente.10")); //$NON-NLS-1$
		btnAñadir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAñadir.setBounds(409, 5, 75, 25);
		btnAñadir.setBorder(new TitledBorder(null, Messages.getString("AñadirPaciente.11"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		btnAñadir.addActionListener(new BtnAñadirActionListener());
		btnAñadir.setFont(new Font(Messages.getString("AñadirPaciente.12"), Font.BOLD, 11)); //$NON-NLS-1$
		panelBotones.add(btnAñadir);
		panelBotones.setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos del nuevo producto:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblNombre = new JLabel(Messages.getString("A�adirPaciente.14")); //$NON-NLS-1$
		lblNombre.setBounds(34, 45, 55, 36);
		lblNombre.setFont(new Font(Messages.getString("A�adirPaciente.15"), Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(99, 52, 129, 29);
		textNombre.setBorder(new TitledBorder(null, Messages.getString("A�adirPaciente.16"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textNombre.setBackground(SystemColor.scrollbar);
		textNombre.setFont(new Font(Messages.getString("A�adirPaciente.17"), Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		lblTipo = new JLabel("Tipo:"); //$NON-NLS-1$
		lblTipo.setBounds(262, 45, 64, 36);
		lblTipo.setFont(new Font(Messages.getString("A�adirPaciente.19"), Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblTipo);
		
		lblID = new JLabel("ID:"); //$NON-NLS-1$
		lblID.setBounds(534, 45, 28, 36);
		lblID.setFont(new Font(Messages.getString("A�adirPaciente.23"), Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblID);
		
		textID = new JTextField();
		textID.setBounds(572, 52, 120, 29);
		textID.setBorder(new TitledBorder(null, Messages.getString("A�adirPaciente.24"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textID.setBackground(SystemColor.scrollbar);
		textID.setFont(new Font(Messages.getString("A�adirPaciente.25"), Font.BOLD, 11)); //$NON-NLS-1$
		textID.setColumns(10);
		panel.add(textID);
		
		lblPrecio = new JLabel("Precio Canci\u00F3n"); //$NON-NLS-1$
		lblPrecio.setBounds(29, 116, 120, 36);
		lblPrecio.setFont(new Font(Messages.getString("A�adirPaciente.27"), Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblPrecio);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(155, 123, 73, 29);
		textPrecio.setBorder(new TitledBorder(null, Messages.getString("A�adirPaciente.28"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textPrecio.setBackground(SystemColor.scrollbar);
		textPrecio.setFont(new Font(Messages.getString("A�adirPaciente.29"), Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(textPrecio);
		textPrecio.setColumns(10);
		
		lblPrecAlbum = new JLabel("Precio album:"); //$NON-NLS-1$
		lblPrecAlbum.setBounds(238, 116, 88, 36);
		lblPrecAlbum.setFont(new Font(Messages.getString("A�adirPaciente.31"), Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblPrecAlbum);
		
		textPrecAlbum = new JTextField();
		textPrecAlbum.setBounds(336, 123, 151, 29);
		textPrecAlbum.setBorder(new TitledBorder(null, Messages.getString("A�adirPaciente.32"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textPrecAlbum.setBackground(SystemColor.scrollbar);
		textPrecAlbum.setFont(new Font(Messages.getString("A�adirPaciente.33"), Font.BOLD, 11)); //$NON-NLS-1$
		textPrecAlbum.setColumns(10);
		panel.add(textPrecAlbum);
		
		lblDireccin = new JLabel("Artista"); //$NON-NLS-1$
		lblDireccin.setBounds(497, 116, 65, 36);
		lblDireccin.setFont(new Font(Messages.getString("A�adirPaciente.35"), Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblDireccin);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(572, 123, 120, 29);
		textDireccion.setBorder(new TitledBorder(null, Messages.getString("A�adirPaciente.36"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textDireccion.setBackground(SystemColor.scrollbar);
		textDireccion.setFont(new Font(Messages.getString("A�adirPaciente.37"), Font.BOLD, 11)); //$NON-NLS-1$
		textDireccion.setColumns(10);
		panel.add(textDireccion);
		
		lblFechaLanz = new JLabel("Fecha de lanzamiento:"); //$NON-NLS-1$
		lblFechaLanz.setBounds(34, 190, 65, 37);
		lblFechaLanz.setFont(new Font(Messages.getString("A�adirPaciente.39"), Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblFechaLanz);
		
		textFechaLanz = new JTextField();
		textFechaLanz.setBounds(109, 194, 119, 31);
		textFechaLanz.setBorder(new TitledBorder(null, Messages.getString("A�adirPaciente.40"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textFechaLanz.setBackground(SystemColor.scrollbar);
		textFechaLanz.setFont(new Font(Messages.getString("A�adirPaciente.41"), Font.BOLD, 11)); //$NON-NLS-1$
		textFechaLanz.setColumns(10);
		panel.add(textFechaLanz);
		
		lblRanking = new JLabel("Ranking"); //$NON-NLS-1$
		lblRanking.setBounds(238, 188, 92, 37);
		lblRanking.setFont(new Font(Messages.getString("A�adirPaciente.43"), Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblRanking);
		
		textRanking = new JTextField();
		textRanking.setBounds(336, 194, 151, 31);
		textRanking.setBorder(new TitledBorder(null, Messages.getString("A�adirPaciente.44"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textRanking.setBackground(SystemColor.scrollbar);
		textRanking.setFont(new Font(Messages.getString("A�adirPaciente.45"), Font.BOLD, 11)); //$NON-NLS-1$
		textRanking.setColumns(10);
		panel.add(textRanking);
		
		lblGnero = new JLabel("Pais:"); //$NON-NLS-1$
		lblGnero.setBounds(511, 190, 51, 37);
		lblGnero.setFont(new Font(Messages.getString("A�adirPaciente.47"), Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblGnero);
		
		
		lblNumeroDeVentas = new JLabel("N\u00FAmero de ventas:"); //$NON-NLS-1$
		lblNumeroDeVentas.setBounds(81, 260, 73, 36);
		lblNumeroDeVentas.setFont(new Font(Messages.getString("A�adirPaciente.55"), Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(lblNumeroDeVentas);
		
		textNumeroVentas = new JTextField();
		textNumeroVentas.setEditable(false);
		textNumeroVentas.setText(Messages.getString("A�adirPaciente.56")+(users.size()+1)); //$NON-NLS-1$
		textNumeroVentas.setBounds(159, 266, 69, 30);
		textNumeroVentas.setBorder(new TitledBorder(null, Messages.getString("A�adirPaciente.57"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textNumeroVentas.setBackground(SystemColor.scrollbar);
		textNumeroVentas.setFont(new Font(Messages.getString("A�adirPaciente.58"), Font.BOLD, 11)); //$NON-NLS-1$
		panel.add(textNumeroVentas);
		textNumeroVentas.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Canci\u00F3n", "Album"}));
		comboBox.setBounds(336, 54, 28, 20);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setForeground(Color.WHITE);
		textField.setBounds(572, 199, 120, 28);
		panel.add(textField);
		textField.setColumns(10);
		
	}
	
	public void limpiar(){
		textNombre.setText(Messages.getString("A�adirPaciente.59")); //$NON-NLS-1$
		
		textID.setText(Messages.getString("A�adirPaciente.61")); //$NON-NLS-1$
		textPrecio.setText(Messages.getString("A�adirPaciente.62")); //$NON-NLS-1$
		textPrecAlbum.setText(Messages.getString("A�adirPaciente.63")); //$NON-NLS-1$
		textDireccion.setText(Messages.getString("A�adirPaciente.64")); //$NON-NLS-1$
		textFechaLanz.setText(Messages.getString("A�adirPaciente.65")); //$NON-NLS-1$
		textRanking.setText(Messages.getString("A�adirPaciente.66")); //$NON-NLS-1$
		textNumeroVentas.setText(Messages.getString("A�adirPaciente.67")+(users.size()+1)); //$NON-NLS-1$
		
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
			if(nombre.equals(Messages.getString("A�adirPaciente.68"))){ //$NON-NLS-1$
				JOptionPane.showMessageDialog(new JFrame(), Messages.getString("A�adirPaciente.69"), //$NON-NLS-1$
						Messages.getString("A�adirPaciente.70"),JOptionPane.PLAIN_MESSAGE ); //$NON-NLS-1$
			}else{
				
			//	Paciente paciente = new Paciente(npaciente,nombre,nacion,direccion,municipio,cp ,DNI,fecha,sexo);
				if(JOptionPane.showConfirmDialog(new JFrame (), Messages.getString("A�adirPaciente.73"), Messages.getString("A�adirPaciente.74"),  //$NON-NLS-1$ //$NON-NLS-2$
						JOptionPane.OK_CANCEL_OPTION)==JOptionPane.YES_OPTION){
				//	pacientes.add(paciente);
					JOptionPane.showMessageDialog(new JFrame (), Messages.getString("A�adirPaciente.75")); //$NON-NLS-1$
					limpiar();
				}
				
			}
		}
	}
}
