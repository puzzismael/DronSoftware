package Presentacion;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;

public class GestionDeUsuarios extends JPanel {

	/**
	 * Create the panel.
	 */
	public GestionDeUsuarios() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{55, 52, 47, 51, 50, 50, 47, 52, 49, 47, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 45, 51, 49, 45, 51, 52, 50, 46, 38, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.gridheight = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 3;
		add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		list.setBorder(new TitledBorder(null, "Lista Canciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setViewportView(list);
		
		JButton btnReproducirCanciones = new JButton("Reproducir canciones");
		GridBagConstraints gbc_btnReproducirCanciones = new GridBagConstraints();
		gbc_btnReproducirCanciones.insets = new Insets(0, 0, 5, 5);
		gbc_btnReproducirCanciones.gridx = 9;
		gbc_btnReproducirCanciones.gridy = 3;
		add(btnReproducirCanciones, gbc_btnReproducirCanciones);
		
		JButton btnBorrarListaCancin = new JButton("Borrar lista canción");
		GridBagConstraints gbc_btnBorrarListaCancin = new GridBagConstraints();
		gbc_btnBorrarListaCancin.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrarListaCancin.gridx = 9;
		gbc_btnBorrarListaCancin.gridy = 5;
		add(btnBorrarListaCancin, gbc_btnBorrarListaCancin);
		
		JButton btnModificarListaCancin = new JButton("Modificar lista canción");
		GridBagConstraints gbc_btnModificarListaCancin = new GridBagConstraints();
		gbc_btnModificarListaCancin.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarListaCancin.gridx = 9;
		gbc_btnModificarListaCancin.gridy = 7;
		add(btnModificarListaCancin, gbc_btnModificarListaCancin);

	}

}
