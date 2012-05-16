package com.name.gfp;


/**
 * Classe que representa as transacoes realizadas pelo Usuario
 * 
 * @author ARTHUR SENA, ELIAS PAULINO, BRUNNA AMORIM, RODOLFO LIMA
 */

public class Transacao {
	
	public String data;
	public String descricao;
	public double valor; //Duvida - Valor deveria ser final ?????
	

	public Transacao(String data, String descricao, double valor){
		
		this.descricao = descricao;
		this.data = data;
		this.valor = valor;
	}
	
	public Transacao(String data, double valor){
		this.data = data;
		this.valor = valor;
		
	}
	
	/**
	 * Recupera a Data da Transacao
	 * @return
	 *        Data da Transacao
	 */
	
	public String getData() {
		return data;
	}
	
	/**
	 * Recupera a Descricao da Transacao
	 * @return
	 *      Descricao da Transacao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Recupera o Valor da Transacao
	 * @return
	 *         Valor da Transacao
	 */
	public double getValor() {
		return valor;
	}

}
