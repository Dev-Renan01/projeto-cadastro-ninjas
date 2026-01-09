package dev.java10x.CadastroDeNinjas.missoes.controllerM;

import dev.java10x.CadastroDeNinjas.missoes.modelM.MissoesModel;
import dev.java10x.CadastroDeNinjas.missoes.servicesM.MissoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @Autowired
    private MissoesService missoesService;

    // Mensagem de boas-vindas
    @GetMapping("/boas-vindas")
    public String boasVindas() {
        return "Seja bem-vindo, escolha a sua missão!";
    }

    // Listar todas as missões
    @GetMapping
    public List<MissoesModel> listarTodas() {
        return missoesService.getAll();
    }

    // Buscar por dificuldade
    @GetMapping("/dificuldade/{dificuldade}")
    public List<MissoesModel> getPorDificuldade(@PathVariable String dificuldade) {
        return missoesService.buscarPorDificuldade(dificuldade);
    }

    // Buscar por status
    @GetMapping("/status/{status}")
    public List<MissoesModel> getPorStatus(@PathVariable String status) {
        return missoesService.buscarPorStatus(status);
    }

    // Criar missão
    @PostMapping
    public ResponseEntity<MissoesModel> criarMissao(@RequestBody MissoesModel missao) {
        MissoesModel salva = missoesService.save(missao);
        return new ResponseEntity<>(salva, HttpStatus.CREATED);
    }

    // Deletar missão por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        missoesService.delete(id);
        return ResponseEntity.noContent().build();
    }
}