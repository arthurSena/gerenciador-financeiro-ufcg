package com.name.gfp;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.*;

/**
 * Classe que representa as transacoes realizadas pelo Usuario
 * 
 * @author ARTHUR SENA, ELIAS PAULINO, BRUNNA AMORIM, RODOLFO LIMA
 */

public class Transacao {
	
	private String data;
	private String descricao;
	private double valor;
	private int id; 
	
	public Transacao(String data, double valor) throws Exception {
		
		if (dataValida(data) == false) {
			throw new Exception("Data invalida.");
		} else if (valor < 0) {
			throw new Exception("Valor invalido");
		}
		
		this.data = data;
		this.valor = valor;
		this.descricao = "";
		this.id = geraID();
	}

	public Transacao(String data, String descricao, double valor) throws Exception {	
		this(data, valor);
		this.descricao = descricao;
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

	public void setData(String data) {
		this.data = data;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getID(){
		return this.id;
	}
	
	private int geraID() {
		return (int) (1+Math.random()*1000000);
	}
	
	private boolean dataValida(String data) {
		Pattern padrao = Pattern
				.compile("(0[1-9]|[1-9]|[12][0-9]|3[01])[\\-/](0[1-9]|1[012]|[1-9])[\\-/](19|20)?\\d{2}");
		Matcher pesquisa = padrao.matcher(data);
		boolean dataCorreta = true;

		String[] arrayData = data.split("/");
		String[] meses = { "02", "04", "06", "09", "11" };

		if (pesquisa.matches()) {
			if (anoBissexto(data) == false) {
				dataCorreta = false;
			} else {
				for (int i = 0; i < meses.length; i++) {
					if (arrayData[0].equals("31") && arrayData[1].equals(meses[i])) {
						dataCorreta = false;
						break;
					}
				}
			}
		} else {
			dataCorreta = false;
		}

		return dataCorreta;

	}

	private boolean anoBissexto(String data) {
		GregorianCalendar calendar = new GregorianCalendar();
		String[] arrayData = data.split("/");

		int dia = Integer.parseInt(arrayData[0]);
		int mes = Integer.parseInt(arrayData[1]);
		int ano = Integer.parseInt(arrayData[2]);

		if (mes == 02 && dia == 30) {
			return false;
		} else if (!(calendar.isLeapYear(ano)) && mes == 02 && dia == 29) {
			return false;
		}
		return true;
	}
}