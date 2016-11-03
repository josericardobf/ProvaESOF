package v1;

public class Pessoa {

	String nome;
	boolean gravida;
	boolean idoso;
	
	public Pessoa(String nome, boolean gravida, boolean idoso) {
		this.nome = nome;
		this.gravida = gravida;
		this.idoso = idoso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isGravida() {
		return gravida;
	}
	public void setGravida(boolean gravida) {
		this.gravida = gravida;
	}
	public boolean isIdoso() {
		return idoso;
	}
	public void setIdoso(boolean idoso) {
		this.idoso = idoso;
	}
	
	
	
}
