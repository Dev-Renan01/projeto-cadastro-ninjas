package dev.java10x.CadastroDeNinjas.missoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @Autowired
    private MissoesService missoesService;

    @GetMapping
    public String boasVindas(){
        return "Seja bem vindo, escolha a sua missao!";
    }

    @GetMapping("/listar")
    public List<MissoesModel> getall(@RequestBody MissoesModel missoesModel){
        return missoesService.getAll();
    }

    @PostMapping("/criar")
    public MissoesModel create(@RequestBody MissoesModel missoesModel){
        return missoesService.save(missoesModel);
    }

    @DeleteMapping("/deletar")
    public void delete(Long id){
        missoesService.delete(id);
    }


}
