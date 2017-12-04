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
	private JTextField textNombre;
	private JEditorPane textReceta;
	private JTextArea textMotivo;
	private JEditorPane textObservaciones;
	private JEditorPane textTratamiento;
	private JButton btnGenerarReceta;
	private JButton btnImprimir;
	private JButton btnLimpiar;
	private ModeloTabla modeloTabla;
	private JScrollPane scrollPane;
	//private ArrayList<Consulta> consultas;
	private JEditorPane textAlergias;
	private JScrollPane scrollPane_4;

	
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
		
		JLabel lblNombre = new JLabel("ID Usuario"); //$NON-NLS-1$
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblNombre.setBounds(82, 15, 78, 14);
		panel.add(lblNombre);
		
		JLabel lblMotivoDeConsulta = new JLabel("Producto Comprado"); //$NON-NLS-1$
		lblMotivoDeConsulta.setFont(new Font("Verdana", Font.BOLD, 11)); //$NON-NLS-1$
		lblMotivoDeConsulta.setBounds(374, 15, 134, 14);
		panel.add(lblMotivoDeConsulta);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("PanelConsultas.7", Font.PLAIN, 11)); //$NON-NLS-1$
		textNombre.setEditable(false);
		textNombre.setBackground(SystemColor.scrollbar);
		textNombre.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textNombre.setBounds(170, 13, 161, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		textMotivo = new JTextArea();
		textMotivo.setEditable(false);
		textMotivo.setBackground(SystemColor.scrollbar);
		textMotivo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); //$NON-NLS-1$
		textMotivo.setFont(new Font("PanelConsultas.10", Font.PLAIN, 11)); //$NON-NLS-1$
		textMotivo.setBounds(518, 11, 152, 24);
		panel.add(textMotivo);
		
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
		
		btnGenerarReceta = new JButton("PanelConsultas.13"); //$NON-NLS-1$
		btnGenerarReceta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGenerarReceta.setEnabled(false);
		btnGenerarReceta.addActionListener(new BtnGenerarRecetaActionListener());
		btnGenerarReceta.setToolTipText("PanelConsultas.14"); //$NON-NLS-1$
		//btnGenerarReceta.setIcon(new ImageIcon(ListadoCompradores.class.getResource("PanelConsultas.15"))); //$NON-NLS-1$
		btnGenerarReceta.setFont(new Font("PanelConsultas.16", Font.BOLD, 11)); //$NON-NLS-1$
		btnGenerarReceta.setBorder(new TitledBorder(null, "PanelConsultas.17", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		btnGenerarReceta.setBounds(680, 173, 123, 60);
		panel.add(btnGenerarReceta);
		
		btnImprimir = new JButton("PanelConsultas.18"); //$NON-NLS-1$
		btnImprimir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnImprimir.setEnabled(false);
		btnImprimir.setToolTipText("PanelConsultas.19"); //$NON-NLS-1$
		//btnImprimir.setIcon(new ImageIcon(ListadoCompradores.class.getResource("PanelConsultas.20"))); //$NON-NLS-1$
		btnImprimir.setBorder(new TitledBorder(null, "PanelConsultas.21", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		btnImprimir.setBounds(680, 102, 123, 60);
		panel.add(btnImprimir);
		
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
		
		btnLimpiar = new JButton("PanelConsultas.27"); //$NON-NLS-1$
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.setEnabled(false);
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		btnLimpiar.setBorder(new TitledBorder(null,"PanelConsultas.28", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.infoText)); //$NON-NLS-1$
		btnLimpiar.setFont(new Font("PanelConsultas.29", Font.BOLD, 11)); //$NON-NLS-1$
		btnLimpiar.setBounds(680, 244, 123, 23);
		panel.add(btnLimpiar);
		
		JButton btnActualizar = new JButton("PanelConsultas.30"); //$NON-NLS-1$
		btnActualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnActualizar.addActionListener(new BtnActualizarActionListener());
		btnActualizar.setFont(new Font("PanelConsultas.31", Font.BOLD, 10)); //$NON-NLS-1$
		btnActualizar.setBounds(680, 278, 123, 23);
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
						textNombre.setText((String) modeloTabla.getValueAt(n, 3));
						textMotivo.setText((String) modeloTabla.getValueAt(n, 4));
					//	textTratamiento.setText(consultas.get(nPaciente).getPaciente().getMedicaci�n());
						//textAlergias.setText(consultas.get(nPaciente).getPaciente().getAlergias());
						btnLimpiar.setEnabled(true);
						btnGenerarReceta.setEnabled(true);
						btnImprimir.setEnabled(true);
					} 
				}
			}
		});
	}
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			textNombre.setText("PanelConsultas.35"); //$NON-NLS-1$
			textMotivo.setText("PanelConsultas.36"); //$NON-NLS-1$
			textTratamiento.setText("PanelConsultas.37"); //$NON-NLS-1$
			textObservaciones.setText("PanelConsultas.38"); //$NON-NLS-1$
			textReceta.setText("PanelConsultas.39"); //$NON-NLS-1$
			textAlergias.setText("PanelConsultas.40"); //$NON-NLS-1$
			btnLimpiar.setEnabled(false);
			btnGenerarReceta.setEnabled(false);
			btnImprimir.setEnabled(false);
		}
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
	private class BtnGenerarRecetaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(textReceta.getText().equals("PanelConsultas.42")){ //$NON-NLS-1$
				JOptionPane.showMessageDialog(new JFrame(), "PanelConsultas.43", //$NON-NLS-1$
						"PanelConsultas.44",JOptionPane.PLAIN_MESSAGE ); //$NON-NLS-1$
			}else{
				JFileChooser fcSave = new JFileChooser();
				int valorDevuelto = fcSave.showSaveDialog(new JPanel());
				if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
					String ruta=fcSave.getSelectedFile().getAbsolutePath();
					try {
						BufferedWriter bw=new BufferedWriter(new FileWriter(fcSave.getSelectedFile()));
						bw.write("PanelConsultas.45"+ textNombre.getText()+"PanelConsultas.46"+textReceta.getText()+"PanelConsultas.47"+textObservaciones.getText()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						bw.flush();
						JOptionPane.showMessageDialog(new JPanel(),"PanelConsultas.48"+ruta); //$NON-NLS-1$
						bw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
									
			}
			
		}
	}
	private class BtnActualizarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			borrarTabla();
			actualizarDatos();
		}
	}
}
