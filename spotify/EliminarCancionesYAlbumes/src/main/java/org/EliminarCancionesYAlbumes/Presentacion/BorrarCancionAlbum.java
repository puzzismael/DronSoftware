package org.EliminarCancionesYAlbumes.Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import org.IntroducirAlbum.Dominio.*;
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


//import com.mysql.jdbc.Messages;

import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.Stack;

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
import javax.swing.AbstractListModel;

public class BorrarCancionAlbum extends JFrame {
	
	
	private JPanel contentPane;
	private JTextField textIDCanc;
	private JScrollPane scrollPane;
	private JList list;
	Album albm =new Album();
	private Album [] album =albm.obtenerListaDeBD();

	public BorrarCancionAlbum() {
		
		
		
		setResizable(false);
		setTitle("Borrar Productos"); //$NON-NLS-1$
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
		
		JLabel lblNPaciente = new JLabel("ID. Canción:"); //$NON-NLS-1$
		lblNPaciente.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblNPaciente.setBounds(42, 23, 79, 14);
		panel.add(lblNPaciente);
		
		
		textIDCanc = new JTextField();
		textIDCanc.setFont(new Font("BorrarPaciente.3", Font.BOLD, 11)); //$NON-NLS-1$
		textIDCanc.setBackground(SystemColor.scrollbar);
		textIDCanc.setBounds(131, 20, 41, 20);
		panel.add(textIDCanc);
		textIDCanc.setColumns(10);
		textIDCanc.setText(albm.getID());
		scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(150, 2));
		contentPane.add(scrollPane, BorderLayout.WEST);
		
		
			
		list = new JList();
		list.setEnabled(false);
		DefaultListModel modelo = new DefaultListModel();
		for(int i = 0; i<album.length; i++){
		        modelo.addElement("id: "+ album[i].getID()+"/nombre: "+album[i].getNombre());
		}
		list.setModel(modelo);
	
		list.addListSelectionListener(new ListListSelectionListener());
		scrollPane.setViewportView(list);
		list.setFont(new Font("BorrarPaciente.10", Font.BOLD, 11)); //$NON-NLS-1$
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		actualizarDatos();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnCancelar = new JButton("Cancelar"); //$NON-NLS-1$
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		btnCancelar.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		panel_1.add(btnCancelar);
		
		JButton btnBorrar = new JButton("Borrar"); //$NON-NLS-1$
		btnBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBorrar.addActionListener(new BtnBorrarActionListener());
		btnBorrar.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		panel_1.add(btnBorrar);
	}
	
	public void actualizarDatos(){
	/*	DefaultListModel modelo = new DefaultListModel();
		for(int i=0;i<usuarios.size();i++){
			modelo.addElement(usuarios.get(i).getApellidos()+"BorrarPaciente.16"+usuarios.get(i).getNombre()); //$NON-NLS-1$
		}
		list.setModel(modelo);*/
	}
	
	
	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			
					int i=list.getSelectedIndex();
					if(i==-1){
						
						textIDCanc.setText("BorrarPaciente.19"); //$NON-NLS-1$
					}else{
						
						
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
			
			Album album =new Album();
			album.EliminarRegistro(textIDCanc.getText());
			dispose();
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						BorrarCancionAlbum bc =new BorrarCancionAlbum();
						bc.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
			
		
			
	}
}
}