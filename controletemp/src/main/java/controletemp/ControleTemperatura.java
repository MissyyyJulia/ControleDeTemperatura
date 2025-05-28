package controletemp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleTemperatura {

	int temp_maxima;
	int temp_minima;
	int temp_atual;
	List<Integer> temperaturas = new ArrayList<>();
	
	
	public void imprimirTemperaturas () {
		System.out.println("\nTemperaturas registradas: ");
		for (int temp : temperaturas) {
			System.out.print(temp+"°, ");
		}
	}
	
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

		System.out.println("\n\nInsira a temperatura da " +contador+ "° hora do dia");
		System.out.println("Temperatura Atual: ");
		temp_atual = scanner.nextInt();
		temperaturas.add(temp_atual);
		

		if (temp_atual > temp_maxima || temp_atual  < temp_minima) {
			System.out.println("ATENÇÃO! A temperatura está fora do padrão.");
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
		System.out.println("\n\nMédia das temperaturas de hoje: " +media+ "°");
	}

	// Para calcular a quantidade de temperaturas acima da média, compara se cada
	// item da lista é maior, pra cada vez que a condição
	// for verdadeira, soma na variável contadora
	public void CalcularTempAcimaLimiteMaximo() {
		int contador = 0;
		for (double temp : temperaturas) {
			if (temp > temp_maxima) {
				contador++;
			}
		}

		System.out.println("\nQuantidades de temperatura acima da média: " + contador);

	}

	
	//Para calcular o menor e o maior numero, o valor atual é comparado ao próximo e se verdadeiro, atribuido à variável
	public void CalcularTempMinimaMaxima() {
		int menor = temperaturas.get(0);
		int maior = temperaturas.get(0);

		for (int temp : temperaturas) {
			if (temp < menor) {
				menor = temp;
			}
			if (temp > maior) {
				maior = temp;
			}
		}

		System.out.println("\nMenor temperatura registrada: " + menor+"°");
		System.out.println("Maior temperatura registrada: " + maior+"°");
	}

}
