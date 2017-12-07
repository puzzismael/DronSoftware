package org.EliminacionDeUsuarios.Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.CreacionDeUsers.Dominio.Usuario;



import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.UIManager;
import java.awt.Color;

public class EliminarUsuario extends JFrame {
	
	
	private JPanel contentPane;
	private JTextField textID;
	private JScrollPane scrollPane;
	private JList<Usuario> list;
	private Usuario user=new Usuario();
	private Usuario[] users =user.obtenerListaDeBD();
	public EliminarUsuario() {
		setTitle("Eliminar Usuario");
		
		setResizable(false);
		 
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 452, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("ID:");
		lblNombre.setFont(new Font("", Font.BOLD, 11)); 
		lblNombre.setBounds(67, 71, 33, 14);
		panel.add(lblNombre);
		
		textID = new JTextField();
		textID.setFont(new Font("", Font.BOLD, 11)); 
		textID.setBackground(SystemColor.scrollbar);
		textID.setBounds(110, 68, 145, 20);
		panel.add(textID);
		textID.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(150, 2));
		contentPane.add(scrollPane, BorderLayout.WEST);
		
		list = new JList();
		list.setEnabled(false);
		list.addListSelectionListener(new ListListSelectionListener());
		scrollPane.setViewportView(list);
		list.setFont(new Font("", Font.BOLD, 11)); 
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); 
		actualizarDatos();
		DefaultListModel modelo = new DefaultListModel();
		for(int i = 0; i<users.length; i++){
		        modelo.addElement("id: "+ users[i].getID()+"/nombre: "+users[i].getNombre());
		}
		list.setModel(modelo);
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnCancelar = new JButton("Cancelar"); 
		btnCancelar.setText("Cancelar");
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		btnCancelar.setFont(new Font("", Font.BOLD, 11));
		panel_1.add(btnCancelar);
		
		JButton btnBorrar = new JButton("Borrar usuario"); 
		btnBorrar.setText("Borrar usuario");
		btnBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBorrar.addActionListener(new BtnBorrarActionListener());
		btnBorrar.setFont(new Font("", Font.BOLD, 11)); 
		panel_1.add(btnBorrar);
	}
	
	public void actualizarDatos(){
		DefaultListModel modelo = new DefaultListModel();
	//	for(int i=0;i<user.size();i++){
		//	modelo.addElement(user.get(i).getApellidos()+" "+user.get(i).getNombre()); 
		//}
		list.setModel(modelo);
	}
	
	
	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			
			
		}
	}
	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
		}
	}
	
	private class BtnBorrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if((textID.getText().replace(" ","")).equals("")) {
				JOptionPane.showMessageDialog(null,"deben estar todos los espacios llenos");
			}else {
				Usuario us =new Usuario();
				us.EliminarRegistro(textID.getText().toString());
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							EliminarUsuario eu =new EliminarUsuario();
							eu.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			
			}
			
		}
	}
}
	
			
		
	
	

