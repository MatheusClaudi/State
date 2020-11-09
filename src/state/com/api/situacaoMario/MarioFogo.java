package state.com.api.situacaoMario;

import state.com.api.Mario;

public class MarioFogo extends SituacaoMario {

	@Override
	public void lidarPegarCogumelo(Mario mario) {
		mario.adicionarPontosAdquiridos(1000);		
	}

	@Override
	public void lidarLevarDano(Mario mario) {
		mario.alterarSituacaoMario(new MarioGrande());
	}

	@Override
	public void lidarPegarFlor(Mario mario) {
		mario.adicionarPontosAdquiridos(1000);				
	}

}
