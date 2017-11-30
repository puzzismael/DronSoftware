package org.EliminarCancionesYAlbumes.Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import  org.EliminarCancionesYAlbumes.Dominio.Usuario;

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

public class BorrarCancionAlbum extends JFrame {
	
	private ArrayList<Usuario> usuarios;
	private JPanel contentPane;
	private JTextField textN;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JScrollPane scrollPane;
	private JList<Usuario> list;


	public BorrarCancionAlbum(ArrayList<Usuario> usuarios) {
		this.usuarios=usuarios;
		setResizable(false);
		setTitle(Messages.getString("BorrarPaciente.0")); //$NON-NLS-1$
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
		
		JLabel lblNPaciente = new JLabel("N. Canci\u00F3n:"); //$NON-NLS-1$
		lblNPaciente.setFont(new Font(Messages.getString("BorrarPaciente.2"), Font.BOLD, 11)); //$NON-NLS-1$
		lblNPaciente.setBounds(20, 23, 77, 14);
		panel.add(lblNPaciente);
		
		textN = new JTextField();
		textN.setEditable(false);
		textN.setFont(new Font(Messages.getString("BorrarPaciente.3"), Font.BOLD, 11)); //$NON-NLS-1$
		textN.setBackground(SystemColor.scrollbar);
		textN.setBounds(110, 20, 41, 20);
		panel.add(textN);
		textN.setColumns(10);
		
		JLabel lblNombre = new JLabel(Messages.getString("BorrarPaciente.4")); //$NON-NLS-1$
		lblNombre.setFont(new Font(Messages.getString("BorrarPaciente.5"), Font.BOLD, 11)); //$NON-NLS-1$
		lblNombre.setBounds(38, 71, 63, 14);
		panel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setFont(new Font(Messages.getString("BorrarPaciente.6"), Font.BOLD, 11)); //$NON-NLS-1$
		textNombre.setBackground(SystemColor.scrollbar);
		textNombre.setBounds(110, 68, 145, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Tipo Producto"); //$NON-NLS-1$
		lblApellidos.setFont(new Font(Messages.getString("BorrarPaciente.8"), Font.BOLD, 11)); //$NON-NLS-1$
		lblApellidos.setBounds(33, 121, 77, 14);
		panel.add(lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.setEditable(false);
		textApellidos.setFont(new Font(Messages.getString("BorrarPaciente.9"), Font.BOLD, 11)); //$NON-NLS-1$
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
		list.setFont(new Font(Messages.getString("BorrarPaciente.10"), Font.BOLD, 11)); //$NON-NLS-1$
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Usuarios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		actualizarDatos();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnCancelar = new JButton(Messages.getString("BorrarPaciente.12")); //$NON-NLS-1$
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		btnCancelar.setFont(new Font(Messages.getString("BorrarPaciente.13"), Font.BOLD, 11)); //$NON-NLS-1$
		panel_1.add(btnCancelar);
		
		JButton btnBorrar = new JButton(Messages.getString("BorrarPaciente.14")); //$NON-NLS-1$
		btnBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBorrar.addActionListener(new BtnBorrarActionListener());
		btnBorrar.setFont(new Font(Messages.getString("BorrarPaciente.15"), Font.BOLD, 11)); //$NON-NLS-1$
		panel_1.add(btnBorrar);
	}
	
	public void actualizarDatos(){
		DefaultListModel modelo = new DefaultListModel();
		for(int i=0;i<usuarios.size();i++){
			modelo.addElement(usuarios.get(i).getApellidos()+Messages.getString("BorrarPaciente.16")+usuarios.get(i).getNombre()); //$NON-NLS-1$
		}
		list.setModel(modelo);
	}
	
	
	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			
					int i=list.getSelectedIndex();
					if(i==-1){
						textNombre.setText(Messages.getString("BorrarPaciente.17")); //$NON-NLS-1$
						textApellidos.setText(Messages.getString("BorrarPaciente.18")); //$NON-NLS-1$
						textN.setText(Messages.getString("BorrarPaciente.19")); //$NON-NLS-1$
					}else{
						textApellidos.setText(usuarios.get(i).getApellidos());
						textNombre.setText(usuarios.get(i).getNombre());
						textN.setText(Messages.getString("BorrarPaciente.20") + usuarios.get(i).getId()); //$NON-NLS-1$
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
				JOptionPane.showMessageDialog(new JFrame(), Messages.getString("BorrarPaciente.21"), //$NON-NLS-1$
						Messages.getString("BorrarPaciente.22"),JOptionPane.PLAIN_MESSAGE ); //$NON-NLS-1$
			}else{
				if((JOptionPane.showConfirmDialog(new JFrame (), Messages.getString("BorrarPaciente.23"), Messages.getString("BorrarPaciente.24"),JOptionPane.OK_CANCEL_OPTION)==JOptionPane.YES_OPTION)){ //$NON-NLS-1$ //$NON-NLS-2$
					usuarios.remove(i);
					actualizarDatos();
					JOptionPane.showMessageDialog(new JFrame(), Messages.getString("BorrarPaciente.25"), //$NON-NLS-1$
							Messages.getString("BorrarPaciente.26"),JOptionPane.PLAIN_MESSAGE ); //$NON-NLS-1$
				}
					
			}
			
		}
	}
}
