package programas;

import java.util.Scanner;

import excecao.Excecoes;
import jogo.Regras;

public class ProgramaVelha {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		new Tabuleiro();
		Regras r = new Regras();
		Tela t = new Tela();
		t.passo1();
	
	while(r.vitoria() == "") 	 {
		try {	
		System.out.println("X ou O: ");
		String nome = sc.next();
		System.out.println("Posição: ");
		Integer p = sc.nextInt();
		t.addXeO(nome, p-1);
		r = new Regras(t.enviarT());
		r.addreferencia();
		t.imprimir();
	
		
		System.out.println(r.vitoria());
		}catch(Excecoes e) {
			System.out.println("Erro: "+e);
			t.imprimir();
		}
		}
		
		
		
			sc.close();
	}
	public static void passo2() {
		
		
	}

}
