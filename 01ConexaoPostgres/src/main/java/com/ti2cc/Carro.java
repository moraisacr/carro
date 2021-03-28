package Bancocarro;

public class Carro {
	private int ano;
	private String cor;
	private String modelo;
	private String marca;
	
	public Carro() {
		this.ano = -1;
		this.cor = "";
		this.modelo = "";
		this.marca = "";
	}
	
	public Carro(int ano, String cor, String modelo, String marca) {
		this.ano = ano;
		this.cor = cor;
		this.modelo = modelo;
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setcor(String Cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Carro [ano=" + ano + ", cor=" + cor + ", modelo=" + modelo + ", marca=" + marca + "]";
	}
	
}
