package questao03;

public class Circulo {
	
	private double raio;
	
	
	public Circulo(double tamanhoRaio) {
		setRaio(tamanhoRaio);
	}
	
	public double area() {
		double area=3.14*Math.pow(raio, 2);
		return area;
	}
	
	public double circunferencia() {
		double circunferencia=2*3.14*raio;
		return circunferencia;
	}
	
	public void aumentarCirculo(double valor) {
		double aumento= this.raio*valor/100;
		this.raio+=aumento;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if(raio>0)
		   this.raio = raio;
	}
	
}
