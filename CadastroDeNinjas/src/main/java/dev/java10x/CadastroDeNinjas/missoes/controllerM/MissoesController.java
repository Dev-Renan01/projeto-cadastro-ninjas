package dev.java10x.CadastroDeNinjas.missoes.controllerM;

import dev.java10x.CadastroDeNinjas.missoes.modelM.MissoesModel;
import dev.java10x.CadastroDeNinjas.missoes.servicesM.MissoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/missoes")
public class MissoesController {

    @Autowired
    private MissoesService missoesService;

    @GetMapping(value = "/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<MissoesModel> listar (){
        return missoesService.listarMissoes();
    }

    @GetMapping(value = "/buscarid/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<MissoesModel> buscarId(@PathVariable Long id){
        return missoesService.buscarPorMissoesId(id);
    }

    @PostMapping(value = "/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public MissoesModel salvar(@RequestBody MissoesModel missoes){
        return missoesService.salvarMissoe(missoes);
    }

    @PostMapping(value = "/atualizar")
    @ResponseStatus(HttpStatus.OK)
    public MissoesModel atualizar(@RequestBody MissoesModel missoesModel){
        return missoesService.atualizarMissao(missoesModel);
    }

    @DeleteMapping(value = "/deleteid/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteId(@PathVariable Long id){
        missoesService.deletarMissao(id);
    }












}