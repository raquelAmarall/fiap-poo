package br.com.fiapride.main;

import br.com.fiapride.model.Bicicleta; // Importando a classe Bicicleta

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		// Criando primeiro objeto
		Bicicleta bicicleta1 = new Bicicleta(); // new aloca memória para uma nova bicicleta
		bicicleta1.marcha = 1;
		bicicleta1.velocidade = 3;
		
		// Criando segundo objeto
		Bicicleta bicicleta2 = new Bicicleta();
		bicicleta2.marcha = 3;
		bicicleta2.velocidade = 10;
		
		// Exibição
		System.out.println("--- Sistema FiapRide ---");
		System.out.println("Bicicleta 1 -> Marcha: " + bicicleta1.marcha + " Velocidade: " + bicicleta1.velocidade);
		System.out.println("Bicicleta 2 -> Marcha: " + bicicleta2.marcha + " Velocidade: " + bicicleta2.velocidade);

	}

}
