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
import javax.swing.border.EmptyBorder;

public class ViewFotossintese extends JDialog {
	
	private static final long serialVersionUID = 2521092645719179311L;
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
					ViewFotossintese dialog = new ViewFotossintese();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public ViewFotossintese() {

		setBounds(10, 10, 780, 680);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.setFont(new Font("Consolas", Font.BOLD, 12));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBounds(10, 1, 75, 18);
		contentPanel.add(btnVoltar);

		JLabel lblTituloFotossintese = new JLabel("COMO OCORRE O PROCESSO DA FOTOSS\u00CDNTESE?");
		lblTituloFotossintese.setBounds(74, 11, 585, 40);
		lblTituloFotossintese.setFont(new Font("Arial Black", Font.BOLD, 20));
		contentPanel.add(lblTituloFotossintese);

		JLabel lblTxtFotossintese = new JLabel("");
		lblTxtFotossintese.setBounds(35, 50, 694, 268);
		lblTxtFotossintese.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTxtFotossintese.setText(
				"<html> &nbsp &nbsp &nbsp � o processo pelo qual a planta se alimenta e cresce. No caso, usaremos a �rvore como exemplo. \r\n"
						+ "<br> &nbsp &nbsp &nbsp Ela ajuda a combater o efeito estufa de 2 maneiras pelo processo da fotoss�ntese: absorvendo os raios luminosos das ondas eletromagn�ticas emitidas pelo Sol e retirando g�s carb�nico da atmosfera. \r\n"
						+ "<br> &nbsp &nbsp &nbsp O Sol emite luz de todos os espectros, que combinados formam a cor branca. A �rvore absorve a energia referente a ponta desses espectros para fazer fotoss�ntese, e reflete de volta a cor verde."
						+ " Por isso as folhas das �rvores s�o verdes. Sendo assim, refletindo menos cores do que absorvendo, a �rvore devolve menos energia em forma de calor para o ambiente, regulando a temperatura. \r\n"
						+ "<br> &nbsp &nbsp &nbsp Os cloroplastos das plantas capturam a energia luminosa, que quando combinada com a �gua e sais minerais, se convertem em energia qu�mica, esta que por sua vez � armazenada em a��cares e outras mol�culas das plantas. "
						+ "Essas mol�culas ser�o utilizadas pelas plantas para o seu crescimento e florescimento de folhas e frutos. Este � o processo da fotoss�ntese. \r\n"
						+ "<br> &nbsp &nbsp &nbsp Para que isso ocorra, � necess�rio que a planta capture CO2 atrav�s de suas folhas, deste modo, ela captura as mol�culas de carbono "
						+ "(utilizadas para o crescimento da planta, gerando novas mol�culas) e devolve o oxig�nio para atmosfera. \r\n"
						+ "   </html>");
		lblTxtFotossintese.setVisible(false);
		contentPanel.add(lblTxtFotossintese);

		JButton btnVisualizarTxt = new JButton("VISUALIZAR");
		btnVisualizarTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTxtFotossintese.setVisible(true);
				btnVisualizarTxt.setVisible(false);
			}
		});
		btnVisualizarTxt.setFont(new Font("Consolas", Font.BOLD, 15));
		btnVisualizarTxt.setBounds(307, 70, 150, 50);
		contentPanel.add(btnVisualizarTxt);

		JLabel lblFotossinteseImagem = new JLabel("fotossinteseImagem");
		lblFotossinteseImagem.setBounds(116, 329, 532, 300);
		lblFotossinteseImagem.setIcon(new ImageIcon("C:\\Users\\jelso\\Downloads\\maxresdefault (1).jpg"));
		lblFotossinteseImagem.setVisible(false);
		contentPanel.add(lblFotossinteseImagem);

		JButton btnVisualizarImg = new JButton("VISUALIZAR");
		btnVisualizarImg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblFotossinteseImagem.setVisible(true);
			}
		});
		btnVisualizarImg.setFont(new Font("Consolas", Font.BOLD, 15));
		btnVisualizarImg.setBounds(307, 341, 150, 50);
		contentPanel.add(btnVisualizarImg);

	}
}

