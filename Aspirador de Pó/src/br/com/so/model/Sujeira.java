package br.com.so.model;

import java.awt.Image;

import javax.swing.ImageIcon;

import br.com.so.view.PainelSala;

public class Sujeira {

	public static ImageIcon imgAspirador= new ImageIcon((new ImageIcon(PainelSala.class.getResource("/br/com/so/img/sujeira.png"))).getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));	

}
