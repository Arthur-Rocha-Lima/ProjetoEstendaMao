package br.com.gustavofarias;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.gustavofarias.dto.Atendido;
import br.com.gustavofarias.dto.Doador;
import br.com.gustavofarias.dto.Funcionario;
import br.com.gustavofarias.dto.Pessoa;
import br.com.gustavofarias.dto.Visitante;
import br.com.gustavofarias.dto.Voluntario;

public class EstendaMao {

	static Scanner in = new Scanner(System.in);

	static List<Pessoa> listPessoa = new ArrayList<Pessoa>();

	public static void main(String[] args) {
		cadastrarPessoa();

		Collections.sort(listPessoa);
		
		System.out.println(listPessoa);
		System.out.println(buscarPessoa());
	}
	
	private static List<Pessoa> buscarPessoa(){
		String cat = null;
		String tipoPessoa = null;
		System.out.println("Qual categoria deseja pesquisar?\n1-Atendido\n2-Funcionário\\n3-Voluntários\\n4-Doadores\\n5-Visitantes\\n");
		cat = in.next();
		
		switch (cat) {
		case "1":
			tipoPessoa = "Atendido";
			break;
		case "2":
			tipoPessoa = "Funcionario";
			break;
		case "3":
			tipoPessoa = "Voluntario";
			break;
		case "4":
			tipoPessoa = "Doador";
			break;
		case "5":
			tipoPessoa = "Visitante";
			break;
		}
		
		if(tipoPessoa.equals("Atendido")) {
			return listPessoa.stream().filter(p -> p.getTipoPessoa().getClass() == Atendido.class).collect(Collectors.toList());
		} else if(tipoPessoa.equals("Doador")) {
			return listPessoa.stream().filter(p -> p.getTipoPessoa().getClass() == Doador.class).collect(Collectors.toList());
		} else if(tipoPessoa.equals("Funcionario")) {
			return listPessoa.stream().filter(p -> p.getTipoPessoa().getClass() == Funcionario.class).collect(Collectors.toList());
		} else if(tipoPessoa.equals("Visitante")) {
			return listPessoa.stream().filter(p -> p.getTipoPessoa().getClass() == Visitante.class).collect(Collectors.toList());
		} else if(tipoPessoa.equals("Voluntario")) {
			return listPessoa.stream().filter(p -> p.getTipoPessoa().getClass() == Voluntario.class).collect(Collectors.toList());
		} else {
			return null;
		}
	}

	private static void cadastrarPessoa() {

		String cat = null;
		String cat2 = null;

		System.out.println("Deseja cadastrar que categoria?\n1 - Funcionário\n2 - Voluntários\n3 - Doadores"
				+ "\n4 - Atendidos\n5 - Visitantes");
		cat = in.next();

		switch (cat) {
		case "1":
			cadFunc();
			break;
		case "2":
			cadVolu();
			break;
		case "3":
			cadDoa();
			break;
		case "4":
			cadAten();
			break;
		case "5":
			cadVisi();
		}

		System.out.println("Deseja cadastrar mais alguma pessoa?\n 1 - Sim\n2 - Não");
		cat2 = in.next();
		switch (cat2) {
		case "1":
			cadastrarPessoa();
		}
	}

	private static void cadFunc() {
		Pessoa p = new Pessoa();
		Funcionario f = new Funcionario();

		System.out.println("Digite o nome do funcionário: ");
		p.setNomeCompleto(in.next());

		System.out.println("Digite a data de nascimento do funcionário: ");
		p.setDtNas(in.next());

		System.out.println("Digite o contato/telefone do funcionário: ");
		p.setTel(in.next());

		System.out.println("Digite o email do funcionário: ");
		p.setEmail(in.next());

		p.setTipoPessoa(f);

		listPessoa.add(p);
	}

	private static void cadVolu() {
		/*
		 * Voluntario v = new Voluntario();
		 * 
		 * System.out.println("Digite o nome do voluntário: ");
		 * v.setNomeCompleto(in.next());
		 * 
		 * System.out.println("Digite a data de nascimento do voluntário: ");
		 * v.setDtNas(in.next());
		 * 
		 * System.out.println("Digite o contato/telefone do voluntário: ");
		 * v.setTel(in.next());
		 * 
		 * System.out.println("Digite o email do voluntário: "); v.setEmail(in.next());
		 */
	}

	private static void cadDoa() {
		/*
		 * Doador d = new Doador();
		 * 
		 * System.out.println("Digite o nome do doador: ");
		 * d.setNomeCompleto(in.next());
		 * 
		 * System.out.println("Digite a data de nascimento do doador: ");
		 * d.setDtNas(in.next());
		 * 
		 * System.out.println("Digite o contato/telefone do doador: ");
		 * d.setTel(in.next());
		 * 
		 * System.out.println("Digite o email do doador: "); d.setEmail(in.next());
		 */
	}

	private static void cadAten() {
		Pessoa p = new Pessoa();
		Atendido a = new Atendido();

		System.out.println("Digite o nome da pessoa atendida:");
		p.setNomeCompleto(in.next());

		System.out.println("Digite a data de nascimento da pessoa atendidao: ");
		p.setDtNas(in.next());

		System.out.println("Digite o contato/telefone da pessoa atendida: ");
		p.setTel(in.next());

		System.out.println("Digite o email da pessoa atendida: ");
		p.setEmail(in.next());

		System.out.println("Digite o CPF da pessoa atendida: ");
		a.setCpf(in.next());

		System.out.println("Digite o RG da pessoa atendida: ");
		a.setRg(in.next());

		System.out.println("Digite a renda familiar da pessoa atendida: ");
		a.setRendaFamiliar(in.next());

		p.setTipoPessoa(a);

		listPessoa.add(p);
	}

	private static void cadVisi() {
		/*
		 * Visitante vi = new Visitante();
		 * 
		 * System.out.println("Digite o nome do visitante: ");
		 * vi.setNomeCompleto(in.next());
		 * 
		 * System.out.println("Digite a data de nascimento do visitante: ");
		 * vi.setDtNas(in.next());
		 * 
		 * System.out.println("Digite o contato/telefone do visitante: ");
		 * vi.setTel(in.next());
		 * 
		 * System.out.println("Digite o email do visitante: "); vi.setEmail(in.next());
		 */
	}
}
