package com.name.gfp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import android.os.Environment;

public class Persistencia {

	XStream xstream = new XStream();

	public void salvarDados(GerenciadorFinanceiro gerenciador) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(Environment
					.getExternalStorageDirectory().getName()
					+ File.separatorChar
					+ "gfp"
					+ File.separatorChar
					+ "dados.xml"));
			String func = xstream.toXML(gerenciador);
			writer.write(func);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public GerenciadorFinanceiro recuperarDados() throws Exception {
		XStream xstream = new XStream(new DomDriver()); 
		FileReader reader = new FileReader(Environment
				.getExternalStorageDirectory().getName()
				+ File.separatorChar
				+ "gfp"
				+ File.separatorChar
				+ "dados.xml");
		return ((GerenciadorFinanceiro) xstream.fromXML(reader)); 
	}

	public void apagarDados() {
		File file = new File(Environment
				.getExternalStorageDirectory().getName()
				+ File.separatorChar
				+ "gfp"
				+ File.separatorChar
				+ "dados.xml");
		
		file.delete();
	}

}
