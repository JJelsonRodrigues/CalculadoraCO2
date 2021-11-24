package br.com.calculadora.funcoes.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class ViewEfeitoEstufa extends JFrame {
	
	
	private static final long serialVersionUID = 5662117209727599219L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEfeitoEstufa frame = new ViewEfeitoEstufa();
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
	public ViewEfeitoEstufa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 750, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEfeitoEstufa = new JLabel("O PROCESSO DO EFEITO ESTUFA");
		lblEfeitoEstufa.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblEfeitoEstufa.setBounds(195, 11, 344, 20);
		contentPane.add(lblEfeitoEstufa);
		
		JLabel lblTxt = new JLabel("New label");
		lblTxt.setVerticalAlignment(SwingConstants.TOP);
		lblTxt.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTxt.setText("<html> <p> &nbsp &nbsp &nbsp O Efeito Estufa � um processo natural que ocorre com a intenra��o da radia��o solar juntamente com os gases do Efeito Estufa (GEE). "
				+ " Este efeito � respons�vel por equilibrar a temperatura da Terra, permitindo a vida. <br> &nbsp &nbsp &nbsp O processo � simples, nessa intera��o, os GEE absorvem a radia��o solar e passam a"
				+ " emitir de volta para a superf�cie terrestre o calor. Somente uma parte deste calor consegue sair da atmosfera e voltar para o espa�o, � desta forma que a Terra mant�m"
				+ " a sua temperatura. <br> &nbsp &nbsp &nbsp O problema � quando os GEE s�o liberados em execesso na atmosfera, evitando que o calor saia e aumentando a temperatura, o nome desse fen�meno � Aquecimento"
				+ "Global. Devido as a��es do homem com a queima de combust�veis f�sseis em Ind�strias e autom�veis, o CO2 (G�s Carb�nico) - que � naturalmente produzido - tem sido lan�ado em excesso, aumentando ainda mais"
				+ " o Aquecimento Global. <br> &nbsp &nbsp &nbsp O Aquecimento Global gera consequ�ncias desastrosas, tais como: derretimento das geleiras e eleva��o do n�vel do mar, aumento da temperatura m�dia global"
				+ "altera��es clim�ticas repentinas e defasagem de vida em alguns ambientes.  <p> </html>");
		lblTxt.setBounds(40, 40, 650, 258);
		lblTxt.setVisible(false);
		contentPane.add(lblTxt);
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Consolas", Font.BOLD, 12));
		btnVoltar.setBounds(40, 13, 85, 18);
		contentPane.add(btnVoltar);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jelso\\OneDrive\\Documentos\\efeitoEstufa.Jpeg.jpg"));
		lblNewLabel.setBounds(192, 291, 350, 245);
		lblNewLabel.setVisible(false);
		contentPane.add(lblNewLabel);
		
		
		JButton btnVisualizarImg = new JButton("VISUALIZAR");
		btnVisualizarImg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setVisible(true);
				btnVisualizarImg.setVisible(false);
			}
		});
		btnVisualizarImg.setFont(new Font("Consolas", Font.BOLD, 15));
		btnVisualizarImg.setBounds(292, 341, 150, 50);
		contentPane.add(btnVisualizarImg);
		
		JButton btnVisualizarTxt = new JButton("VISUALIZAR");
		btnVisualizarTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTxt.setVisible(true);
				btnVisualizarTxt.setVisible(false);
			}
		});
		btnVisualizarTxt.setFont(new Font("Consolas", Font.BOLD, 15));
		btnVisualizarTxt.setBounds(292, 89, 150, 50);
		contentPane.add(btnVisualizarTxt);
		
		
		
		
	}
}
