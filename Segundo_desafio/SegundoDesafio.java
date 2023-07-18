import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class SegundoDesafio {
	
    public static void main(String[] args) {
    	
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite o valor monetário: ");
			String valorStr = scanner.nextLine();
			    double valor = Double.parseDouble(valorStr);

			    //Imprimindo o número de notas
			    System.out.println("NOTAS:");
			    int notas = (int) valor;
			    System.out.printf("%d nota(s) de R$ 100.00%n", notas / 100);
			    valor -= notas - (notas%100);
			    notas %= 100;
			    System.out.printf("%d nota(s) de R$ 50.00%n", notas / 50);
			    valor -= notas - (notas%50);
			    notas %= 50;
			    System.out.printf("%d nota(s) de R$ 20.00%n", notas / 20);
			    valor -= notas - (notas%20);
			    notas %= 20;
			    System.out.printf("%d nota(s) de R$ 10.00%n", notas / 10);
			    valor -= notas - (notas%10);
			    notas %= 10;
			    System.out.printf("%d nota(s) de R$ 5.00%n", notas / 5);
			    valor -= notas - (notas%5);
			    notas %= 5;
			    System.out.printf("%d nota(s) de R$ 2.00%n", notas / 2);
			    valor -= notas - (notas%2);
			    
			    //Arredondamento da variável valor para duas casas decimais. 
			    DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));
			    valor = Double.parseDouble(df.format(valor));
			    valor *= 100;
			    
			    //Imprimindo o número de moedas
			    System.out.println("MOEDAS:");
			    int moedas = (int) valor;
			    System.out.printf("%d moeda(s) de R$ 1.00%n", moedas / 100);
			    moedas %= 100;
			    System.out.printf("%d moeda(s) de R$ 0.50%n", moedas / 50);
			    moedas %= 50;
			    System.out.printf("%d moeda(s) de R$ 0.25%n", moedas / 25);
			    moedas %= 25;
			    System.out.printf("%d moeda(s) de R$ 0.10%n", moedas / 10);
			    moedas %= 10;
			    System.out.printf("%d moeda(s) de R$ 0.05%n", moedas / 5);
			    moedas %= 5;
			    System.out.printf("%d moeda(s) de R$ 0.01%n", moedas);
			    
        } catch (NumberFormatException e) {
        	System.out.println("Entrada inválida! O valor monetário deve ser um número de ponto flutuante "
        			+ "(utilize '.' ao invés de ',' para números não-inteiros).");
		}
	}
}

