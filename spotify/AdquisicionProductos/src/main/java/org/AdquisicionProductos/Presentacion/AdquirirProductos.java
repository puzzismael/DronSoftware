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
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class AdquirirProductos extends JFrame {

	private JPanel contentPane;
	//private JList<Doctor> list;
	//private JList<Paciente> list1;
	//private ArrayList<Doctor> usuarios=new ArrayList<Doctor>();

	
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
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		//list = new JList</*Doctor*/>();
		//list.addListSelectionListener(new ListListSelectionListener());
		//list.setBorder(new TitledBorder(null, Messages.getString("BuscarPaciente.1"), TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
		//scrollPane.setViewportView(list);
		actualizarDatos();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new TitledBorder(null, "Cesta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane_1.setPreferredSize(new Dimension(150, 2));
		contentPane.add(scrollPane_1, BorderLayout.EAST);
		
		JList list_1 = new JList();
		scrollPane_1.setViewportView(list_1);
		
		//list1 = new JList<Paciente>();
		//list1.setBorder(new TitledBorder(null, Messages.getString("BuscarPaciente.2"), TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
	//	scrollPane_1.setViewportView(list1);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton button = new JButton(">>"); //$NON-NLS-1$
		button.addActionListener(new ButtonActionListener());
		button.setBounds(34, 90, 52, 23);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton);
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
	private class ButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		/*	int i=list.getSelectedIndex();
			try{
				DefaultListModel modelo = new DefaultListModel();
				for(int j=0;j<usuarios.get(i).getPacientes().size();j++){
					modelo.addElement(usuarios.get(i).getPacientes().get(j).getApellidos()+Messages.getString("BuscarPaciente.5")+usuarios.get(i).getPacientes().get(j).getNombre()); //$NON-NLS-1$
				}
				list1.setModel(modelo);
			}catch(ArrayIndexOutOfBoundsException e){
				JOptionPane.showMessageDialog(new JFrame(), Messages.getString("BuscarPaciente.6"), //$NON-NLS-1$
						Messages.getString("BuscarPaciente.7"),JOptionPane.PLAIN_MESSAGE ); //$NON-NLS-1$
			*/}
			
		
	}
}
