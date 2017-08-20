package br.com.so.model;

import java.util.Random;

public class Sala {
	
	/*Legenda:
	 * 	TRUE - Espaço limpo
	 *  FALSE - Espaço sujo
	*/
	private static Boolean mapaSala[][];
	private final Integer linhas, colunas;
	
	public Sala(Integer linhas, Integer colunas) {
		Sala.mapaSala = new Boolean[linhas][colunas];
		this.linhas = linhas;
		this.colunas = colunas; 
		Random r = new Random();
		for(int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				mapaSala[i][j] = r.nextBoolean();//Gera distribuição de sujeira aleatória pela sala
			}
		}
	}
	
	//Recebe as corrdenadas e retorna TRUE se estivar limpa
	public Boolean posicaoLimpa(int x, int y) {
		return (mapaSala[x][y]);
	}
	public void limparArea(int x, int y) {
		mapaSala[x][y]=true;
	}
	public void sujarArea(int x, int y) {
		mapaSala[x][y]=false;
	}

	public Boolean[][] getMapaSala() {
		return mapaSala;
	}

	public Integer getColunas() {
		return colunas;
	}

	public Integer getLinhas() {
		return linhas;
	}
	
}
