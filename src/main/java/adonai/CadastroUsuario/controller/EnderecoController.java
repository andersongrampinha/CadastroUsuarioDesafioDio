package adonai.CadastroUsuario.controller;

import adonai.CadastroUsuario.model.Endereco;
import adonai.CadastroUsuario.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<Iterable<Endereco>> buscarTodos() {
        return ResponseEntity.ok(enderecoService.buscarTodos());
    }

    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> buscarPorId(@PathVariable String cep) {
        return ResponseEntity.ok(enderecoService.buscarPorCep(cep));
    }

    @PostMapping
    public ResponseEntity<Endereco> inserir(@RequestBody Endereco endereco) {
        enderecoService.inserir(endereco);
        return ResponseEntity.ok(endereco);
    }

    @PutMapping("/{cep}")
    public ResponseEntity<Endereco> atualizar(@PathVariable String cep, @RequestBody Endereco endereco) {
        enderecoService.atualizar(cep, endereco);
        return ResponseEntity.ok(endereco);
    }

    @DeleteMapping("/{cep}")
    public ResponseEntity<Void> deletar(@PathVariable String cep) {
        enderecoService.deletar(cep);
        return ResponseEntity.ok().build();
    }
}
