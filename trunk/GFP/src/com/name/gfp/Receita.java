package com.name.gfp;

/***
 * Classe que Representa uma determinada Renda do Usuário
 * 
 * @author ARTHUR SENA, RODOLFO LIMA, ELIAS PAULINO, BRUNNA AMORIM
 */

public class Receita extends Transacao{
	
	private Tipo tipo; 
	
	public Receita(String data, double valor, Tipo tipo) throws Exception{
		//TODO Verificar se a data eh valida -- (Tá em Transacao)
		//TODO verificar se o valor eh valido -- (Tá em Transacao)
		
		super(data,valor);
		this.tipo = tipo;
	}

	public Receita(String data, double valor, Tipo tipo, String descricao) throws Exception{
		//TODO Verificar se a data eh valida -- (Tá em Transacao)
		//TODO verificar se o valor eh valido -- (Tá em Transacao)
		
		super(data,descricao,valor);
		this.tipo = tipo;
	}

	/**
	 * Recupera o Tipo da Renda
	 * @return
	 *        Tipo da Renda
	 */
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	

}
