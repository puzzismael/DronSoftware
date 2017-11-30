package org.CreacionDeUsers.Presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JMonthChooser;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JYearChooser;

import org.CreacionDeUsers.Dominio.centro;
import org.CreacionDeUsers.Dominio.usuario;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Window;

import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.util.Stack;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class GestionDeUsuarios extends JDialog {
	private JPanel panel_1;
	private JPanel Listado;
	private JPanel panelBotones;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_3;

	private JLabel lblDNI;
	private JLabel lblNombre;
	private static JList list;
	private JLabel lblContraseña;
	private JLabel lblTelefono;
	private JLabel lblDomicilio;
	private JLabel lblCorreoElectronico;
	private JLabel lblGenero;
	private JLabel lblAñoDeNacimiento;
	private JLabel lblNCuentaBancaria;
	private JTextField textDNI;
	private JTextField textNombre;
	private JTextField textContraseña;
	private JTextField textTelf;
	private JTextField textDom;
	private JTextField textCorreoElectronico;
	private JTextField textGenero;
	private JTextField textAñoDeNacimiento;
	private JTextField textCuentaBancaria;
	private JToolBar toolBar;
	private JLabel lblNewLabel;
	private static GestionDeUsuarios dialog;
	private centro centro;
	private Stack <usuario> user; 
	private DefaultListModel modeloLista;
	private JButton btnAñadir;
	private int opcion;
	private JButton btnAtras;
	private JButton btnGuardar;
	private JLabel lblGestionDeUsuarios;
	private JLabel lblApellidos;
	private JTextField textApellidos;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionDeUsuarios window = new GestionDeUsuarios();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static JList getListado()
	{
		return list;
	}
	
	/*public static JPanel getListado()
	{
		return panelScrolPane;
	}*/
	/**
	 * Create the dialog.
	 * @throws FileNotFoundException 
	 */
	
	public GestionDeUsuarios() throws FileNotFoundException {
		setBackground(new Color(255, 255, 255));
		setTitle("Spotify");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GestionDeUsuarios.class.getResource("/Presentacion/GestionPacientes.jpg")));
		addWindowListener(new ThisWindowListener());
		setName("Spotify"); //$NON-NLS-1$
		setBounds(100, 100, 849, 530);
		getContentPane().setLayout(new BorderLayout(0, 0));
		{
			Listado = new JPanel();
			Listado.setBackground(new Color(192, 192, 192));
			Listado.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Usuarios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
			Listado.setPreferredSize(new Dimension(220, 300));
			getContentPane().add(Listado, BorderLayout.WEST);
			Listado.setLayout(new BorderLayout(0, 0));
			{
				scrollPane = new JScrollPane();
				scrollPane.setBackground(new Color(192, 192, 192));
				Listado.add(scrollPane, BorderLayout.CENTER);
				{
					list = new JList();
					list.addListSelectionListener(new ListListSelectionListener());
					
				
					
					
					
					list.setFont(new Font("Tahoma", Font.PLAIN, 20));
					
					scrollPane.setViewportView(list);
					modeloLista = new DefaultListModel();
					list.setModel(modeloLista);
					//Añadimos dos elementos de prueba a la lista
			
					centro=new centro();
					user=centro.Leer_fichero();
					System.out.println(user.size());
					for(int i=0;i<user.size();i++)
					modeloLista.addElement(user.elementAt(i).getDNI());
					
					list.setCellRenderer(new identificadorUsuario());
					scrollPane.setColumnHeaderView(list);
				}
			}
			{
				panelBotones = new JPanel();
				panelBotones.setBackground(new Color(192, 192, 192));
				panelBotones.setPreferredSize(new Dimension(10, 70));
				panelBotones.setMinimumSize(new Dimension(10, 20));
				Listado.add(panelBotones, BorderLayout.SOUTH);
				{
					{
						btnAñadir = new JButton("A\u00F1adir "); //$NON-NLS-1$
						btnAñadir.addActionListener(new BtnAadirActionListener());
						panelBotones.add(btnAñadir);
					}
				}
			}
			
		}
		{
			panel_1 = new JPanel();
			panel_1.setForeground(new Color(255, 255, 255));
			panel_1.setBackground(new Color(255, 255, 255));
			panel_1.setPreferredSize(new Dimension(10, 41));
			panel_1.setSize(new Dimension(10, 20));
			getContentPane().add(panel_1, BorderLayout.NORTH);
			panel_1.setLayout(new BorderLayout(0, 0));
			{
				toolBar = new JToolBar();
				toolBar.setBackground(new Color(255, 255, 255));
				toolBar.setFloatable(false);
				panel_1.add(toolBar, BorderLayout.CENTER);
				{
					lblGestionDeUsuarios = new JLabel("  GESTI\u00D3N DE USUARIOS");
					lblGestionDeUsuarios.setBackground(new Color(255, 255, 255));
					toolBar.add(lblGestionDeUsuarios);
				}
			}
		}
		{
			panel = new JPanel();
			getContentPane().add(panel, BorderLayout.EAST);
		}
		{
			panel_2 = new JPanel();
			getContentPane().add(panel_2, BorderLayout.SOUTH);
		}
		{
			panel_3 = new JPanel();
			panel_3.setBackground(new Color(192, 192, 192));
			panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Uusario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-2$
			getContentPane().add(panel_3, BorderLayout.CENTER);
			GridBagLayout gbl_panel_3 = new GridBagLayout();
			gbl_panel_3.columnWidths = new int[]{82, 144, 123, 127, 0};
			gbl_panel_3.rowHeights = new int[]{0, 30, 30, 31, 28, 30, 31, 26, 28, 33, 30, 25, 20, 30, 0};
			gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel_3.setLayout(gbl_panel_3);
			{
			}
			{
				lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon(GestionDeUsuarios.class.getResource("/Presentacion/IconoPaciente.png")));
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.gridwidth = 2;
				gbc_lblNewLabel.gridheight = 4;
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel.gridx = 0;
				gbc_lblNewLabel.gridy = 1;
				panel_3.add(lblNewLabel, gbc_lblNewLabel);
			}
			{
				lblDNI = new JLabel("ID:"); //$NON-NLS-1$
				GridBagConstraints gbc_lblDNI = new GridBagConstraints();
				gbc_lblDNI.anchor = GridBagConstraints.WEST;
				gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
				gbc_lblDNI.gridx = 2;
				gbc_lblDNI.gridy = 1;
				panel_3.add(lblDNI, gbc_lblDNI);
			}
			{
				textDNI = new JTextField();
				textDNI.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textDNI.setEditable(false);
				GridBagConstraints gbc_textDNI = new GridBagConstraints();
				gbc_textDNI.insets = new Insets(0, 0, 5, 0);
				gbc_textDNI.fill = GridBagConstraints.HORIZONTAL;
				gbc_textDNI.gridx = 3;
				gbc_textDNI.gridy = 1;
				panel_3.add(textDNI, gbc_textDNI);
				textDNI.setColumns(10);
			}
			{
				lblNombre = new JLabel("Nombre"); //$NON-NLS-1$
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.anchor = GridBagConstraints.WEST;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 2;
				gbc_lblNombre.gridy = 2;
				panel_3.add(lblNombre, gbc_lblNombre);
			}
			{
				textNombre = new JTextField();
				textNombre.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textNombre.setEditable(false);
				GridBagConstraints gbc_textNombre = new GridBagConstraints();
				gbc_textNombre.insets = new Insets(0, 0, 5, 0);
				gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_textNombre.gridx = 3;
				gbc_textNombre.gridy = 2;
				panel_3.add(textNombre, gbc_textNombre);
				textNombre.setColumns(10);
			}
			{
				lblApellidos = new JLabel("Apellidos");
				GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
				gbc_lblApellidos.anchor = GridBagConstraints.WEST;
				gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
				gbc_lblApellidos.gridx = 2;
				gbc_lblApellidos.gridy = 3;
				panel_3.add(lblApellidos, gbc_lblApellidos);
			}
			{
				textApellidos = new JTextField();
				textApellidos.setBackground(SystemColor.control);
				textApellidos.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				GridBagConstraints gbc_textApellidos = new GridBagConstraints();
				gbc_textApellidos.insets = new Insets(0, 0, 5, 0);
				gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
				gbc_textApellidos.gridx = 3;
				gbc_textApellidos.gridy = 3;
				panel_3.add(textApellidos, gbc_textApellidos);
				textApellidos.setColumns(10);
			}
			{
				lblContraseña = new JLabel("Contrase\u00F1a"); //$NON-NLS-1$
				GridBagConstraints gbc_lblContraseña = new GridBagConstraints();
				gbc_lblContraseña.anchor = GridBagConstraints.WEST;
				gbc_lblContraseña.insets = new Insets(0, 0, 5, 5);
				gbc_lblContraseña.gridx = 2;
				gbc_lblContraseña.gridy = 4;
				panel_3.add(lblContraseña, gbc_lblContraseña);
			}
			{
				textContraseña = new JTextField();
				textContraseña.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textContraseña.setEditable(false);
				GridBagConstraints gbc_textContraseña = new GridBagConstraints();
				gbc_textContraseña.insets = new Insets(0, 0, 5, 0);
				gbc_textContraseña.fill = GridBagConstraints.HORIZONTAL;
				gbc_textContraseña.gridx = 3;
				gbc_textContraseña.gridy = 4;
				panel_3.add(textContraseña, gbc_textContraseña);
				textContraseña.setColumns(10);
			}
			{
				lblTelefono = new JLabel("telefono"); //$NON-NLS-1$
				GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
				gbc_lblTelefono.anchor = GridBagConstraints.WEST;
				gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelefono.gridx = 1;
				gbc_lblTelefono.gridy = 6;
				panel_3.add(lblTelefono, gbc_lblTelefono);
			}
			{
				textTelf = new JTextField();
				textTelf.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textTelf.setEditable(false);
				GridBagConstraints gbc_textTelf = new GridBagConstraints();
				gbc_textTelf.insets = new Insets(0, 0, 5, 5);
				gbc_textTelf.fill = GridBagConstraints.HORIZONTAL;
				gbc_textTelf.gridx = 2;
				gbc_textTelf.gridy = 6;
				panel_3.add(textTelf, gbc_textTelf);
				textTelf.setColumns(10);
			}
			{
				lblDomicilio = new JLabel("Domicilio"); //$NON-NLS-1$
				GridBagConstraints gbc_lblDomicilio = new GridBagConstraints();
				gbc_lblDomicilio.anchor = GridBagConstraints.WEST;
				gbc_lblDomicilio.insets = new Insets(0, 0, 5, 5);
				gbc_lblDomicilio.gridx = 1;
				gbc_lblDomicilio.gridy = 7;
				panel_3.add(lblDomicilio, gbc_lblDomicilio);
			}
			{
				textDom = new JTextField();
				textDom.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textDom.setEditable(false);
				GridBagConstraints gbc_textDom = new GridBagConstraints();
				gbc_textDom.insets = new Insets(0, 0, 5, 5);
				gbc_textDom.fill = GridBagConstraints.HORIZONTAL;
				gbc_textDom.gridx = 2;
				gbc_textDom.gridy = 7;
				panel_3.add(textDom, gbc_textDom);
				textDom.setColumns(10);
			}
			{
				lblCorreoElectronico = new JLabel("Correo electr\u00F3nico"); //$NON-NLS-1$
				GridBagConstraints gbc_lblCorreoElectronico = new GridBagConstraints();
				gbc_lblCorreoElectronico.anchor = GridBagConstraints.WEST;
				gbc_lblCorreoElectronico.insets = new Insets(0, 0, 5, 5);
				gbc_lblCorreoElectronico.gridx = 1;
				gbc_lblCorreoElectronico.gridy = 8;
				panel_3.add(lblCorreoElectronico, gbc_lblCorreoElectronico);
			}
			{
				textCorreoElectronico = new JTextField();
				textCorreoElectronico.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textCorreoElectronico.setEditable(false);
				GridBagConstraints gbc_textCorreoElectronico = new GridBagConstraints();
				gbc_textCorreoElectronico.insets = new Insets(0, 0, 5, 5);
				gbc_textCorreoElectronico.fill = GridBagConstraints.HORIZONTAL;
				gbc_textCorreoElectronico.gridx = 2;
				gbc_textCorreoElectronico.gridy = 8;
				panel_3.add(textCorreoElectronico, gbc_textCorreoElectronico);
				textCorreoElectronico.setColumns(10);
			}
			{
				lblGenero = new JLabel("G\u00E9nero:"); //$NON-NLS-1$
				GridBagConstraints gbc_lblGenero = new GridBagConstraints();
				gbc_lblGenero.anchor = GridBagConstraints.WEST;
				gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
				gbc_lblGenero.gridx = 1;
				gbc_lblGenero.gridy = 9;
				panel_3.add(lblGenero, gbc_lblGenero);
			}
			{
				textGenero = new JTextField();
				textGenero.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textGenero.setEditable(false);
				GridBagConstraints gbc_textGenero = new GridBagConstraints();
				gbc_textGenero.insets = new Insets(0, 0, 5, 5);
				gbc_textGenero.fill = GridBagConstraints.HORIZONTAL;
				gbc_textGenero.gridx = 2;
				gbc_textGenero.gridy = 9;
				panel_3.add(textGenero, gbc_textGenero);
				textGenero.setColumns(10);
			}
			{
				lblAñoDeNacimiento = new JLabel("A\u00F1o de nacimiento"); //$NON-NLS-1$
				GridBagConstraints gbc_lblAñoDeNacimiento = new GridBagConstraints();
				gbc_lblAñoDeNacimiento.anchor = GridBagConstraints.WEST;
				gbc_lblAñoDeNacimiento.insets = new Insets(0, 0, 5, 5);
				gbc_lblAñoDeNacimiento.gridx = 1;
				gbc_lblAñoDeNacimiento.gridy = 10;
				panel_3.add(lblAñoDeNacimiento, gbc_lblAñoDeNacimiento);
			}
			{
				textAñoDeNacimiento = new JTextField();
				textAñoDeNacimiento.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textAñoDeNacimiento.setEditable(false);
				GridBagConstraints gbc_textAñoDeNacimiento = new GridBagConstraints();
				gbc_textAñoDeNacimiento.insets = new Insets(0, 0, 5, 5);
				gbc_textAñoDeNacimiento.fill = GridBagConstraints.HORIZONTAL;
				gbc_textAñoDeNacimiento.gridx = 2;
				gbc_textAñoDeNacimiento.gridy = 10;
				panel_3.add(textAñoDeNacimiento, gbc_textAñoDeNacimiento);
				textAñoDeNacimiento.setColumns(10);
			}
			{
				lblNCuentaBancaria = new JLabel("N\u00BA Cuenta bancaria"); //$NON-NLS-1$
				GridBagConstraints gbc_lblNCuentaBancaria = new GridBagConstraints();
				gbc_lblNCuentaBancaria.anchor = GridBagConstraints.WEST;
				gbc_lblNCuentaBancaria.insets = new Insets(0, 0, 5, 5);
				gbc_lblNCuentaBancaria.gridx = 1;
				gbc_lblNCuentaBancaria.gridy = 11;
				panel_3.add(lblNCuentaBancaria, gbc_lblNCuentaBancaria);
			}
			{
			}
			{
				{
					textCuentaBancaria = new JTextField();
					textCuentaBancaria.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					textCuentaBancaria.setEditable(false);
					GridBagConstraints gbc_textCuentaBancaria = new GridBagConstraints();
					gbc_textCuentaBancaria.insets = new Insets(0, 0, 5, 5);
					gbc_textCuentaBancaria.fill = GridBagConstraints.HORIZONTAL;
					gbc_textCuentaBancaria.gridx = 2;
					gbc_textCuentaBancaria.gridy = 11;
					panel_3.add(textCuentaBancaria, gbc_textCuentaBancaria);
					textCuentaBancaria.setColumns(10);
				}
			}
			btnAtras = new JButton("atras");
			btnAtras.addActionListener(new BtnAtrasActionListener());
			GridBagConstraints gbc_btnAtras = new GridBagConstraints();
			gbc_btnAtras.insets = new Insets(0, 0, 0, 5);
			gbc_btnAtras.gridx = 2;
			gbc_btnAtras.gridy = 13;
			panel_3.add(btnAtras, gbc_btnAtras);
			{
				btnGuardar = new JButton("guardar");
				GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
				gbc_btnGuardar.gridx = 3;
				gbc_btnGuardar.gridy = 13;
				panel_3.add(btnGuardar, gbc_btnGuardar);
			}
		}
	}
	
	private class ThisWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent arg0) {
		
			
			//Principal.setGestorpac(null);
		}
	}
	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			for(int i=0;i<user.size();i++)
			{	
				if(user.elementAt(i).getDNI().equals(list.getSelectedValue()))
				{
					textDNI.setText(user.elementAt(i).getDNI());
					textNombre.setText(user.elementAt(i).getNombre());
					textContraseña.setText(user.elementAt(i).getPrApellido());
		
					textTelf.setText(user.elementAt(i).getTelefono());
					textDom.setText(user.elementAt(i).getDomicilio());
					textCorreoElectronico.setText(user.elementAt(i).getAntecFamiliares());
					
					textGenero.setText(user.elementAt(i).getVacunas());
					textAñoDeNacimiento.setText(user.elementAt(i).getTratamiento());
					textCuentaBancaria.setText(user.elementAt(i).getOperaciones());
					
					
				}
			}
		}
	}
	private class BtnAadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textDNI.setEditable(true);
			textNombre.setEditable(true);
			textContraseña.setEditable(true);
		
			textTelf.setEditable(true);
			textDom.setEditable(true);
			textCorreoElectronico.setEditable(true);
			
			textGenero.setEditable(true);
			textAñoDeNacimiento.setEditable(true);
			textCuentaBancaria.setEditable(true);
		
			opcion=1;
			btnGuardar.setEnabled(true);
			btnAtras.setEnabled(true);
			list.setEnabled(false);
			
		}
	}
	private class BtnAtrasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
			textDNI.setEditable(false);
			textNombre.setEditable(false);
			textContraseña.setEditable(false);
		
			textTelf.setEditable(false);
			textDom.setEditable(false);
			textCorreoElectronico.setEditable(false);
	
			textGenero.setEditable(false);
			textAñoDeNacimiento.setEditable(false);
			textCuentaBancaria.setEditable(false);
			
			btnGuardar.setEnabled(false);
			btnAtras.setEnabled(false);
			list.setEnabled(true);
			
		}
	}
	
	
	public boolean formatoValido() {
		System.out.println(textNombre.getText().indexOf(" ")==0);
		boolean valor=true;
		if(textDNI.getText().replace(" ","").equals(""))
		{
			valor=false;	
		}
		if(textNombre.getText().replace(" ","").equals(""))
		{
			valor=false;	
		}
		if(textContraseña.getText().replace(" ","").equals(""))
		{
			valor=false;
		}
	
		if(textTelf.getText().replace(" ","").equals(""))
		{
			valor=false;
		}
		if(textDom.getText().replace(" ","").equals(""))
		{
			valor=false;
		}
		if(textCorreoElectronico.getText().replace(" ","").equals(""))
		{
			valor=false;
		}
	
		if(textGenero.getText().replace(" ","").equals(""))
		{
			valor=false;
		}
		if(textAñoDeNacimiento.getText().replace(" ","").equals(""))
		{
			valor=false;
		}
		if(textCuentaBancaria.getText().replace(" ","").equals(""))
		{
			valor=false;
		}
	
		return valor;
		
	}
	public boolean NoRepetido() {
		boolean valor =true ;
		System.out.println(user.size());
		for(int i=0;i<user.size();i++)
		{	
			if(user.elementAt(i).getDNI().equals(textDNI.getText()))
			{
				valor=false;
				
			}
		}
		return valor;
	}
	
	
	public boolean AlgunBlanco(String cadena)
	{	boolean valor =false;
		for(int i =0;i<cadena.length();i++)
		{
			if(cadena.charAt(i)==' ')
			{
				valor=true;
			}
		}
		return valor;
		
	}
	
	
	
}
