package br.com.gustavofarias.dto;

public class Atendido{

	private String cpf;
	
	private String rg;
	
	private String rendaFamiliar;
	
	@Override
	public String toString() {
		return "Atendido [cpf=" + cpf + ", rg=" + rg + ", rendaFamiliar=" + rendaFamiliar + "]";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRendaFamiliar() {
		return rendaFamiliar;
	}

	public void setRendaFamiliar(String rendaFamiliar) {
		this.rendaFamiliar = rendaFamiliar;
	}
	
}
