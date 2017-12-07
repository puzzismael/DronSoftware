package Presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.CreacionDeUsers.Dominio.Cancion;
import org.CreacionDeUsers.Dominio.Usuario;
import org.IntroducirAlbum.Dominio.Album;



import javax.swing.UIManager;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GestionDeUsuarios extends JPanel {
	JButton btnReproducir;
	private JTextField textFieldNombreCancion;
	private JTextField textFieldCancionStreaming;
	private JTextField textFieldPrecio;
	private JButton btnReproducirCancin;
	private JList<Cancion> listCancionesDispositivo;
	private JList<Cancion> list;
	private ArrayList<Usuario> user;
	private ArrayList<Cancion> canc;
	Usuario usuari;
	private Album album=new Album();
	private Album[] albumes=album.obtenerListaDeBD();
	/**
	 * Create the panel.
	 */
	public GestionDeUsuarios() {
	
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{64, 0, 60, 58, 49, 55, 46, 46, 57, 26, 68, 0, 49, 36, 0};
		gridBagLayout.rowHeights = new int[]{47, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNombreUsuario = new JLabel("Gestor del usuario");
		lblNombreUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNombreUsuario = new GridBagConstraints();
		gbc_lblNombreUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblNombreUsuario.gridwidth = 5;
		gbc_lblNombreUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreUsuario.gridx = 1;
		gbc_lblNombreUsuario.gridy = 1;
		add(lblNombreUsuario, gbc_lblNombreUsuario);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.gridheight = 9;
		gbc_tabbedPane.gridwidth = 9;
		gbc_tabbedPane.insets = new Insets(0, 0, 0, 5);
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 1;
		gbc_tabbedPane.gridy = 3;
		add(tabbedPane, gbc_tabbedPane);
		
		JPanel panelDispositivo = new JPanel();
		panelDispositivo.setBackground(SystemColor.scrollbar);
		tabbedPane.addTab("Guardado en dispositivo", null, panelDispositivo, null);
		GridBagLayout gbl_panelDispositivo = new GridBagLayout();
		gbl_panelDispositivo.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelDispositivo.rowHeights = new int[]{18, 31, -5, 31, 0, 0, 45, 0, 0, 0};
		gbl_panelDispositivo.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelDispositivo.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelDispositivo.setLayout(gbl_panelDispositivo);
		
		
        
		
		final JList list_1 = new JList();
		list_1.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				btnReproducir.setEnabled(true);
				textFieldNombreCancion.setText(albumes[list_1.getSelectedIndex()].getNombre());
			}
		});
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.gridheight = 6;
		gbc_list_1.gridwidth = 6;
		gbc_list_1.insets = new Insets(0, 0, 5, 5);
		gbc_list_1.fill = GridBagConstraints.BOTH;
		gbc_list_1.gridx = 1;
		gbc_list_1.gridy = 1;
		panelDispositivo.add(list_1, gbc_list_1);
		DefaultListModel modelo = new DefaultListModel();
		
		for(int i = 0; i<albumes.length; i++){
		        modelo.addElement("ID:"+albumes[i].getID()+"-nombre: "+albumes[i].getNombre()+"-artista: "+albumes[i].getArtista());
		}
		list_1.setModel(modelo);
		
		JLabel lblNombreCancin = new JLabel("Nombre canci\u00F3n:");
		GridBagConstraints gbc_lblNombreCancin = new GridBagConstraints();
		gbc_lblNombreCancin.anchor = GridBagConstraints.EAST;
		gbc_lblNombreCancin.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreCancin.gridx = 7;
		gbc_lblNombreCancin.gridy = 3;
		panelDispositivo.add(lblNombreCancin, gbc_lblNombreCancin);
		
		textFieldNombreCancion = new JTextField();
		GridBagConstraints gbc_textFieldNombreCancion = new GridBagConstraints();
		gbc_textFieldNombreCancion.gridwidth = 2;
		gbc_textFieldNombreCancion.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNombreCancion.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNombreCancion.gridx = 8;
		gbc_textFieldNombreCancion.gridy = 3;
		panelDispositivo.add(textFieldNombreCancion, gbc_textFieldNombreCancion);
		textFieldNombreCancion.setColumns(10);
		
		btnReproducir = new JButton("Reproducir");
		GridBagConstraints gbc_btnReproducir = new GridBagConstraints();
		gbc_btnReproducir.insets = new Insets(0, 0, 5, 5);
		gbc_btnReproducir.gridx = 8;
		gbc_btnReproducir.gridy = 6;
		panelDispositivo.add(btnReproducir, gbc_btnReproducir);
		btnReproducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JFrame(), "Reproducir canción "+albumes[list_1.getSelectedIndex()].getNombre(), 
					"Reproduciendo canción...\n"+albumes[list_1.getSelectedIndex()].getNombre(),JOptionPane.PLAIN_MESSAGE );

			}
		});
		btnReproducir.setEnabled(false);
		tabbedPane.setEnabledAt(0, true);
	
		JPanel panelStreaming = new JPanel();
		panelStreaming.setBackground(SystemColor.scrollbar);
		tabbedPane.addTab("Streaming", null, panelStreaming, null);
		GridBagLayout gbl_panelStreaming = new GridBagLayout();
		gbl_panelStreaming.columnWidths = new int[]{23, 44, 0, 0, 0, 35, 23, 0, 0, 0, 0, 0};
		gbl_panelStreaming.rowHeights = new int[]{36, 27, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelStreaming.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelStreaming.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelStreaming.setLayout(gbl_panelStreaming);
		
		final JList list_2 = new JList();
		list_2.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				textFieldCancionStreaming.setText(albumes[list_2.getSelectedIndex()].getNombre());
			textFieldPrecio.setText((albumes[list_2.getSelectedIndex()].getPrecioCancion()));
	
	
			}
			
		});
		GridBagConstraints gbc_list_2 = new GridBagConstraints();
		gbc_list_2.gridwidth = 3;
		gbc_list_2.gridheight = 5;
		gbc_list_2.insets = new Insets(0, 0, 5, 5);
		gbc_list_2.fill = GridBagConstraints.BOTH;
		gbc_list_2.gridx = 1;
		gbc_list_2.gridy = 1;
		panelStreaming.add(list_2, gbc_list_2);
		DefaultListModel modelo2 = new DefaultListModel();
		
		for(int i = 0; i<albumes.length; i++){
		        modelo2.addElement("ID:"+albumes[i].getID()+"-nombre: "+albumes[i].getNombre()+"-artista: "+albumes[i].getArtista());
		}
		list_2.setModel(modelo2); 
		JLabel lblNombreCancin_1 = new JLabel("Nombre canci\u00F3n:");
		GridBagConstraints gbc_lblNombreCancin_1 = new GridBagConstraints();
		gbc_lblNombreCancin_1.gridwidth = 2;
		gbc_lblNombreCancin_1.anchor = GridBagConstraints.EAST;
		gbc_lblNombreCancin_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreCancin_1.gridx = 6;
		gbc_lblNombreCancin_1.gridy = 1;
		panelStreaming.add(lblNombreCancin_1, gbc_lblNombreCancin_1);
		
		textFieldCancionStreaming = new JTextField();
		GridBagConstraints gbc_textFieldCancionStreaming = new GridBagConstraints();
		gbc_textFieldCancionStreaming.gridwidth = 2;
		gbc_textFieldCancionStreaming.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldCancionStreaming.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCancionStreaming.gridx = 8;
		gbc_textFieldCancionStreaming.gridy = 1;
		panelStreaming.add(textFieldCancionStreaming, gbc_textFieldCancionStreaming);
		textFieldCancionStreaming.setColumns(10);
		
		JLabel lblPrecio_1 = new JLabel("Precio:");
		GridBagConstraints gbc_lblPrecio_1 = new GridBagConstraints();
		gbc_lblPrecio_1.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio_1.gridx = 7;
		gbc_lblPrecio_1.gridy = 2;
		panelStreaming.add(lblPrecio_1, gbc_lblPrecio_1);
		
		textFieldPrecio = new JTextField();
		GridBagConstraints gbc_textFieldPrecio = new GridBagConstraints();
		gbc_textFieldPrecio.gridwidth = 2;
		gbc_textFieldPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPrecio.gridx = 8;
		gbc_textFieldPrecio.gridy = 2;
		panelStreaming.add(textFieldPrecio, gbc_textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		
		JList list = new JList();

	}
	
	public void actualizarDatos(){
		DefaultListModel modelo = new DefaultListModel();
		for(int i=0;i<user.size();i++){
			modelo.addElement(user.get(i).getApellidos()+" "+user.get(i).getNombre()); 
		}
		
		
		listCancionesDispositivo.setModel(modelo);
		list.setModel(modelo);
	}
	
	
	
	

}
