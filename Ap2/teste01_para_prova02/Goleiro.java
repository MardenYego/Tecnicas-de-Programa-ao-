package teste01_para_prova02;

import java.util.ArrayList;
import java.util.Random;

public class Goleiro {
	
	private int linha;
	private int coluna;
	
	Random aleatorio= new Random();
	public Goleiro() {
		this.setLinha(aleatorio.nextInt(17));
		this.setColuna(aleatorio.nextInt(9));
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
