package org.EnvioDeMensajes.Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class EnviarMensaje {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnviarMensaje window = new EnviarMensaje();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EnviarMensaje() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 497, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{18, 34, 75, 73, 122, 0};
		gbl_panel.rowHeights = new int[]{22, 34, 32, 38, 54, 29, 40, 36, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblPara = new JLabel("Para:   ");
		lblPara.setForeground(Color.DARK_GRAY);
		GridBagConstraints gbc_lblPara = new GridBagConstraints();
		gbc_lblPara.anchor = GridBagConstraints.WEST;
		gbc_lblPara.insets = new Insets(0, 0, 5, 5);
		gbc_lblPara.gridx = 1;
		gbc_lblPara.gridy = 1;
		panel.add(lblPara, gbc_lblPara);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblCc = new JLabel("cc:       ");
		lblCc.setForeground(Color.DARK_GRAY);
		lblCc.setHorizontalAlignment(SwingConstants.CENTER);
		lblCc.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblCc = new GridBagConstraints();
		gbc_lblCc.anchor = GridBagConstraints.WEST;
		gbc_lblCc.insets = new Insets(0, 0, 5, 5);
		gbc_lblCc.gridx = 1;
		gbc_lblCc.gridy = 2;
		panel.add(lblCc, gbc_lblCc);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAsunto = new JLabel("Asunto:");
		lblAsunto.setForeground(Color.DARK_GRAY);
		GridBagConstraints gbc_lblAsunto = new GridBagConstraints();
		gbc_lblAsunto.anchor = GridBagConstraints.WEST;
		gbc_lblAsunto.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsunto.gridx = 1;
		gbc_lblAsunto.gridy = 3;
		panel.add(lblAsunto, gbc_lblAsunto);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JTextPane txtpnMensaje = new JTextPane();
		txtpnMensaje.setText("Mensaje");
		txtpnMensaje.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_txtpnMensaje = new GridBagConstraints();
		gbc_txtpnMensaje.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnMensaje.gridwidth = 4;
		gbc_txtpnMensaje.gridheight = 3;
		gbc_txtpnMensaje.fill = GridBagConstraints.BOTH;
		gbc_txtpnMensaje.gridx = 1;
		gbc_txtpnMensaje.gridy = 4;
		panel.add(txtpnMensaje, gbc_txtpnMensaje);
		
		JButton btnEnviar = new JButton("Enviar");
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnviar.gridx = 1;
		gbc_btnEnviar.gridy = 7;
		panel.add(btnEnviar, gbc_btnEnviar);
	}

}
