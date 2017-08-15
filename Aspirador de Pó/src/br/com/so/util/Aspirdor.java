package br.com.so.util;

public class Aspirdor {

	private final Double bateriaDuracaoTotal;//Duração em Segundos
	private Double bateriaDuracaoRestante = 0.0;
	private final Integer filtroCapacidadeTotal;
	private Integer filtroQtdAtual = 0;
	private Integer posX, posY;

	/*
	 * Leva 12 segundos para encher (6 áreas - 2s cada)
	 * Demora 3s para esvaziar quando está cheio por completo
	 * 1/2 s para esvaziar cada unidade de sujeira [mas para esvaziar é td ou nada]
	*/
	public Aspirdor(Double bateriaDuracaoTotal, Integer filtroCapacidadeTotal) {
		this.bateriaDuracaoTotal = bateriaDuracaoTotal;
		this.filtroCapacidadeTotal = filtroCapacidadeTotal;
		//a posição inicial é a área de carga/esvaziamento
		this.posX = 0;
		this.posY = 5;
	}
	
	public void mover(Double qtd){
		bateriaDuracaoRestante -= qtd;
	}
	//Retorna TRUE enquanto estiver carregando
	public Boolean carregar(Double qtd){
		bateriaDuracaoRestante += qtd;
		return (bateriaDuracaoTotal>bateriaDuracaoRestante);
	}
	//Retorna TRUE enquanto possuir capacidade
	public Boolean Limpar(){
		this.filtroQtdAtual++;
		return (filtroCapacidadeTotal>filtroQtdAtual);
	} 
	
	
	
	public Double getBateiraDuracaoRestante() {
		return bateriaDuracaoRestante;
	}

	public void setBateiraDuracaoRestante(Double bateriaDuracaoRestante) {
		this.bateriaDuracaoRestante = bateriaDuracaoRestante;
	}

	public Double getBateriaDuracaoTotal() {
		return bateriaDuracaoTotal;
	}
	
	
}
