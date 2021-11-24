package br.com.calculadora.funcoes.variaveis;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class CaixaDeNumerosDiasSemana extends PlainDocument {

	private static final long serialVersionUID = -7564877223883590029L;
	
	private int quantidadeMax;
	
	
	public CaixaDeNumerosDiasSemana(int MaxLen) {
		super();
		if(MaxLen<=0)
			throw new IllegalArgumentException("Informe o número de dias da semana!");
		quantidadeMax = MaxLen;
	}
		
	@Override
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
		if(str == null || getLength() == quantidadeMax)
			return;
		int totalQuantia = (getLength()+str.length());
		if(totalQuantia<= quantidadeMax) {
			super.insertString(offs, str.replaceAll("[^0-7]", ""), a);
			return;
		} 
		
		String nova = str.substring(0,getLength() - quantidadeMax);
		super.insertString(offs, nova, a);
		
	}
}
