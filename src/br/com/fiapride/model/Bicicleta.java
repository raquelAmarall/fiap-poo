package br.com.fiapride.model;

public class Bicicleta {
	
	private int marcha;
	private double velocidade;
	
	public Bicicleta(int marcha, double velocidade) {
		this.marcha = marcha;
		this.velocidade = velocidade;
	}
	
	public int getMarcha() {
		return this.marcha;	
	}
	
	private void setMarcha(int marcha) {
		if (marcha <= 0) {
			System.out.println("Marcha não pode ser igual ou menor que 0");
		} else {
			this.marcha = marcha;
		}
	}
	
	public double getVelocidade() {
		return this.velocidade;
	}
	
	private void setVelocidade(double velocidade) {
		if (velocidade < 0) {
			System.out.println("Não é possível dar ré em uma bicicleta");
		} else {
			this.velocidade = velocidade;
		}	
		
	}
	
	public void mudarMacha(boolean mais) {
		double velocidade = this.getVelocidade();
		int marcha = this.getMarcha();
		if (mais) {
			marcha ++;
			velocidade += 0.5;
		} else {
			marcha --;
			velocidade -= 0.5;
			
		  }
		this.setVelocidade(velocidade);
		this.setMarcha(marcha);
	}
	
	public void acelerar(boolean movimento) {
		int marcha = this.getMarcha();
		double velocidade = this.getVelocidade();
		if (movimento) {
			if (marcha <= 5) {
				velocidade ++;
			}else {
				velocidade += 2;
			}
		}
		this.setMarcha(marcha);
		this.setVelocidade(velocidade);
	}
	
	public void frear(boolean freio) {
		double velocidade = this.getVelocidade();
		if(freio) {
			velocidade--;		}
	}

}
