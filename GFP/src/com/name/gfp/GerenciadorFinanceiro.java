package com.name.gfp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Classe responsavel pelo gerenciamento financeiro do usuario
 * 
 * @author ARTHUR SENA, RODOLFO LIMA, BRUNNA AMORIM, ELIAS PAULINO
 */

public class GerenciadorFinanceiro {
	
	List<Transacao> listaDeTransacoes;
	
	/**
	 * Construtor da Classe
	 */
	public GerenciadorFinanceiro(){
		listaDeTransacoes = new ArrayList<Transacao>();
	}
	
	/**
	 * Recupera a Lista de Transacoes realizada pelo Usuario
	 * @return
	 *        Lista de Transacoes 
	 */
	public List<Transacao> getListaDeTransacoes() {
		return listaDeTransacoes;
	}
	
	public boolean adicionarDespesa(String data, double valor, String categoria, String descricao) throws Exception{
		Transacao addDespesa = new Transacao(data, valor, "Despesa", categoria, descricao);	
		return listaDeTransacoes.add(addDespesa);
	}
	
	
	public boolean adicionarReceita(String data, double valor, String categoria, String descricao) throws Exception{
		Transacao addReceita = new Transacao(data, valor, "Receita", categoria, descricao);	
		return listaDeTransacoes.add(addReceita);
	}
	
	
	public boolean excluirTransacao(int idTransacao){
		Iterator<Transacao> it = listaDeTransacoes.iterator();
		
		while (it.hasNext()){
			Transacao aux = it.next();
			if (aux.getID() == idTransacao ){
				return listaDeTransacoes.remove(aux);
			}
		}
		return false;
	}
	

	public Transacao getTransacao(int idTransacao){
		Iterator<Transacao> it = listaDeTransacoes.iterator();
		
		while (it.hasNext()){
			Transacao aux = it.next();
			if (aux.getID() == idTransacao ){
				return aux;
			}
		}
		return null;
	}
	
}
