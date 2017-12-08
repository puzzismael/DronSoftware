package org.AdquisicionProductos.Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

//import dominio.Doctor;
//import dominio.Paciente;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.event.ListSelectionListener;

import org.AdquisicionProductos.Dominio.ProductoAdquirido;
import Dominio.Album;

import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;

public class AdquirirProductos extends JFrame {

	private JPanel contentPane;
	//private JList<Doctor> list;
	//private JList<Paciente> list1;
	//private ArrayList<Doctor> usuarios=new ArrayList<Doctor>();

	private Album album=new Album();
	private Album[] albumes=album.obtenerListaDeBD();
	private JList list ;
	private JList list1 ;
	private String  id;
	private String precio;
	private String comprador;
	Stack acumulados = new Stack();
	private JButton btnComprar;
	public AdquirirProductos(/*ArrayList<Doctor> usuarios*/) {
		//this.usuarios=usuarios;
		setTitle("Adquirir Productos"); //$NON-NLS-1$
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setPreferredSize(new Dimension(150, 2));
		contentPane.add(scrollPane, BorderLayout.WEST);
		
		 list = new JList();
		 list.addListSelectionListener(new ListSelectionListener() {
		 	public void valueChanged(ListSelectionEvent e) {
		 		btnComprar.setEnabled(true);
		 	}
		 });
		scrollPane.setViewportView(list);
		list.setBackground(SystemColor.control);
		scrollPane.setViewportView(list);
		list.setEnabled(true);
		DefaultListModel modelo = new DefaultListModel();
		
		for(int i = 0; i<albumes.length; i++){
		        modelo.addElement(albumes[i].getNombre());
		}
		list.setModel(modelo);
		
		//list = new JList</*Doctor*/>();
		//list.addListSelectionListener(new ListListSelectionListener());
		//list.setBorder(new TitledBorder(null, Messages.getString("BuscarPaciente.1"), TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
		//scrollPane.setViewportView(list);
		actualizarDatos();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos Comprados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		scrollPane_1.setPreferredSize(new Dimension(150, 2));
		contentPane.add(scrollPane_1, BorderLayout.EAST);
		
		list1 = new JList();
		scrollPane_1.setViewportView(list1);
		
		//list1 = new JList<Paciente>();
		//list1.setBorder(new TitledBorder(null, Messages.getString("BuscarPaciente.2"), TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
	//	scrollPane_1.setViewportView(list1);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnComprar = new JButton("Comprar");
		btnComprar.setEnabled(false);
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				boolean bol=true;
				while(cont<acumulados.size())
				{
					if(list.getSelectedValue().equals(acumulados.elementAt(cont))){
						bol=false;
						JOptionPane.showMessageDialog(null,"Ya tiene ese producto, seleccionen otro");
					}
					cont++;
				}
					if(bol)
					{
				DefaultListModel modelo1 = new DefaultListModel();
				
			          acumulados.push(list.getSelectedValue());
				      for(int i=0;i<acumulados.size();i++)  
			          modelo1.addElement(acumulados.elementAt(i));
				
				list1.setModel(modelo1);
				ProductoAdquirido prodAd =new ProductoAdquirido();
				prodAd.insertarBD(id, list.getSelectedValue().toString(), comprador);
				JOptionPane.showMessageDialog(null,"Producto adquirido!!!");
			}
			}
		});
		panel_1.add(btnComprar);
	}

	
	public void actualizarDatos(){
		DefaultListModel modelo = new DefaultListModel();
	/*	for(int i=0;i<usuarios.size();i++){
			modelo.addElement(usuarios.get(i).getApellidos()+Messages.getString("BuscarPaciente.4")+usuarios.get(i).getNombre()); //$NON-NLS-1$
		}
		list.setModel(modelo);*/
	}
	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
		}
	}
	public void setId(String id) {
		this.id=id;
	}
	public void comprador(String comp) {
		this.comprador=comp;
	}
	
}
