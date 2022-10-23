package prova01;

import java.util.ArrayList;
import java.util.Random;

public class Chute {
	private int id; 
	private int forca;
	private int quadrante;
	private int posicaoX;
	private int posicaoY;
	public ArrayList<Chute>ListaDeChutes=new ArrayList<Chute>();
	

	public void adicionarChutes(Chute chute) {
		ListaDeChutes.add(chute);
	}
	
	
	public Chute(int id,int forca) {
		setId(id);
		setForca(forca);	 
	}
	
	public int chutar() {
		
		Random aleatorio = new Random();
		
		//Posição do chute
		setPosicaoX(aleatorio.nextInt(9));
		setPosicaoY(aleatorio.nextInt(17));
		
		if((getPosicaoX()>=2 && getPosicaoX()<=8) && (getPosicaoY()>=2 && getPosicaoY()<=14)) {
			if((getPosicaoX()>=2 && getPosicaoX()<=4) && (getPosicaoY()>=2 && getPosicaoY()<=7)) {
				setQuadrante(1);
			}else if((getPosicaoX()>=2 && getPosicaoX()<=4) && (getPosicaoY()>=8 && getPosicaoY()<=14)) {
				setQuadrante(2);
			}else if((getPosicaoX()>=5 && getPosicaoX()<=8) && (getPosicaoY()>=2 && getPosicaoY()<=7)) {
				setQuadrante(3);
			}else if((getPosicaoX()>=5 && getPosicaoX()<=8 ) && (getPosicaoY()>=8 && getPosicaoY()<=14)) {
				setQuadrante(4);
			}
			
			return getQuadrante();
		}
		
		return 0;	
	}
	
	

	public ArrayList<Chute> getListaDeChutes() {
		return ListaDeChutes;
	}

	public void setListaDeChutes(ArrayList<Chute> listaDeChutes) {
		ListaDeChutes = listaDeChutes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
