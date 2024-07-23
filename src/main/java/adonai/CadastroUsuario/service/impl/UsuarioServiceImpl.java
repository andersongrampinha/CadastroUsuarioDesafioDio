package adonai.CadastroUsuario.service.impl;

import adonai.CadastroUsuario.model.Usuario;
import adonai.CadastroUsuario.repository.UsuarioRepository;
import adonai.CadastroUsuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Iterable<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarPorId(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.get();
    }

    @Override
    public void inserir(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void atualizar(Long id, Usuario usuario) {
        Optional<Usuario> usuarioBd = usuarioRepository.findById(id);
        if (usuarioBd.isPresent()) {
            inserir(usuario);
        }
    }

    @Override
    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
