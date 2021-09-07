package br.com.gustavofarias;

import java.util.Scanner;

import br.com.gustavofarias.dto.Atendido;
import br.com.gustavofarias.dto.Doador;
import br.com.gustavofarias.dto.Funcionario;
import br.com.gustavofarias.dto.Visitante;
import br.com.gustavofarias.dto.Voluntario;

public class EstendaMao {

	static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {

        String cat = null;

        System.out.println("Deseja cadastrar que categoria?\n1 - Funcionário\n2 - Voluntários\n3 - Doadores"
                + "\n4 - Atendidos\n5 - Visitantes ");
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

    }

    private static void cadFunc() {
        Funcionario f = new Funcionario();
        
        System.out.println("Digite o nome do funcionário: ");
        f.setNomeCompleto(in.next());
        
        System.out.println("Digite a data de nascimento do funcionário: ");
        f.setDtNas(in.next());
        
        System.out.println("Digite o contato/telefone do funcionário: ");
        f.setTel(in.next());
        
        System.out.println("Digite o email do funcionário: ");
        f.setEmail(in.next());
        
    }

    private static void cadVolu() {
        Voluntario v = new Voluntario();
               
        System.out.println("Digite o nome do voluntário: ");
        v.setNomeCompleto(in.next());
        
        System.out.println("Digite a data de nascimento do voluntário: ");
        v.setDtNas(in.next());
        
        System.out.println("Digite o contato/telefone do voluntário: ");
        v.setTel(in.next());
        
        System.out.println("Digite o email do voluntário: ");
        v.setEmail(in.next());
    }

    private static void cadDoa() {
        Doador d = new Doador();
        
        System.out.println("Digite o nome do doador: ");
        d.setNomeCompleto(in.next());
        
        System.out.println("Digite a data de nascimento do doador: ");
        d.setDtNas(in.next());
        
        System.out.println("Digite o contato/telefone do doador: ");
        d.setTel(in.next());
        
        System.out.println("Digite o email do doador: ");
        d.setEmail(in.next());
    }

    private static void cadAten() {
        Atendido a = new Atendido();
        
        System.out.println("Digite o nome da pessoa atendida:");
        a.setNomeCompleto(in.next());
        
        System.out.println("Digite a data de nascimento da pessoa atendidao: ");
        a.setDtNas(in.next());
        
        System.out.println("Digite o contato/telefone da pessoa atendida: ");
        a.setTel(in.next());
        
        System.out.println("Digite o email da pessoa atendida: ");
        a.setEmail(in.next());
    }

    private static void cadVisi() {
        Visitante vi = new Visitante();
        
        System.out.println("Digite o nome do visitante: ");
        vi.setNomeCompleto(in.next());
        
        System.out.println("Digite a data de nascimento do visitante: ");
        vi.setDtNas(in.next());
        
        System.out.println("Digite o contato/telefone do visitante: ");
        vi.setTel(in.next());
        
        System.out.println("Digite o email do visitante: ");
        vi.setEmail(in.next());
    }
}
