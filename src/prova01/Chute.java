package prova01;

import java.util.Random;

public class Chute {
	private int forca;
	private int quadrante;
	private int posicaoX;
	private int posicaoY;

	
	public Chute() {
		Random aleatorio = new Random();
		
		//setQuadrante();
//	 	setPosicaoX(aleatorio.nextInt(10));
//	 	setPosicaoY(aleatorio.nextInt(18));
	 
	}
	
	

	public int getForca() {
		return forca;
	}
	
	public void setForca(int forca) {
		this.forca = forca;
	}
	
	public int getQuadrante() {
		return quadrante;
	}
	
	public void setQuadrante(int quadrante) {
		this.quadrante = quadrante;
	}
	
	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}
	
	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	
}
