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
import javax.swing.JList;

public class ListadoDeEspecialistas extends JDialog {
	private JPanel panelDatos;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblID;
	private JLabel lblUsuario;
	private JTextField textFieldNombre;
	private JTextField textTipo;
	private JTextField textPrecAlbum;
	private JTextField textID;
	private JLabel lblPrec;
	private JLabel lblArtista;
	private JTextField textPrec;
	private JTextField textArtista;
	private JPanel panelTablas;
	private JTextField textFechaDeLanzamiento;
	private JScrollPane scrollPane;
	private JTable table;
	private JTable table_1;
	private JButton btnObtenerProducto;
	private JScrollPane scrollPane_1;
	private JList list;
	private JLabel lblContrasea;

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
					ListadoDeEspecialistas window = new ListadoDeEspecialistas ();
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
			gbl_panelDatos.columnWidths = new int[]{82, 78, 39, 97, 118, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panelDatos.rowHeights = new int[]{39, 24, 11, 18, 18, 19, 19, 19, 19, 19, 0, 0, 0, 0};
			gbl_panelDatos.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panelDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelDatos.setLayout(gbl_panelDatos);
			{
				lblUsuario = new JLabel("Listado de usuarios"); //$NON-NLS-1$
				lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
				GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
				gbc_lblUsuario.fill = GridBagConstraints.VERTICAL;
				gbc_lblUsuario.gridwidth = 2;
				gbc_lblUsuario.gridheight = 2;
				gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
				gbc_lblUsuario.gridx = 1;
				gbc_lblUsuario.gridy = 1;
				panelDatos.add(lblUsuario, gbc_lblUsuario);
			}
			{
				lblID = new JLabel("ID"); //$NON-NLS-1$
				GridBagConstraints gbc_lblID = new GridBagConstraints();
				gbc_lblID.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblID.insets = new Insets(0, 0, 5, 5);
				gbc_lblID.gridx = 1;
				gbc_lblID.gridy = 3;
				panelDatos.add(lblID, gbc_lblID);
			}
			{
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBorder(new TitledBorder(null, "Productos Obtenidos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
				gbc_scrollPane_1.gridwidth = 13;
				gbc_scrollPane_1.gridheight = 8;
				gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_1.gridx = 8;
				gbc_scrollPane_1.gridy = 1;
				panelDatos.add(scrollPane_1, gbc_scrollPane_1);
				{
					list = new JList();
					scrollPane_1.setViewportView(list);
				}
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
				lblNombre = new JLabel("Nombre"); //$NON-NLS-1$
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.gridwidth = 2;
				gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 1;
				gbc_lblNombre.gridy = 4;
				panelDatos.add(lblNombre, gbc_lblNombre);
			}
			{
				textTipo = new JTextField();
				textTipo.setEditable(false);
				GridBagConstraints gbc_textTipo = new GridBagConstraints();
				gbc_textTipo.fill = GridBagConstraints.HORIZONTAL;
				gbc_textTipo.insets = new Insets(0, 0, 5, 5);
				gbc_textTipo.gridx = 3;
				gbc_textTipo.gridy = 4;
				panelDatos.add(textTipo, gbc_textTipo);
				textTipo.setColumns(10);
			}
			{
				lblApellidos = new JLabel("Apellidos"); //$NON-NLS-1$
				GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
				gbc_lblApellidos.gridwidth = 2;
				gbc_lblApellidos.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
				gbc_lblApellidos.gridx = 1;
				gbc_lblApellidos.gridy = 5;
				panelDatos.add(lblApellidos, gbc_lblApellidos);
			}
			{
				textPrecAlbum = new JTextField();
				textPrecAlbum.setEditable(false);
				GridBagConstraints gbc_textPrecAlbum = new GridBagConstraints();
				gbc_textPrecAlbum.fill = GridBagConstraints.HORIZONTAL;
				gbc_textPrecAlbum.insets = new Insets(0, 0, 5, 5);
				gbc_textPrecAlbum.gridx = 3;
				gbc_textPrecAlbum.gridy = 5;
				panelDatos.add(textPrecAlbum, gbc_textPrecAlbum);
				textPrecAlbum.setColumns(10);
			}
			{
				lblContrasea = new JLabel("Contrase\u00F1a");
				GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
				gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
				gbc_lblContrasea.gridx = 1;
				gbc_lblContrasea.gridy = 6;
				panelDatos.add(lblContrasea, gbc_lblContrasea);
			}
			{
				textID = new JTextField();
				textID.setEditable(false);
				GridBagConstraints gbc_textID = new GridBagConstraints();
				gbc_textID.fill = GridBagConstraints.HORIZONTAL;
				gbc_textID.insets = new Insets(0, 0, 5, 5);
				gbc_textID.gridx = 3;
				gbc_textID.gridy = 6;
				panelDatos.add(textID, gbc_textID);
				textID.setColumns(10);
			}
			{
				lblPrec = new JLabel(""); //$NON-NLS-1$
				GridBagConstraints gbc_lblPrec = new GridBagConstraints();
				gbc_lblPrec.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblPrec.gridwidth = 2;
				gbc_lblPrec.insets = new Insets(0, 0, 5, 5);
				gbc_lblPrec.gridx = 1;
				gbc_lblPrec.gridy = 7;
				panelDatos.add(lblPrec, gbc_lblPrec);
			}
			{
				textPrec = new JTextField();
				textPrec.setEditable(false);
				GridBagConstraints gbc_textPrec = new GridBagConstraints();
				gbc_textPrec.fill = GridBagConstraints.HORIZONTAL;
				gbc_textPrec.insets = new Insets(0, 0, 5, 5);
				gbc_textPrec.gridx = 3;
				gbc_textPrec.gridy = 7;
				panelDatos.add(textPrec, gbc_textPrec);
				textPrec.setColumns(10);
			}
			{
				lblArtista = new JLabel(""); //$NON-NLS-1$
				GridBagConstraints gbc_lblArtista = new GridBagConstraints();
				gbc_lblArtista.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblArtista.gridwidth = 2;
				gbc_lblArtista.insets = new Insets(0, 0, 5, 5);
				gbc_lblArtista.gridx = 1;
				gbc_lblArtista.gridy = 8;
				panelDatos.add(lblArtista, gbc_lblArtista);
			}
			{
				textArtista = new JTextField();
				textArtista.setEditable(false);
				GridBagConstraints gbc_textArtista = new GridBagConstraints();
				gbc_textArtista.fill = GridBagConstraints.HORIZONTAL;
				gbc_textArtista.insets = new Insets(0, 0, 5, 5);
				gbc_textArtista.gridx = 3;
				gbc_textArtista.gridy = 8;
				panelDatos.add(textArtista, gbc_textArtista);
				textArtista.setColumns(10);
			}
			{
				textFechaDeLanzamiento = new JTextField();
				textFechaDeLanzamiento.setEditable(false);
				GridBagConstraints gbc_textFechaDeLanzamiento = new GridBagConstraints();
				gbc_textFechaDeLanzamiento.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFechaDeLanzamiento.insets = new Insets(0, 0, 5, 5);
				gbc_textFechaDeLanzamiento.gridx = 3;
				gbc_textFechaDeLanzamiento.gridy = 9;
				panelDatos.add(textFechaDeLanzamiento, gbc_textFechaDeLanzamiento);
				textFechaDeLanzamiento.setColumns(10);
			}
			{
				btnObtenerProducto = new JButton("Obtener producto");
				GridBagConstraints gbc_btnObtenerProducto = new GridBagConstraints();
				gbc_btnObtenerProducto.gridwidth = 4;
				gbc_btnObtenerProducto.insets = new Insets(0, 0, 5, 5);
				gbc_btnObtenerProducto.gridx = 14;
				gbc_btnObtenerProducto.gridy = 10;
				panelDatos.add(btnObtenerProducto, gbc_btnObtenerProducto);
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
					textTipo.setText((String)table.getValueAt(n, 1));
					textPrecAlbum.setText((String)table.getValueAt(n, 2));
					textID.setText((String)table.getValueAt(n, 3));
					
					textPrec.setText((String)table.getValueAt(n, 5));
					textArtista.setText((String)table.getValueAt(n, 6));
					textFechaDeLanzamiento.setText((String)table.getValueAt(n, 7));
					
				
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
