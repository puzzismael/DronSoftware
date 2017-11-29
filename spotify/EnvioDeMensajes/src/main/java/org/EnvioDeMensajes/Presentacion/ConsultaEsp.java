package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import Dominio.Especialista;

import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class ConsultaEsp extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JList<Especialista> list;
	private JTextArea textArea;
	private ArrayList<Especialista> especialistas;
	private String text=Messages.getString("ConsultaEsp.0"); //$NON-NLS-1$
	private JLabel lblAdjunto;


	public ConsultaEsp(ArrayList<Especialista> especialistas) {
		setResizable(false);
		this.especialistas=especialistas;
	
		setTitle(Messages.getString("ConsultaEsp.1")); //$NON-NLS-1$
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 566, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(150, 2));
		contentPane.add(scrollPane, BorderLayout.WEST);
		
		list = new JList<Especialista>();
		list.addListSelectionListener(new ListListSelectionListener());
		list.setFont(new Font(Messages.getString("ConsultaEsp.2"), Font.BOLD, 11)); //$NON-NLS-1$
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBorder(new TitledBorder(null, Messages.getString("ConsultaEsp.3"), TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
		scrollPane.setViewportView(list);
		actualizarDatos();
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel(Messages.getString("ConsultaEsp.4")); //$NON-NLS-1$
		lblNombre.setFont(new Font(Messages.getString("ConsultaEsp.5"), Font.BOLD, 11)); //$NON-NLS-1$
		lblNombre.setBounds(21, 21, 70, 14);
		panel.add(lblNombre);
		
		JLabel lblApellidos = new JLabel(Messages.getString("ConsultaEsp.6")); //$NON-NLS-1$
		lblApellidos.setFont(new Font(Messages.getString("ConsultaEsp.7"), Font.BOLD, 11)); //$NON-NLS-1$
		lblApellidos.setBounds(21, 60, 70, 14);
		panel.add(lblApellidos);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font(Messages.getString("ConsultaEsp.8"), Font.BOLD, 11)); //$NON-NLS-1$
		textNombre.setBackground(SystemColor.scrollbar);
		textNombre.setBorder(new TitledBorder(null, Messages.getString("ConsultaEsp.9"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textNombre.setBounds(101, 19, 163, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		textApellidos = new JTextField();
		textApellidos.setFont(new Font(Messages.getString("ConsultaEsp.10"), Font.BOLD, 11)); //$NON-NLS-1$
		textApellidos.setBackground(SystemColor.scrollbar);
		textApellidos.setBorder(new TitledBorder(null, Messages.getString("ConsultaEsp.11"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		textApellidos.setBounds(101, 58, 163, 20);
		panel.add(textApellidos);
		textApellidos.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setFont(new Font(Messages.getString("ConsultaEsp.12"), Font.BOLD, 11)); //$NON-NLS-1$
		textArea.setBackground(SystemColor.scrollbar);
		textArea.setBorder(new TitledBorder(UIManager.getBorder(Messages.getString("ConsultaEsp.13")), Messages.getString("ConsultaEsp.14"), TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$ //$NON-NLS-2$
		textArea.setBounds(21, 97, 339, 90);
		panel.add(textArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.scrollbar);
		panel_2.setBorder(new TitledBorder(null, Messages.getString("ConsultaEsp.15"), TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK)); //$NON-NLS-1$
		panel_2.setBounds(21, 198, 339, 40);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblAdjunto = new JLabel(Messages.getString("ConsultaEsp.16")); //$NON-NLS-1$
		panel_2.add(lblAdjunto);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnCancelar = new JButton(Messages.getString("ConsultaEsp.17")); //$NON-NLS-1$
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		panel_1.add(btnCancelar);
		
		JButton btnAdjuntar = new JButton(Messages.getString("ConsultaEsp.18")); //$NON-NLS-1$
		btnAdjuntar.addActionListener(new BtnAdjuntarActionListener());
		panel_1.add(btnAdjuntar);
		
		JButton btnEnviar = new JButton(Messages.getString("ConsultaEsp.19")); //$NON-NLS-1$
		btnEnviar.addActionListener(new BtnEnviarActionListener());
		panel_1.add(btnEnviar);
	}
	
	public void actualizarDatos(){
		DefaultListModel modelo = new DefaultListModel();
		for(int i=0;i<especialistas.size();i++){
			modelo.addElement(especialistas.get(i).getApellidos()+Messages.getString("ConsultaEsp.20")+especialistas.get(i).getNombre()); //$NON-NLS-1$
		}
		list.setModel(modelo);
	}
	
	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			int i=list.getSelectedIndex();
			if(i==-1){
				textNombre.setText(Messages.getString("ConsultaEsp.21")); //$NON-NLS-1$
				textApellidos.setText(Messages.getString("ConsultaEsp.22")); //$NON-NLS-1$
			}else{
				textApellidos.setText(especialistas.get(i).getApellidos());
				textNombre.setText(especialistas.get(i).getNombre());
			}
		}
	}
	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
	private class BtnAdjuntarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(new PanelEspecialista(especialistas));
			//Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				text= text+Messages.getString("ConsultaEsp.23") +file.getName(); //$NON-NLS-1$
				lblAdjunto.setText(text);
			}
		}
	}
	private class BtnEnviarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int i=list.getSelectedIndex();
			if(i==-1||textArea.getText().equals(Messages.getString("ConsultaEsp.24"))){ //$NON-NLS-1$
				JOptionPane.showMessageDialog(new JFrame(), Messages.getString("ConsultaEsp.25"), //$NON-NLS-1$
						Messages.getString("ConsultaEsp.26"),JOptionPane.PLAIN_MESSAGE ); //$NON-NLS-1$
			}else{
				JOptionPane.showMessageDialog(new JFrame(), Messages.getString("ConsultaEsp.27"), //$NON-NLS-1$
						Messages.getString("ConsultaEsp.28"),JOptionPane.PLAIN_MESSAGE ); //$NON-NLS-1$
				list.setSelectedIndex(-1);
				actualizarDatos();
			}
		}
	}
}
