package oo_instanciamento;

public class Game {

	public static void main(String[] args) {
		
		Jogador player = new Jogador();
		player.iniciarJogador();
		player.adicionarVidaJogador();
	
		
				
		Inimigo inimigo = new Inimigo();
		inimigo.iniciarInimigo();
		inimigo.adicionarVidaInimigo();
	}

}

