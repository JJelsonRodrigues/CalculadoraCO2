package br.com.calculadora.funcoes.view;
import java.awt.BorderLayout;



import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.EventQueue;

public class ViewCombustao extends JDialog {

	private static final long serialVersionUID = 8164208600395999215L;
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
					ViewCombustao dialog = new ViewCombustao();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ViewCombustao() {
		setBounds(10, 10, 780, 680);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Consolas", Font.BOLD, 12));
		btnVoltar.setBounds(25, 15, 85, 20);
		contentPanel.add(btnVoltar);
		
		JLabel lblTituloCombustao = new JLabel("PROCESSO DA COMBUST\u00C3O");
		lblTituloCombustao.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblTituloCombustao.setBounds(199, 11, 335, 35);
		contentPanel.add(lblTituloCombustao);
		
		JLabel lblTxtCombustao = new JLabel("New label");
		lblTxtCombustao.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTxtCombustao.setText("<html>  &nbsp  &nbsp  &nbsp A combust�o � caracterizada por tr�s partes necess�rias:\r\n"
				+ "<br>  &nbsp  &nbsp  &nbsp Combust�vel: material oxid�vel que reage com o oxig�nio, pegando fogo. Os combust�veis podem ser s�lidos (carv�o, madeira, papel), l�quidos (gasolina, etanol e �leo diesel) e gasosos (g�s butano, g�s metano);\r\n"
				+ "<br> &nbsp  &nbsp  &nbsp Comburente: geralmente � o oxig�nio do ar (O2(g)), que pode estar na forma pura ou misturado com outros gases, como acontece no caso do ar. Se n�o houver suprimento de oxig�nio suficiente no ar, a rea��o n�o ocorre. No ar, temos cerca de 20% de O2(g), e o limite para que haja combust�o � 9% para o carv�o e 16% para os demais combust�veis.\r\n"
				+ "Uma experi�ncia que comprova a veracidade desse fato � quando pegamos uma vela acesa e a tampamos com um copo. Com o passar do tempo, todo O2(g) do ar � consumido e a vela apaga;\r\n"
				+ "<br> &nbsp  &nbsp  &nbsp Energia (calor): para que a rea��o de combust�o se inicie, � necess�ria uma fonte de igni��o, como uma fa�sca. Depois que a rea��o se inicia, a energia liberada na forma de calor providencia a energia necess�ria para que a rea��o continue at� que todo o combust�vel ou comburente tornem-se escassos.\r\n"
				+ " </html>");
		lblTxtCombustao.setBounds(72, 42, 620, 270);
		lblTxtCombustao.setVisible(false);
		contentPanel.add(lblTxtCombustao);
		
		JLabel lblImgCombustao = new JLabel("New label");
		lblImgCombustao.setIcon(new ImageIcon("C:\\Users\\jelso\\Downloads\\Fig1-Tri\u00E2ngulo-combust\u00E3o-60pc.png"));
		lblImgCombustao.setBounds(206, 317, 351, 226);
		lblImgCombustao.setVisible(false);
		contentPanel.add(lblImgCombustao);
		
		JButton btnVisualizarImg = new JButton("VISUALIZAR");
		btnVisualizarImg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImgCombustao.setVisible(true);
				btnVisualizarImg.setVisible(false);
			}
		});
		btnVisualizarImg.setFont(new Font("Consolas", Font.BOLD, 15));
		btnVisualizarImg.setBounds(307, 341, 150, 50);
		contentPanel.add(btnVisualizarImg);

		JButton btnVisualizarTxt = new JButton("VISUALIZAR");
		btnVisualizarTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTxtCombustao.setVisible(true);
				btnVisualizarTxt.setVisible(false);
			}
		});
		btnVisualizarTxt.setFont(new Font("Consolas", Font.BOLD, 15));
		btnVisualizarTxt.setBounds(307, 89, 150, 50);
		contentPanel.add(btnVisualizarTxt);

	}
}
