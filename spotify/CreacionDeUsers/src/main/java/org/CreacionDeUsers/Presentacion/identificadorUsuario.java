package org.CreacionDeUsers.Presentacion;

import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class identificadorUsuario  extends DefaultListCellRenderer  {
	public identificadorUsuario() {
	}
	protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();

	public Component getListCellRendererComponent(JList list, Object value, int index,boolean
	isSelected, boolean hasFocus) {
		
	JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index,
	isSelected, hasFocus);
	//renderer.setIcon(new ImageIcon(IdentificadorPaciente.class.getResource("paciente-directorio.png")));
	renderer.setBorder(new TitledBorder(LineBorder.createGrayLineBorder(),"Uusario"));
	renderer.setHorizontalAlignment(JLabel.CENTER);
	renderer.setBackground(new Color(250,250,200));
	renderer.setForeground(Color.BLUE);
	if (isSelected) renderer.setBackground(new Color(200,250,200));
	return renderer;
	}
}
