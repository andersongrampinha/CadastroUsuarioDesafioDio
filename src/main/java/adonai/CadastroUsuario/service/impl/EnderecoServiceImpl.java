package adonai.CadastroUsuario.service.impl;

import adonai.CadastroUsuario.model.Endereco;
import adonai.CadastroUsuario.repository.EnderecoRepository;
import adonai.CadastroUsuario.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoServiceImpl implements EnderecoService {
    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public Iterable<Endereco> buscarTodos() {
        return enderecoRepository.findAll();
    }

    @Override
    public Endereco buscarPorCep(String cep) {
        Optional<Endereco> endereco = enderecoRepository.findById(cep);
        return endereco.get();
    }

    @Override
    public void inserir(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    @Override
    public void atualizar(String cep, Endereco endereco) {
        Optional<Endereco> enderecoBd = enderecoRepository.findById(cep);
        if (enderecoBd.isPresent()) {
            inserir(endereco);
        }
    }

    @Override
    public void deletar(String cep) {
        enderecoRepository.deleteById(cep);
    }
}
