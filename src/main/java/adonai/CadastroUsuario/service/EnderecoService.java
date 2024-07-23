package adonai.CadastroUsuario.service;

import adonai.CadastroUsuario.model.Endereco;

public interface EnderecoService {
    Iterable<Endereco> buscarTodos();

    Endereco buscarPorCep(String cep);

    void inserir(Endereco endereco);

    void atualizar(String cep, Endereco endereco);

    void deletar(String cep);
}
