package com.name.gfp;

import com.thoughtworks.xstream.XStream;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class TelaAdicionarDespesa extends Activity {

	//XStream xstream = new XStream();
	GerenciadorFinanceiro gerenciador;

	public void imprimirMensagem(String Caption, String Title) {
		AlertDialog.Builder builder = new AlertDialog.Builder(
				TelaAdicionarDespesa.this);
		builder.setMessage(Caption);
		builder.setNeutralButton("OK", null);
		AlertDialog dialog = builder.create();
		dialog.setTitle(Title);
		dialog.show();
	}
 
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.adicionardespesa);
		Intent i = getIntent();

		gerenciador = (GerenciadorFinanceiro) i
				.getSerializableExtra("GerenciadorObj");

		Spinner spinnerTipo = (Spinner) findViewById(R.adicionarDespesa.spinnerTipo);
		ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
				this, R.array.tipo, android.R.layout.simple_spinner_item);
		adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerTipo.setAdapter(adapter2);

		Spinner spinnerCategoria = (Spinner) findViewById(R.adicionarDespesa.spinnerCategoria);
		ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(
				this, R.array.categorias, android.R.layout.simple_spinner_item);
		adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerCategoria.setAdapter(adapter1);
		
		
		Button btAdd = (Button) findViewById(R.adicionarDespesa.btAdd);
		
		btAdd.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View v) {
				
				String data = ((EditText) findViewById(R.adicionarDespesa.editTextData)).getText().toString();
				double valor = Double.parseDouble(((EditText) findViewById(R.adicionarDespesa.valor)).getText().toString());
				String descricao = ((EditText) findViewById(R.adicionarDespesa.editTextDescricao)).getText().toString();
				String tipo = ((Spinner) findViewById(R.adicionarDespesa.spinnerTipo)).getSelectedItem().toString();
				int numeroDeParcelas= Integer.parseInt(((EditText) findViewById(R.adicionarDespesa.editTextParcelas)).getText().toString());
				String categoria = ((Spinner) findViewById(R.adicionarDespesa.spinnerCategoria)).getSelectedItem().toString();;
				
				if(tipo.toLowerCase().equals("fixo")){
					try {
						gerenciador.adicionarDespesa(data, valor, descricao,Tipo.FIXO, categoria, numeroDeParcelas);
						imprimirMensagem("Transacao Adicionada com Sucesso !!!", "Ops...");
					} catch (Exception e) {
						imprimirMensagem(e.getMessage(), "Ops...");
					}
				}
				else if(tipo.toLowerCase().equals("mensalmente")){
					try {
						gerenciador.adicionarDespesa(data, valor, descricao,Tipo.FIXO, categoria, numeroDeParcelas);
						imprimirMensagem("Transacao Adicionada com Sucesso !!!", "Ops...");
					} catch (Exception e) {
						imprimirMensagem(e.getMessage(), "Ops...");
					}
				}
				
				else if(tipo.toLowerCase().equals("unico")){
					try {
						gerenciador.adicionarDespesa(data, valor, descricao,Tipo.FIXO, categoria, numeroDeParcelas);
						imprimirMensagem("Transacao Adicionada com Sucesso !!!", "Ops...");
					} catch (Exception e) {
						imprimirMensagem(e.getMessage(), "Ops...");
					}
				}
			}
		});
		

	}
}
