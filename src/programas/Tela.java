package programas;

import excecao.Excecoes;
import jogo.Posicao;

public class Tela {

	private Tabuleiro t = new Tabuleiro();
	private PosicaoList pos = new PosicaoList();
	
	public void imprimir() {
		
		for(int i = 0; i < t.getTabuleiro().length; i++) {
			for(int j = 0; j < t.getTabuleiro().length; j++) {
				
				System.out.print("|"+t.getTabuleiro()[i][j]);
				
			}
			System.out.println("|");
		}
	}
	public void addXeO(String nome, int p) throws Excecoes {
		if(t.getTabuleiro()[pos.getPos().get(p).getLinha()][pos.getPos().get(p).getColuna()] != " " ) {
			throw new Excecoes("Esta posição ja foi usado");
		}
		t.getTabuleiro()[pos.getPos().get(p).getLinha()][pos.getPos().get(p).getColuna()] = nome;
	
	}
	
	public  void posicao() {
		for(int i = 0; i < t.getTabuleiro().length; i++) {
			for(int j = 0; j < t.getTabuleiro().length; j++) {
		this.pos.getPos().add((new Posicao(i, j)));
			}
		}
	}
	public  void inicio() {
		for(int i = 0; i < t.getTabuleiro().length; i++) {
			for(int j = 0; j < t.getTabuleiro().length; j++) {
				if(t.getTabuleiro()[i][j] == null) {
					t.getTabuleiro()[i][j] = " ";
				}
			}
		}
	}
	
	public Tabuleiro enviarT() {
		return t;
	}
	public void passo1() {
		posicao();
		inicio();
		imprimir();
	}
	
	
	}

	
	
	

