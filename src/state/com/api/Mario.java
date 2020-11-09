package state.com.api;

import state.com.api.situacaoMario.SituacaoMario;

public class Mario {
	
	public SituacaoMario situacao;
	
	public long pontuacao = 0;
	
	public Mario() {
		this.situacao = SituacaoMario.getSituacaoInicialMario();
	}
	
	public void adicionarPontosAdquiridos(long pontos) {
		this.pontuacao += pontos;
	}
	
	public void alterarSituacaoMario(SituacaoMario situacao) {
		this.situacao = situacao;
	}
	
	public void pegarCogumelo() {
		situacao.lidarPegarCogumelo(this);
	}
	
	public void levarDano() throws Exception {
		situacao.lidarLevarDano(this);
	}
	
	public void pegarFlor() {
		situacao.lidarPegarFlor(this);
	}
}