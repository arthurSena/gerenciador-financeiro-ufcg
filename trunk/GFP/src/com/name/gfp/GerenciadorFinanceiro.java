package com.name.gfp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.Serializable;

/**
 * Classe responsavel pelo gerenciamento financeiro do usuario
 * 
 * @author ARTHUR SENA, RODOLFO LIMA, BRUNNA AMORIM, ELIAS PAULINO
 */

@SuppressWarnings("serial")
public class GerenciadorFinanceiro implements Serializable {
	
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
	
	public Transacao exibirTransacao(int idTransacao){
		
		Iterator<Transacao> it = listaDeTransacoes.iterator();
		
		while (it.hasNext()){
			Transacao aux = it.next();
			if (aux.getID() == idTransacao ){
				return aux;
			}
		}
		return null;
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
	
	//TODO nao gostei dessa parte de editar, ficou com vario metodos parecido =\ 
	// sei q tem como deixar mais limpo essa parte, acho q eh com factory ne ? mas nao 
	// lembro direito 
	public boolean editarValor(int idTransacao, int valor){
		
		Iterator<Transacao> it = listaDeTransacoes.iterator();
		
		while (it.hasNext()){
			Transacao aux = it.next();
			if (aux.getID() == idTransacao ){
				aux.setValor(valor);
				return true;
			}
		}
		return false;
	}
	
	public boolean editarDescricao(int idTransacao, String descricao){
		
		Iterator<Transacao> it = listaDeTransacoes.iterator();
		
		while (it.hasNext()){
			Transacao aux = it.next();
			if (aux.getID() == idTransacao ){
				aux.setDescricao(descricao);
				return true;
			}
		}
		return false;
	}
	
	public boolean editarData(int idTransacao, String data){
		
		Iterator<Transacao> it = listaDeTransacoes.iterator();
		
		while (it.hasNext()){
			Transacao aux = it.next();
			if (aux.getID() == idTransacao ){
				aux.setData(data);
				return true;
			}
		}
		return false;
	}
	
	public boolean editarCategoria(int idTransacao, Categoria categoria){
		
		Iterator<Transacao> it = listaDeTransacoes.iterator();
		
		while (it.hasNext()){
			//TODO preciso verificar aqui se o objeto eh do tipo Receita ou Despesa para so depois 
			// modificar a categoria ... sei que tem como, mas não lembro como faz
				return true;
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
