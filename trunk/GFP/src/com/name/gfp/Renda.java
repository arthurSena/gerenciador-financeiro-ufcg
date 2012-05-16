package com.name.gfp;

/***
 * Classe que Representa uma determinada Renda do Usuário
 * 
 * @author ARTHUR SENA, RODOLFO LIMA, ELIAS PAULINO, BRUNNA AMORIM
 */

public class Renda extends Transacao{
	
	public int tipo;

	public Renda(String data, String descricao, double valor, int tipo){
		super(data,descricao,valor);
		this.tipo = tipo;
	}
	
	//Acredito que Descricao seja Opcional ne ?
	public Renda(String data, double valor, int tipo){
		super(data,valor);
		this.tipo = tipo;
	}

	/**
	 * Recupera o Tipo da Renda
	 * @return
	 *        Tipo da Renda
	 */
	
	public int getTipo() {//Se agent nao usar Enum, depois vai ter q fazer uma checagem pra saber
		                  //a categoria exta da Renda
		return tipo;
	}


}
