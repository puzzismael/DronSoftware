package org.AdquisicionProductos.Presentacion;
import java.awt.Font;
import java.util.*;
import javax.swing.table.*;

class ModeloTabla extends AbstractTableModel {
	private String[] nombreColumnas = { "ModeloTabla.0", "ModeloTabla.1","ModeloTabla.2", "ModeloTabla.3","ModeloTabla.4", "ModeloTabla.5"}; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
	private Vector datos = new Vector();
	
	public int getColumnCount() {return nombreColumnas.length;}
	
	public int getRowCount() {return datos.size();}
	
	public String getColumnName(int col) {return nombreColumnas[col];}
	
	public Object getValueAt(int row, int col) {
	
	Object[] fila = (Object [])datos.elementAt(row);
		return fila[col];
	}
	
	public Class getColumnClass(int c) {return getValueAt(0, c).getClass();}
	
	public boolean isCellEditable(int row, int col) {return true;}
	
	public void setValueAt(Object value, int row, int col) {
		if (row < getRowCount() && col < getColumnCount()){
			Object[] fila = (Object [])datos.elementAt(row);
			fila[col] = value;
			fireTableCellUpdated(row, col);
		}
	}
	
	public void eliminaFila (){ 
		datos.remove(0);
		}
	public void eliminaFila (int row){ 
		datos.remove(0);
		}
	public void aniadeFila (Object[] row){ 
		datos.add (row);
		}
	 
}