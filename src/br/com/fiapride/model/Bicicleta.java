package br.com.fiapride.model;

public class Bicicleta {
	
	public int marcha;
	public double velocidade;
	
	public Bicicleta(int marcha, double velocidade) {
		this.marcha = marcha;
		this.velocidade = velocidade;
	}
	
	public void mudarMacha(boolean mais) {
		if (mais) {
			this.marcha ++;
			this.velocidade += 0.5;
		} else {
			if(this.marcha == 1) {
				System.out.println("Menor marcha disponível já está sendo utilizada");
			} else {
			this.marcha --;
			this.velocidade -= 0.5;
		     }
	     }
	}
	
	public void acelerar(boolean movimento) {
		if (movimento) {
			if (this.marcha <= 5) {
				this.velocidade ++;
			}else {
				this.velocidade += 2;
			}
		}	
	}
	
	public void frear(boolean freio) {
		if(freio && velocidade > 0) {
			this.velocidade--;
		}else {
			System.out.println("Sua velocidade é 0, não é possivel diminiuir mais.");
		}
	}

}
