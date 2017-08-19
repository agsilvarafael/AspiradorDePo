package br.com.so.model;

import br.com.so.util.Timer;

public class Aspirdor {

	private final Integer bateriaDuracaoTotalTicks;//Dura��o em Segundos
	private Integer bateriaDuracaoRestanteTicks = 0;
	private final Integer filtroCapacidadeTotal;
	private Integer filtroQtdAtual = 0;
	private Integer posX, posY;
	private Integer limpezaNTicks;
//	private String urlImage = ;

	/*
	 * Leva 12 segundos para encher (6 �reas - 2s cada)
	 * Demora 3s para esvaziar quando est� cheio por completo
	 * 1/2 s para esvaziar cada unidade de sujeira [mas para esvaziar � td ou nada]
	*/
	public Aspirdor(Integer capacidadeMovimento, Double tempoLimpezaQuadradoSeg,
			Integer filtroCapacidadeTotal, Double tempoLimpezaFiltro) 
	{
		//
		this.bateriaDuracaoTotalTicks = (int) (capacidadeMovimento + tempoLimpezaQuadradoSeg/Timer.tick);
		this.filtroCapacidadeTotal = filtroCapacidadeTotal;
		//a posi��o inicial � a �rea de carga/esvaziamento
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
