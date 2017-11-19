package Presentacion;
import java.util.*;
import javax.swing.table.*;
class MiModeloTabla extends AbstractTableModel {
private String[] nombreColumnas = { "Nombre", "Primer Ap", "Segundo Ap", "Correo","Fotografía","Horario","Especialidad","DNI"};
private Vector datos = new Vector();
boolean[] columnEditables = new boolean[] {
		false,false , false, false,false,false,false,false};
public int getColumnCount() {return nombreColumnas.length;}
public int getRowCount() {return datos.size();}
public String getColumnName(int col) {return nombreColumnas[col];}
public Object getValueAt(int row, int col) {
Object[] fila = (Object [])datos.elementAt(row);
return fila[col];
}
public Class getColumnClass(int c) {return getValueAt(0, c).getClass();}
public boolean isCellEditable(int row, int col) {return columnEditables[col];}
public void setValueAt(Object value, int row, int col) {
if (row < getRowCount() && col < getColumnCount()){
Object[] fila = (Object [])datos.elementAt(row);
fila[col] = value;
fireTableCellUpdated(row, col);
}
}
public void eliminaFila (int row){ datos.remove(row);}
public void aniadeFila (Object[] row){ datos.add (row);}
}

