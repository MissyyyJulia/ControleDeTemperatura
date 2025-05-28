package controletemp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleTemperatura {

	int temp_maxima;
	int temp_minima;
	int temp_atual;
	List<Integer> temperaturas = new ArrayList<>();
	
	public void inserirTempMaxMin() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nInsira a temperatura Mínimia: ");
		temp_minima = scanner.nextInt();
		System.out.println("\nInsira a temperatura Máxima: ");
		temp_maxima = scanner.nextInt();
	}

	//função para receber as temperaturas
	public void inserirTemperaturas(int contador) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira as temperaturas da hora " + contador + ":");
		System.out.println("\nInsira a temperatura Atual: ");
		temp_atual = scanner.nextInt();
		temperaturas.add(temp_atual);
		

		if (temp_atual > temp_maxima || temp_atual  < temp_minima) {
			System.out.println("\nA temperatura está fora do padrão.");
		}
	}

	// Para calcular a média das temperaturas atuais, soma todos os valores e divide pelo tamanho da lista
	public void CalcularTempMedia() {
		int soma = 0;
		int tam = temperaturas.size();

		for (int i = 0; i < tam; i++) {
			soma += temperaturas.get(i);
		}

		int media = soma /tam;
		System.out.println("\nMédia das temperaturas de hoje: " +media);
	}

	// Para calcular a quantidade de temperaturas acima da média, compara se cada
	// item da lista é maior, pra cada vez que a condição
	// for verdadeira, soma na variável contadora
	public void CalcularTempAcimaLimiteMaximo(int contador) {
		for (double temp : temperaturas) {
			if (temp > temp_maxima) {
				contador++;
			}
		}

		System.out.println("\nQuantidades de temperatura acima da média: " + contador);

	}

	
	//Para calcular o menor e o maior numero, o valor atual é comparado ao próximo e se verdadeiro, atribuido à variável
	public void CalcularTempMinimaMaxima() {
		double menor = temperaturas.get(0);
		double maior = temperaturas.get(0);

		for (double temp : temperaturas) {
			if (temp < menor) {
				menor = temp;
			}
			if (temp > maior) {
				maior = temp;
			}
		}

		System.out.println("\nMenor temperatura registrada: " + menor);
		System.out.println("Maior temperatura registrada: " + maior);
	}

}
