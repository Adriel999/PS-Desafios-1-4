import java.util.Scanner;

public class QuartoDesafio {
	
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite a quantidade de casos de teste: ");
			int n = scanner.nextInt();
			scanner.nextLine(); // Consume a quebra de linha após o número de casos de teste

			for (int i = 0; i < n; i++) {
			    System.out.print("Digite a frase embaralhada: ");
			    String linha = scanner.nextLine();

			    String fraseDecifrada = desembaralhar(linha);
			    System.out.println("Frase decifrada: " + fraseDecifrada);
			}
		}
    }
    
    /**
     * Desembaralha a frase com erro na impressão
     * 
     * @param linha Frase embaralhada
     * @return Frase Decifrada
     */
    public static String desembaralhar(String linha) {
    	
        int tamanho = linha.length();
        String metadeEsquerda = linha.substring(0, tamanho / 2);
        String metadeDireita = linha.substring(tamanho / 2);

        StringBuilder sb = new StringBuilder();

        // Construir a frase desembaralhada
        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            sb.append(metadeEsquerda.charAt(i));
        }

        for (int i = tamanho - 1; i >= tamanho / 2; i--) {
            sb.append(metadeDireita.charAt(i - tamanho / 2));
        }

        return sb.toString();
    }
}

