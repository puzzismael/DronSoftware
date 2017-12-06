package org.BuscarCanciones.Presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;

import org.IntroducirAlbum.Dominio.Album;

import javax.swing.event.ListSelectionEvent;
import javax.swing.JLabel;

public class BuscarCanciones extends JDialog {
	private JTextField textNombre;
	private Album album=new Album();
	private Album[] albumes=album.obtenerListaDeBD();
	private JList list ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BuscarCanciones dialog = new BuscarCanciones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BuscarCanciones() {
		getContentPane().setBackground(UIManager.getColor("Button.highlight"));
		setBackground(UIManager.getColor("Button.disabledShadow"));
		setBounds(100, 100, 465, 301);
		getContentPane().setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBackground(UIManager.getColor("Button.disabledShadow"));
			scrollPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Listado de Canciones/albumes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			scrollPane.setPreferredSize(new Dimension(200, 2));
			getContentPane().add(scrollPane, BorderLayout.WEST);
			{
				list = new JList();
				DefaultListModel modelo = new DefaultListModel();
				
				for(int i = 0; i<albumes.length; i++){
				        modelo.addElement(albumes[i].getNombre());
				}
				list.setModel(modelo);
				list.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent e) {
						
					}
				});
				scrollPane.setViewportView(list);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(UIManager.getColor("Button.disabledShadow"));
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				textNombre = new JTextField();
				textNombre.setBounds(151, 31, 88, 23);
				textNombre.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textNombre.setBackground(UIManager.getColor("Button.shadow"));
				textNombre.setForeground(UIManager.getColor("Button.foreground"));
				panel.add(textNombre);
				textNombre.setColumns(10);
			}
			
			JButton btnBuscar = new JButton("buscar");
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(textNombre.getText().replace(" ","").equals(""))
					{
						JOptionPane.showMessageDialog(null,"rellene todos los espacios");
					}else {
					boolean bol =true;
					for(int i=0;i<albumes.length;i++)
					{
						if((textNombre.getText().equals(albumes[i].getArtista()))||
							(textNombre.getText().equals(albumes[i].getNombre()))) {
							JOptionPane.showMessageDialog(null,"Producto encontrado");
						bol=false;
						}
					}
				if(bol)JOptionPane.showMessageDialog(null,"El producto no existe");
				}
				}
			});
			btnBuscar.setBounds(139, 218, 89, 23);
			panel.add(btnBuscar);
			
			JLabel lblNombrecancartista = new JLabel("NombreCanc/Artista");
			lblNombrecancartista.setFont(new Font("Verdana", Font.BOLD, 11));
			lblNombrecancartista.setBounds(10, 32, 143, 19);
			panel.add(lblNombrecancartista);
		}
	}
}
