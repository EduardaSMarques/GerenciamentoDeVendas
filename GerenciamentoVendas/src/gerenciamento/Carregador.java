package gerenciamento;

public class Carregador {
	
	private int carregadorID;
	private String cor;
	private String potencia;
	private String tipoDeEntrada;

	public int getCarregadorID() {
		return carregadorID;
	}

	public void setCarregadorID(int carregadorID) {
		this.carregadorID = carregadorID;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getTipoDeEntrada() {
		return tipoDeEntrada;
	}

	public void setTipoDeEntrada(String tipoDeEntrada) {
		this.tipoDeEntrada = tipoDeEntrada;
	}

}
