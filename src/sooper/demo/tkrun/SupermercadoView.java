package sooper.demo.tkrun;

/*ventana para la gestion de pedidos. La ventana esta construida usando WindowsBuilder.
 * Se instala desde el Eclipse Marketplace. Una vez instalado, tan solo hay que abrir 
 * la clase con boton derecho-> abrir con WindowBuilder Editor  */

import net.miginfocom.swing.MigLayout;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import sooper.demo.tkrun.*;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class SupermercadoView {

	
	protected JFrame frmSooper;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	
	public SupermercadoView() {
		initialize();
	}
	
	private void initialize() {
		
		//inicializacion y parámetros del frame. Codigo auto-generado desde el WinBuilder
		frmSooper = new JFrame();
		frmSooper.setTitle("SOOPER");
		frmSooper.setBounds(0, 0, 496, 496);
		frmSooper.getContentPane().setLayout(new MigLayout("", "[]", "[][][][][grow][]"));
		
		textField = new JTextField();
		textField.setText("<introduzca aqui el numero de pedido>");
		frmSooper.getContentPane().add(textField, "cell 0 0,growx");
		textField.setColumns(10);
		
		JButton btnAniadirPedido = new JButton("Añadir Pedido");
		frmSooper.getContentPane().add(btnAniadirPedido, "cell 0 1");
		
		JScrollPane scrollPane = new JScrollPane();
		frmSooper.getContentPane().add(scrollPane, "cell 0 2,grow");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"idArticulo", "Descripcion"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnEmbolsarArticulos = new JButton("Embolsar");
		frmSooper.getContentPane().add(btnEmbolsarArticulos, "cell 0 3,aligny bottom");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		frmSooper.getContentPane().add(scrollPane_1, "cell 0 4,grow");
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"idArticulo", "idContenedor", "Tipo Contenedor"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton btnEnviarAlmacen = new JButton("Enviar a almacen");
		frmSooper.getContentPane().add(btnEnviarAlmacen, "cell 0 5");
		frmSooper.setVisible(true);
		
	}
	
	

}
