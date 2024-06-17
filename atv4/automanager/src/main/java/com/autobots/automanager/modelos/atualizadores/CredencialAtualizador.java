package com.autobots.automanager.modelos.atualizadores;

import com.autobots.automanager.entidades.Credencial;

public class CredencialAtualizador {
	public void atualizar(Credencial credencial, Credencial novaCredencial) {
		credencial.setNomeUsuario(novaCredencial.getNomeUsuario());
		credencial.setSenha(novaCredencial.getSenha());
	}
}
