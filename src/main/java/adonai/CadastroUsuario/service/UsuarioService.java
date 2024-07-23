package adonai.CadastroUsuario.service;

import adonai.CadastroUsuario.model.Usuario;

public interface UsuarioService {
    Iterable<Usuario> buscarTodos();

    Usuario buscarPorId(Long id);

    void inserir(Usuario usuario);

    void atualizar(Long id, Usuario cliente);

    void deletar(Long id);
}
