package org.AdquisicionProductos.Presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class ListadoDeCompradores extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ListadoDeCompradores() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelDatos = new JPanel();
		panelDatos.setPreferredSize(new Dimension(10, 380));
		add(panelDatos, BorderLayout.NORTH);
		GridBagLayout gbl_panelDatos = new GridBagLayout();
		gbl_panelDatos.columnWidths = new int[]{0, 41, 33, 45, 39, 45, 34, 45, 47, 59, 56, 58, 56, 35, 49, 0, 0};
		gbl_panelDatos.rowHeights = new int[]{0, 40, 35, 47, 35, 39, 39, 43, 34, 0, 0};
		gbl_panelDatos.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelDatos.setLayout(gbl_panelDatos);
		
		JPanel panelTablas = new JPanel();
		add(panelTablas, BorderLayout.CENTER);
		GridBagLayout gbl_panelTablas = new GridBagLayout();
		gbl_panelTablas.columnWidths = new int[]{0, 0, 41, 65, 0, 42, 54, 51, 46, 44, 47, 49, 48, 36, 44, 0, 0};
		gbl_panelTablas.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panelTablas.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelTablas.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panelTablas.setLayout(gbl_panelTablas);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 13;
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 1;
		panelTablas.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);

	}
}
