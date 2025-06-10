package dev.java10x.CadastroDeNinjas.missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @GetMapping
    public String boasVindas(){
        return "Seja bem vindo, escolha a sua missao!";
    }


}
