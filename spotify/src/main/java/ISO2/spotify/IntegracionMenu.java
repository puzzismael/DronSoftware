package ISO2.spotify;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.SwingConstants;

public class IntegracionMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntegracionMenu frame = new IntegracionMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IntegracionMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1124, 709);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		mnInicio.setForeground(Color.BLACK);
		mnInicio.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnInicio);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setForeground(Color.BLACK);
		mnArchivo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnArchivo);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setForeground(Color.BLACK);
		mnAyuda.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnAyuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{209, 0};
		gbl_panel.rowHeights = new int[]{186, 45, 45, 45, 45, 45, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JButton button = new JButton("Panel Principal");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setPreferredSize(new Dimension(209, 45));
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setFont(new Font("Verdana", Font.BOLD, 13));
		button.setBorder(null);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.gridx = 0;
		gbc_button.gridy = 1;
		panel.add(button, gbc_button);
		
		JButton button_1 = new JButton("Mi Perfil");
		button_1.setPreferredSize(new Dimension(209, 45));
		button_1.setHorizontalTextPosition(SwingConstants.LEADING);
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setFont(new Font("Verdana", Font.BOLD, 13));
		button_1.setBorder(null);
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 0);
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 2;
		panel.add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("Gesti\u00F3n de Pacientes");
		button_2.setPreferredSize(new Dimension(209, 45));
		button_2.setHorizontalTextPosition(SwingConstants.LEADING);
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.setFont(new Font("Verdana", Font.BOLD, 13));
		button_2.setBorder(null);
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 0);
		gbc_button_2.gridx = 0;
		gbc_button_2.gridy = 3;
		panel.add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("Gesti\u00F3n de Consultas");
		button_3.setPreferredSize(new Dimension(209, 45));
		button_3.setHorizontalTextPosition(SwingConstants.LEADING);
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setFont(new Font("Verdana", Font.BOLD, 13));
		button_3.setBorder(null);
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 0);
		gbc_button_3.gridx = 0;
		gbc_button_3.gridy = 4;
		panel.add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("Drs. Especialistas \r");
		button_4.setPreferredSize(new Dimension(209, 45));
		button_4.setHorizontalTextPosition(SwingConstants.LEADING);
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setFont(new Font("Verdana", Font.BOLD, 13));
		button_4.setBorder(null);
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 5;
		panel.add(button_4, gbc_button_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(104, 18));
		contentPane.add(panel_1, BorderLayout.CENTER);
	}

}
