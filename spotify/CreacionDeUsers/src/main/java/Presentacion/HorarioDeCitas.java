package Presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import com.mysql.jdbc.Messages;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.components.JLocaleChooser;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JYearChooser;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JSplitPane;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import java.awt.Insets;
import java.awt.List;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.TitledBorder;
import java.awt.TextArea;
import java.awt.Toolkit;

public class HorarioDeCitas extends JDialog {
	public String cadena;
	static HorarioDeCitas dialog ;
	private JSplitPane splitPane;
	private JPanel panel;
	private JTabbedPane tabbedPane;
	private JPanel Notas;
	private JPanel Citas;
	private JPanel Dias;
	private JToolBar toolBar;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JPanel panel_1;
	private JDateChooser dateChooser;
	private JLabel lblFecha;
	private JScrollPane scrollPane;
	private JList list;
	private JScrollPane scrollPane_1;
	private JTable table;
	private JList list_1;
	private JToolBar toolBar_1;
	private JButton btnCargarDatos;
	private JButton btnEliminarDatos;
	private JList list_2;
	private TextArea textArea;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 */
	public HorarioDeCitas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(HorarioDeCitas.class.getResource("/Presentacion/citas.jpg")));
		setBounds(100, 100, 722, 433);
		getContentPane().setLayout(new BorderLayout(0, 0));
		{
			splitPane = new JSplitPane();
			splitPane.setPreferredSize(new Dimension(216, 46));
			splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
			getContentPane().add(splitPane, BorderLayout.CENTER);
			{
				panel = new JPanel();
				panel.setPreferredSize(new Dimension(10, 300));
				splitPane.setLeftComponent(panel);
				panel.setLayout(new BorderLayout(0, 0));
				{
					toolBar = new JToolBar();
					panel.add(toolBar, BorderLayout.NORTH);
					{
						btnNewButton = new JButton(Messages.getString("HorarioDeCitas.btnNewButton.text"));
						btnNewButton.addActionListener(new BtnNewButtonActionListener());
						
						toolBar.add(btnNewButton);
					}
					{
						btnNewButton_1 = new JButton(Messages.getString("HorarioDeCitas.btnNewButton_1.text"));
						btnNewButton_1.addActionListener(new BtnNewButton_1ActionListener());
						toolBar.add(btnNewButton_1);
					}
				}
				{
					panel_1 = new JPanel();
					panel.add(panel_1, BorderLayout.CENTER);
					GridBagLayout gbl_panel_1 = new GridBagLayout();
					gbl_panel_1.columnWidths = new int[]{20, 60, 50, 59, 56, 62, 68, 49, 59, 55, 56, 58, 39, 0};
					gbl_panel_1.rowHeights = new int[]{40, 25, 39, 45, 59, 40, 0, 0};
					gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
					gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
					panel_1.setLayout(gbl_panel_1);
					{
						lblFecha = new JLabel(Messages.getString("HorarioDeCitas.lblFecha.text")); //$NON-NLS-1$
						GridBagConstraints gbc_lblFecha = new GridBagConstraints();
						gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
						gbc_lblFecha.gridx = 1;
						gbc_lblFecha.gridy = 1;
						panel_1.add(lblFecha, gbc_lblFecha);
					}
					{
						dateChooser = new JDateChooser();
						GridBagConstraints gbc_dateChooser = new GridBagConstraints();
						gbc_dateChooser.gridwidth = 2;
						gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
						gbc_dateChooser.fill = GridBagConstraints.BOTH;
						gbc_dateChooser.gridx = 2;
						gbc_dateChooser.gridy = 1;
						panel_1.add(dateChooser, gbc_dateChooser);
					}
					{
						scrollPane_1 = new JScrollPane();
						GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
						gbc_scrollPane_1.gridwidth = 7;
						gbc_scrollPane_1.gridheight = 4;
						gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
						gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
						gbc_scrollPane_1.gridx = 5;
						gbc_scrollPane_1.gridy = 1;
						panel_1.add(scrollPane_1, gbc_scrollPane_1);
						{
							table = new JTable();
							table.setModel(new DefaultTableModel(
								new Object[][] {
									{"8:30", "Carlos", "Espalda", "Dolor"},
									{"8:45", "Pablo", "mu\u00F1eca", "Dolor"},
									{"9:00", "", null, null},
									{"9:15", "Alberto", "Alzeimer", "Dolor"},
									{"9:30", null, null, null},
									{"9:45", null, null, null},
									{"10:00", null, null, null},
									{"10:15", null, null, null},
									{"10:30", null, null, null},
									{"10:45", null, null, null},
									{"11:00", null, null, null},
									{"13:00", null, null, null},
									{"13:15", null, null, null},
									{"13:30", null, null, null},
									{null, null, null, null},
								},
								new String[] {
									"Horario", "Paciente", "Dolencia", "Descripci\u00F3n"
								}
							) {
								Class[] columnTypes = new Class[] {
									String.class, String.class, String.class, String.class
								};
								public Class getColumnClass(int columnIndex) {
									return columnTypes[columnIndex];
								}
								boolean[] columnEditables = new boolean[] {
									false, true, true, true
								};
								public boolean isCellEditable(int row, int column) {
									return columnEditables[column];
								}
							});
							table.setRowHeight(20);
							scrollPane_1.setViewportView(table);
						}
					}
					{
						scrollPane = new JScrollPane();
						scrollPane.setBorder(new TitledBorder(null, Messages.getString("HorarioDeCitas.scrollPane.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
						scrollPane.setName(Messages.getString("HorarioDeCitas.scrollPane.name")); //$NON-NLS-1$
						scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
						scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
						GridBagConstraints gbc_scrollPane = new GridBagConstraints();
						gbc_scrollPane.gridheight = 4;
						gbc_scrollPane.gridwidth = 3;
						gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
						gbc_scrollPane.fill = GridBagConstraints.BOTH;
						gbc_scrollPane.gridx = 1;
						gbc_scrollPane.gridy = 2;
						panel_1.add(scrollPane, gbc_scrollPane);
						{
							list = new JList();
							list.setModel(new AbstractListModel() {
								String[] values = new String[] {"8:30   24-10-1994", "10:00 30-11-1995  ", "3", "4", "5", "6", "7", "8", "9", "10"};
								public int getSize() {
									return values.length;
								}
								public Object getElementAt(int index) {
									return values[index];
								}
							});
							scrollPane.setViewportView(list);
						}
					}
				}
			}
			{
				tabbedPane = new JTabbedPane(JTabbedPane.TOP);
				splitPane.setRightComponent(tabbedPane);
				{
					Citas = new JPanel();
					tabbedPane.addTab("Citas", null, Citas, null);
					Citas.setLayout(new BorderLayout(0, 0));
					{
						list_1 = new JList();
						list_1.setModel(new AbstractListModel() {
							String[] values = new String[] {"8:30 24-11-1995", "8:45 25-12-1999"};
							public int getSize() {
								return values.length;
							}
							public Object getElementAt(int index) {
								return values[index];
							}
						});
						Citas.add(list_1, BorderLayout.CENTER);
					}
				}
				{
					Dias = new JPanel();
					tabbedPane.addTab("Dias", null, Dias, null);
					Dias.setLayout(new BorderLayout(0, 0));
					{
						toolBar_1 = new JToolBar();
						Dias.add(toolBar_1, BorderLayout.SOUTH);
						{
							btnCargarDatos = new JButton(Messages.getString("HorarioDeCitas.btnCargarDatos.text")); //$NON-NLS-1$
							toolBar_1.add(btnCargarDatos);
						}
						{
							btnEliminarDatos = new JButton(Messages.getString("HorarioDeCitas.btnEliminarDatos.text")); //$NON-NLS-1$
							toolBar_1.add(btnEliminarDatos);
						}
					}
					{
						list_2 = new JList();
						list_2.setModel(new AbstractListModel() {
							String[] values = new String[] {"20-10-1998", "16-12-2015"};
							public int getSize() {
								return values.length;
							}
							public Object getElementAt(int index) {
								return values[index];
							}
						});
						Dias.add(list_2, BorderLayout.CENTER);
					}
				}
				{
					Notas = new JPanel();
					tabbedPane.addTab("Notas", null, Notas, null);
					Notas.setLayout(new BorderLayout(0, 0));
					{
						textArea = new TextArea();
						Notas.add(textArea, BorderLayout.CENTER);
					}
				}
			}
		}
	}

	
	
	private class BtnNewButton_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(getParent(), "Cita almacenada", "Administrar citas",
					JOptionPane.PLAIN_MESSAGE);
		}
	}
}
