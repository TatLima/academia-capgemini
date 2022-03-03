package questoes;

import java.util.Arrays;
import java.util.List;

public class Questao2 {
	
	public static void main(String[] args) {
		List<Integer> n = Arrays.asList(1,5,3,4,2);
		Integer x = 2;
		Integer quantidadeDePares = 0;
		
		for(int i=0; i<n.size(); i++) {
			Integer a = n.get(i);
			
			for(int j=0; j<n.size(); j++) {
				if(i!=j) {
					Integer b = n.get(j);
					
					if((a - b) == x){
						quantidadeDePares++;
					}
				}
			}
		}
		
		System.out.println("Quantidade de Pares: " + quantidadeDePares);
	}
	
}
