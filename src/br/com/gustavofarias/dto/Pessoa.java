package br.com.gustavofarias.dto;

public class Pessoa implements Comparable<Pessoa>{

	private String nomeCompleto;
	private String dtNas;
	private String tel;
	private String email;
	private Object tipoPessoa;
	
	@Override 
	public int compareTo(Pessoa outroPessoa) { 
		if(this.nomeCompleto.compareTo(outroPessoa.getNomeCompleto()) < 0) {
			return -1;
		} else if(this.nomeCompleto.compareTo(outroPessoa.getNomeCompleto()) > 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "Pessoa [nomeCompleto=" + nomeCompleto + ", dtNas=" + dtNas + ", tel=" + tel + ", email=" + email
				+ ", tipoPessoa=" + tipoPessoa.toString() + "]";
	}

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

	public Object getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(Object tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
}
