package br.com.mateusRibeiro.minhaCarteira.service;

import br.com.mateusRibeiro.minhaCarteira.model.Usuario;

public interface UsuarioService {
    Usuario autenticar(String email, String senha);
    Usuario cadastrar(Usuario usuario);
    void validarEmail(String email);
}
