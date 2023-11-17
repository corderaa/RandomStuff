package calculadoraPermisosJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Color;

/**
 * The Class calculadora.
 */
public class calculadora extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** The array binario. */
	public static int[][] arrayBinario = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/** The text solucion. */
	private static JTextField textSolucion;

	/**
	 * Guardado del numero binario.
	 */
	public static void guardadoBinario() {
		String numeroBinario = "";
		for (int i = 0; i < arrayBinario.length; i++) {
			for (int j = 0; j < 3; j++) {
				numeroBinario += arrayBinario[i][j];
			}
		}
		calculoOc(numeroBinario);
	}

	/**
	 * Calculo del numero octal.
	 *
	 * @param numeroBinario
	 */
	public static void calculoOc(String numeroBinario) {
		numeroBinario.trim();
		int solucion = Integer.parseInt(numeroBinario, 2);
		String octal = Integer.toOctalString(solucion);
		visualizacion(octal, textSolucion);
	}

	/**
	 * Visualizacion de solucion.
	 *
	 * @param oc
	 * @param textSolucion
	 */
	public static void visualizacion(String octal, JTextField textSolucion) {
		textSolucion.setText(octal);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */

	/**
	 * Instantiates a new calculadora.
	 */

	public calculadora() {
		setResizable(false);
		setTitle("CALCULADORA DE PERMISOS (LINUX)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 243);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		lblUsuario.setBounds(6, 21, 87, 23);
		contentPane.add(lblUsuario);

		JLabel lblGrupo = new JLabel("GRUPO");
		lblGrupo.setForeground(new Color(255, 255, 255));
		lblGrupo.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrupo.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		lblGrupo.setBounds(139, 21, 87, 23);
		contentPane.add(lblGrupo);

		JLabel lblResto = new JLabel("RESTO");
		lblResto.setForeground(new Color(255, 255, 255));
		lblResto.setHorizontalAlignment(SwingConstants.CENTER);
		lblResto.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		lblResto.setBounds(268, 21, 87, 23);
		contentPane.add(lblResto);

		JCheckBox chckbxLeerUsuario = new JCheckBox("LEER");
		chckbxLeerUsuario.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		chckbxLeerUsuario.setForeground(new Color(255, 255, 255));
		chckbxLeerUsuario.setBackground(new Color(51, 51, 51));
		chckbxLeerUsuario.setBounds(6, 60, 87, 23);
		contentPane.add(chckbxLeerUsuario);

		JCheckBox chckbxEscribirUsuario = new JCheckBox("ESCRIBIR");
		chckbxEscribirUsuario.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		chckbxEscribirUsuario.setForeground(new Color(255, 255, 255));
		chckbxEscribirUsuario.setBackground(new Color(51, 51, 51));
		chckbxEscribirUsuario.setBounds(6, 86, 87, 23);
		contentPane.add(chckbxEscribirUsuario);

		JCheckBox chckbxEjecutarUsuario = new JCheckBox("EJECUTAR");
		chckbxEjecutarUsuario.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		chckbxEjecutarUsuario.setForeground(new Color(255, 255, 255));
		chckbxEjecutarUsuario.setBackground(new Color(51, 51, 51));
		chckbxEjecutarUsuario.setBounds(6, 112, 87, 23);
		contentPane.add(chckbxEjecutarUsuario);

		JCheckBox chckbxLeerGrupo = new JCheckBox("LEER");
		chckbxLeerGrupo.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		chckbxLeerGrupo.setForeground(new Color(255, 255, 255));
		chckbxLeerGrupo.setBackground(new Color(51, 51, 51));
		chckbxLeerGrupo.setBounds(139, 60, 87, 23);
		contentPane.add(chckbxLeerGrupo);

		JCheckBox chckbxEscribirGrupo = new JCheckBox("ESCRIBIR");
		chckbxEscribirGrupo.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		chckbxEscribirGrupo.setForeground(new Color(255, 255, 255));
		chckbxEscribirGrupo.setBackground(new Color(51, 51, 51));
		chckbxEscribirGrupo.setBounds(139, 86, 87, 23);
		contentPane.add(chckbxEscribirGrupo);

		JCheckBox chckbxEjecutarGrupo = new JCheckBox("EJECUTAR");
		chckbxEjecutarGrupo.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		chckbxEjecutarGrupo.setForeground(new Color(255, 255, 255));
		chckbxEjecutarGrupo.setBackground(new Color(51, 51, 51));
		chckbxEjecutarGrupo.setBounds(139, 112, 87, 23);
		contentPane.add(chckbxEjecutarGrupo);

		JCheckBox chckbxLeerResto = new JCheckBox("LEER");
		chckbxLeerResto.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		chckbxLeerResto.setForeground(new Color(255, 255, 255));
		chckbxLeerResto.setBackground(new Color(51, 51, 51));
		chckbxLeerResto.setBounds(268, 60, 87, 23);
		contentPane.add(chckbxLeerResto);

		JCheckBox chckbxEscribirResto = new JCheckBox("ESCRIBIR");
		chckbxEscribirResto.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		chckbxEscribirResto.setForeground(new Color(255, 255, 255));
		chckbxEscribirResto.setBackground(new Color(51, 51, 51));
		chckbxEscribirResto.setBounds(268, 86, 87, 23);
		contentPane.add(chckbxEscribirResto);

		JCheckBox chckbxEjecutarResto = new JCheckBox("EJECUTAR");
		chckbxEjecutarResto.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		chckbxEjecutarResto.setForeground(new Color(255, 255, 255));
		chckbxEjecutarResto.setBackground(new Color(51, 51, 51));
		chckbxEjecutarResto.setBounds(268, 112, 87, 23);
		contentPane.add(chckbxEjecutarResto);

		JLabel lblSolucion = new JLabel("SOLUCION:");
		lblSolucion.setForeground(new Color(255, 255, 255));
		lblSolucion.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 17));
		lblSolucion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolucion.setBounds(72, 157, 98, 23);
		contentPane.add(lblSolucion);

		textSolucion = new JTextField();
		textSolucion.setEditable(false);
		textSolucion.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 18));
		textSolucion.setHorizontalAlignment(SwingConstants.RIGHT);
		textSolucion.setText("0");
		textSolucion.setBounds(180, 157, 86, 24);
		contentPane.add(textSolucion);
		textSolucion.setColumns(10);

		chckbxLeerUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxLeerUsuario.isSelected()) {
					arrayBinario[0][0] = 1;
				} else {
					arrayBinario[0][0] = 0;
				}
				guardadoBinario();
			}
		});
		chckbxEscribirUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxEscribirUsuario.isSelected()) {
					arrayBinario[0][1] = 1;
				} else {
					arrayBinario[0][1] = 0;
				}
				guardadoBinario();
			}
		});
		chckbxEjecutarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxEjecutarUsuario.isSelected()) {
					arrayBinario[0][2] = 1;
				} else {
					arrayBinario[0][2] = 0;
				}
				guardadoBinario();
			}
		});

		chckbxLeerGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxLeerGrupo.isSelected()) {
					arrayBinario[1][0] = 1;
				} else {
					arrayBinario[1][0] = 0;
				}
				guardadoBinario();
			}
		});
		chckbxEscribirGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxEscribirGrupo.isSelected()) {
					arrayBinario[1][1] = 1;
				} else {
					arrayBinario[1][1] = 0;
				}
				guardadoBinario();
			}
		});
		chckbxEjecutarGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxEjecutarGrupo.isSelected()) {
					arrayBinario[1][2] = 1;
				} else {
					arrayBinario[1][2] = 0;
				}
				guardadoBinario();
			}
		});

		chckbxLeerResto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxLeerResto.isSelected()) {
					arrayBinario[2][0] = 1;
				} else {
					arrayBinario[2][0] = 0;
				}
				guardadoBinario();
			}
		});
		chckbxEscribirResto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxEscribirResto.isSelected()) {
					arrayBinario[2][1] = 1;
				} else {
					arrayBinario[2][1] = 0;
				}
				guardadoBinario();
			}
		});
		chckbxEjecutarResto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxEjecutarResto.isSelected()) {
					arrayBinario[2][2] = 1;
				} else {
					arrayBinario[2][2] = 0;
				}
				guardadoBinario();
			}
		});

	}
}
