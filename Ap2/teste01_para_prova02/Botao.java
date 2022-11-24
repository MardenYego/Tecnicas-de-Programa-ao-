package teste01_para_prova02;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class Botao extends JButton {
	
	private int linha;
	private int coluna;
	
	public Botao(int linha,int coluna) {
		this.linha=linha;
		this.coluna=coluna;
		gerarBotao();
	}
	
	public void gerarBotao() {
		this.setPreferredSize(new Dimension(25,25));
		this.setText("Gol");
		this.setBackground(Color.DARK_GRAY);
		this.setForeground(Color.RED);
	}

	
	
	
	
	
	
	
	
	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	
	
	
	
}
