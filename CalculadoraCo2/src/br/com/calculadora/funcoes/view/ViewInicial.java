package br.com.calculadora.funcoes.view;


import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.text.BadLocationException;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class ViewInicial implements ActionListener  {
	
	private JFrame frame;
	
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
					ViewInicial window = new ViewInicial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public ViewInicial () {
		tela ();
	} 
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void tela () {
		frame = new JFrame();
		frame.setTitle("Calco2");
		frame.setBackground(new Color(144, 238, 144));
		frame.setBounds(10, 10, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnIniciarCalculo = new JButton("Iniciar c\u00E1lculo");
		btnIniciarCalculo.setFont(new Font("Consolas", Font.BOLD, 14));
		btnIniciarCalculo.setBackground(new Color(0, 128, 128));
		btnIniciarCalculo.setBounds(287, 60, 160, 40);
		frame.getContentPane().add(btnIniciarCalculo);
		btnIniciarCalculo.addActionListener(this);
			
		
		JButton btnFotossntese = new JButton("Fotoss\u00EDntese");
		btnFotossntese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameFotossintese();
			}
		});
		btnFotossntese.setFont(new Font("Consolas", Font.BOLD, 14));
		btnFotossntese.setBackground(new Color(0, 128, 128));
		btnFotossntese.setBounds(287, 125, 160, 40);
		frame.getContentPane().add(btnFotossntese);
		
		
		JButton btnEfeitoEstufa = new JButton("Efeito Estufa");
		btnEfeitoEstufa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameEfeitoEstufa();
			}
		});
		btnEfeitoEstufa.setFont(new Font("Consolas", Font.BOLD, 14));
		btnEfeitoEstufa.setBackground(new Color(0, 128, 128));
		btnEfeitoEstufa.setBounds(287, 190, 160, 40);
		frame.getContentPane().add(btnEfeitoEstufa);
		
		
		JButton btnCombusto = new JButton("Combust\u00E3o ");
		btnCombusto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameCombustao();
			}
		});
		btnCombusto.setFont(new Font("Consolas", Font.BOLD, 14));
		btnCombusto.setBackground(new Color(0, 128, 128));
		btnCombusto.setBounds(287, 255, 160, 40);
		frame.getContentPane().add(btnCombusto);
		
		
		JLabel lblCalcO2 = new JLabel("CalcO2");
		lblCalcO2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCalcO2.setBounds(50, 11, 120, 25);
		frame.getContentPane().add(lblCalcO2);
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void FrameCalculadora() throws BadLocationException {
		ViewCalculadora view = new ViewCalculadora();
		view.setSize(750,500);
		view.setVisible(true);
		view.setResizable(false);
	
	
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void FrameFotossintese() {
		ViewFotossintese view = new ViewFotossintese();
		view.setSize(780,680);
		view.setVisible(true);
		view.setResizable(false);
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void FrameCombustao() {
		ViewCombustao view = new ViewCombustao();
		view.setSize(780,680);
		view.setVisible(true);
		view.setResizable(false);
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void FrameEfeitoEstufa() {
		ViewEfeitoEstufa view = new ViewEfeitoEstufa();
		view.setSize(780,680);
		view.setVisible(true);
		view.setResizable(false);
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			FrameCalculadora();
		} catch (BadLocationException e1) {

			e1.printStackTrace();
		}
		
	}
	
}
