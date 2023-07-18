import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class PrimeiroDesafio{
	
	public static void main(String[] args){
		
		try (Scanner scanner = new Scanner(System.in)) {
			int n = validacao(scanner); // Número de linhas de entrada
		
        
	        List<Integer> pares = new ArrayList<>(); //Lista de números pares
	        List<Integer> impares = new ArrayList<>(); //Lista de números ímpares
	
	        // Leitura dos valores de entrada
	        for (int i=0; i<n; i++) {
	            int entrada = validacao(scanner);
	            
	            // Adição da nova entrada na lista correta
	            if (entrada%2 == 0) {
	                pares.add(entrada); 
	            } else {
	                impares.add(entrada); 
	            }
	        }
	
	        // Ordenação e impressão dos pares em ordem crescente e dos ímpares na decrescente
	        Collections.sort(pares);
	        Collections.sort(impares, Comparator.reverseOrder());
	        for (int valor: pares) {
	            System.out.println(valor);
	        }
	        for (int valor: impares) {
	            System.out.println(valor);
	        }
        
		} catch(Exception e) {
			System.out.print(e);
		}
	}

	/**
	 * Valida se o número de entrada é um inteiro positivo
	 * 
	 * @param scanner
	 * @return n Número de entrada
	 * @throws Exception
	 */
	public static int validacao(Scanner scanner) throws Exception {
		int n;
		if (scanner.hasNextInt()) {
			n = scanner.nextInt();
			if (n <= 0) {
				throw new Exception("Digite um número positivo.");	
			}
		} else {
			throw new Exception("Digite um número inteiro.");
		}
		return n;
	}
}
