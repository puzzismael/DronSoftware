package Presentacion;

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
import com.mysql.jdbc.Messages;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JYearChooser;

import Dominio.CentroMedico;
import Dominio.usuario;

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

public class GestionDeUsuarios extends JDialog {
	private JPanel panel_1;
	private JPanel Listado;
	private JPanel panelBotones;
	private JScrollPane scrollPane;
	private JButton btnEditar;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_3;

	private JLabel lblDNI;
	private JLabel lblNombre;
	private static JList list;
	private JLabel lblApellidos;
	private JLabel lblTefMovil;
	private JLabel lblDomicilio;
	private JLabel lblAntecedentesFamiliares;
	private JLabel lblAlergias;
	private JLabel lblVacunas;
	private JLabel lblTratamiento;
	private JLabel lblOperaciones;
	private JLabel lblCronicos;
	private JTextField textDNI;
	private JTextField textNombre;
	private JTextField textPrApellido;
	private JTextField textTelf;
	private JTextField textDom;
	private JTextField textAntFam;
	private JTextField textAlerg;
	private JTextField textVac;
	private JTextField textTrat;
	private JTextField textOp;
	private JTextField textCr;
	private JToolBar toolBar;
	private JButton btnCalendarioDeCitas;
	private JButton btnBorrar_1;
	private JButton btnInformesClinicos;
	private JLabel lblNewLabel;
	private static GestionDeUsuarios dialog;
	private CentroMedico centroMedico;
	private Stack <usuario> user; 
	private JLabel lblSegApellido;
	private JTextField textSegApellido;
	private DefaultListModel modeloLista;
	private JButton btnAñadir;
	private int opcion;
	private JButton btnAtras;
	private JButton btnGuardar;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(GestionDeUsuarios.class.getResource("/Presentacion/GestionPacientes.jpg")));
		addWindowListener(new ThisWindowListener());
		setName(Messages.getString("GestionDePacientes.this.name")); //$NON-NLS-1$
		setBounds(100, 100, 849, 566);
		getContentPane().setLayout(new BorderLayout(0, 0));
		{
			Listado = new JPanel();
			Listado.setBorder(new TitledBorder(null, Messages.getString("GestionDePacientes.Listado.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
			Listado.setPreferredSize(new Dimension(220, 300));
			getContentPane().add(Listado, BorderLayout.WEST);
			Listado.setLayout(new BorderLayout(0, 0));
			{
				scrollPane = new JScrollPane();
				Listado.add(scrollPane, BorderLayout.CENTER);
				{
					list = new JList();
					list.addListSelectionListener(new ListListSelectionListener());
					
				
					
					
					
					list.setFont(new Font("Tahoma", Font.PLAIN, 20));
					
					scrollPane.setViewportView(list);
					modeloLista = new DefaultListModel();
					list.setModel(modeloLista);
					//AÃ±adimos dos elementos de prueba a la lista
			
					centroMedico=new CentroMedico();
					user=centroMedico.Leer_fichero();
					System.out.println(user.size());
					for(int i=0;i<user.size();i++)
					modeloLista.addElement(user.elementAt(i).getDNI());
					
					list.setCellRenderer(new IdentificadorPaciente());
					scrollPane.setColumnHeaderView(list);
				}
			}
			{
				panelBotones = new JPanel();
				panelBotones.setPreferredSize(new Dimension(10, 70));
				panelBotones.setMinimumSize(new Dimension(10, 20));
				Listado.add(panelBotones, BorderLayout.SOUTH);
				{
					btnEditar = new JButton("Editar"); //$NON-NLS-1$
					btnEditar.addActionListener(new BtnEditarActionListener());
					{
						btnAñadir = new JButton("A\u00F1adir "); //$NON-NLS-1$
						btnAñadir.addActionListener(new BtnAadirActionListener());
						panelBotones.add(btnAñadir);
					}
					panelBotones.add(btnEditar);
				}
				{
					{
						btnBorrar_1 = new JButton("Borrar"); //$NON-NLS-1$
						btnBorrar_1.addActionListener(new BtnBorrar_1ActionListener());
						panelBotones.add(btnBorrar_1);
					}
				}
			}
			
		}
		{
			panel_1 = new JPanel();
			panel_1.setPreferredSize(new Dimension(10, 41));
			panel_1.setSize(new Dimension(10, 20));
			getContentPane().add(panel_1, BorderLayout.NORTH);
			panel_1.setLayout(new BorderLayout(0, 0));
			{
				toolBar = new JToolBar();
				panel_1.add(toolBar, BorderLayout.CENTER);
				{
					btnCalendarioDeCitas = new JButton("Calendario de citas"); //$NON-NLS-1$
					btnCalendarioDeCitas.addActionListener(new BtnCalendarioDeCitasActionListener());
					toolBar.add(btnCalendarioDeCitas);
				}
				{
					btnInformesClinicos = new JButton("Informes clinicos"); //$NON-NLS-1$
					btnInformesClinicos.addActionListener(new BtnInformesClinicosActionListener());
					toolBar.add(btnInformesClinicos);
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
			panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), Messages.getString("GestionDePacientes.panel_3.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-2$
			getContentPane().add(panel_3, BorderLayout.CENTER);
			GridBagLayout gbl_panel_3 = new GridBagLayout();
			gbl_panel_3.columnWidths = new int[]{82, 144, 123, 106, 0};
			gbl_panel_3.rowHeights = new int[]{0, 30, 30, 31, 28, 30, 31, 26, 28, 33, 30, 25, 0, 30, 30, 0, 0};
			gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
				lblDNI = new JLabel("DNI"); //$NON-NLS-1$
				GridBagConstraints gbc_lblDNI = new GridBagConstraints();
				gbc_lblDNI.anchor = GridBagConstraints.WEST;
				gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
				gbc_lblDNI.gridx = 2;
				gbc_lblDNI.gridy = 2;
				panel_3.add(lblDNI, gbc_lblDNI);
			}
			{
				textDNI = new JTextField();
				textDNI.setEditable(false);
				GridBagConstraints gbc_textDNI = new GridBagConstraints();
				gbc_textDNI.insets = new Insets(0, 0, 5, 0);
				gbc_textDNI.fill = GridBagConstraints.HORIZONTAL;
				gbc_textDNI.gridx = 3;
				gbc_textDNI.gridy = 2;
				panel_3.add(textDNI, gbc_textDNI);
				textDNI.setColumns(10);
			}
			{
				lblNombre = new JLabel("Nombre"); //$NON-NLS-1$
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.anchor = GridBagConstraints.WEST;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 2;
				gbc_lblNombre.gridy = 3;
				panel_3.add(lblNombre, gbc_lblNombre);
			}
			{
				textNombre = new JTextField();
				textNombre.setEditable(false);
				GridBagConstraints gbc_textNombre = new GridBagConstraints();
				gbc_textNombre.insets = new Insets(0, 0, 5, 0);
				gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_textNombre.gridx = 3;
				gbc_textNombre.gridy = 3;
				panel_3.add(textNombre, gbc_textNombre);
				textNombre.setColumns(10);
			}
			{
				lblApellidos = new JLabel("Pr Apellido"); //$NON-NLS-1$
				GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
				gbc_lblApellidos.anchor = GridBagConstraints.WEST;
				gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
				gbc_lblApellidos.gridx = 2;
				gbc_lblApellidos.gridy = 4;
				panel_3.add(lblApellidos, gbc_lblApellidos);
			}
			{
				textPrApellido = new JTextField();
				textPrApellido.setEditable(false);
				GridBagConstraints gbc_textPrApellido = new GridBagConstraints();
				gbc_textPrApellido.insets = new Insets(0, 0, 5, 0);
				gbc_textPrApellido.fill = GridBagConstraints.HORIZONTAL;
				gbc_textPrApellido.gridx = 3;
				gbc_textPrApellido.gridy = 4;
				panel_3.add(textPrApellido, gbc_textPrApellido);
				textPrApellido.setColumns(10);
			}
			{
				lblSegApellido = new JLabel("Seg Apellido"); //$NON-NLS-1$
				GridBagConstraints gbc_lblSegApellido = new GridBagConstraints();
				gbc_lblSegApellido.anchor = GridBagConstraints.WEST;
				gbc_lblSegApellido.insets = new Insets(0, 0, 5, 5);
				gbc_lblSegApellido.gridx = 2;
				gbc_lblSegApellido.gridy = 5;
				panel_3.add(lblSegApellido, gbc_lblSegApellido);
			}
			{
				textSegApellido = new JTextField();
				textSegApellido.setEditable(false);
				GridBagConstraints gbc_textSegApellido = new GridBagConstraints();
				gbc_textSegApellido.insets = new Insets(0, 0, 5, 0);
				gbc_textSegApellido.fill = GridBagConstraints.HORIZONTAL;
				gbc_textSegApellido.gridx = 3;
				gbc_textSegApellido.gridy = 5;
				panel_3.add(textSegApellido, gbc_textSegApellido);
				textSegApellido.setColumns(10);
			}
			{
				lblTefMovil = new JLabel("telefono"); //$NON-NLS-1$
				GridBagConstraints gbc_lblTefMovil = new GridBagConstraints();
				gbc_lblTefMovil.anchor = GridBagConstraints.WEST;
				gbc_lblTefMovil.insets = new Insets(0, 0, 5, 5);
				gbc_lblTefMovil.gridx = 1;
				gbc_lblTefMovil.gridy = 6;
				panel_3.add(lblTefMovil, gbc_lblTefMovil);
			}
			{
				textTelf = new JTextField();
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
				lblAntecedentesFamiliares = new JLabel("Antecedentes"); //$NON-NLS-1$
				GridBagConstraints gbc_lblAntecedentesFamiliares = new GridBagConstraints();
				gbc_lblAntecedentesFamiliares.anchor = GridBagConstraints.WEST;
				gbc_lblAntecedentesFamiliares.insets = new Insets(0, 0, 5, 5);
				gbc_lblAntecedentesFamiliares.gridx = 1;
				gbc_lblAntecedentesFamiliares.gridy = 8;
				panel_3.add(lblAntecedentesFamiliares, gbc_lblAntecedentesFamiliares);
			}
			{
				textAntFam = new JTextField();
				textAntFam.setEditable(false);
				GridBagConstraints gbc_textAntFam = new GridBagConstraints();
				gbc_textAntFam.insets = new Insets(0, 0, 5, 5);
				gbc_textAntFam.fill = GridBagConstraints.HORIZONTAL;
				gbc_textAntFam.gridx = 2;
				gbc_textAntFam.gridy = 8;
				panel_3.add(textAntFam, gbc_textAntFam);
				textAntFam.setColumns(10);
			}
			{
				lblAlergias = new JLabel("Alergias"); //$NON-NLS-1$
				GridBagConstraints gbc_lblAlergias = new GridBagConstraints();
				gbc_lblAlergias.anchor = GridBagConstraints.WEST;
				gbc_lblAlergias.insets = new Insets(0, 0, 5, 5);
				gbc_lblAlergias.gridx = 1;
				gbc_lblAlergias.gridy = 9;
				panel_3.add(lblAlergias, gbc_lblAlergias);
			}
			{
				textAlerg = new JTextField();
				textAlerg.setEditable(false);
				GridBagConstraints gbc_textAlerg = new GridBagConstraints();
				gbc_textAlerg.insets = new Insets(0, 0, 5, 5);
				gbc_textAlerg.fill = GridBagConstraints.HORIZONTAL;
				gbc_textAlerg.gridx = 2;
				gbc_textAlerg.gridy = 9;
				panel_3.add(textAlerg, gbc_textAlerg);
				textAlerg.setColumns(10);
			}
			{
				lblVacunas = new JLabel("Vacunas"); //$NON-NLS-1$
				GridBagConstraints gbc_lblVacunas = new GridBagConstraints();
				gbc_lblVacunas.anchor = GridBagConstraints.WEST;
				gbc_lblVacunas.insets = new Insets(0, 0, 5, 5);
				gbc_lblVacunas.gridx = 1;
				gbc_lblVacunas.gridy = 10;
				panel_3.add(lblVacunas, gbc_lblVacunas);
			}
			{
				textVac = new JTextField();
				textVac.setEditable(false);
				GridBagConstraints gbc_textVac = new GridBagConstraints();
				gbc_textVac.insets = new Insets(0, 0, 5, 5);
				gbc_textVac.fill = GridBagConstraints.HORIZONTAL;
				gbc_textVac.gridx = 2;
				gbc_textVac.gridy = 10;
				panel_3.add(textVac, gbc_textVac);
				textVac.setColumns(10);
			}
			{
				lblTratamiento = new JLabel("Tratamiento"); //$NON-NLS-1$
				GridBagConstraints gbc_lblTratamiento = new GridBagConstraints();
				gbc_lblTratamiento.anchor = GridBagConstraints.WEST;
				gbc_lblTratamiento.insets = new Insets(0, 0, 5, 5);
				gbc_lblTratamiento.gridx = 1;
				gbc_lblTratamiento.gridy = 11;
				panel_3.add(lblTratamiento, gbc_lblTratamiento);
			}
			{
				textTrat = new JTextField();
				textTrat.setEditable(false);
				GridBagConstraints gbc_textTrat = new GridBagConstraints();
				gbc_textTrat.insets = new Insets(0, 0, 5, 5);
				gbc_textTrat.fill = GridBagConstraints.HORIZONTAL;
				gbc_textTrat.gridx = 2;
				gbc_textTrat.gridy = 11;
				panel_3.add(textTrat, gbc_textTrat);
				textTrat.setColumns(10);
			}
			{
				lblOperaciones = new JLabel("Operaciones"); //$NON-NLS-1$
				GridBagConstraints gbc_lblOperaciones = new GridBagConstraints();
				gbc_lblOperaciones.anchor = GridBagConstraints.WEST;
				gbc_lblOperaciones.insets = new Insets(0, 0, 5, 5);
				gbc_lblOperaciones.gridx = 1;
				gbc_lblOperaciones.gridy = 12;
				panel_3.add(lblOperaciones, gbc_lblOperaciones);
			}
			{
				textOp = new JTextField();
				textOp.setEditable(false);
				GridBagConstraints gbc_textOp = new GridBagConstraints();
				gbc_textOp.insets = new Insets(0, 0, 5, 5);
				gbc_textOp.fill = GridBagConstraints.HORIZONTAL;
				gbc_textOp.gridx = 2;
				gbc_textOp.gridy = 12;
				panel_3.add(textOp, gbc_textOp);
				textOp.setColumns(10);
			}
			{
				lblCronicos = new JLabel("Enf Cronicas"); //$NON-NLS-1$
				GridBagConstraints gbc_lblCronicos = new GridBagConstraints();
				gbc_lblCronicos.anchor = GridBagConstraints.WEST;
				gbc_lblCronicos.insets = new Insets(0, 0, 5, 5);
				gbc_lblCronicos.gridx = 1;
				gbc_lblCronicos.gridy = 13;
				panel_3.add(lblCronicos, gbc_lblCronicos);
			}
			{
				textCr = new JTextField();
				textCr.setEditable(false);
				GridBagConstraints gbc_textCr = new GridBagConstraints();
				gbc_textCr.insets = new Insets(0, 0, 5, 5);
				gbc_textCr.fill = GridBagConstraints.HORIZONTAL;
				gbc_textCr.gridx = 2;
				gbc_textCr.gridy = 13;
				panel_3.add(textCr, gbc_textCr);
				textCr.setColumns(10);
			}
			{
			}
			{
				btnAtras = new JButton("atras");
				btnAtras.addActionListener(new BtnAtrasActionListener());
				GridBagConstraints gbc_btnAtras = new GridBagConstraints();
				gbc_btnAtras.insets = new Insets(0, 0, 0, 5);
				gbc_btnAtras.gridx = 2;
				gbc_btnAtras.gridy = 15;
				panel_3.add(btnAtras, gbc_btnAtras);
			}
			{
				btnGuardar = new JButton("guardar");
				GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
				gbc_btnGuardar.gridx = 3;
				gbc_btnGuardar.gridy = 15;
				panel_3.add(btnGuardar, gbc_btnGuardar);
			}
		}
	}
		
	private class BtnEditarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) 
		{	
			if(list.getSelectedValue()!=null)
			{
			
				opcion=2;
			
				list.setEnabled(false);
				textDNI.setEditable(false);
				textNombre.setEditable(true);
				textPrApellido.setEditable(true);
				textSegApellido.setEditable(true);
				textTelf.setEditable(true);
				textDom.setEditable(true);
				textAntFam.setEditable(true);
				textAlerg.setEditable(true);
				textVac.setEditable(true);
				textTrat.setEditable(true);
				textOp.setEditable(true);
				textCr.setEditable(true);
			
			
				btnGuardar.setEnabled(true);
				btnAtras.setEnabled(true);
			}
			else 
			{
				JOptionPane.showMessageDialog(getParent(), "Tiene que selecionar algÃºn paciente", "Aviso",
						JOptionPane.PLAIN_MESSAGE);
			}
			
		}
	}
	private class BtnCalendarioDeCitasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			HorarioDeCitas hc=new HorarioDeCitas();                
			hc.setVisible(true);
		}
	}
	
	private class ThisWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent arg0) {
		
			
			//Principal.setGestorpac(null);
		}
	}
	private class BtnBorrar_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
			
			
			
			if(list.getSelectedValue()!=null){
				
				for(int i=0;i<user.size();i++)
				{	
					if(user.elementAt(i).getDNI().equals(list.getSelectedValue()))
					{
						user.remove(i);	
					}
				}	
				
				DefaultListModel modelo = (DefaultListModel) list.getModel(); 
				int index = list.getSelectedIndex() ;
				modelo.remove( index );
			}else
			{
				JOptionPane.showMessageDialog(getParent(), "Tiene que selecionar algÃºn paciente", "Aviso",
						JOptionPane.PLAIN_MESSAGE);
			}
			
			
			centroMedico.setPacientes(user);
			
			centroMedico.escribirFichero();
			
			textDNI.setText("");
			textNombre.setText("");
			textPrApellido.setText("");
			textSegApellido.setText("");
			textTelf.setText("");
			textDom.setText("");
			textAntFam.setText("");
			textAlerg.setText("");
			textVac.setText("");
			textTrat.setText("");
			textOp.setText("");
			textCr.setText("");
		}
	}
	private class BtnInformesClinicosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		//	InformesClinicos ic=new InformesClinicos();                
		//	ic.setVisible(true);
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
					textPrApellido.setText(user.elementAt(i).getPrApellido());
					textSegApellido.setText(user.elementAt(i).getSegApellido());
					textTelf.setText(user.elementAt(i).getTelefono());
					textDom.setText(user.elementAt(i).getDomicilio());
					textAntFam.setText(user.elementAt(i).getAntecFamiliares());
					textAlerg.setText(user.elementAt(i).getAlergias());
					textVac.setText(user.elementAt(i).getVacunas());
					textTrat.setText(user.elementAt(i).getTratamiento());
					textOp.setText(user.elementAt(i).getOperaciones());
					textCr.setText(user.elementAt(i).getEnfCronicas());
					
				}
			}
		}
	}
	private class BtnAadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textDNI.setEditable(true);
			textNombre.setEditable(true);
			textPrApellido.setEditable(true);
			textSegApellido.setEditable(true);
			textTelf.setEditable(true);
			textDom.setEditable(true);
			textAntFam.setEditable(true);
			textAlerg.setEditable(true);
			textVac.setEditable(true);
			textTrat.setEditable(true);
			textOp.setEditable(true);
			textCr.setEditable(true);
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
			textPrApellido.setEditable(false);
			textSegApellido.setEditable(false);
			textTelf.setEditable(false);
			textDom.setEditable(false);
			textAntFam.setEditable(false);
			textAlerg.setEditable(false);
			textVac.setEditable(false);
			textTrat.setEditable(false);
			textOp.setEditable(false);
			textCr.setEditable(false);
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
		if(textPrApellido.getText().replace(" ","").equals(""))
		{
			valor=false;
		}
		if(textSegApellido.getText().replace(" ","").equals(""))
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
		if(textAntFam.getText().replace(" ","").equals(""))
		{
			valor=false;
		}
		if(textAlerg.getText().replace(" ","").equals(""))
		{
			valor=false;
		}
		if(textVac.getText().replace(" ","").equals(""))
		{
			valor=false;
		}
		if(textTrat.getText().replace(" ","").equals(""))
		{
			valor=false;
		}
		if(textOp.getText().replace(" ","").equals(""))
		{
			valor=false;
		}
		if(textCr.getText().replace(" ","").equals(""))
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
