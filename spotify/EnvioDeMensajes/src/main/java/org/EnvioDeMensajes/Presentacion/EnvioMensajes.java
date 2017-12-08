package org.EnvioDeMensajes.Presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominioo.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EnvioMensajes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EnvioMensajes dialog = new EnvioMensajes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EnvioMensajes() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Verdana", Font.BOLD, 11));
		lblCorreo.setBounds(53, 32, 57, 14);
		contentPanel.add(lblCorreo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(120, 30, 108, 20);
		contentPanel.add(comboBox);
		
		Usuario user=new Usuario();
		Usuario [] users=user.obtenerListaDeBD();
		for(int i=0;i<users.length;i++)
		comboBox.addItem(users[i].getCorreo());
		
		JLabel lblAsunto = new JLabel("Asunto:");
		lblAsunto.setFont(new Font("Verdana", Font.BOLD, 11));
		lblAsunto.setBounds(53, 81, 57, 14);
		contentPanel.add(lblAsunto);
		
		textField = new JTextField();
		textField.setBounds(124, 79, 179, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		final JTextPane txtpnMensaje = new JTextPane();
		txtpnMensaje.setText("Mensaje");
		txtpnMensaje.setBounds(83, 140, 240, 96);
		contentPanel.add(txtpnMensaje);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Mensaje enviado");
				textField.setText("");
				txtpnMensaje.setText("");
				
			}
		});
		btnEnviar.setBounds(335, 228, 89, 23);
		contentPanel.add(btnEnviar);
	}
}
