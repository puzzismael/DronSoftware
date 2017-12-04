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

import org.EliminacionDeUsuarios.Dominio.Usuario;

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
	
	private ArrayList<Usuario> user;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JScrollPane scrollPane;
	private JList<Usuario> list;


	public EliminarUsuario(ArrayList<Usuario> user) {
		setTitle("Eliminar Usuario");
		this.user=user;
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
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("", Font.BOLD, 11)); 
		lblNombre.setBounds(38, 71, 63, 14);
		panel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setFont(new Font("", Font.BOLD, 11)); 
		textNombre.setBackground(SystemColor.scrollbar);
		textNombre.setBounds(110, 68, 145, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:"); 
		lblApellidos.setFont(new Font("", Font.BOLD, 11)); 
		lblApellidos.setBounds(33, 121, 77, 14);
		panel.add(lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.setEditable(false);
		textApellidos.setFont(new Font("", Font.BOLD, 11)); 
		textApellidos.setBackground(SystemColor.scrollbar);
		textApellidos.setBounds(110, 118, 145, 20);
		panel.add(textApellidos);
		textApellidos.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(150, 2));
		contentPane.add(scrollPane, BorderLayout.WEST);
		
		list = new JList<Usuario>();
		list.addListSelectionListener(new ListListSelectionListener());
		scrollPane.setViewportView(list);
		list.setFont(new Font("", Font.BOLD, 11)); 
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); 
		actualizarDatos();
		
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
			
					int i=list.getSelectedIndex();
					if(i==-1){
						textNombre.setText(""); 
						textApellidos.setText(""); 
						
					}else{
						textApellidos.setText(user.get(i).getApellidos());
						textNombre.setText(user.get(i).getNombre());
						
			}
		}
	}
	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
		}
	}
	
	private class BtnBorrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int i=list.getSelectedIndex();
			if(i==-1){
				JOptionPane.showMessageDialog(new JFrame(), "Borrar usuario", 
						"No hay usuarios para borrar.\n",JOptionPane.PLAIN_MESSAGE );
			}else{
				if((JOptionPane.showConfirmDialog(new JFrame (),"Borrar usuario","�Desea  borrar el usuario seleccionado?",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.YES_OPTION)){
					user.remove(i);
					actualizarDatos();
					JOptionPane.showMessageDialog(new JFrame(), "Enhorabuena", 
							"Usuario eliminado con �xito",JOptionPane.PLAIN_MESSAGE ); 
				}
					
			}
			
		}
	}
}
