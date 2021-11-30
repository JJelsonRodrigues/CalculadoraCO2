package br.com.calculadora.funcoes.view;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;

import br.com.calculadora.funcoes.variaveis.CaixaDeNumerosDiasSemana;
import br.com.calculadora.funcoes.variaveis.CaixaDeNumerosKmRodados;

public class ViewCalculadora extends JDialog implements ActionListener {

	private static final long serialVersionUID = -1090980879231953070L;
	private JPanel contentPanel = new JPanel();
	double valor;
	private JTextField txtKmRodados;
	private JTextField txtDiasSemana;
	private JLabel lblKmRodado;
	private JLabel lblDiasSemana;
	private JLabel lblCombustivel;
	private JComboBox<Object> caixaCombinacao;

	public static void main(String[] args) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println();
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCalculadora dialog = new ViewCalculadora();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewCalculadora() throws BadLocationException {

		setBounds(10, 10, 750, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		txtKmRodados = new JTextField();
		txtKmRodados.setDocument(new CaixaDeNumerosKmRodados());
		txtKmRodados.setBounds(106, 55, 300, 30);
		txtKmRodados.setColumns(10);
		contentPanel.add(txtKmRodados);

		txtDiasSemana = new JTextField();
		txtDiasSemana.setDocument(new CaixaDeNumerosDiasSemana(1));
		txtDiasSemana.setBounds(106, 121, 300, 30);
		txtDiasSemana.setColumns(10);
		contentPanel.add(txtDiasSemana);

		lblKmRodado = new JLabel("Insira os Km's rodados por voc\u00EA durante o dia:");
		lblKmRodado.setFont(new Font("Consolas", Font.BOLD, 15));
		lblKmRodado.setBounds(96, 30, 383, 14);
		contentPanel.add(lblKmRodado);

		lblDiasSemana = new JLabel("Quantos dias na semana voc\u00EA faz esses Km's:");
		lblDiasSemana.setFont(new Font("Consolas", Font.BOLD, 15));
		lblDiasSemana.setBounds(96, 96, 350, 14);
		contentPanel.add(lblDiasSemana);

		lblCombustivel = new JLabel("Selecione o tipo de combust\u00EDvel que voc\u00EA utiliza:");
		lblCombustivel.setFont(new Font("Consolas", Font.BOLD, 15));
		lblCombustivel.setBounds(96, 220, 399, 14);
		contentPanel.add(lblCombustivel);

		JButton btnLimpaCampos = new JButton("Limpar campos");
		btnLimpaCampos.setFont(new Font("Consolas", Font.PLAIN, 12));
		btnLimpaCampos.setBounds(198, 162, 123, 35);
		contentPanel.add(btnLimpaCampos);
		btnLimpaCampos.addActionListener(this);

		caixaCombinacao = new JComboBox<Object>();
		caixaCombinacao.setModel(new DefaultComboBoxModel<Object>(
				new Object[] { "<Selecione um combustível>", "Gasolina", "Etanol", "Diesel" }));
		caixaCombinacao.setSelectedIndex(0);
		caixaCombinacao.setFont(new Font("Consolas", Font.BOLD, 14));
		caixaCombinacao.setBounds(96, 245, 260, 30);
		contentPanel.add(caixaCombinacao);

		JButton btnCalcula = new JButton("Calcular");
		btnCalcula.setFont(new Font("Consolas", Font.BOLD, 15));
		btnCalcula.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (conta() <= 10) {
					JOptionPane.showMessageDialog(null,
							"Parabéns, você é um consumidor consciente e deverá plantar " + conta()
									+ " árvores por ano para repor o CO2 lançado.",
							"Resultado", JOptionPane.INFORMATION_MESSAGE);
				} else if (conta() > 10 && conta() <= 40) {
					JOptionPane.showMessageDialog(null, "Você é um consumidor moderado para alto, deverá plantar "
							+ conta() + " árvores por ano para repor o CO2 lançado.\n "
							+ "Tome mais cuidado para com a natureza, procure utilizar meios de transporte alternativos e limpos",
							"Resultado", JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "ATENÇÃO!!!, deverá plantar " + conta()
							+ " árvores por ano para repor o CO2 lançado. Isso é um número muito elevado, "
							+ "procure \n usar transporte público e outros meios limpos de transporte, se não, continuará prejudicando a natureza de forma brutal!",
							"Resultado", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnCalcula.setBounds(317, 325, 100, 35);
		contentPanel.add(btnCalcula);

		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.setFont(new Font("Consolas", Font.BOLD, 15));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBounds(6, 11, 80, 23);
		contentPanel.add(btnVoltar);

	}

	public double caixaCombustivel() {

		if (caixaCombinacao.getSelectedItem().equals("Gasolina")) {
			valor = 0.12;
		} else if (caixaCombinacao.getSelectedItem().equals("Etanol")) {
			valor = 0.10;
		} else if (caixaCombinacao.getSelectedItem().equals("Diesel")) {
			valor = 0.18;
		}

		return valor;

	}

	public double conta() {

		double resultado = ((Double.parseDouble(txtDiasSemana.getText())) * (Double.parseDouble(txtKmRodados.getText()))
				* 52.1 * caixaCombustivel()) / 57.25;
		return Math.ceil(resultado);

	}

	public void actionPerformed(ActionEvent e) {

		txtDiasSemana.setText("");
		txtKmRodados.setText("");

	}
}