import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ElegirCurso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfID;
	private JTextField tfNombre;
	private JRadioButton rdbtnPrimero ;
	private JRadioButton rdbtnINFORMATICA ;
	private final ButtonGroup buttonGroup1 = new ButtonGroup();
	private final ButtonGroup buttonGroup2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElegirCurso frame = new ElegirCurso();
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
	public ElegirCurso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCampos = new JPanel();
		contentPane.add(panelCampos, BorderLayout.NORTH);
		panelCampos.setLayout(new GridLayout(2, 2, 10, 10));
		panelCampos.setBorder(new EmptyBorder(10,30,10,100));//REPASAR HASTA SANGRAR
		
		JLabel lblID = new JLabel("ID");
		lblID.setVerticalAlignment(SwingConstants.TOP);
		lblID.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCampos.add(lblID);
		
		tfID = new JTextField();
		panelCampos.add(tfID);
		tfID.setColumns(12);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCampos.add(lblNombre);
		
		tfNombre = new JTextField();
		panelCampos.add(tfNombre);
		tfNombre.setColumns(12);
		
		JPanel panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		
		JButton btnInsertar = new JButton("INSERTAR");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=tfID.getText().trim();
				String nombre=tfNombre.getText().trim();
				
			}
		});
		panelBotones.add(btnInsertar);
		
		JButton btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfID.setText("");
				tfNombre.setText("");
				rdbtnPrimero.setSelected(true);
				rdbtnINFORMATICA.setSelected(true);
				
			}
		});
		panelBotones.add(btnLimpiar);
		
		JPanel panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		
		JPanel panelCurso = new JPanel();
		panelCurso.setBorder(new TitledBorder(null, "Curso", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelCentral.add(panelCurso);
		panelCurso.setLayout(new GridLayout(2, 1, 5, 5));
		
		rdbtnPrimero = new JRadioButton("PRIMERO",true);
		buttonGroup1.add(rdbtnPrimero);
		panelCurso.add(rdbtnPrimero);
		
		JRadioButton rdbtnSegundo = new JRadioButton("SEGUNDO");
		buttonGroup1.add(rdbtnSegundo);
		panelCurso.add(rdbtnSegundo);
		
		JPanel panelGrado = new JPanel();
		panelGrado.setBorder(new TitledBorder(null, "Grado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelCentral.add(panelGrado);
		panelGrado.setLayout(new GridLayout(3, 1, 0, 0));
		
		rdbtnINFORMATICA = new JRadioButton("INFORMATICA", true);
		buttonGroup2.add(rdbtnINFORMATICA);
		panelGrado.add(rdbtnINFORMATICA);
		
		JRadioButton rdbtnDependencia = new JRadioButton("DEPENDENCIA");
		buttonGroup2.add(rdbtnDependencia);
		panelGrado.add(rdbtnDependencia);
		
		JRadioButton rdbtnEnfermeria = new JRadioButton("ENFERMERIA");
		buttonGroup2.add(rdbtnEnfermeria);
		panelGrado.add(rdbtnEnfermeria);
	}

}
