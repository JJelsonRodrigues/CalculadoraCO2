package br.com.calculadora.funcoes.variaveis;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class CaixaDeNumerosKmRodados extends PlainDocument {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4832544555329764521L;

	@Override
	public void insertString(int offs, String string, AttributeSet a) throws BadLocationException {
		super.insertString(offs, string.replaceAll("[^0-9 ^.]", ""), a);
	}
}
