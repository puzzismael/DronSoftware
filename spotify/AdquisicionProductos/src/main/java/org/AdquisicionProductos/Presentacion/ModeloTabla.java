/**
 * 
 */
package org.AdquisicionProductos.Presentacion;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

/**
 * @author Sergio Fernández García
 *
 */
public class ModeloTabla extends AbstractTableModel {
	
	private String[] nombreColumnas;
	private Vector datos = new Vector();
	
	public ModeloTabla(String [] headers){
		if (headers!= null){
			this.nombreColumnas = headers;
		}
	}
	
	
	public int getColumnCount() {
		return nombreColumnas.length;
	}
	
	public int getRowCount() {
		return datos.size();
	}
	
	public String getColumnName(int col) {
		return nombreColumnas[col];
	}
	
	public Object getValueAt(int row, int col) {
		Object[] fila = (Object [])datos.elementAt(row);
		return fila[col];
	}
	
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}
	
	public boolean isCellEditable(int row, int col) {
		return false;
	}
	
	public void setValueAt(Object value, int row, int col) {
		if (row < getRowCount() && col < getColumnCount()){
			Object[] fila = (Object [])datos.elementAt(row);
			fila[col] = value;
			fireTableCellUpdated(row, col);
		}
	}
	
	public void eliminaFila (int row){
		datos.remove(row);
	}
	
	public void eliminarFilas (){
		datos.clear();
	}
	
	public void aniadeFila (Object[] row){
		datos.add(row);
	}
}
