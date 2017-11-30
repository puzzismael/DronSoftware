package org.BuscarCanciones.Presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;

public class BuscarCanciones extends JDialog {
	private JTextField textNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BuscarCanciones dialog = new BuscarCanciones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BuscarCanciones() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Listado de Canciones/albumes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			scrollPane.setPreferredSize(new Dimension(200, 2));
			getContentPane().add(scrollPane, BorderLayout.WEST);
		}
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 40, 0, 54, 0};
			gbl_panel.rowHeights = new int[]{20, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cancion", "album", "artista"}));
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox.gridwidth = 2;
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.gridx = 1;
				gbc_comboBox.gridy = 1;
				panel.add(comboBox, gbc_comboBox);
			}
			{
				textNombre = new JTextField();
				GridBagConstraints gbc_textNombre = new GridBagConstraints();
				gbc_textNombre.insets = new Insets(0, 0, 5, 0);
				gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_textNombre.gridx = 4;
				gbc_textNombre.gridy = 1;
				panel.add(textNombre, gbc_textNombre);
				textNombre.setColumns(10);
			}
		}
	}

}
