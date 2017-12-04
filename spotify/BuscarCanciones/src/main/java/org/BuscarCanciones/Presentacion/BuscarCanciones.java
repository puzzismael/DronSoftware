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
import java.awt.Font;

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
		getContentPane().setBackground(UIManager.getColor("Button.highlight"));
		setBackground(UIManager.getColor("Button.disabledShadow"));
		setBounds(100, 100, 465, 301);
		getContentPane().setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBackground(UIManager.getColor("Button.disabledShadow"));
			scrollPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Listado de Canciones/albumes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			scrollPane.setPreferredSize(new Dimension(200, 2));
			getContentPane().add(scrollPane, BorderLayout.WEST);
			{
				JList list = new JList();
				scrollPane.setViewportView(list);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(UIManager.getColor("Button.disabledShadow"));
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setBounds(30, 31, 77, 21);
				comboBox.setFont(new Font("Verdana", Font.BOLD, 11));
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cancion", "album", "artista"}));
				panel.add(comboBox);
			}
			{
				textNombre = new JTextField();
				textNombre.setBounds(117, 31, 88, 23);
				textNombre.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textNombre.setBackground(UIManager.getColor("Button.shadow"));
				textNombre.setForeground(UIManager.getColor("Button.foreground"));
				panel.add(textNombre);
				textNombre.setColumns(10);
			}
		}
	}

}
