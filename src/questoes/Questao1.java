package questoes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Questao1 {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(9, 2, 1, 4, 6);
		
		Collections.sort(lista);
		
		Integer indiceMediana = (lista.size() / 2);
		
		System.out.println("A mediana é: " + lista.get(indiceMediana));
	}
	
}
