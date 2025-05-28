package controletemp;

public class Main {

	public static void main(String[] args) {
		
		int contador = 1;
		ControleTemperatura controleTemperatura =  new ControleTemperatura();
		
		controleTemperatura.inserirTempMaxMin();
		
		while(contador < 25) {
			controleTemperatura.inserirTemperaturas(contador);
			contador++;
		}
		
		controleTemperatura.CalcularTempMedia();
		controleTemperatura.CalcularTempMinimaMaxima();
		controleTemperatura.CalcularTempAcimaLimiteMaximo(contador);
		
	}

}
