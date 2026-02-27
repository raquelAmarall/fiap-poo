package br.com.fiapride.main;

import br.com.fiapride.model.Bicicleta; // Importando a classe Bicicleta

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		// Criando primeiro objeto
		Bicicleta bicicleta1 = new Bicicleta(1, 3); // new aloca memória para uma nova bicicleta
		System.out.println("Diminuindo a macha da bicicleta 1");
		bicicleta1.mudarMacha(false);
		
		// Criando segundo objeto
		Bicicleta bicicleta2 = new Bicicleta(3, 10);
		System.out.println("Diminuindo a macha da bicicleta 2");
		bicicleta2.mudarMacha(false);
		System.out.println("Acelerando bicicleta 2");
		bicicleta2.acelerar(true);
		
		// Criando terceiro objeto
		Bicicleta bicicleta3 = new Bicicleta(4, 5);
		System.out.println("Freando bicicleta 3");
		bicicleta3.frear(true);
		
		// Exibição
		System.out.println("--- Sistema FiapRide ---");
		System.out.println("Bicicleta 1 -> Marcha: " + bicicleta1.marcha + "  Velocidade: " + bicicleta1.velocidade);
		System.out.println("Bicicleta 2 -> Marcha: " + bicicleta2.marcha + "  Velocidade: " + bicicleta2.velocidade);
		System.out.println("Bicicleta 3 -> Marcha: " + bicicleta3.marcha + "  Velocidade: " + bicicleta3.velocidade);
	}

}
