package state.com.api.situacaoMario;

import state.com.api.Mario;

public class MarioPequeno extends SituacaoMario {

	@Override
	public void lidarPegarCogumelo(Mario mario) {
		mario.alterarSituacaoMario(new MarioGrande());
	}

	@Override
	public void lidarLevarDano(Mario mario) throws Exception {
		throw new Exception("Mario morreu.");
	}

	@Override
	public void lidarPegarFlor(Mario mario) {
		mario.alterarSituacaoMario(new MarioFogo());		
	}

}
