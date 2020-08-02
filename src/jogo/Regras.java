package jogo;

import programas.Tabuleiro;

public class Regras {
	
	private Tabuleiro t2;
	Integer[][] referenciaT = new Integer[3][3];
	public Regras() {
		for(int i = 0; i < 3; i++) {
			for( int j = 0; j < 3; j++) {
				referenciaT[i][j] = 0;
			}
		}
		
	}

	public Regras(Tabuleiro t2) {
		this.t2 = t2;
	}
	public String vitoria() {
		String aux = "";
		int soma1 = 0, soma2 = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				soma1 += referenciaT[i][j];
				soma2 += referenciaT[j][i];
			}
			if(soma1 == 3 || soma2 == 3) {
				aux = "X venceu!";
			}else if(soma2 == -3 || soma2 == -3) {
				aux ="O Venceu!";
			}else if(referenciaT[0][0] + referenciaT[1][1] + referenciaT[2][2] == 3 || referenciaT[2][0] + referenciaT[1][1] + referenciaT[0][2] == 3) {
				aux = "X Venceu!";
			}else if(referenciaT[0][0] + referenciaT[1][1] + referenciaT[2][2] == -3 || referenciaT[2][0] + referenciaT[1][1] + referenciaT[0][2] == -3) {
				aux = "O Venceu!";
			}else if(verificar() == 0) {
				aux = "Empate!";
			}
			
		
		}
	
		return aux;
	}
	
	public void addreferencia() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(t2.getTabuleiro()[i][j].equals("x")) {
					referenciaT[i][j] = 1;
					
				}else if((t2.getTabuleiro()[i][j]).equals("o")) {
					referenciaT[i][j] = -1;
				}else {
					referenciaT[i][j]= 0;
				}
			}
		}
	
	}
	public Integer verificar() {
		Integer cont = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(referenciaT[i][j] == 0) {
					cont++;
				}
				
			}
		}
		return cont;
	}
	
	
	
	
	
	
}
