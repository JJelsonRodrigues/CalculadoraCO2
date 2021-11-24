package br.com.calculadora.funcoes.view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;


public class ViewFotossintese extends JFrame {

	private static final long serialVersionUID = 2521092645719179311L;
	private JPanel contentPane;

	
	public static void main(String[] args) {
		
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex ) {
			System.err.println();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewFotossintese frame = new ViewFotossintese();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public ViewFotossintese() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 780, 680);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.setFont(new Font("Consolas", Font.BOLD, 12));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBounds(10, 1, 75, 18);
		contentPane.add(btnVoltar);
		
		
		JLabel lblFotossinteseImagem = new JLabel("fotossinteseImagem");
		lblFotossinteseImagem.setBounds(116, 329, 532, 300);
		lblFotossinteseImagem.setIcon(new ImageIcon("C:\\Users\\jelso\\Downloads\\maxresdefault (1).jpg"));
		lblFotossinteseImagem.setVisible(false);
		contentPane.add(lblFotossinteseImagem);
		
		
		JButton btnVisualizarImg = new JButton("VISUALIZAR");
		btnVisualizarImg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblFotossinteseImagem.setVisible(true);
			}
		});
		btnVisualizarImg.setFont(new Font("Consolas", Font.BOLD, 15));
		btnVisualizarImg.setBounds(307, 341, 150, 50);
		contentPane.add(btnVisualizarImg);
		
		
		JLabel lblTitulo = new JLabel("COMO OCORRE O PROCESSO DA FOTOSS\u00CDNTESE?");
		lblTitulo.setBounds(74, 11, 585, 40);
		lblTitulo.setFont(new Font("Arial Black", Font.BOLD, 20));
		contentPane.add(lblTitulo);
		
		
		JLabel lblTexto = new JLabel("");
		lblTexto.setBounds(35, 50, 694, 268);
		lblTexto.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTexto.setText("<html> &nbsp &nbsp &nbsp É o processo pelo qual a planta se alimenta e cresce. No caso, usaremos a árvore como exemplo. \r\n"
				+ "<br> &nbsp &nbsp &nbsp Ela ajuda a combater o efeito estufa de 2 maneiras pelo processo da fotossíntese: absorvendo os raios luminosos das ondas eletromagnéticas emitidas pelo Sol e retirando gás carbônico da atmosfera. \r\n"
				+ "<br> &nbsp &nbsp &nbsp O Sol emite luz de todos os espectros, que combinados formam a cor branca. A árvore absorve a energia referente a ponta desses espectros para fazer fotossíntese, e reflete de volta a cor verde."
				+ " Por isso as folhas das árvores são verdes. Sendo assim, refletindo menos cores do que absorvendo, a árvore devolve menos energia em forma de calor para o ambiente, regulando a temperatura. \r\n"
				+ "<br> &nbsp &nbsp &nbsp Os cloroplastos das plantas capturam a energia luminosa, que quando combinada com a água e sais minerais, se convertem em energia química, esta que por sua vez é armazenada em açúcares e outras moléculas das plantas. "
				+ "Essas moléculas serão utilizadas pelas plantas para o seu crescimento e florescimento de folhas e frutos. Este é o processo da fotossíntese. \r\n"
				+ "<br> &nbsp &nbsp &nbsp Para que isso ocorra, é necessário que a planta capture CO2 através de suas folhas, deste modo, ela captura as moléculas de carbono "
				+ "(utilizadas para o crescimento da planta, gerando novas moléculas) e devolve o oxigênio para atmosfera. \r\n"
				+ "   </html>");
		lblTexto.setVisible(false);
		contentPane.add(lblTexto);
		
		
		JButton btnVisualizarTxt = new JButton("VISUALIZAR");
		btnVisualizarTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setVisible(true);
				btnVisualizarTxt.setVisible(false);
			}
		});
		btnVisualizarTxt.setFont(new Font("Consolas", Font.BOLD, 15));
		btnVisualizarTxt.setBounds(307, 70, 150, 50);
		contentPane.add(btnVisualizarTxt);
		
	
	}
}
