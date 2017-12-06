package org.AdquisicionProductos.Presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;

//import dominio.Consulta;
//import dominio.Doctor;
//import dominio.Paciente;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import org.AdquisicionProductos.Dominio.ProductoAdquirido;
import org.IntroducirAlbum.Dominio.Album;

import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class ListadoCompradores extends JPanel {
	private JTable table;
	private JEditorPane textReceta;
	private JEditorPane textObservaciones;
	private JEditorPane textTratamiento;
	private ModeloTabla modeloTabla;
	private JScrollPane scrollPane;
	//private ArrayList<Consulta> consultas;
	private JEditorPane textAlergias;
	private JScrollPane scrollPane_4;
	private JList list;
	private ProductoAdquirido ProAd=new ProductoAdquirido();
	private ProductoAdquirido [] proAds=ProAd.obtenerListaDeBD();
	
	
	public ListadoCompradores(/*Doctor doctor*/) {
		//consultas=doctor.getConsultas();
		setBackground(SystemColor.text);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblConsultas = new JLabel("Listado de Compradores"); //$NON-NLS-1$
		lblConsultas.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultas.setFont(new Font("PanelConsultas.1", Font.BOLD, 16)); //$NON-NLS-1$
		add(lblConsultas, BorderLayout.NORTH);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setMinimumSize(new Dimension(140, 25));
		splitPane.setPreferredSize(new Dimension(140, 25));
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		add(splitPane, BorderLayout.CENTER);
		
		scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
DefaultListModel modelo = new DefaultListModel();
		
		for(int i = 0; i<proAds.length; i++){
		        modelo.addElement("Comprador ID: "+proAds[i].getID()+" producto: "+proAds[i].getPrecio()
		        		+" Comprador:"+proAds[i].getComprador());
		}
		list.setModel(modelo);
	
		table = new JTable();
		table.setFont(new Font("PanelConsultas.2", Font.BOLD, 11)); //$NON-NLS-1$
		table.setBackground(SystemColor.text);
		table.setSelectionMode(1);
		
		modeloTabla = new ModeloTabla();
		table.setModel(modeloTabla);
		table.setRowHeight(30);
		actualizarDatos();
		
		TableColumn columnaRealizado = table.getColumnModel().getColumn(5);
		JCheckBox check=new JCheckBox();
		columnaRealizado.setCellEditor(new DefaultCellEditor(check));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 25));
		panel.setBackground(SystemColor.text);
		splitPane.setRightComponent(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		scrollPane_1.setBackground(SystemColor.scrollbar);
		scrollPane_1.setBounds(374, 66, 296, 235);
		panel.add(scrollPane_1);
		
		textReceta = new JEditorPane();
		textReceta.setFont(new Font("PanelConsultas.12", Font.PLAIN, 11)); //$NON-NLS-1$
		textReceta.setBorder(null);
		textReceta.setBackground(SystemColor.scrollbar);
		scrollPane_1.setViewportView(textReceta);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		scrollPane_2.setBackground(SystemColor.scrollbar);
		scrollPane_2.setBounds(93, 66, 238, 72);
		panel.add(scrollPane_2);
		
		textTratamiento = new JEditorPane();
		textTratamiento.setFont(new Font("PanelConsultas.23", Font.PLAIN, 11)); //$NON-NLS-1$
		textTratamiento.setEditable(false);
		textTratamiento.setBorder(new TitledBorder(null, "Datos Bancarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textTratamiento.setBackground(SystemColor.scrollbar);
		scrollPane_2.setViewportView(textTratamiento);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$ //$NON-NLS-2$
		scrollPane_3.setBackground(SystemColor.scrollbar);
		scrollPane_3.setBounds(93, 229, 238, 72);
		panel.add(scrollPane_3);
		
		textObservaciones = new JEditorPane();
		textObservaciones.setFont(new Font("PanelConsultas.26", Font.PLAIN, 11)); //$NON-NLS-1$
		textObservaciones.setBorder(null);
		textObservaciones.setBackground(SystemColor.scrollbar);
		scrollPane_3.setViewportView(textObservaciones);
		
		JButton btnActualizar = new JButton("actualizar"); //$NON-NLS-1$
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 ProductoAdquirido pAd=new ProductoAdquirido();
					ProductoAdquirido [] prodcAd=pAd.obtenerListaDeBD();
					DefaultListModel modelo = new DefaultListModel();
					
					for(int i = 0; i<prodcAd.length; i++){
					        modelo.addElement("Comprador ID: "+prodcAd[i].getID()+"  producto: "+prodcAd[i].getPrecio()
					        		+" Comprador:"+prodcAd[i].getComprador());
					}
					list.setModel(modelo);
					
				}
			
		});
		btnActualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	
		btnActualizar.setFont(new Font("PanelConsultas.31", Font.BOLD, 10)); //$NON-NLS-1$
		btnActualizar.setBounds(336, 313, 123, 23);
		panel.add(btnActualizar);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$ //$NON-NLS-2$
		scrollPane_4.setBackground(SystemColor.scrollbar);
		scrollPane_4.setBounds(93, 146, 238, 72);
		panel.add(scrollPane_4);
		
		textAlergias = new JEditorPane();
		textAlergias.setFont(new Font("PanelConsultas.34", Font.PLAIN, 11)); //$NON-NLS-1$
		textAlergias.setEditable(false);
		textAlergias.setBorder(new TitledBorder(null, "notas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textAlergias.setBackground(SystemColor.scrollbar);
		scrollPane_4.setViewportView(textAlergias);

		ListSelectionModel rowSM = table.getSelectionModel();
		rowSM.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {
					//int filaSeleccionada = lsm.getMinSelectionIndex() + 1;
					//taFilaSeleccionada.setText("Fila "+filaSeleccionada+" seleccionada");
					ModeloTabla modeloTabla = (ModeloTabla) table.getModel();
					int n= table.getSelectedRow();
					if (n!=-1){
						int nPaciente=lsm.getMinSelectionIndex();
						
					//	textTratamiento.setText(consultas.get(nPaciente).getPaciente().getMedicaci�n());
						//textAlergias.setText(consultas.get(nPaciente).getPaciente().getAlergias());
						
					} 
				}
			}
		});
	}
	public void actualizarDatos(){
		
	//	for(int i=0;i<consultas.size();i++){
		//	Object[] fila= {consultas.get(i).getDia(),consultas.get(i).getHoraCita(),consultas.get(i).getPaciente().getId(),consultas.get(i).getPaciente().getNombre()+Messages.getString("PanelConsultas.41")+consultas.get(i).getPaciente().getApellidos(),consultas.get(i).getMotivo(),false}; //$NON-NLS-1$
			//modeloTabla.aniadeFila(fila);
		//}
		//scrollPane.setViewportView(table);
	}
	public void borrarTabla(){
		int size=table.getRowCount();
		for(int i=0;i<size;i++){
			modeloTabla.eliminaFila();
		}
		scrollPane.setViewportView(table);
	}
}
