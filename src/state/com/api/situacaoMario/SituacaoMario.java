package state.com.api.situacaoMario;

import state.com.api.Mario;

public abstract class SituacaoMario {
	
	
	public static SituacaoMario getSituacaoInicialMario() {
		return new MarioPequeno();
	}
	
	public void lidarPegarCogumelo(Mario mario) {}
	
	public void lidarLevarDano(Mario mario) throws Exception {}
	
	public void lidarPegarFlor(Mario mario) {}
	
}