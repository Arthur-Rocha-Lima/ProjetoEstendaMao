package br.com.gustavofarias.dto;

public class Visitante {

	private String nomeCompleto;
	private String dtNas;
	private String tel;
	private String email;
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDtNas() {
		return dtNas;
	}

	public void setDtNas(String dtNas) {
		this.dtNas = dtNas;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
