import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class TerceiroDesafio {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite o valor alvo (k): ");
			int k = scanner.nextInt();

			System.out.print("Digite o tamanho do array: ");
			int n = scanner.nextInt();

			int[] arr = new int[n];
			System.out.printf("Digite os %d elementos do array separados por espaço: ", n);
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			
			int numPares = contarPares(k, arr);
			System.out.println("Número de pares: " + numPares);
		}
	}
	
	/**
	 * Conta a quantidade de pares possíveis para os valores atribuídos na entrada.
	 * 
	 * @param k Valor alvo
	 * @param arr
	 * @return
	 */
	public static int contarPares(int k, int[] arr) {
		int count = 0;
	    Map<Integer, Integer> map = new HashMap<>();

	    // Contagem dos elementos do array
	    for (int num : arr) {
	    	map.put(num, map.getOrDefault(num, 0) + 1);
	    }

	    // Verificação dos pares
	    for (int num : arr) {
	    	int complement = num - k;
	    	if (map.containsKey(complement)) {
	    		count += map.get(complement);
	    	}
	    }
	        return count;
	    }

}

