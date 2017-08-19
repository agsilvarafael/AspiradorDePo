package br.com.so.model;

import br.com.so.util.Timer;

public class Aspirdor {

	private final Integer bateriaDuracaoTotalTicks;//Duração em Segundos
	private Integer bateriaDuracaoRestanteTicks = 0;
	private final Integer filtroCapacidadeTotal;
	private Integer filtroQtdAtual = 0;
	private Integer posX, posY;
	private Integer limpezaNTicks;
//	private String urlImage = ;

	/*
	 * Leva 12 segundos para encher (6 áreas - 2s cada)
	 * Demora 3s para esvaziar quando está cheio por completo
	 * 1/2 s para esvaziar cada unidade de sujeira [mas para esvaziar é td ou nada]
	*/
	public Aspirdor(Integer capacidadeMovimento, Double tempoLimpezaQuadradoSeg,
			Integer filtroCapacidadeTotal, Double tempoLimpezaFiltro) 
	{
		//
		this.bateriaDuracaoTotalTicks = (int) (capacidadeMovimento + tempoLimpezaQuadradoSeg/Timer.tick);
		this.filtroCapacidadeTotal = filtroCapacidadeTotal;
		//a posição inicial é a área de carga/esvaziamento
		this.posX = 0;
		this.posY = 5;
	}
	
	public void mover(Integer qtd){
		bateriaDuracaoRestanteTicks -= qtd;
	}
	//Retorna TRUE enquanto estiver carregando
	public Boolean carregar(Double qtd){
		bateriaDuracaoRestante += qtd;
		return (bateriaDuracaoTotalTicks>bateriaDuracaoRestante);
	}
	//Retorna TRUE enquanto possuir capacidade
	public Boolean Limpar(){
		this.filtroQtdAtual++;
		return (filtroCapacidadeTotal>filtroQtdAtual);
	} 
	
	
	
	public Integer getBateiraDuracaoRestanteTicks() {
		return bateriaDuracaoRestanteTicks;
	}

	public void setBateiraDuracaoRestante(Integer bateriaDuracaoRestanteTicks) {
		this.bateriaDuracaoRestanteTicks = bateriaDuracaoRestanteTicks;
	}

	public Integer getBateriaDuracaoTotalTicks() {
		return bateriaDuracaoTotalTicks;
	}
	
	
}
