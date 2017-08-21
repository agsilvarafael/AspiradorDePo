package br.com.so.model;

import java.awt.Image;

import javax.swing.ImageIcon;

import br.com.so.util.Timer;
import br.com.so.view.PainelSala;

public class Aspirador {

	private final Integer bateriaDuracaoTotalTicks;//Dura��o em Segundos
	private Integer bateriaDuracaoRestanteTicks = 0;
	private final Integer filtroCapacidadeTotal;
	private Integer filtroQtdAtual = 0;
	private Integer posX, posY;
	private Integer limpezaNTicks;
	public static ImageIcon imgAspiradornew = new ImageIcon((new ImageIcon(PainelSala.class.getResource("/br/com/so/img/aspirador.png"))).
			   getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));

	/*
	 * Leva 12 segundos para encher (6 �reas - 2s cada)
	 * Demora 3s para esvaziar quando est� cheio por completo
	 * 1/2 s para esvaziar cada unidade de sujeira [mas para esvaziar � td ou nada]
	*/
	public Aspirador(Integer capacidadeMovimento, Double tempoLimpezaQuadradoSeg,
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
	public Boolean carregar(Integer qtdTicks){
		bateriaDuracaoRestanteTicks += qtdTicks;
		return (bateriaDuracaoTotalTicks>bateriaDuracaoRestanteTicks);
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
