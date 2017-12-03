package org.AdquisicionProductos.Presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

//import dominio.Paciente;
//import persistencia.GestorPacientes;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaPacientes extends JInternalFrame {
	
	private static ListaPacientes ventanaListaPacientes;
	
	private JToolBar toolBar;
	private JButton btnAlta;
	private JButton btnModificar;
	private JButton btnGuardar;
	private JButton btnEliminar;
	private JPanel pnlBotones;
	private JPanel panel_1;
	private JTextField txtBusqueda;
	private JButton btnBuscar;
	private JPanel pnlMensajes;
	private JLabel lblEstado;
	private JSplitPane splitPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	private JScrollPane scrollPane_1;
//	private Ficha_paciente ficha_paciente;
	private ModeloTabla modeloTabla;
//	private Paciente paciente;
	

	private String ruta;
	private static final ImageIcon ALTA_ICON = new ImageIcon(ListaPacientes.class.getResource("/presentacion/icons/pacient_icons/Alta_16x16.png")); //$NON-NLS-1$
	private static final ImageIcon CANCELAR_ICON = new ImageIcon(ListaPacientes.class.getResource("/presentacion/icons/pacient_icons/Cancelar_16x16.png")); //$NON-NLS-1$

	//Variable para saber cuando el boton de altas está en modo de alta o para cancelarla
	private boolean alta;
	private boolean modificacion;
	
	public static ListaPacientes getInstance(){
		if (ventanaListaPacientes == null){
			ventanaListaPacientes = new ListaPacientes();
		}
		return ventanaListaPacientes;
	}
	
	/**
	 * Create the frame.
	 */
	private ListaPacientes() {
		alta = true;
		modificacion = false;
		
		//paciente = new Paciente();
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(new Rectangle(0, 0, 850, 600));
		addInternalFrameListener(new ThisInternalFrameListener());
		setTitle("ListaPacientes.this.title"); //$NON-NLS-1$
		
		//Comprobación para breadcrums
		//ruta = Breadcrumbs.getPath();
		
		
		pnlBotones = new JPanel();
		getContentPane().add(pnlBotones, BorderLayout.NORTH);
		GridBagLayout gbl_pnlBotones = new GridBagLayout();
		gbl_pnlBotones.columnWidths = new int[]{175, 231, 0, 16, 0};
		gbl_pnlBotones.rowHeights = new int[]{38, 0};
		gbl_pnlBotones.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlBotones.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pnlBotones.setLayout(gbl_pnlBotones);
		
		toolBar = new JToolBar();
		GridBagConstraints gbc_toolBar = new GridBagConstraints();
		gbc_toolBar.insets = new Insets(0, 0, 0, 5);
		gbc_toolBar.anchor = GridBagConstraints.WEST;
		gbc_toolBar.gridx = 0;
		gbc_toolBar.gridy = 0;
		pnlBotones.add(toolBar, gbc_toolBar);
		
		btnAlta = new JButton("ListaPacientes.btnAlta.text"); //$NON-NLS-1$
		btnAlta.addActionListener(new BtnAltaActionListener());
		btnAlta.setIcon(new ImageIcon(ListaPacientes.class.getResource("/presentacion/icons/pacient_icons/Alta_16x16.png"))); //$NON-NLS-1$
		toolBar.add(btnAlta);
		
		btnModificar = new JButton("ListaPacientes.btnModificar.text"); //$NON-NLS-1$
		btnModificar.addActionListener(new BtnModificarActionListener());
		btnModificar.setEnabled(false);
		btnModificar.setIcon(new ImageIcon(ListaPacientes.class.getResource("/presentacion/icons/pacient_icons/Modificar_16x16.png"))); //$NON-NLS-1$
		btnModificar.setEnabled(false);
		toolBar.add(btnModificar);
		
		btnGuardar = new JButton("ListaPacientes.btnGuardar.text"); //$NON-NLS-1$
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		btnGuardar.setEnabled(false);
		btnGuardar.setIcon(new ImageIcon(ListaPacientes.class.getResource("/presentacion/icons/pacient_icons/Guardar_16x16.png"))); //$NON-NLS-1$
		toolBar.add(btnGuardar);
		
		btnEliminar = new JButton("ListaPacientes.btnEliminar.text"); //$NON-NLS-1$
		btnEliminar.addActionListener(new BtnEliminarActionListener());
		btnEliminar.setEnabled(false);
		btnEliminar.setIcon(new ImageIcon(ListaPacientes.class.getResource("/presentacion/icons/pacient_icons/Bajas_16x16.png"))); //$NON-NLS-1$
		toolBar.add(btnEliminar);
		
		panel_1 = new JPanel();
		panel_1.setMinimumSize(new Dimension(200, 10));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 0;
		pnlBotones.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{3, 86, 0};
		gbl_panel_1.rowHeights = new int[]{25, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		btnBuscar = new JButton(""); //$NON-NLS-1$
		btnBuscar.setEnabled(false);
		btnBuscar.setIcon(new ImageIcon(ListaPacientes.class.getResource("/presentacion/icons/pacient_icons/buscar_pacinte.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnBuscar.insets = new Insets(0, 0, 0, 5);
		gbc_btnBuscar.gridx = 0;
		gbc_btnBuscar.gridy = 0;
		panel_1.add(btnBuscar, gbc_btnBuscar);
		
		txtBusqueda = new JTextField();
		txtBusqueda.setEnabled(false);
		txtBusqueda.setSize(new Dimension(30, 0));
		GridBagConstraints gbc_txtBusqueda = new GridBagConstraints();
		gbc_txtBusqueda.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBusqueda.gridx = 1;
		gbc_txtBusqueda.gridy = 0;
		panel_1.add(txtBusqueda, gbc_txtBusqueda);
		txtBusqueda.setColumns(10);
		
		pnlMensajes = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnlMensajes.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(pnlMensajes, BorderLayout.SOUTH);
		
		lblEstado = new JLabel("ListaPacientes.8"); //$NON-NLS-1$
		pnlMensajes.add(lblEstado);
		
		splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setResizeWeight(.8f);
		getContentPane().add(splitPane, BorderLayout.CENTER);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 300));
		panel.setMinimumSize(new Dimension(300, 150));
		splitPane.setLeftComponent(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		scrollPane = new JScrollPane();
		panel.add(scrollPane, "name_1572114386227203"); //$NON-NLS-1$
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setRowHeight(64);
		
		String [] headers = {"ListaPacientes.10","ListaPacientes.11","ListaPacientes.12", "ListaPacientes.13"}; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		modeloTabla = new ModeloTabla(headers);
		table.setModel(modeloTabla);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		splitPane.setRightComponent(scrollPane_1);
		
	/*	ficha_paciente = new Ficha_paciente();
		ficha_paciente.setPreferredSize(new Dimension(850, 180));
		ficha_paciente.setMaximumSize(new Dimension(1200, 180));
		ficha_paciente.setMinimumSize(new Dimension(500, 180));
		ficha_paciente.setAlignmentY(Component.CENTER_ALIGNMENT);
		*///scrollPane_1.setViewportView(ficha_paciente);
		
		//GestorPacientes pacientesManager = new GestorPacientes();
		
	//	pacientesManager.listar().forEach((k,v) -> addToTable(pacientesManager.buscar(k)));
		
		ListSelectionModel rowSM = table.getSelectionModel();
		rowSM.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
					ListSelectionModel lsm = (ListSelectionModel) e.getSource();
					
					if (!lsm.isSelectionEmpty()) {
						int n = table.getSelectedRow();
						if (n != -1){
							btnModificar.setEnabled(true);
							btnEliminar.setEnabled(true);
							
							String contenido = "ListaPacientes.14" + modeloTabla.getValueAt(n, 3) + ", " + modeloTabla.getValueAt(n, 2); //$NON-NLS-1$ //$NON-NLS-2$
							//ficha_paciente.setPaciente(pacientesManager.buscar(modeloTabla.getValueAt(n, 1).toString())); 
							//ficha_paciente.setEnable(false);
							
							//paciente = pacientesManager.buscar(modeloTabla.getValueAt(n, 1).toString());
							lblEstado.setText(contenido);
						}
					}		
			}
		});
		 
		//ficha_paciente.setEnable(false);
		lblEstado.setText(""); //$NON-NLS-1$
		//	Ajustamos la parte inferior del splitPane
		splitPane.setDividerLocation(splitPane.getSize().width - splitPane.getInsets().bottom - splitPane.getDividerSize() - 180);
	}

	private Object[] addToTable(/*Paciente paciente*/) {
		
	/*	Object[] fila= {new ImageIcon(getClass().getClassLoader().getResource(paciente.getFoto())),
				paciente.getCip(), paciente.getApellidos(), paciente.getNombre()};
		*/
	//	modeloTabla.aniadeFila(fila);
		
		return null;//fila;
	}

	private class ThisInternalFrameListener extends InternalFrameAdapter {
		@Override
		public void internalFrameClosing(InternalFrameEvent e) {
			//Breadcrumbs.setPath(""); //$NON-NLS-1$
			//JInternalFrameManager jifManager = JInternalFrameManager.getInstance();
			//fManager.remove(e.getInternalFrame().hashCode());
			
		}
		@Override
		public void internalFrameActivated(InternalFrameEvent arg0) {
		//	Breadcrumbs.setPath(ruta);
			
		}
	}
	private class BtnAltaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//Comprobar si se va a dar de alta o si por el contrario se cancela la acción.
			if (alta){
				table.setEnabled(false);
				//ficha_paciente.setEnable(true);
				//ficha_paciente.clean();
				btnAlta.setText("ListaPacientes.18"); //$NON-NLS-1$
				btnAlta.setIcon(CANCELAR_ICON);
				btnModificar.setEnabled(false);
				btnEliminar.setEnabled(false);
				btnGuardar.setEnabled(true);
				//ficha_paciente.getTxtNHistorial().setFocusable(true);
				lblEstado.setText("ListaPacientes.19"); //$NON-NLS-1$
				alta = false;
			}
			else{
				table.setEnabled(true);
				//ficha_paciente.clean();
				//ficha_paciente.setEnable(false);
				btnAlta.setText("ListaPacientes.20"); //$NON-NLS-1$
				btnModificar.setEnabled(true);
				btnEliminar.setEnabled(true);
				btnGuardar.setEnabled(false);
				btnAlta.setIcon(ALTA_ICON);
				table.setFocusable(true);
				alta = true;
				lblEstado.setText("ListaPacientes.21"); //$NON-NLS-1$
			}
			
			modificacion = false;
		}
	}
	private class BtnModificarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			table.setEnabled(false);
			modificacion = true;
		//	ficha_paciente.setEnable(true);
			btnAlta.setEnabled(true);
			btnAlta.setText("ListaPacientes.22"); //$NON-NLS-1$
			btnAlta.setIcon(CANCELAR_ICON);
			btnModificar.setEnabled(false);
			btnEliminar.setEnabled(false);
			btnGuardar.setEnabled(true);
		//	ficha_paciente.getTxtCIP().setFocusable(true);
			lblEstado.setText("ListaPacientes.23"); //$NON-NLS-1$
			alta = false;	
			
		}
	}
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			int respuesta;
	//		GestorPacientes pacientesManager = new GestorPacientes();
			String mensaje = ""; //$NON-NLS-1$
			String pregunta = ""; //$NON-NLS-1$
			
			if(datosMinimos()){
				if(modificacion){
					pregunta = "ListaPacientes.26"; //$NON-NLS-1$
					mensaje = "ListaPacientes.27"; //$NON-NLS-1$
				}else{
					pregunta ="ListaPacientes.28"; //$NON-NLS-1$
					mensaje = "ListaPacientes.29"; //$NON-NLS-1$
				}
				
				respuesta = JOptionPane.showConfirmDialog(table, pregunta, "ListaPacientes.30", JOptionPane.OK_CANCEL_OPTION); //$NON-NLS-1$
				
				//Si la respuesta es SÍ (0) 
				if(respuesta==0){
						// El método añadir, en el caso de que exista el paciente:
						
						//  -> Al usar un HashMap si existe, lo reescribe, por lo tanto se puede utilizar el mismo método
						
						//Paciente pt = new Paciente();
						
						//pt = crearPaciente();
					//	pacientesManager.agregar(pt);
						
						
					//	Object[] datos_paciente = {new ImageIcon(getClass().getClassLoader().getResource(pt.getFoto())), pt.getCip(),
						//		pt.getApellidos(), pt.getNombre()};
						//Se actualiza la lista de los pacientes.
						table.setEnabled(true);
						if(modificacion){
						//	pacientesManager.eliminar(paciente.getCip());
							modeloTabla.eliminarFilas();
							//pacientesManager.listar().forEach((k,v) -> addToTable(pacientesManager.buscar(k)));
						}else{
							//modeloTabla.aniadeFila(datos_paciente);
						}
						alta = true;
						modificacion = false;
						btnAlta.setText("ListaPacientes.31"); //$NON-NLS-1$
						btnAlta.setIcon(ALTA_ICON);
						btnModificar.setEnabled(false);
						btnGuardar.setEnabled(false);
						
						modeloTabla.fireTableDataChanged();
						//ficha_paciente.clean();
						//ficha_paciente.setEnable(false);
						
				}else{
					mensaje = "ListaPacientes.32"; //$NON-NLS-1$
				}
								
			}else{
				mensaje = "ListaPacientes.33"; //$NON-NLS-1$
			}
			

			JOptionPane.showMessageDialog(table, mensaje,"ListaPacientes.34", JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-1$
			lblEstado.setText(mensaje);
		}

		private boolean datosMinimos() {
		//	if(ficha_paciente.getTxtNHistorial().getText() == null ||ficha_paciente.getTxtNHistorial().getText().equals("")){ //$NON-NLS-1$
			//	return false;
			//}
			
			//if(ficha_paciente.getTxtCIP().getText() == null ||ficha_paciente.getTxtCIP().getText().equals("")){ //$NON-NLS-1$
			//	return false;
			//}
			
			//if(ficha_paciente.getFtxtIdentificador().getValue() == null ||ficha_paciente.getFtxtIdentificador().getValue().toString().equals("")){ //$NON-NLS-1$
				//return false;
			//}
			
			//i//f(ficha_paciente.getTxtNombre().getText() == null ||ficha_paciente.getTxtNombre().getText().equals("")){ //$NON-NLS-1$
				//return false;
			//}
			
			//if(ficha_paciente.getTxtApellidos().getText() == null ||ficha_paciente.getTxtApellidos().getText().equals("")){ //$NON-NLS-1$
				//return false;
			//}
			
			//if(ficha_paciente.getFtxtFechaNacimiento().getValue() == null ||ficha_paciente.getFtxtFechaNacimiento().getValue().toString().equals("")){ //$NON-NLS-1$
			//	return false;
			//}
			
			return true;
		}
	}
	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			int respuesta;
			//GestorPacientes pacientesManager = new GestorPacientes();
			String mensaje = "ListaPacientes.41"; //$NON-NLS-1$
			
			respuesta = JOptionPane.showConfirmDialog(table, mensaje, "ListaPacientes.42", JOptionPane.OK_CANCEL_OPTION); //$NON-NLS-1$
			
			//Si la respuesta es SÍ (0) 
			if(respuesta==0){
					// El método añadir, en el caso de que exista el paciente:
					
					//  -> Al usar un HashMap si existe, lo reescribe, por lo tanto se puede utilizar el mismo método
					
		//			pacientesManager.eliminar(paciente.getCip());
					
					table.setEnabled(true);
					
					modeloTabla.eliminaFila(table.getSelectedRow());
					alta = true;
					modificacion = false;
					btnAlta.setIcon(ALTA_ICON);
					btnModificar.setEnabled(false);
					btnGuardar.setEnabled(false);
					
					modeloTabla.fireTableDataChanged();
			//		ficha_paciente.clean();
				//	ficha_paciente.setEnable(false);
					mensaje = "ListaPacientes.43"; //$NON-NLS-1$
			}else{
				mensaje = "ListaPacientes.44"; //$NON-NLS-1$
			}
			
			JOptionPane.showMessageDialog(table, mensaje, "ListaPacientes.45", JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-1$
			lblEstado.setText(mensaje);
		}
	}

	public String getRuta() {
		return ruta;
	}
	
//	public Paciente crearPaciente() {
	//	return ficha_paciente.updatePaciente();
//	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
}
