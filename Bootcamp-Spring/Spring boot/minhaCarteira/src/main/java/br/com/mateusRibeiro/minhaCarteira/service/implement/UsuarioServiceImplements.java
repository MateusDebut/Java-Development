package br.com.mateusRibeiro.minhaCarteira.service.implement;

import br.com.mateusRibeiro.minhaCarteira.model.Usuario;
import br.com.mateusRibeiro.minhaCarteira.repository.UsuarioRepository;
import br.com.mateusRibeiro.minhaCarteira.service.UsuarioService;

public class UsuarioServiceImplements implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImplements(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario autenticar(String email, String senha) {
        return null;
    }

    @Override
    public Usuario cadastrar(Usuario usuario) {
        return null;
    }

    @Override
    public void validarEmail(String email) {

    }
}
