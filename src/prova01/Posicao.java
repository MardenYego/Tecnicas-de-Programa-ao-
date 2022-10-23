package prova01;

public class Posicao {
	
	private int quantidadeGols;
	private int quantidadeDefesas;
	private int quantidadesBolasFora; 
	private String tipo;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if(!(tipo.equals("")))
			this.tipo = tipo;
	}
	public int getQuantidadeGols() {
		return quantidadeGols;
	}
	public void setQuantidadeGols(int quantidadeGols) {
		if(quantidadeGols>=0)
			this.quantidadeGols = quantidadeGols;
	}
	public int getQuantidadeDefesas() {
		return quantidadeDefesas;
	}
	public void setQuantidadeDefesas(int quantidadeDefesas) {
		if(quantidadeDefesas>=0)
			this.quantidadeDefesas = quantidadeDefesas;
	}
}
