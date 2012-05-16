package com.name.gfp;

/***
 * Classe que Representa um debito do Usuário
 * 
 * @author ARTHUR SENA, RODOLFO LIMA, ELIAS PAULINO, BRUNNA AMORIM
 */

public class Debito extends Transacao{
	
	/*
	 *Eu coloquei inteiro, porq eu pensei em agent usar valores pra indentificar
	 *cada categoria, tipo 0 seria categoria X, 1 categoria Y..o mesmo vale pra o tipo...e por ai vai..
	 *axo q o mais correto seria usar ENUM, mas eu nao lembro como eh q usa =\...
	 */
	
	public int categoria;
	public int tipo;
	
	
	public Debito(String data, String descricao, double valor, int categoria, int tipo){
		super(data,descricao,valor);
		this.tipo = categoria;
		this.categoria = categoria;
	}
	
	//Acredito que Descricao seja Opcional ne ?
	public Debito(String data, double valor, int categoria, int tipo){
		super(data,valor);
		this.tipo = categoria;
		this.categoria = categoria;
	}
	
	/**
	 * Recupera a categoria do Debito
	 * @return
	 *        Categoria do Debito
	 */
	
	public int getCategoria() {
		return categoria;
	}
	
	/**
	 * Altera a Categoria do Débito  
	 * @param categoria
	 */
	
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	/**
	 * Recupera o Tipo do Débito
	 * @return
	 */
	
	public int getTipo() {
		return tipo;
	}
	
}
