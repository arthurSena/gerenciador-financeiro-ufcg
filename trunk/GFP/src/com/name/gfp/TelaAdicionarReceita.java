//package com.name.gfp;
//
//
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//
//import android.app.Activity;
//import android.app.AlertDialog;
//import android.content.Intent;
//import android.os.Bundle;
//import android.os.Environment;
//
//import android.view.View;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.EditText;
//import android.widget.Spinner;
//
//
//import com.thoughtworks.xstream.XStream;  
//
//
//public class TelaAdicionarReceita extends Activity {
//    /** Called when the activity is first created. */
//	
//	//XStream xstream = new XStream(); 
//	GerenciadorFinanceiro gerenciador;
//
//	
//	 @Override
//	    public void onCreate(Bundle savedInstanceState) {
//	        super.onCreate(savedInstanceState);
//	        setContentView(R.layout.adicionar);
//	        Intent i = getIntent();
//	        
//	        gerenciador = (GerenciadorFinanceiro) i.getSerializableExtra("GerenciadorObj");
//		
//		Spinner spinnerTipo = (Spinner) findViewById(R.adicionar.spinnerTipo);
//		ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
//				this, R.array.tipo, android.R.layout.simple_spinner_item);
//		adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//		spinnerTipo.setAdapter(adapter2);
//		
//			
//			//Adicionando na lista.
//			
//			Button btAdd = (Button) findViewById(R.adicionar.btAdd);
//			
//			btAdd.setOnClickListener(new View.OnClickListener() {
//				
//				public void onClick(View arg0) {
//					String descricao = ((EditText) findViewById(R.adicionar.editTextDescricao)).getText().toString();
//					Double valor = Double.parseDouble(((EditText) findViewById(R.adicionar.valor)).getText().toString());
//					String tipo =  ((Spinner) findViewById(R.adicionar.spinnerTipo)).getSelectedItem().toString();
//					String data = ((EditText) findViewById(R.adicionar.editTextData)).getText().toString();
//					
//					if(tipo.toLowerCase().equals("fixo")){
//						try {
//							gerenciador.adicionarReceita(data, valor, Tipo.FIXO, descricao);
//							imprimirMensagem("Transacao Adicionada com Sucesso !!!", "Sucesso");
//						} catch (Exception e) {
//							imprimirMensagem(e.getMessage(), "Ops...");
//						}
//						
//					}else if(tipo.toLowerCase().equals("mensalmente")){
//						try {
//							gerenciador.adicionarReceita(data, valor, Tipo.MENSALMENTE, descricao);
//							imprimirMensagem("Transacao Adicionada com Sucesso !!!", "Sucesso");
//						} catch (Exception e) {
//							imprimirMensagem(e.getMessage(), "Ops...");
//						}
//						
//					}else if(tipo.toLowerCase().equals("unico")){
//						
//						try {
//							gerenciador.adicionarReceita(data, valor, Tipo.UNICO, descricao);
//							imprimirMensagem("Transacao Adicionada com Sucesso !!!", "Sucesso");
//						} catch (Exception e) {
//							imprimirMensagem(e.getMessage(), "Ops...");
//						}
//					}
////					imprimirMensagem("Transacao adicionada com Sucesso", "Sucesso");
//					
//					//Por enquanto dxa esse codigo da persistencia comentado...
//					
////					 BufferedWriter writer;
////					try {
////							writer = new BufferedWriter(new FileWriter( Environment.getExternalStorageDirectory().getName() + "/"+ "pessoa.xml"));
////							String func = xstream.toXML("passar aqui o objeto criado ou atualizado");
////							writer.write(func);
////							writer.close();
////						} catch (IOException e) {
////							e.printStackTrace();
////						}
//					
//				}
//			});
//					 
//			
////			TableRow tr1 = new TableRow(this);
////			tr1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
////					LayoutParams.WRAP_CONTENT));
////			
////			
////			TextView t4 = new TextView(this);
////			t4.setText("Descricao1");
////			TextView t5 = new TextView(this);
////			t5.setText("Categoria1");
////			TextView t6 = new TextView(this);
////			t6.setText("   Valor1");
////			
////			tr1.addView(t4);
////			tr1.addView(t5);
////			tr1.addView(t6);
////			
////			TableRow tr2 = new TableRow(this);
////			tr2.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
////					LayoutParams.WRAP_CONTENT));
////			
////			
////			TextView t7 = new TextView(this);
////			t7.setText("Descricao2");
////			TextView t8 = new TextView(this);
////			t8.setText("Categoria2");
////			TextView t9 = new TextView(this);
////			t9.setText("   Valor2");
////			
////			tr2.addView(t7);
////			tr2.addView(t8);
////			tr2.addView(t9);
////			
////			TableRow tr3 = new TableRow(this);
////			
////			tr3.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
////					LayoutParams.WRAP_CONTENT));
////			
////			TextView t10 = new TextView(this);
////			t10.setText("Descricao3");
////			TextView t11 = new TextView(this);
////			t11.setText("Categoria3");
////			TextView t12 = new TextView(this);
////			t12.setText("   Valor3");
////			
////			tr3.addView(t10);
////			tr3.addView(t11);
////			tr3.addView(t12);
////			
////			tl.addView(tr1, new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
////					LayoutParams.WRAP_CONTENT));
////			tl.addView(tr2, new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
////					LayoutParams.WRAP_CONTENT));
////			tl.addView(tr3, new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
////					LayoutParams.WRAP_CONTENT));
//			
//	 }
//	 /**
//		 * Imprime uma mensagem de ao usuário
//		 * 
//		 * @param Caption
//		 *            Mensagem a ser imprimida
//		 * @param Title
//		 *            Titulo da mensagem
//		 */
//
//		public void imprimirMensagem(String Caption, String Title) {
//			AlertDialog.Builder builder = new AlertDialog.Builder(
//					TelaAdicionarReceita.this);
//			builder.setMessage(Caption);
//			builder.setNeutralButton("OK", null);
//			AlertDialog dialog = builder.create();
//			dialog.setTitle(Title);
//			dialog.show();
//		}
//	 
//}