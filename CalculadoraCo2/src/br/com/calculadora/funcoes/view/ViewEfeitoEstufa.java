package br.com.calculadora.funcoes.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ViewEfeitoEstufa extends JDialog {
	
	private static final long serialVersionUID = 5662117209727599219L;
	private final JPanel contentPanel = new JPanel();

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
					ViewEfeitoEstufa dialog = new ViewEfeitoEstufa();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewEfeitoEstufa() {

		setBounds(10, 10, 750, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblTituloEfeitoEstufa = new JLabel("O PROCESSO DO EFEITO ESTUFA");
		lblTituloEfeitoEstufa.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblTituloEfeitoEstufa.setBounds(195, 11, 344, 20);
		contentPanel.add(lblTituloEfeitoEstufa);

		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Consolas", Font.BOLD, 12));
		btnVoltar.setBounds(40, 15, 85, 20);
		contentPanel.add(btnVoltar);

		JLabel lblTxtEfeitoEstufa = new JLabel("New label");
		lblTxtEfeitoEstufa.setVerticalAlignment(SwingConstants.TOP);
		lblTxtEfeitoEstufa.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTxtEfeitoEstufa.setText(
				"<html> <p> &nbsp &nbsp &nbsp O Efeito Estufa � um processo natural que ocorre com a intenra��o da radia��o solar juntamente com os gases do Efeito Estufa (GEE). "
						+ " Este efeito � respons�vel por equilibrar a temperatura da Terra, permitindo a vida. <br> &nbsp &nbsp &nbsp O processo � simples, nessa intera��o, os GEE absorvem a radia��o solar e passam a"
						+ " emitir de volta para a superf�cie terrestre o calor. Somente uma parte deste calor consegue sair da atmosfera e voltar para o espa�o, � desta forma que a Terra mant�m"
						+ " a sua temperatura. <br> &nbsp &nbsp &nbsp O problema � quando os GEE s�o liberados em execesso na atmosfera, evitando que o calor saia e aumentando a temperatura, o nome desse fen�meno � Aquecimento"
						+ "Global. Devido as a��es do homem com a queima de combust�veis f�sseis em Ind�strias e autom�veis, o CO2 (G�s Carb�nico) - que � naturalmente produzido - tem sido lan�ado em excesso, aumentando ainda mais"
						+ " o Aquecimento Global. <br> &nbsp &nbsp &nbsp O Aquecimento Global gera consequ�ncias desastrosas, tais como: derretimento das geleiras e eleva��o do n�vel do mar, aumento da temperatura m�dia global"
						+ "altera��es clim�ticas repentinas e defasagem de vida em alguns ambientes.  <p> </html>");
		lblTxtEfeitoEstufa.setBounds(40, 40, 650, 258);
		lblTxtEfeitoEstufa.setVisible(false);
		contentPanel.add(lblTxtEfeitoEstufa);

		JLabel lblImgEfeitoEstufa = new JLabel("New label");
		lblImgEfeitoEstufa.setIcon(new ImageIcon("C:\\Users\\jelso\\OneDrive\\Documentos\\efeitoEstufa.Jpeg.jpg"));
		lblImgEfeitoEstufa.setBounds(192, 291, 350, 245);
		lblImgEfeitoEstufa.setVisible(false);
		contentPanel.add(lblImgEfeitoEstufa);

		JButton btnVisualizarImg = new JButton("VISUALIZAR");
		btnVisualizarImg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImgEfeitoEstufa.setVisible(true);
				btnVisualizarImg.setVisible(false);
			}
		});
		btnVisualizarImg.setFont(new Font("Consolas", Font.BOLD, 15));
		btnVisualizarImg.setBounds(292, 341, 150, 50);
		contentPanel.add(btnVisualizarImg);

		JButton btnVisualizarTxt = new JButton("VISUALIZAR");
		btnVisualizarTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTxtEfeitoEstufa.setVisible(true);
				btnVisualizarTxt.setVisible(false);
			}
		});
		btnVisualizarTxt.setFont(new Font("Consolas", Font.BOLD, 15));
		btnVisualizarTxt.setBounds(292, 89, 150, 50);
		contentPanel.add(btnVisualizarTxt);

	}
}
