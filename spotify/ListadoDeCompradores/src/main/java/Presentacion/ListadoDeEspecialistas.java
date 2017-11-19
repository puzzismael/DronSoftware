package Presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Messages;

import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.border.LineBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Button;
import java.awt.ComponentOrientation;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.UIManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.Toolkit;

public class ListadoDeEspecialistas extends JDialog {
	private JPanel panelDatos;
	private JLabel lblNombre;
	private JLabel lblPrimerAp;
	private JLabel lblSegundoAp;
	private JLabel lblCorreo;
	private JLabel lblUsuario;
	private JTextField textFieldNombre;
	private JTextField textFieldPrimerAp;
	private JTextField textFieldSegundoAp;
	private JTextField textFieldCorreo;
	private JLabel lblHorario;
	private JLabel lblEspecialidad;
	private JTextField textFieldHorario;
	private JTextField textFieldEspecialidad;
	private JPanel panelTablas;
	private JLabel lblDNI;
	private JTextField textFieldDNI;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblFoto;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListadoDeEspecialistas window = new ListadoDeEspecialistas();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public ListadoDeEspecialistas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListadoDeEspecialistas.class.getResource("/Presentacion/ListadoDeEspecialistas.jpg")));
	
		setBounds(100, 100, 932, 710);
		getContentPane().setLayout(new BorderLayout());
		{
			panelDatos = new JPanel();
			panelDatos.setSize(new Dimension(0, 100));
			panelDatos.setBorder(new LineBorder(null, 0));
			getContentPane().add(panelDatos, BorderLayout.WEST);
			GridBagLayout gbl_panelDatos = new GridBagLayout();
			gbl_panelDatos.columnWidths = new int[]{82, 78, 39, 97, 118, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panelDatos.rowHeights = new int[]{39, 24, 11, 18, 18, 19, 19, 19, 19, 19, 0, 0, 0, 0, 0};
			gbl_panelDatos.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panelDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelDatos.setLayout(gbl_panelDatos);
			{
				lblFoto = new JLabel("");
				
				GridBagConstraints gbc_lblFoto = new GridBagConstraints();
				gbc_lblFoto.fill = GridBagConstraints.VERTICAL;
				gbc_lblFoto.anchor = GridBagConstraints.EAST;
				gbc_lblFoto.gridwidth = 13;
				gbc_lblFoto.gridheight = 13;
				gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
				gbc_lblFoto.gridx = 5;
				gbc_lblFoto.gridy = 0;
				panelDatos.add(lblFoto, gbc_lblFoto);
			}
			{
				lblUsuario = new JLabel("ListadoDeUsuarios"); //$NON-NLS-1$
				lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
				GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
				gbc_lblUsuario.fill = GridBagConstraints.VERTICAL;
				gbc_lblUsuario.gridwidth = 2;
				gbc_lblUsuario.gridheight = 2;
				gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
				gbc_lblUsuario.gridx = 0;
				gbc_lblUsuario.gridy = 1;
				panelDatos.add(lblUsuario, gbc_lblUsuario);
			}
			{
				lblNombre = new JLabel("Nombre"); //$NON-NLS-1$
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblNombre.gridwidth = 2;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 1;
				gbc_lblNombre.gridy = 3;
				panelDatos.add(lblNombre, gbc_lblNombre);
			}
			{
				textFieldNombre = new JTextField();
				textFieldNombre.setEditable(false);
				GridBagConstraints gbc_textFieldNombre = new GridBagConstraints();
				gbc_textFieldNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldNombre.insets = new Insets(0, 0, 5, 5);
				gbc_textFieldNombre.gridx = 3;
				gbc_textFieldNombre.gridy = 3;
				panelDatos.add(textFieldNombre, gbc_textFieldNombre);
				textFieldNombre.setColumns(10);
			}
			{
				lblPrimerAp = new JLabel("Primer Ap"); //$NON-NLS-1$
				GridBagConstraints gbc_lblPrimerAp = new GridBagConstraints();
				gbc_lblPrimerAp.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblPrimerAp.gridwidth = 2;
				gbc_lblPrimerAp.insets = new Insets(0, 0, 5, 5);
				gbc_lblPrimerAp.gridx = 1;
				gbc_lblPrimerAp.gridy = 4;
				panelDatos.add(lblPrimerAp, gbc_lblPrimerAp);
			}
			{
				textFieldPrimerAp = new JTextField();
				textFieldPrimerAp.setEditable(false);
				GridBagConstraints gbc_textFieldPrimerAp = new GridBagConstraints();
				gbc_textFieldPrimerAp.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldPrimerAp.insets = new Insets(0, 0, 5, 5);
				gbc_textFieldPrimerAp.gridx = 3;
				gbc_textFieldPrimerAp.gridy = 4;
				panelDatos.add(textFieldPrimerAp, gbc_textFieldPrimerAp);
				textFieldPrimerAp.setColumns(10);
			}
			{
				lblSegundoAp = new JLabel("Segundo Ap"); //$NON-NLS-1$
				GridBagConstraints gbc_lblSegundoAp = new GridBagConstraints();
				gbc_lblSegundoAp.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblSegundoAp.gridwidth = 2;
				gbc_lblSegundoAp.insets = new Insets(0, 0, 5, 5);
				gbc_lblSegundoAp.gridx = 1;
				gbc_lblSegundoAp.gridy = 5;
				panelDatos.add(lblSegundoAp, gbc_lblSegundoAp);
			}
			{
				textFieldSegundoAp = new JTextField();
				textFieldSegundoAp.setEditable(false);
				GridBagConstraints gbc_textFieldSegundoAp = new GridBagConstraints();
				gbc_textFieldSegundoAp.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldSegundoAp.insets = new Insets(0, 0, 5, 5);
				gbc_textFieldSegundoAp.gridx = 3;
				gbc_textFieldSegundoAp.gridy = 5;
				panelDatos.add(textFieldSegundoAp, gbc_textFieldSegundoAp);
				textFieldSegundoAp.setColumns(10);
			}
			{
				lblCorreo = new JLabel("Correo"); //$NON-NLS-1$
				GridBagConstraints gbc_lblCorreo = new GridBagConstraints();
				gbc_lblCorreo.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblCorreo.gridwidth = 2;
				gbc_lblCorreo.insets = new Insets(0, 0, 5, 5);
				gbc_lblCorreo.gridx = 1;
				gbc_lblCorreo.gridy = 6;
				panelDatos.add(lblCorreo, gbc_lblCorreo);
			}
			{
				textFieldCorreo = new JTextField();
				textFieldCorreo.setEditable(false);
				GridBagConstraints gbc_textFieldCorreo = new GridBagConstraints();
				gbc_textFieldCorreo.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldCorreo.insets = new Insets(0, 0, 5, 5);
				gbc_textFieldCorreo.gridx = 3;
				gbc_textFieldCorreo.gridy = 6;
				panelDatos.add(textFieldCorreo, gbc_textFieldCorreo);
				textFieldCorreo.setColumns(10);
			}
			{
				lblHorario = new JLabel("Horario"); //$NON-NLS-1$
				GridBagConstraints gbc_lblHorario = new GridBagConstraints();
				gbc_lblHorario.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblHorario.gridwidth = 2;
				gbc_lblHorario.insets = new Insets(0, 0, 5, 5);
				gbc_lblHorario.gridx = 1;
				gbc_lblHorario.gridy = 7;
				panelDatos.add(lblHorario, gbc_lblHorario);
			}
			{
				textFieldHorario = new JTextField();
				textFieldHorario.setEditable(false);
				GridBagConstraints gbc_textFieldHorario = new GridBagConstraints();
				gbc_textFieldHorario.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldHorario.insets = new Insets(0, 0, 5, 5);
				gbc_textFieldHorario.gridx = 3;
				gbc_textFieldHorario.gridy = 7;
				panelDatos.add(textFieldHorario, gbc_textFieldHorario);
				textFieldHorario.setColumns(10);
			}
			{
				lblEspecialidad = new JLabel("Especialidad"); //$NON-NLS-1$
				GridBagConstraints gbc_lblEspecialidad = new GridBagConstraints();
				gbc_lblEspecialidad.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblEspecialidad.gridwidth = 2;
				gbc_lblEspecialidad.insets = new Insets(0, 0, 5, 5);
				gbc_lblEspecialidad.gridx = 1;
				gbc_lblEspecialidad.gridy = 8;
				panelDatos.add(lblEspecialidad, gbc_lblEspecialidad);
			}
			{
				textFieldEspecialidad = new JTextField();
				textFieldEspecialidad.setEditable(false);
				GridBagConstraints gbc_textFieldEspecialidad = new GridBagConstraints();
				gbc_textFieldEspecialidad.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldEspecialidad.insets = new Insets(0, 0, 5, 5);
				gbc_textFieldEspecialidad.gridx = 3;
				gbc_textFieldEspecialidad.gridy = 8;
				panelDatos.add(textFieldEspecialidad, gbc_textFieldEspecialidad);
				textFieldEspecialidad.setColumns(10);
			}
			{
				lblDNI = new JLabel("DNI"); //$NON-NLS-1$
				GridBagConstraints gbc_lblDNI = new GridBagConstraints();
				gbc_lblDNI.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblDNI.gridwidth = 2;
				gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
				gbc_lblDNI.gridx = 1;
				gbc_lblDNI.gridy = 9;
				panelDatos.add(lblDNI, gbc_lblDNI);
			}
			{
				textFieldDNI = new JTextField();
				textFieldDNI.setEditable(false);
				GridBagConstraints gbc_textFieldDNI = new GridBagConstraints();
				gbc_textFieldDNI.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldDNI.insets = new Insets(0, 0, 5, 5);
				gbc_textFieldDNI.gridx = 3;
				gbc_textFieldDNI.gridy = 9;
				panelDatos.add(textFieldDNI, gbc_textFieldDNI);
				textFieldDNI.setColumns(10);
			}
		}
		{
			panelTablas = new JPanel();
			panelTablas.setBorder(new LineBorder(new Color(192, 192, 192), 5));
			panelTablas.setPreferredSize(new Dimension(20, 300));
			panelTablas.setSize(new Dimension(40, 40));
			getContentPane().add(panelTablas, BorderLayout.SOUTH);
			GridBagLayout gbl_panelTablas = new GridBagLayout();
			gbl_panelTablas.columnWidths = new int[]{47, 40, 40, 90, 61, 51, 62, 51, 48, 35, 67, 57, 63, 50, 0};
			gbl_panelTablas.rowHeights = new int[]{25, 50, 35, 0, 0, 47, 11, 0};
			gbl_panelTablas.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panelTablas.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelTablas.setLayout(gbl_panelTablas);
			{
				scrollPane = new JScrollPane();
				GridBagConstraints gbc_scrollPane = new GridBagConstraints();
				gbc_scrollPane.gridheight = 2;
				gbc_scrollPane.gridwidth = 12;
				gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane.fill = GridBagConstraints.BOTH;
				gbc_scrollPane.gridx = 1;
				gbc_scrollPane.gridy = 1;
				panelTablas.add(scrollPane, gbc_scrollPane);
				{
					table = new JTable();
					table.setRowHeight(40);
					/*table.setModel(new DefaultTableModel(
						new Object[][] {
							{"Felipe", "Gonzalez", "Gutierrez", "gonzalez@foro.com", null, "10:00-11:30", "Neurologia", "12345678-A"},
							{"Carlos", "Buenafuente", "Andreu", "Carlos@foro.com", null, "12:00-13:30", "Psicologia", "12345678-B"},
							{"Enrique", "Mac\u00EDas", "Garc\u00EDa", "Enrique@foro.com", null, "09:00-10:30", "Rehabilitaci\u00F3n", "12345678-C"},
							{"Luis", "Cabrera", "Campos", "Luis@foro.com", null, "14:00-15:00", "Fisiolog\u00EDa", "12345678-D"},
							{"Alfonso", "Calabr\u00EDa", "Gomez", "Alfonso@foro.com", null, "16:00-17:00", "Sistema Endocrino", "12345678-E"},
							{"Elisa", "Martinez", "Inarejos", "Elisa@foro.com", null, "20:00-21:00", "Psicoterapia", "12345678-F"},
							{"Lucia", "Pi\u00F1ero", "Requena", "Lucia@foro.com", null, "13:00-14:00", "Oftanmologo", "12345678-G"},
							{"Andrea", "Lomas", "Saez", "Andrea@foro.com", null, "10:00-11:30", "\u00D3ptica", "12345678-H"},
						},
						new String[] {
							"Nombre", "Primer Ap", "Segundo Ap", "Correo", "Fotograf\u00EDa", "Horario", "Especialidad", "DNI"
						}
					) {
						Class[] columnTypes = new Class[] {
							String.class, String.class, String.class, String.class, Object.class, String.class, String.class, String.class
						};
						public Class getColumnClass(int columnIndex) {
							return columnTypes[columnIndex];
						}
						boolean[] columnEditables = new boolean[] {
							false, false, false, false, false, false, false, false
						};
						public boolean isCellEditable(int row, int column) {
							return columnEditables[column];
						}
					});
					scrollPane.setViewportView(table);*/
				}
				{
					
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					ListSelectionModel rowSM = table.getSelectionModel();
					rowSM.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent e) {
					ListSelectionModel lsm = (ListSelectionModel) e.getSource();
					if (!lsm.isSelectionEmpty()) {
					//int filaSeleccionada = lsm.getMinSelectionIndex() + 1;
					//taFilaSeleccionada.setText("Fila "+filaSeleccionada+" seleccionada");
					//MiModeloTabla modeloTabla = (MiModeloTabla)table.getModel();
					int n= table.getSelectedRow();
					if (n != -1)
					{
					
					textFieldNombre.setText((String)table.getValueAt(n, 0));
					textFieldPrimerAp.setText((String)table.getValueAt(n, 1));
					textFieldSegundoAp.setText((String)table.getValueAt(n, 2));
					textFieldCorreo.setText((String)table.getValueAt(n, 3));
					lblFoto.setIcon((Icon) table.getValueAt(n, 4));
					textFieldHorario.setText((String)table.getValueAt(n, 5));
					textFieldEspecialidad.setText((String)table.getValueAt(n, 6));
					textFieldDNI.setText((String)table.getValueAt(n, 7));
					
				
					}
					}
					}
					});

					table.setPreferredScrollableViewportSize(new Dimension(450, 600));
					
					MiModeloTabla modeloTabla = new MiModeloTabla();
					table.setModel(modeloTabla);
					table.setRowHeight(40);
					Object[] fila1= {"Felipe", "Gonzalez","Gutierrez","gonzalez@foro.com", new
							ImageIcon(getClass().getClassLoader().getResource
							("presentacion/IconoDeEspecialista1.jpg")),"10:00-11:30","Neurologia", "12345678-A"};
							modeloTabla.aniadeFila(fila1);
					Object[] fila2= {"Carlos", "Buenafuente","Andreu","Carlos@foro.com", new
							ImageIcon(getClass().getClassLoader().getResource
							("presentacion/IconoDeEspecialista2.jpg")),"12:00-13:30","Psicologia", "12345678-B"};
							modeloTabla.aniadeFila(fila2);
					Object[] fila3= {"Enrique", "Macías","García","Enrique@foro.com", new
							ImageIcon(getClass().getClassLoader().getResource
							("presentacion/IconoDeEspecialista2.jpg")),"09:00-10:30","Rehabilitación", "12345678-C"};
							modeloTabla.aniadeFila(fila3);
					Object[] fila4= {"Luis", "Cabrera","Campos","Luis@foro.com", new
							ImageIcon(getClass().getClassLoader().getResource
							("presentacion/IconoDeEspecialista1.jpg")),"14:00-15:00","Fisiología", "12345678-D"};
							modeloTabla.aniadeFila(fila4);
					Object[] fila5= {"Alfonso", "Calabría","Gomez","Alfonso@foro.com", new
							ImageIcon(getClass().getClassLoader().getResource
							("presentacion/IconoDeEspecialista2.jpg")),"16:00-17:00","Sistema Endocrino", "12345678-E"};
							modeloTabla.aniadeFila(fila5);
					Object[] fila6= {"Elisa", "Martinez","Inarejos","Elisa@foro.com", new
							ImageIcon(getClass().getClassLoader().getResource
							("presentacion/IconoDeEspecialista2.jpg")),"20:00-21:00","Psicoterapia", "12345678-F"};
							modeloTabla.aniadeFila(fila6);
					Object[] fila7= {"Lucia", "Piñero","Requena","Lucia@foro.com", new
							ImageIcon(getClass().getClassLoader().getResource
							("presentacion/IconoDeEspecialista2.jpg")),"13:00-14:00","Oftanmologo", "12345678-G"};
							modeloTabla.aniadeFila(fila7);
					Object[] fila8= {"Andrea", "Lomas","Saez","Andrea@foro.com", new
							ImageIcon(getClass().getClassLoader().getResource
							("presentacion/IconoDeEspecialista1.jpg")),"10:00-11:30","Óptica", "12345678-H"};
							modeloTabla.aniadeFila(fila8);
					
					scrollPane.setViewportView(table);
				}
			}
		}
	}
	
}
