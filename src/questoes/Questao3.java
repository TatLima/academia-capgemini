package questoes;

import java.util.ArrayList;
import java.util.List;

public class Questao3 {
	public static void main(String[] args) {
		String s = "tenha um bom dia";
		
		s = retiraEspacos(s);
		
		Integer quantidadeCaracteres = verificaQuantidadeDeCaracteres(s);
		
		List<String> lista = divideTexto(quantidadeCaracteres, s);
		
		List<String> listaEncriptada = encripta(lista);
		
		System.out.println(converteEmTexto(listaEncriptada));
	}
	
	private static String retiraEspacos(String texto) {
		return texto.replaceAll("\\s+","");
	}
	
	private static Integer verificaQuantidadeDeCaracteres(String texto) {
		Double quantidade = Math.sqrt(texto.length());
		
		return (int) Math.round(quantidade);
	}
	
	private static List<String> divideTexto(Integer quantidadeCaracteres, String texto) {
		List<String> lista = new ArrayList<>();
		int i = 0;
		
		while(i<texto.length()) {
			int limite = i+quantidadeCaracteres;
			
			if(limite > texto.length()) {
				limite = texto.length();
			}
			
			lista.add(texto.substring(i, limite));
			
			i=limite;
		}
		
		return lista;
	}
	
	private static List<String> encripta(List<String> lista) {
		List<String> listaEncriptada = new ArrayList<>();
		
		for(int j=0; j<lista.size(); j++) {
			
			String palavra = lista.get(j);
			
			for(int p=0; p<palavra.length(); p++) {
				char c = palavra.charAt(p);
				
				if((listaEncriptada.size() == 0) || (listaEncriptada.size() <= p)) {
					listaEncriptada.add(String.valueOf(c));
				} else {
					String texto = listaEncriptada.get(p);
					texto = texto.concat(String.valueOf(c));
					
					listaEncriptada.set(p, texto);
				}
			}
		}
		
		return listaEncriptada;
	}
	
	private static String converteEmTexto(List<String> lista) {
		String texto = "";
		
		for(String s: lista) {
			texto = texto.concat(s).concat(" ");
		}
		
		return texto;
	}
}
